// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import com.fitbit.bluetooth.c;
import com.fitbit.bluetooth.e;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity

class a
    implements com.fitbit.util.Fragment.a
{

    final com.fitbit.synclair.operation.info.fo.SynclairOperationType a;
    final SynclairActivity b;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        SynclairActivity.a(b).d();
    /* block-local class not found */
    class _cls1 {}

        if (!(new c(new _cls1())).a())
        {
            SynclairActivity.a(b, a);
        }
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    lairOperationType(SynclairActivity synclairactivity, com.fitbit.synclair.operation.info.fo.SynclairOperationType synclairoperationtype)
    {
        b = synclairactivity;
        a = synclairoperationtype;
        super();
    }
}
