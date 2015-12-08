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

        public abstract void br(String s);

        public abstract String ke();

        public abstract void kg();
    }

    private class b extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener WX;
        final n WY;

        public void bs(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void bt(String s)
        {
            WX.onContainerAvailable(WY, s);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                bh.w("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                bt((String)message.obj);
                break;
            }
        }

        public b(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            WY = n.this;
            super(looper);
            WX = containeravailablelistener;
        }
    }


    private final Looper AS;
    private Container WR;
    private Container WS;
    private b WT;
    private a WU;
    private boolean WV;
    private TagManager WW;
    private Status wJ;

    public n(Status status)
    {
        wJ = status;
        AS = null;
    }

    public n(TagManager tagmanager, Looper looper, Container container, a a1)
    {
        WW = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        AS = looper;
        WR = container;
        WU = a1;
        wJ = Status.Bv;
        tagmanager.a(this);
    }

    private void kf()
    {
        if (WT != null)
        {
            WT.bs(WS.kc());
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = WV;
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
        bh.w("Unexpected null container.");
          goto _L1
        container;
        throw container;
        WS = container;
        kf();
          goto _L1
    }

    public void bp(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = WV;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        WR.bp(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void br(String s)
    {
        if (WV)
        {
            bh.w("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            WU.br(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!WV) goto _L2; else goto _L1
_L1:
        bh.w("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (WS != null)
        {
            WR = WS;
            WS = null;
        }
        container = WR;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (WV)
        {
            bh.w("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return WR.getContainerId();
        }
    }

    public Status getStatus()
    {
        return wJ;
    }

    String ke()
    {
        if (WV)
        {
            bh.w("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return WU.ke();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!WV) goto _L2; else goto _L1
_L1:
        bh.w("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        WU.kg();
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
        if (!WV) goto _L2; else goto _L1
_L1:
        bh.w("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        WV = true;
        WW.b(this);
        WR.release();
        WR = null;
        WS = null;
        WU = null;
        WT = null;
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
        if (!WV) goto _L2; else goto _L1
_L1:
        bh.w("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        WT = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        WT = new b(containeravailablelistener, AS);
        if (WS != null)
        {
            kf();
        }
          goto _L3
    }
}
