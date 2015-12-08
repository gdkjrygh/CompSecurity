// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            IPackageHandler, AdjustFactory, ActivityPackage, ActivityKind, 
//            ILogger, Util, IRequestHandler, IActivityHandler

public class PackageHandler extends HandlerThread
    implements IPackageHandler
{
    private static final class InternalHandler extends Handler
    {

        private static final int ADD = 2;
        private static final int INIT = 1;
        private static final int SEND_FIRST = 4;
        private static final int SEND_NEXT = 3;
        private final WeakReference packageHandlerReference;

        public final void handleMessage(Message message)
        {
            super.handleMessage(message);
            PackageHandler packagehandler = (PackageHandler)packageHandlerReference.get();
            if (packagehandler == null)
            {
                return;
            }
            switch (message.arg1)
            {
            default:
                return;

            case 1: // '\001'
                packagehandler.initInternal();
                return;

            case 2: // '\002'
                packagehandler.addInternal((ActivityPackage)message.obj);
                return;

            case 4: // '\004'
                packagehandler.sendFirstInternal();
                return;

            case 3: // '\003'
                packagehandler.sendNextInternal();
                return;
            }
        }

        protected InternalHandler(Looper looper, PackageHandler packagehandler)
        {
            super(looper);
            packageHandlerReference = new WeakReference(packagehandler);
        }
    }


    private static final String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final String PACKAGE_QUEUE_NAME = "Package queue";
    private IActivityHandler activityHandler;
    private Context context;
    private final InternalHandler internalHandler = new InternalHandler(getLooper(), this);
    private AtomicBoolean isSending;
    private ILogger logger;
    private List packageQueue;
    private boolean paused;
    private IRequestHandler requestHandler;

    public PackageHandler(IActivityHandler iactivityhandler, Context context1, boolean flag)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        logger = AdjustFactory.getLogger();
        init(iactivityhandler, context1, flag);
        iactivityhandler = Message.obtain();
        iactivityhandler.arg1 = 1;
        internalHandler.sendMessage(iactivityhandler);
    }

    private void addInternal(ActivityPackage activitypackage)
    {
        if (activitypackage.getActivityKind().equals(ActivityKind.CLICK) && !packageQueue.isEmpty())
        {
            packageQueue.add(1, activitypackage);
        } else
        {
            packageQueue.add(activitypackage);
        }
        logger.debug("Added package %d (%s)", new Object[] {
            Integer.valueOf(packageQueue.size()), activitypackage
        });
        logger.verbose("%s", new Object[] {
            activitypackage.getExtendedString()
        });
        writePackageQueue();
    }

    public static Boolean deletePackageQueue(Context context1)
    {
        return Boolean.valueOf(context1.deleteFile("AdjustIoPackageQueue"));
    }

    private void initInternal()
    {
        requestHandler = AdjustFactory.getRequestHandler(this);
        isSending = new AtomicBoolean();
        readPackageQueue();
    }

    private void readPackageQueue()
    {
        packageQueue = (List)Util.readObject(context, "AdjustIoPackageQueue", "Package queue");
        if (packageQueue != null)
        {
            logger.debug("Package handler read %d packages", new Object[] {
                Integer.valueOf(packageQueue.size())
            });
            return;
        } else
        {
            packageQueue = new ArrayList();
            return;
        }
    }

    private void sendFirstInternal()
    {
        if (packageQueue.isEmpty())
        {
            return;
        }
        if (paused)
        {
            logger.debug("Package handler is paused", new Object[0]);
            return;
        }
        if (isSending.getAndSet(true))
        {
            logger.verbose("Package handler is already sending", new Object[0]);
            return;
        } else
        {
            ActivityPackage activitypackage = (ActivityPackage)packageQueue.get(0);
            requestHandler.sendPackage(activitypackage);
            return;
        }
    }

    private void sendNextInternal()
    {
        packageQueue.remove(0);
        writePackageQueue();
        isSending.set(false);
        sendFirstInternal();
    }

    private void writePackageQueue()
    {
        Util.writeObject(packageQueue, context, "AdjustIoPackageQueue", "Package queue");
        logger.debug("Package handler wrote %d packages", new Object[] {
            Integer.valueOf(packageQueue.size())
        });
    }

    public void addPackage(ActivityPackage activitypackage)
    {
        Message message = Message.obtain();
        message.arg1 = 2;
        message.obj = activitypackage;
        internalHandler.sendMessage(message);
    }

    public void closeFirstPackage()
    {
        isSending.set(false);
    }

    public void finishedTrackingActivity(JSONObject jsonobject)
    {
        activityHandler.finishedTrackingActivity(jsonobject);
    }

    public void init(IActivityHandler iactivityhandler, Context context1, boolean flag)
    {
        activityHandler = iactivityhandler;
        context = context1;
        paused = flag;
    }

    public void pauseSending()
    {
        paused = true;
    }

    public void resumeSending()
    {
        paused = false;
    }

    public void sendFirstPackage()
    {
        Message message = Message.obtain();
        message.arg1 = 4;
        internalHandler.sendMessage(message);
    }

    public void sendNextPackage()
    {
        Message message = Message.obtain();
        message.arg1 = 3;
        internalHandler.sendMessage(message);
    }




}
