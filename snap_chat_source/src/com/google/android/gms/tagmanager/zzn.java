// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, zzbf, Container

class zzn
    implements ContainerHolder
{
    public static interface zza
    {

        public abstract void zzcQ(String s);

        public abstract String zzsK();

        public abstract void zzsM();
    }

    class zzb extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener zzaxJ;
        final zzn zzaxK;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                zzbf.zzZ("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                zzcS((String)message.obj);
                break;
            }
        }

        protected void zzcS(String s)
        {
            zzaxJ.onContainerAvailable(zzaxK, s);
        }
    }


    private Status zzHb;
    private final Looper zzMc;
    private boolean zzSW;
    private Container zzaxE;
    private Container zzaxF;
    private zzb zzaxG;
    private zza zzaxH;
    private TagManager zzaxI;

    public zzn(Status status)
    {
        zzHb = status;
        zzMc = null;
    }

    public zzn(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        zzaxI = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        zzMc = looper;
        zzaxE = container;
        zzaxH = zza1;
        zzHb = Status.zzNo;
        tagmanager.zza(this);
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!zzSW) goto _L2; else goto _L1
_L1:
        zzbf.zzZ("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (zzaxF != null)
        {
            zzaxE = zzaxF;
            zzaxF = null;
        }
        container = zzaxE;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (zzSW)
        {
            zzbf.zzZ("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaxE.getContainerId();
        }
    }

    public Status getStatus()
    {
        return zzHb;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzSW) goto _L2; else goto _L1
_L1:
        zzbf.zzZ("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaxH.zzsM();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzSW) goto _L2; else goto _L1
_L1:
        zzbf.zzZ("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzSW = true;
        zzaxI.zzb(this);
        zzaxE.release();
        zzaxE = null;
        zzaxF = null;
        zzaxH = null;
        zzaxG = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void zzcO(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzSW;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaxE.zzcO(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void zzcQ(String s)
    {
        if (zzSW)
        {
            zzbf.zzZ("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            zzaxH.zzcQ(s);
            return;
        }
    }

    String zzsK()
    {
        if (zzSW)
        {
            zzbf.zzZ("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaxH.zzsK();
        }
    }
}
