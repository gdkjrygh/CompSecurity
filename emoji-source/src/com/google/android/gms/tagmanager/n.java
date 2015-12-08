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

        public abstract void bJ(String s);

        public abstract String lo();

        public abstract void lq();
    }

    private class b extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener aeG;
        final n aeH;

        public void bK(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void bL(String s)
        {
            aeG.onContainerAvailable(aeH, s);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                bh.A("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                bL((String)message.obj);
                break;
            }
        }

        public b(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            aeH = n.this;
            super(looper);
            aeG = containeravailablelistener;
        }
    }


    private final Looper DF;
    private boolean Ip;
    private Container aeB;
    private Container aeC;
    private b aeD;
    private a aeE;
    private TagManager aeF;
    private Status yz;

    public n(Status status)
    {
        yz = status;
        DF = null;
    }

    public n(TagManager tagmanager, Looper looper, Container container, a a1)
    {
        aeF = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        DF = looper;
        aeB = container;
        aeE = a1;
        yz = Status.En;
        tagmanager.a(this);
    }

    private void lp()
    {
        if (aeD != null)
        {
            aeD.bK(aeC.lm());
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Ip;
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
        bh.A("Unexpected null container.");
          goto _L1
        container;
        throw container;
        aeC = container;
        lp();
          goto _L1
    }

    public void bH(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Ip;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aeB.bH(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void bJ(String s)
    {
        if (Ip)
        {
            bh.A("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            aeE.bJ(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!Ip) goto _L2; else goto _L1
_L1:
        bh.A("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (aeC != null)
        {
            aeB = aeC;
            aeC = null;
        }
        container = aeB;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (Ip)
        {
            bh.A("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aeB.getContainerId();
        }
    }

    public Status getStatus()
    {
        return yz;
    }

    String lo()
    {
        if (Ip)
        {
            bh.A("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aeE.lo();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!Ip) goto _L2; else goto _L1
_L1:
        bh.A("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aeE.lq();
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
        if (!Ip) goto _L2; else goto _L1
_L1:
        bh.A("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Ip = true;
        aeF.b(this);
        aeB.release();
        aeB = null;
        aeC = null;
        aeE = null;
        aeD = null;
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
        if (!Ip) goto _L2; else goto _L1
_L1:
        bh.A("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        aeD = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        aeD = new b(containeravailablelistener, DF);
        if (aeC != null)
        {
            lp();
        }
          goto _L3
    }
}
