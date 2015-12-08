// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.synclair.operation.BaseSynclairOperation;
import com.fitbit.synclair.operation.o;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.synclair:
//            SynclairManager

class <init> extends <init>
{

    final SynclairManager a;

    protected volatile void a(BaseSynclairOperation basesynclairoperation)
    {
        a((o)basesynclairoperation);
    }

    protected void a(o o1)
    {
        super.a(o1);
        BluetoothErrorsHandler.a().a(EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError));
    }

    lairOperation(SynclairManager synclairmanager)
    {
        a = synclairmanager;
        super(synclairmanager);
    }
}
