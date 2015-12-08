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

        public abstract void cr(String s);

        public abstract String nU();

        public abstract void nW();
    }

    private class b extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener aop;
        final n aoq;

        public void cs(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void ct(String s)
        {
            aop.onContainerAvailable(aoq, s);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                bh.T("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                ct((String)message.obj);
                break;
            }
        }

        public b(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            aoq = n.this;
            super(looper);
            aop = containeravailablelistener;
        }
    }


    private Status CM;
    private final Looper IH;
    private boolean NU;
    private Container aok;
    private Container aol;
    private b aom;
    private a aon;
    private TagManager aoo;

    public n(Status status)
    {
        CM = status;
        IH = null;
    }

    public n(TagManager tagmanager, Looper looper, Container container, a a1)
    {
        aoo = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        IH = looper;
        aok = container;
        aon = a1;
        CM = Status.Jv;
        tagmanager.a(this);
    }

    private void nV()
    {
        if (aom != null)
        {
            aom.cs(aol.nS());
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = NU;
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
        aol = container;
        nV();
          goto _L1
    }

    public void cp(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = NU;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aok.cp(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void cr(String s)
    {
        if (NU)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            aon.cr(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!NU) goto _L2; else goto _L1
_L1:
        bh.T("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (aol != null)
        {
            aok = aol;
            aol = null;
        }
        container = aok;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (NU)
        {
            bh.T("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aok.getContainerId();
        }
    }

    public Status getStatus()
    {
        return CM;
    }

    String nU()
    {
        if (NU)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aon.nU();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!NU) goto _L2; else goto _L1
_L1:
        bh.T("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aon.nW();
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
        if (!NU) goto _L2; else goto _L1
_L1:
        bh.T("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        NU = true;
        aoo.b(this);
        aok.release();
        aok = null;
        aol = null;
        aon = null;
        aom = null;
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
        if (!NU) goto _L2; else goto _L1
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
        aom = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        aom = new b(containeravailablelistener, IH);
        if (aol != null)
        {
            nV();
        }
          goto _L3
    }
}
