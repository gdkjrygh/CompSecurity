// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            ScottyClientFactory, IUploadService, UploadService, ByteArrayWrapper

public class Uploader
{
    final class IUploadServiceCallbackImpl extends IUploadServiceCallback.Stub
    {

        Listener listener;
        final Uploader this$0;

        public final void onResponseReceived(final String sessionId, final ByteArrayWrapper responseTextBytes, int i)
            throws RemoteException
        {
            this;
            JVM INSTR monitorenter ;
            onUploadFinished(sessionId);
            if (responseTextBytes.getByteArray() != null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            Log.e(Uploader.TAG, (new StringBuilder(44)).append("Response is null. Response code: ").append(i).toString());
            (new Handler(context.getMainLooper())).post(sessionId. new Runnable() {

                final IUploadServiceCallbackImpl this$1;
                final String val$sessionId;

                public final void run()
                {
                    listener.onUploadFailed(sessionId);
                }

            
            {
                this$1 = final_iuploadservicecallbackimpl;
                sessionId = String.this;
                super();
            }
            });
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            (new Handler(context.getMainLooper())).post(i. new Runnable() {

                final IUploadServiceCallbackImpl this$1;
                final int val$httpResponseCode;
                final ByteArrayWrapper val$responseTextBytes;
                final String val$sessionId;

                public final void run()
                {
                    listener.onResponseReceived(sessionId, responseTextBytes.getByteArray(), httpResponseCode);
                }

            
            {
                this$1 = final_iuploadservicecallbackimpl;
                sessionId = s;
                responseTextBytes = bytearraywrapper;
                httpResponseCode = I.this;
                super();
            }
            });
            if (true) goto _L2; else goto _L1
_L1:
            sessionId;
            this;
            JVM INSTR monitorexit ;
            throw sessionId;
        }

        public final void onUploadFailed(String s)
            throws RemoteException
        {
            this;
            JVM INSTR monitorenter ;
            onUploadFinished(s);
            (new Handler(context.getMainLooper())).post(s. new Runnable() {

                final IUploadServiceCallbackImpl this$1;
                final String val$sessionId;

                public final void run()
                {
                    listener.onUploadFailed(sessionId);
                }

            
            {
                this$1 = final_iuploadservicecallbackimpl;
                sessionId = String.this;
                super();
            }
            });
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public IUploadServiceCallbackImpl(Listener listener1)
        {
            this$0 = Uploader.this;
            super();
            listener = (Listener)Preconditions.checkNotNull(listener1);
        }
    }

    public static interface Listener
    {

        public abstract void onResponseReceived(String s, byte abyte0[], int i);

        public abstract void onUploadFailed(String s);
    }

    final class PendingUploaderHolder
    {

        private final String authorizationHeader;
        private final Listener listener;
        private final String metadata;
        private final long size;
        final Uploader this$0;
        private final String uploadID;
        private final Uri uri;
        private final String url;








        PendingUploaderHolder(String s, String s1, Uri uri1, long l, String s2, 
                String s3, Listener listener1)
        {
            this$0 = Uploader.this;
            super();
            url = s;
            authorizationHeader = s1;
            uri = uri1;
            size = l;
            metadata = s2;
            uploadID = s3;
            listener = listener1;
        }
    }


    private static final String TAG = com/google/android/libraries/uploader/service/lib/service/Uploader.getName();
    private Map activeUploadIDs;
    private Context context;
    private boolean isBinding;
    private boolean isBound;
    private BroadcastReceiver onUploadServiceStart;
    private List pendingUploads;
    private ScottyClientFactory scottyClientFactory;
    private ServiceConnection serviceConnection;
    private IUploadService uploadService;

    public Uploader(Context context1)
    {
        serviceConnection = new ServiceConnection() {

            final Uploader this$0;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                this;
                JVM INSTR monitorenter ;
                uploadService = IUploadService.Stub.asInterface(ibinder);
                if (uploadService != null)
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                Log.e(Uploader.TAG, "Error connecting to AIDL Service");
                this;
                JVM INSTR monitorexit ;
                return;
                Log.i(Uploader.TAG, "Connected to AIDL Service. Starting all pending uploads.");
                try
                {
                    uploadService.onConnect();
                    isBound = true;
                    componentname = new ArrayList();
                    ibinder = pendingUploads.iterator();
                    do
                    {
                        if (!ibinder.hasNext())
                        {
                            break;
                        }
                        PendingUploaderHolder pendinguploaderholder = (PendingUploaderHolder)ibinder.next();
                        if (!startPendingUpload(pendinguploaderholder))
                        {
                            componentname.add(pendinguploaderholder);
                        }
                    } while (true);
                    break MISSING_BLOCK_LABEL_147;
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
                Log.e(Uploader.TAG, "RemoteException in Uploader#onServiceConnected", componentname);
_L1:
                this;
                JVM INSTR monitorexit ;
                return;
                componentname;
                this;
                JVM INSTR monitorexit ;
                throw componentname;
                pendingUploads.clear();
                isBinding = false;
                componentname = componentname.iterator();
                while (componentname.hasNext()) 
                {
                    ibinder = (PendingUploaderHolder)componentname.next();
                    ((PendingUploaderHolder) (ibinder)).listener.onUploadFailed(((PendingUploaderHolder) (ibinder)).uploadID);
                }
                  goto _L1
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                isBound = false;
            }

            
            {
                this$0 = Uploader.this;
                super();
            }
        };
        onUploadServiceStart = new BroadcastReceiver() {

            final Uploader this$0;

            public final void onReceive(Context context2, Intent intent)
            {
                Log.i(Uploader.TAG, "Restarting all active uploads");
                for (context2 = activeUploadIDs.entrySet().iterator(); context2.hasNext(); associateCallback((String)intent.getKey(), (Listener)intent.getValue()))
                {
                    intent = (java.util.Map.Entry)context2.next();
                }

            }

            
            {
                this$0 = Uploader.this;
                super();
            }
        };
        Preconditions.checkNotNull(context1);
        context = context1;
        isBound = false;
        scottyClientFactory = new ScottyClientFactory();
        activeUploadIDs = new HashMap();
        pendingUploads = new ArrayList();
        context1.registerReceiver(onUploadServiceStart, new IntentFilter("UploadService.Started"));
    }

    private boolean associateCallback(String s, Listener listener)
    {
        String s1 = TAG;
        Object obj = String.valueOf(s);
        boolean flag;
        if (((String) (obj)).length() != 0)
        {
            obj = "Uploader#restartUpload restarting Upload for session Id: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Uploader#restartUpload restarting Upload for session Id: ");
        }
        Log.i(s1, ((String) (obj)));
        if (!isBound)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj = null;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = new IUploadServiceCallbackImpl(listener);
        Preconditions.checkState(uploadService.sessionExists(s));
        flag = uploadService.associateCallback(s, ((IUploadServiceCallback) (obj)));
        return flag;
        s;
        Log.e(TAG, "RemoteException in Uploader#cancelUpload", s);
        return false;
    }

