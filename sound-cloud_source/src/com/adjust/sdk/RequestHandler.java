// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            IRequestHandler, AdjustFactory, ActivityPackage, ILogger, 
//            IPackageHandler, Util

public class RequestHandler extends HandlerThread
    implements IRequestHandler
{
    private static final class InternalHandler extends Handler
    {

        private static final int SEND = 0x11ad0;
        private final WeakReference requestHandlerReference;

        public final void handleMessage(Message message)
        {
            super.handleMessage(message);
            RequestHandler requesthandler = (RequestHandler)requestHandlerReference.get();
            if (requesthandler == null)
            {
                return;
            }
            switch (message.arg1)
            {
            default:
                return;

            case 72400: 
                requesthandler.sendInternal((ActivityPackage)message.obj);
                break;
            }
        }

        protected InternalHandler(Looper looper, RequestHandler requesthandler)
        {
            super(looper);
            requestHandlerReference = new WeakReference(requesthandler);
        }
    }


    private InternalHandler internalHandler;
    private ILogger logger;
    private IPackageHandler packageHandler;

    public RequestHandler(IPackageHandler ipackagehandler)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        logger = AdjustFactory.getLogger();
        internalHandler = new InternalHandler(getLooper(), this);
        init(ipackagehandler);
    }

    private void closePackage(ActivityPackage activitypackage, String s, Throwable throwable)
    {
        activitypackage = activitypackage.getFailureMessage();
        s = getReasonString(s, throwable);
        logger.error("%s. (%s) Will retry later", new Object[] {
            activitypackage, s
        });
        packageHandler.closeFirstPackage();
    }

    private String getReasonString(String s, Throwable throwable)
    {
        if (throwable != null)
        {
            return String.format(Locale.US, "%s: %s", new Object[] {
                s, throwable
            });
        } else
        {
            return String.format(Locale.US, "%s", new Object[] {
                s
            });
        }
    }

    private void requestFinished(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            packageHandler.closeFirstPackage();
            return;
        } else
        {
            packageHandler.finishedTrackingActivity(jsonobject);
            packageHandler.sendNextPackage();
            return;
        }
    }

    private void sendInternal(ActivityPackage activitypackage)
    {
        String s = (new StringBuilder("https://app.adjust.com")).append(activitypackage.getPath()).toString();
        try
        {
            requestFinished(Util.readHttpResponse(Util.createPOSTHttpsURLConnection(s, activitypackage.getClientSdk(), activitypackage.getParameters())));
            return;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            sendNextPackage(activitypackage, "Failed to encode parameters", unsupportedencodingexception);
            return;
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            closePackage(activitypackage, "Request timed out", sockettimeoutexception);
            return;
        }
        catch (IOException ioexception)
        {
            closePackage(activitypackage, "Request failed", ioexception);
            return;
        }
        catch (Throwable throwable)
        {
            sendNextPackage(activitypackage, "Runtime exception", throwable);
        }
    }

    private void sendNextPackage(ActivityPackage activitypackage, String s, Throwable throwable)
    {
        activitypackage = activitypackage.getFailureMessage();
        s = getReasonString(s, throwable);
        logger.error("%s. (%s)", new Object[] {
            activitypackage, s
        });
        packageHandler.sendNextPackage();
    }

    public void init(IPackageHandler ipackagehandler)
    {
        packageHandler = ipackagehandler;
    }

    public void sendPackage(ActivityPackage activitypackage)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11ad0;
        message.obj = activitypackage;
        internalHandler.sendMessage(message);
    }

}
