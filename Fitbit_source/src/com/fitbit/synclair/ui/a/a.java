// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.a;

import com.fitbit.FitBitApplication;
import com.fitbit.synclair.SynclairError;
import com.fitbit.synclair.SynclairManager;
import com.fitbit.synclair.operation.info.SynclairOperationInfo;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.controller.c;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.util.ar;

// Referenced classes of package com.fitbit.synclair.ui.a:
//            f

public abstract class a
    implements f
{

    protected c a;

    public a()
    {
    }

    public void a()
    {
        a.a();
    }

    public boolean a(SynclairActivity synclairactivity)
    {
        Object obj = g();
        com.fitbit.synclair.SynclairManager.SynclairManagerState synclairmanagerstate = ((SynclairManager) (obj)).B();
        if (synclairmanagerstate == null)
        {
            synclairactivity.H();
            return false;
        }
        if (!com.fitbit.synclair.SynclairManager.SynclairManagerState.c.equals(synclairmanagerstate))
        {
            synclairactivity.g(false);
        }
        obj = ((SynclairManager) (obj)).C();
        if (!com.fitbit.synclair.SynclairManager.SynclairManagerState.b.equals(synclairmanagerstate) || !((SynclairOperationInfo) (obj)).h() || !com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.b.equals(((SynclairOperationInfo) (obj)).a()) || !synclairactivity.a(((SynclairOperationInfo) (obj)).b()))
        {
            synclairactivity.b(null);
        }
        return true;
    }

    protected boolean a(SynclairActivity synclairactivity, SynclairError synclairerror)
    {
    /* anonymous class not found */
    class _anm1 {}

        _cls1.b[synclairerror.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 54
    //                   2 71
    //                   3 110
    //                   4 128
    //                   5 141
    //                   6 159
    //                   7 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return false;
_L2:
        synclairactivity.a(synclairactivity.getString(0x7f08053a), null);
        synclairactivity.I();
_L10:
        return true;
_L3:
        if (ar.c(FitBitApplication.a()))
        {
            synclairerror = synclairactivity.getString(0x7f08053f);
        } else
        {
            synclairerror = synclairactivity.getString(0x7f08053d);
        }
        synclairactivity.a(synclairerror, null);
        synclairactivity.I();
        continue; /* Loop/switch isn't completed */
_L4:
        synclairactivity.a(synclairactivity.getString(0x7f08053c), null);
        synclairactivity.I();
        continue; /* Loop/switch isn't completed */
_L5:
        f().a(SynclairScreenState.u);
        continue; /* Loop/switch isn't completed */
_L6:
        synclairactivity.a(synclairactivity.getString(0x7f08018e), null);
        synclairactivity.I();
        continue; /* Loop/switch isn't completed */
_L7:
        f().a(SynclairScreenState.w);
        continue; /* Loop/switch isn't completed */
_L8:
        synclairactivity.a("TRACKER_VALIDATION_ERROR implemented not on BaseOperationResolver");
        if (true) goto _L10; else goto _L9
_L9:
    }

    public boolean b(SynclairActivity synclairactivity)
    {
        com.fitbit.synclair.SynclairManager.SynclairManagerState synclairmanagerstate = g().B();
        _cls1.a[synclairmanagerstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 46
    //                   2 52
    //                   3 54;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        synclairactivity.H();
        return true;
_L3:
        return false;
_L4:
        if (!synclairactivity.o())
        {
            synclairactivity.g(true);
            synclairactivity.K();
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void c(SynclairActivity synclairactivity)
    {
    }

    public void d(SynclairActivity synclairactivity)
    {
        f().q();
    }
}
