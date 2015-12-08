// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.DialogInterface;
import com.paypal.android.sdk.cv;
import com.paypal.android.sdk.cw;
import com.paypal.android.sdk.cx;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            M, LoginActivity

final class N
    implements android.content.DialogInterface.OnClickListener
{

    private M a;

    N(M m)
    {
        a = m;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        LoginActivity.a(a.c, i);
        a.a.a(i);
        LoginActivity.e(a.c).o.a((String)a.b.get(i));
    }
}
