// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;

final class foo
    implements android.view.View.OnClickListener
{

    private fok a;

    foo(fok fok1)
    {
        a = fok1;
        super();
    }

    public final void onClick(View view)
    {
        if (!a.i())
        {
            return;
        } else
        {
            fok.h(a).a(pwr.t);
            view = a;
            hrk hrk1 = new hrk(a.O_(), fok.i(a).d());
            hrk1.a.putExtra("account_id", hrk1.b);
            view.a(hrk1.a);
            a.O_().overridePendingTransition(p.Q, 0);
            return;
        }
    }
}
