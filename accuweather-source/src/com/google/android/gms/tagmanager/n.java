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

        public abstract String lj();

        public abstract void ll();
    }

    private class b extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener aeD;
        final n aeE;

        public void bK(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void bL(String s)
        {
            aeD.onContainerAvailable(aeE, s);
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
            aeE = n.this;
            super(looper);
            aeD = containeravailablelistener;
        }
    }


    private final Looper DC;
    private boolean Im;
    private b aeA;
    private a aeB;
    private TagManager aeC;
    private Container aey;
    private Container aez;
    private Status yw;

    public n(Status status)
    {
        yw = status;
        DC = null;
    }

    public n(TagManager tagmanager, Looper looper, Container container, a a1)
    {
        aeC = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        DC = looper;
        aey = container;
        aeB = a1;
        yw = Status.Ek;
        tagmanager.a(this);
    }

    private void lk()
    {
        if (aeA != null)
        {
            aeA.bK(aez.lh());
        }
    }

    public void a(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Im;
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
        aez = container;
        lk();
          goto _L1
    }

    public void bH(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Im;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aey.bH(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void bJ(String s)
    {
        if (Im)
        {
            bh.A("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            aeB.bJ(s);
            return;
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!Im) goto _L2; else goto _L1
_L1:
        bh.A("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (aez != null)
        {
            aey = aez;
            aez = null;
        }
        container = aey;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (Im)
        {
            bh.A("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aey.getContainerId();
        }
    }

    public Status getStatus()
    {
        return yw;
    }

    String lj()
    {
        if (Im)
        {
            bh.A("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aeB.lj();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!Im) goto _L2; else goto _L1
_L1:
        bh.A("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aeB.ll();
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
        if (!Im) goto _L2; else goto _L1
_L1:
        bh.A("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Im = true;
        aeC.b(this);
        aey.release();
        aey = null;
        aez = null;
        aeB = null;
        aeA = null;
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
        if (!Im) goto _L2; else goto _L1
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
        aeA = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        aeA = new b(containeravailablelistener, DC);
        if (aez != null)
        {
            lk();
        }
          goto _L3
    }
}
