// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.bluetooth.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.ae;
import com.fitbit.synclair.SynclairError;

// Referenced classes of package com.fitbit.synclair.operation:
//            s

public class k extends s
{

    private static final String a = "SearchTrackerForUpdateOperation";
    private final String e;

    public k(a a1, String s1)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.d, a1);
        e = s1;
    }

    BluetoothDevice a(ae ae1)
    {
        return ae1.f();
    }

    volatile Object a(f f)
    {
        return a((ae)f);
    }

    protected void b(ae ae1)
    {
        a(SynclairError.a);
    }

    protected void c(f f)
    {
        b((ae)f);
    }

    protected String p()
    {
        return "SearchTrackerForUpdateOperation";
    }

    ae q()
    {
        return new ae(e);
    }

    f r()
    {
        return q();
    }
}
