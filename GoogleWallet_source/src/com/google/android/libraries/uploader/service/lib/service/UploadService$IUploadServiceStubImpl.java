// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.uploader.client.HttpHeaders;
import com.google.uploader.client.HttpUrlConnectionHttpClient;
import com.google.uploader.client.InputStreamDataStream;
import com.google.uploader.client.Transfer;
import com.google.uploader.client.TransferOptions;
import com.google.uploader.client.UploadClient;
import java.io.FileNotFoundException;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            UploadService, IUploadServiceCallback, ScottyClientFactory

final class <init> extends <init>
{

    final UploadService this$0;

    private <init> getTransferInfo(String s)
    {
        if (UploadService.access$300(UploadService.this).get(s) != null)
        {
            return (this._cls0)UploadService.access$300(UploadService.this).get(s);
        } else
        {
            return (this._cls0)UploadService.access$400(UploadService.this).get(s);
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
        transfer = s.r();
        if (s.ponse() == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        UploadService.access$600(UploadService.this, iuploadservicecallback, s);
        uploadservice;
        JVM INSTR monitorexit ;
        return true;
        if (s.rException() == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        iuploadservicecallback.onUploadFailed(s.Id());
        uploadservice;
        JVM INSTR monitorexit ;
        return true;
        s;
        uploadservice;
        JVM INSTR monitorexit ;
        throw s;
        this._cls0 _lcls0 = new nit>(UploadService.this);
        _lcls0.tCallback(iuploadservicecallback);
        _lcls0.tTransferInfo(s);
        transfer.attachListener(_lcls0, 0x10000);
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
        s2 = UploadService.access$100();
        s1 = String.valueOf(s);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s1 = "UploadService #cancelUpload for : ".concat(s1);
_L1:
        Log.i(s2, s1);
        s = (this._cls0)UploadService.access$300(UploadService.this).get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s.r().cancel();
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
        s2 = UploadService.access$100();
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
        double d = s.Done();
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
        s2 = UploadService.access$100();
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
        if (s.rException() != null)
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
            UploadService.access$508(UploadService.this);
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
            UploadService.access$510(UploadService.this);
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
                String s4 = UploadService.access$100();
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
        getTransferInfo gettransferinfo = new nit>(UploadService.this, iuploadservicecallback);
        iuploadservicecallback = null;
        if (!Strings.isNullOrEmpty(s1))
        {
            iuploadservicecallback = new HttpHeaders();
            iuploadservicecallback.set("Authorization", s1);
        }
        s1 = new HttpUrlConnectionHttpClient();
        UploadService.access$200(UploadService.this);
        s1 = ScottyClientFactory.generateClient(s1);
        java.io.InputStream inputstream = getContentResolver().openInputStream(uri);
        TransferOptions transferoptions = TransferOptions.newBuilder().getContentResolver();
        s = s1.createTransfer(s, "PUT", iuploadservicecallback, new InputStreamDataStream(inputstream, 0x100000), s2, transferoptions);
        s.attachListener(gettransferinfo, 0x10000);
        s1 = new this._cls0(l, s, s3, uri);
        gettransferinfo.tTransferInfo(s1);
        s2 = UploadService.access$100();
        uri = String.valueOf(uri);
        Log.i(s2, (new StringBuilder(String.valueOf(uri).length() + 43)).append("Calling scotty library to start upload for ").append(uri).toString());
        s.send();
        UploadService.access$300(UploadService.this).put(s3, s1);
        uploadservice;
        JVM INSTR monitorexit ;
        return true;
        s;
        uploadservice;
        JVM INSTR monitorexit ;
        throw s;
        s;
        Log.e(UploadService.access$100(), "FileNotFoundException!", s);
        uploadservice;
        JVM INSTR monitorexit ;
        return false;
        s;
        Log.e(UploadService.access$100(), "SecurityException", s);
        uploadservice;
        JVM INSTR monitorexit ;
        return false;
    }

    private ()
    {
        this$0 = UploadService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
