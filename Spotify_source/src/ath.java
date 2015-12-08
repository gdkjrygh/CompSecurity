// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.HMILevel;
import com.ford.syncV4.proxy.rpc.enums.LockScreenStatus;
import java.util.Hashtable;

public final class ath
{

    private Boolean a;
    private Boolean b;
    private HMILevel c;

    public ath()
    {
        a = Boolean.valueOf(false);
        b = null;
        c = null;
    }

    private void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a = Boolean.valueOf(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private LockScreenStatus c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null && !c.equals(HMILevel.d)) goto _L2; else goto _L1
_L1:
        LockScreenStatus lockscreenstatus = LockScreenStatus.c;
_L4:
        this;
        JVM INSTR monitorexit ;
        return lockscreenstatus;
_L2:
        if (!c.equals(HMILevel.c))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (a.booleanValue())
        {
            lockscreenstatus = LockScreenStatus.a;
            continue; /* Loop/switch isn't completed */
        }
        lockscreenstatus = LockScreenStatus.c;
        continue; /* Loop/switch isn't completed */
        if (b.booleanValue() && a.booleanValue())
        {
            lockscreenstatus = LockScreenStatus.a;
            continue; /* Loop/switch isn't completed */
        }
        if (!b.booleanValue() && a.booleanValue())
        {
            lockscreenstatus = LockScreenStatus.b;
            continue; /* Loop/switch isn't completed */
        }
        lockscreenstatus = LockScreenStatus.c;
        continue; /* Loop/switch isn't completed */
        if (!c.equals(HMILevel.a) && !c.equals(HMILevel.b))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (b != null && !b.booleanValue())
        {
            lockscreenstatus = LockScreenStatus.b;
            continue; /* Loop/switch isn't completed */
        }
        lockscreenstatus = LockScreenStatus.a;
        continue; /* Loop/switch isn't completed */
        lockscreenstatus = LockScreenStatus.c;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void a(HMILevel hmilevel)
    {
        this;
        JVM INSTR monitorenter ;
        c = hmilevel;
        if (!hmilevel.equals(HMILevel.a) && !hmilevel.equals(HMILevel.b)) goto _L2; else goto _L1
_L1:
        b(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (hmilevel.equals(HMILevel.d))
        {
            b(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        hmilevel;
        throw hmilevel;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b = Boolean.valueOf(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final avh b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = new avh();
        obj1 = b;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ((avh) (obj)).b.put("driverDistraction", "notSet");
_L9:
        obj1 = c;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((avh) (obj)).b.put("hmiLevel", obj1);
_L11:
        obj1 = a;
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        ((avh) (obj)).b.put("userSelected", obj1);
_L13:
        obj1 = c();
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        ((avh) (obj)).b.put("showLockScreen", obj1);
_L15:
        this;
        JVM INSTR monitorexit ;
        return ((avh) (obj));
_L2:
        ((avh) (obj)).b.put("driverDistraction", ((Boolean) (obj1)).toString());
          goto _L9
        obj;
        throw obj;
_L4:
        if (!((avh) (obj)).b.contains("hmiLevel")) goto _L11; else goto _L10
_L10:
        ((avh) (obj)).b.remove("hmiLevel");
          goto _L11
_L6:
        if (!((avh) (obj)).b.contains("userSelected")) goto _L13; else goto _L12
_L12:
        ((avh) (obj)).b.remove("userSelected");
          goto _L13
_L8:
        if (!((avh) (obj)).b.contains("showLockScreen")) goto _L15; else goto _L14
_L14:
        ((avh) (obj)).b.remove("showLockScreen");
          goto _L15
    }
}
