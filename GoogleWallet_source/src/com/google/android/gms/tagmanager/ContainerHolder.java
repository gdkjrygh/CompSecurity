// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            Container, bg, TagManager

public class ContainerHolder
    implements Releasable, Result
{
    public static interface ContainerAvailableListener
    {
    }


    private Status EU;
    private boolean YS;
    private Container aMI;
    private Container aMJ;
    private o.b aMK;
    private o.a aML;
    private TagManager aMM;

    public void ds(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = YS;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aMI.ds(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void du(String s)
    {
        if (YS)
        {
            bg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            s = aML;
            return;
        }
    }

    String getContainerId()
    {
        if (YS)
        {
            bg.e("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aMI.getContainerId();
        }
    }

    public Status getStatus()
    {
        return EU;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!YS) goto _L2; else goto _L1
_L1:
        bg.e("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        o.a a = aML;
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
        if (!YS) goto _L2; else goto _L1
_L1:
        bg.e("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        YS = true;
        aMM.b$7f9baf3(this);
        aMI.release();
        aMI = null;
        aMJ = null;
        aML = null;
        aMK = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String sx()
    {
        if (YS)
        {
            bg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aML.sx();
        }
    }
}
