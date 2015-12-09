// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, Container, zzbg

class zzo
    implements ContainerHolder
{
    private class a extends Handler
    {

        final zzo a;
        private final ContainerHolder.ContainerAvailableListener b;

        public void a(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void b(String s)
        {
            b.onContainerAvailable(a, s);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                zzbg.zzak("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                b((String)message.obj);
                break;
            }
        }

        public a(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            a = zzo.this;
            super(looper);
            b = containeravailablelistener;
        }
    }

    public static interface zza
    {

        public abstract void zzdB(String s);

        public abstract String zzwu();

        public abstract void zzww();
    }


    private final Looper a;
    private Container b;
    private Container c;
    private Status d;
    private a e;
    private zza f;
    private boolean g;
    private TagManager h;

    public zzo(Status status)
    {
        d = status;
        a = null;
    }

    public zzo(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        h = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        a = looper;
        b = container;
        f = zza1;
        d = Status.zzQU;
        tagmanager.zza(this);
    }

    private void c()
    {
        if (e != null)
        {
            e.a(c.zzws());
        }
    }

    String a()
    {
        if (g)
        {
            zzbg.zzak("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return b.getContainerId();
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (container != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        zzbg.zzak("Unexpected null container.");
          goto _L1
        container;
        throw container;
        c = container;
        c();
          goto _L1
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.zzdz(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    String b()
    {
        if (g)
        {
            zzbg.zzak("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return f.zzwu();
        }
    }

    void b(String s)
    {
        if (g)
        {
            zzbg.zzak("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            f.zzdB(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        zzbg.zzak("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (c != null)
        {
            b = c;
            c = null;
        }
        container = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Status getStatus()
    {
        return d;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        zzbg.zzak("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.zzww();
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
        if (!g) goto _L2; else goto _L1
_L1:
        zzbg.zzak("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g = true;
        h.zzb(this);
        b.release();
        b = null;
        c = null;
        f = null;
        e = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containeravailablelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g) goto _L2; else goto _L1
_L1:
        zzbg.zzak("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        e = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        e = new a(containeravailablelistener, a);
        if (c != null)
        {
            c();
        }
          goto _L3
    }
}