    private void onUploadFinished(String s)
    {
        activeUploadIDs.remove(s);
        if (activeUploadIDs.isEmpty() && !isBinding)
        {
            Log.i(TAG, "No more uploads. Unbind from the service.");
            unBindFromService();
        }
    }

    private boolean startPendingUpload(PendingUploaderHolder pendinguploaderholder)
    {
        String s = TAG;
        Object obj = String.valueOf(pendinguploaderholder.uploadID);
        boolean flag;
        boolean flag1;
        if (((String) (obj)).length() != 0)
        {
            obj = "Uploader#startPendingUpload for: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Uploader#startPendingUpload for: ");
        }
        Log.i(s, ((String) (obj)));
        obj = null;
        if (pendinguploaderholder.listener != null)
        {
            obj = new IUploadServiceCallbackImpl(pendinguploaderholder.listener);
        }
        flag = false;
        try
        {
            flag1 = uploadService.startUpload(pendinguploaderholder.url, pendinguploaderholder.authorizationHeader, pendinguploaderholder.uri, pendinguploaderholder.size, pendinguploaderholder.metadata, ((IUploadServiceCallback) (obj)), pendinguploaderholder.uploadID);
        }
        // Misplaced declaration of an exception variable
        catch (PendingUploaderHolder pendinguploaderholder)
        {
            Log.e(TAG, "RemoteException in Uploader#startPendingUpload", pendinguploaderholder);
            return flag;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        flag = flag1;
        activeUploadIDs.put(pendinguploaderholder.uploadID, pendinguploaderholder.listener);
        return flag1;
    }

    private void unBindFromService()
    {
        if (isBound)
        {
            Log.i(TAG, "unbinding...");
            try
            {
                uploadService.onDisconnect();
            }
            catch (RemoteException remoteexception)
            {
                Log.e(TAG, "RemoteException in Uploader#cleanUp", remoteexception);
            }
            context.unbindService(serviceConnection);
            isBound = false;
        }
    }

    public final String startUpload(String s, String s1, Uri uri, long l, String s2, Listener listener, 
            String s3)
    {
        this;
        JVM INSTR monitorenter ;
        String s4 = TAG;
        String s5 = String.valueOf(uri.toString());
        Log.i(s4, (new StringBuilder(String.valueOf(s5).length() + 32 + String.valueOf(s3).length())).append("In startUpload for ").append(s5).append(" session id: ").append(s3).toString());
        s = new PendingUploaderHolder(s, s1, uri, l, s2, s3, listener);
        if (!isBound)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        Log.i(TAG, "Service already binded. Start upload directly");
        if (startPendingUpload(s))
        {
            return s3;
        }
        this;
        JVM INSTR monitorexit ;
        return "error_starting_upload";
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        Log.i(TAG, "Service not binded. Adding to pending downloads.");
        if (!isBinding)
        {
            Log.i(TAG, "Starting service");
            s1 = new Intent(context, com/google/android/libraries/uploader/service/lib/service/UploadService);
            s1.putExtra("scottyClientFactory", scottyClientFactory);
            Preconditions.checkNotNull(context.startService(s1));
            s1 = new Intent(context, com/google/android/libraries/uploader/service/lib/service/UploadService);
            Preconditions.checkState(context.bindService(s1, serviceConnection, 1));
            isBinding = true;
        }
        pendingUploads.add(s);
        this;
        JVM INSTR monitorexit ;
        return s3;
    }





/*
    static boolean access$1202(Uploader uploader, boolean flag)
    {
        uploader.isBinding = flag;
        return flag;
    }

*/







/*
    static IUploadService access$702(Uploader uploader, IUploadService iuploadservice)
    {
        uploader.uploadService = iuploadservice;
        return iuploadservice;
    }

*/



/*
    static boolean access$902(Uploader uploader, boolean flag)
    {
        uploader.isBound = flag;
        return flag;
    }

*/
}
