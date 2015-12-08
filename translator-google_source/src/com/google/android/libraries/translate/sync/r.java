// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.DialogInterface;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            k, s, q

final class r
    implements android.content.DialogInterface.OnClickListener
{

    final q a;
    final k b;

    public r(k k1, q q)
    {
        b = k1;
        super();
        a = q;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        p.a(b.a, n.a(b.a, f.msg_confirm_signout_1, new int[] {
            f.msg_confirm_signout_2
        })).setNegativeButton(f.label_cancel, null).setPositiveButton(f.msg_signout, new s(this)).show();
    }
}
