// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.app.Service;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.uploader.client.HttpHeaders;
import com.google.uploader.client.HttpResponse;
import com.google.uploader.client.HttpUrlConnectionHttpClient;
import com.google.uploader.client.InputStreamDataStream;
import com.google.uploader.client.Transfer;
import com.google.uploader.client.TransferException;
import com.google.uploader.client.TransferListener;
import com.google.uploader.client.TransferOptions;
import com.google.uploader.client.UploadClient;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            ByteArrayWrapper, IUploadServiceCallback, ScottyClientFactory

public class UploadService extends Service
{
    final class IUploadServiceStubImpl extends IUploadService.Stub
    {

        final UploadService this$0;

        private TransferInfo getTransferInfo(String s)
        {
            if (activeTransfers.get(s) != null)
            {
                return (TransferInfo)activeTransfers.get(s);
            } else
            {
                return (TransferInfo)inactiveTransfers.get(s);
            }
        }

        public final boolean associateCallback(String s, IUploadServiceCallback iuploadservicecallback)
            throws RemoteException
        {
            UploadService uploadservice = UploadService.this;
            uploadservice;
            JVM INSTR monitorenter ;
            s = getTransferInfo(s);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            Transfer transfer;
            transfer = s.getTransfer();
            if (s.getHttpResponse() == null)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            UploadService.invokeOnResponseReceivedCallback(UploadService.this, iuploadservicecallback, s);
            uploadservice;
            JVM INSTR monitorexit ;
            return true;
            if (s.getTransferException() == null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            iuploadservicecallback.onUploadFailed(s.getSessionId());
            uploadservice;
            JVM INSTR monitorexit ;
            return true;
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
            TransferListenerImpl transferlistenerimpl = new TransferListenerImpl();
            transferlistenerimpl.setCallback(iuploadservicecallback);
            transferlistenerimpl.setTransferInfo(s);
            transfer.attachListener(transferlistenerimpl, 0x10000);
            uploadservice;
            JVM INSTR monitorexit ;
            return true;
            uploadservice;
            JVM INSTR monitorexit ;
            return false;
        }

        public final void cancelUpload(String s)
            throws RemoteException
        {
            UploadService uploadservice = UploadService.this;
            uploadservice;
            JVM INSTR monitorenter ;
            String s1;
            String s2;
            s2 = UploadService.TAG;
            s1 = String.valueOf(s);
            if (s1.length() == 0)
            {
                break MISSING_BLOCK_LABEL_71;
            }
            s1 = "UploadService #cancelUpload for : ".concat(s1);
_L1:
            Log.i(s2, s1);
            s = (TransferInfo)activeTransfers.get(s);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            s.getTransfer().cancel();
            uploadservice;
            JVM INSTR monitorexit ;
            return;
            s1 = new String("UploadService #cancelUpload for : ");
              goto _L1
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final double getUpdate(String s)
            throws RemoteException
        {
            UploadService uploadservice = UploadService.this;
            uploadservice;
            JVM INSTR monitorenter ;
            String s1;
            String s2;
            s2 = UploadService.TAG;
            s1 = String.valueOf(s);
            if (s1.length() == 0)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            s1 = "UploadService #getUpdate for : ".concat(s1);
_L1:
            Log.i(s2, s1);
            s = getTransferInfo(s);
            if (s != null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            uploadservice;
            JVM INSTR monitorexit ;
            return -1D;
            s1 = new String("UploadService #getUpdate for : ");
              goto _L1
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
            double d = s.getPercentDone();
            uploadservice;
            JVM INSTR monitorexit ;
            return d;
        }

        public final boolean hasUploadFailed(String s)
            throws RemoteException
        {
            boolean flag = false;
            UploadService uploadservice = UploadService.this;
            uploadservice;
            JVM INSTR monitorenter ;
            String s1;
            String s2;
            s2 = UploadService.TAG;
            s1 = String.valueOf(s);
            if (s1.length() == 0)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            s1 = "UploadService #isUploadFailed for : ".concat(s1);
_L1:
            Log.i(s2, s1);
            s = getTransferInfo(s);
            if (s != null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            uploadservice;
            JVM INSTR monitorexit ;
            return false;
            s1 = new String("UploadService #isUploadFailed for : ");
              goto _L1
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
            if (s.getTransferException() != null)
            {
                flag = true;
            }
            uploadservice;
            JVM INSTR monitorexit ;
            return flag;
        }

        public final void onConnect()
            throws RemoteException
        {
            synchronized (UploadService.this)
            {
                int i = ((com.google.android.libraries.uploader.service.lib.service) (this)).IUploadServiceCallback;
            }
            return;
            exception;
            uploadservice;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onDisconnect()
            throws RemoteException
        {
            synchronized (UploadService.this)
            {
                int i = ((com.google.android.libraries.uploader.service.lib.service) (this)).IUploadServiceCallback;
            }
            return;
            exception;
            uploadservice;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final boolean sessionExists(String s)
            throws RemoteException
        {
            UploadService uploadservice = UploadService.this;
            uploadservice;
            JVM INSTR monitorenter ;
            boolean flag;
            if (getTransferInfo(s) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uploadservice;
            JVM INSTR monitorexit ;
            return flag;
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final boolean startUpload(String s, String s1, Uri uri, long l, String s2, IUploadServiceCallback iuploadservicecallback, 
                String s3)
            throws RemoteException
        {
label0:
            {
                synchronized (UploadService.this)
                {
                    String s4 = UploadService.TAG;
                    String s5 = String.valueOf(uri);
                    Log.i(s4, (new StringBuilder(String.valueOf(s5).length() + 33 + String.valueOf(s2).length())).append("UploadService#startUpload for : ").append(s5).append(" ").append(s2).toString());
                    Preconditions.checkNotNull(s3);
                    if (!associateCallback(s3, iuploadservicecallback))
                    {
                        break label0;
                    }
                }
                return true;
            }
            TransferListenerImpl transferlistenerimpl = new TransferListenerImpl(iuploadservicecallback);
            iuploadservicecallback = null;
            if (!Strings.isNullOrEmpty(s1))
            {
                iuploadservicecallback = new HttpHeaders();
                iuploadservicecallback.set("Authorization", s1);
            }
            s1 = new HttpUrlConnectionHttpClient();
            scottyClientFactory;
            s1 = ScottyClientFactory.generateClient(s1);
            InputStream inputstream = getContentResolver().openInputStream(uri);
            TransferOptions transferoptions = TransferOptions.newBuilder().build();
            s = s1.createTransfer(s, "PUT", iuploadservicecallback, new InputStreamDataStream(inputstream, 0x100000), s2, transferoptions);
            s.attachListener(transferlistenerimpl, 0x10000);
            s1 = new TransferInfo(l, s, s3, uri);
            transferlistenerimpl.setTransferInfo(s1);
            s2 = UploadService.TAG;
            uri = String.valueOf(uri);
            Log.i(s2, (new StringBuilder(String.valueOf(uri).length() + 43)).append("Calling scotty library to start upload for ").append(uri).toString());
            s.send();
            activeTransfers.put(s3, s1);
            uploadservice;
            JVM INSTR monitorexit ;
            return true;
            s;
            uploadservice;
            JVM INSTR monitorexit ;
            throw s;
            s;
            Log.e(UploadService.TAG, "FileNotFoundException!", s);
            uploadservice;
            JVM INSTR monitorexit ;
            return false;
            s;
            Log.e(UploadService.TAG, "SecurityException", s);
            uploadservice;
            JVM INSTR monitorexit ;
            return false;
        }

        private IUploadServiceStubImpl()
        {
            this$0 = UploadService.this;
            super();
        }

    }

    static final class TransferInfo
    {

        private TransferException exception;
        private HttpResponse response;
        private long totalBytes;
        private Transfer transfer;
        private String uploadSessionId;
        private Uri uri;

        public final void completeTransfer(HttpResponse httpresponse)
        {
            boolean flag;
            if (exception == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            response = httpresponse;
        }

        public final void completeTransfer(TransferException transferexception)
        {
            boolean flag;
            if (response == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            exception = transferexception;
        }

        public final HttpResponse getHttpResponse()
        {
            return response;
        }

        public final double getPercentDone()
        {
            return (double)transfer.getBytesUploaded() / (double)totalBytes;
        }

        public final String getSessionId()
        {
            return uploadSessionId;
        }

        public final Transfer getTransfer()
        {
            return transfer;
        }

        public final TransferException getTransferException()
        {
            return exception;
        }

        public TransferInfo(long l, Transfer transfer1, String s, Uri uri1)
        {
            totalBytes = l;
            transfer = (Transfer)Preconditions.checkNotNull(transfer1);
            uploadSessionId = (String)Preconditions.checkNotNull(s);
            uri = (Uri)Preconditions.checkNotNull(uri1);
        }
    }

    final class TransferListenerImpl extends TransferListener
    {

        private IUploadServiceCallback callback;
        final UploadService this$0;
        private TransferInfo transferInfo;

        public final void onException(Transfer transfer, TransferException transferexception)
        {
            Log.i(UploadService.TAG, " in onException");
            String s = UploadService.TAG;
            transfer = String.valueOf(transferInfo.getTransfer().getTransferHandle());
            if (transfer.length() != 0)
            {
                transfer = " scotty upload id: ".concat(transfer);
            } else
            {
                transfer = new String(" scotty upload id: ");
            }
            Log.i(s, transfer);
            transferInfo.completeTransfer(transferexception);
            removeFromActiveTransfers(transferInfo);
            if (transferexception.getType() != com.google.uploader.client.TransferException.Type.CANCELED)
            {
                if (callback != null)
                {
                    try
                    {
                        callback.onUploadFailed(transferInfo.getSessionId());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Transfer transfer)
                    {
                        Log.e(UploadService.TAG, "Process that provided the callback is no longer present", transfer);
                    }
                }
                Log.e(UploadService.TAG, "Exception when uploading: ", transferexception);
            }
        }

        public final void onResponseReceived(Transfer transfer, HttpResponse httpresponse)
        {
            String s = UploadService.TAG;
            transfer = String.valueOf(transferInfo.getSessionId());
            if (transfer.length() != 0)
            {
                transfer = " in onResponseReceived for ".concat(transfer);
            } else
            {
                transfer = new String(" in onResponseReceived for ");
            }
            Log.i(s, transfer);
            transferInfo.completeTransfer(httpresponse);
            UploadService.invokeOnResponseReceivedCallback(UploadService.this, callback, transferInfo);
            removeFromActiveTransfers(transferInfo);
        }

        public final void onStart(Transfer transfer)
        {
            Preconditions.checkNotNull(transferInfo);
            String s = UploadService.TAG;
            transfer = String.valueOf(transferInfo.getSessionId());
            if (transfer.length() != 0)
            {
                transfer = " in onStart for ".concat(transfer);
            } else
            {
                transfer = new String(" in onStart for ");
            }
            Log.i(s, transfer);
        }

        public final void onTransferHandleReady(Transfer transfer)
        {
            Preconditions.checkNotNull(transferInfo);
            String s = UploadService.TAG;
            transfer = String.valueOf(transferInfo.getSessionId());
            if (transfer.length() != 0)
            {
                transfer = " in onTransferHandleReady for ".concat(transfer);
            } else
            {
                transfer = new String(" in onTransferHandleReady for ");
            }
            Log.i(s, transfer);
            s = UploadService.TAG;
            transfer = String.valueOf(transferInfo.getTransfer().getTransferHandle());
            if (transfer.length() != 0)
            {
                transfer = " scotty upload id: ".concat(transfer);
            } else
            {
                transfer = new String(" scotty upload id: ");
            }
            Log.i(s, transfer);
        }

        public final void onUploadProgress(Transfer transfer)
        {
            transfer = UploadService.TAG;
            String s = transferInfo.getSessionId();
            double d = transferInfo.getPercentDone();
            Log.i(transfer, (new StringBuilder(String.valueOf(s).length() + 53)).append(" in onUploadProgress for ").append(s).append(" : ").append(d * 100D).append("%").toString());
        }

        public final void setCallback(IUploadServiceCallback iuploadservicecallback)
        {
            callback = (IUploadServiceCallback)Preconditions.checkNotNull(iuploadservicecallback);
        }

        public final void setTransferInfo(TransferInfo transferinfo)
        {
            transferInfo = (TransferInfo)Preconditions.checkNotNull(transferinfo);
        }

        public TransferListenerImpl()
        {
            this$0 = UploadService.this;
            super();
        }

        public TransferListenerImpl(IUploadServiceCallback iuploadservicecallback)
        {
            this$0 = UploadService.this;
            super();
            setCallback(iuploadservicecallback);
        }
    }


    private static final String TAG = com/google/android/libraries/uploader/service/lib/service/UploadService.getName();
    private Map activeTransfers;
    private IUploadServiceStubImpl binder;
    private Map inactiveTransfers;
    private int numClients;
    private ScottyClientFactory scottyClientFactory;

    public UploadService()
    {
        binder = new IUploadServiceStubImpl();
        activeTransfers = new HashMap();
        inactiveTransfers = new HashMap();
    }

    private static void invokeOnResponseReceivedCallback(IUploadServiceCallback iuploadservicecallback, TransferInfo transferinfo)
    {
        if (iuploadservicecallback == null) goto _L2; else goto _L1
_L1:
        ByteArrayOutputStream bytearrayoutputstream;
        InputStream inputstream;
        byte abyte0[];
        inputstream = transferinfo.getHttpResponse().getResponseBody();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[4096];
_L5:
        int i = inputstream.read(abyte0);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L5
_L2:
        return;
_L4:
        try
        {
            ByteArrayWrapper bytearraywrapper = new ByteArrayWrapper();
            bytearraywrapper.setByteArray(bytearrayoutputstream.toByteArray());
            iuploadservicecallback.onResponseReceived(transferinfo.getSessionId(), bytearraywrapper, transferinfo.getHttpResponse().getResponseCode());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IUploadServiceCallback iuploadservicecallback)
        {
            Log.e(TAG, "Process that provided the callback is no longer present.", iuploadservicecallback);
        }
        // Misplaced declaration of an exception variable
        catch (IUploadServiceCallback iuploadservicecallback)
        {
            Log.e(TAG, "IOException while reading the response body,", iuploadservicecallback);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void removeFromActiveTransfers(TransferInfo transferinfo)
    {
        this;
        JVM INSTR monitorenter ;
        Log.i(TAG, "Removing transferinfo from active");
        activeTransfers.remove(transferinfo.getSessionId());
        inactiveTransfers.put(transferinfo.getSessionId(), transferinfo);
        if (activeTransfers.isEmpty() && numClients == 0)
        {
            Log.i(TAG, "in handler : calling stopSelf");
            stopSelf();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        transferinfo;
        this;
        JVM INSTR monitorexit ;
        throw transferinfo;
    }

    public IBinder onBind(Intent intent)
    {
        return binder;
    }

    public void onCreate()
    {
        super.onCreate();
        numClients = 0;
    }

    public void onDestroy()
    {
        Log.i(TAG, "UploadService#onDestroy");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Log.i(TAG, "starting Remote Upload Service...");
        this;
        JVM INSTR monitorenter ;
        if (scottyClientFactory == null)
        {
            scottyClientFactory = (ScottyClientFactory)intent.getExtras().getParcelable("scottyClientFactory");
            Preconditions.checkNotNull(scottyClientFactory);
            sendBroadcast(new Intent("UploadService.Started"));
        }
        this;
        JVM INSTR monitorexit ;
        return 3;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public boolean onUnbind(Intent intent)
    {
        Log.i(TAG, "UploadService#onUnbind - disconnected from all clients");
        if (activeTransfers.isEmpty())
        {
            Log.i(TAG, "onUnbind : calling stopSelf");
            stopSelf();
        }
        return false;
    }







/*
    static int access$508(UploadService uploadservice)
    {
        int i = uploadservice.numClients;
        uploadservice.numClients = i + 1;
        return i;
    }

*/


/*
    static int access$510(UploadService uploadservice)
    {
        int i = uploadservice.numClients;
        uploadservice.numClients = i - 1;
        return i;
    }

*/


}
