// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, Container, bh

class n
    implements ContainerHolder
{
    public static interface a
    {

        public abstract void ct(String s);

        public abstract String pl();

        public abstract void pn();
    }

    private class b extends Handler
    {

        final n aqA;
        private final ContainerHolder.ContainerAvailableListener aqz;

        public void cu(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void cv(String s)
        {
            aqz.onContainerAvailable(aqA, s);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                bh.T("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                cv((String)message.obj);
                break;
            }
        }

        public b(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            aqA = n.this;
            super(looper);
            aqz = containeravailablelistener;
        }
    }


    private Status Eb;
    private final Looper JF;
    private boolean Pf;
    private Container aqu;
    private Container aqv;
    private b aqw;
    private a aqx;
    private TagManager aqy;

    public n(Status status)
    {
        Eb = status;
        JF = null;
    }

    public n(TagManager tagmanager, Looper looper, Container container, a a1)
    {
        aqy = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        JF = looper;
        aqu = container;
        aqx = a1;
        Eb = Status.Kw;
        tagmanager.a(this);
    }

    private void pm()
    {
        if (aqw != null)
        {
            aqw.cu(aqv.pj());
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Pf;
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
        bh.T("Unexpected null container.");
          goto _L1
        container;
        throw container;
        aqv = container;
        pm();
          goto _L1
    }

    public void cr(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Pf;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aqu.cr(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void ct(String s)
    {
        if (Pf)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            aqx.ct(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (aqv != null)
        {
            aqu = aqv;
            aqv = null;
        }
        container = aqu;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (Pf)
        {
            bh.T("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aqu.getContainerId();
        }
    }

    public Status getStatus()
    {
        return Eb;
    }

    String pl()
    {
        if (Pf)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aqx.pl();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aqx.pn();
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
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Pf = true;
        aqy.b(this);
        aqu.release();
        aqu = null;
        aqv = null;
        aqx = null;
        aqw = null;
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
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        aqw = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        aqw = new b(containeravailablelistener, JF);
        if (aqv != null)
        {
            pm();
        }
          goto _L3
    }
}
