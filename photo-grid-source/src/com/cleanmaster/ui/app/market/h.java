// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.content.Context;
import android.text.TextUtils;
import com.cleanmaster.util.n;
import com.picksinit.ClickAdFinishListener;
import com.picksinit.SmartGoGp;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            n, d, Ad

final class h
    implements com.cleanmaster.ui.app.market.n
{

    final Ad a;
    final String b;
    final ClickAdFinishListener c;
    final Context d;
    final String e;

    h(Ad ad, String s, ClickAdFinishListener clickadfinishlistener, Context context, String s1)
    {
        a = ad;
        b = s;
        c = clickadfinishlistener;
        d = context;
        e = s1;
        super();
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            String s1 = s;
            if (!com.cleanmaster.ui.app.market.d.a(s))
            {
                s1 = (new StringBuilder("market://details?id=")).append(a.getPkg()).toString();
                com.cleanmaster.ui.app.market.d.b(b, a, null);
            }
            if (c != null)
            {
                c.onClickFinish(new SmartGoGp(s1));
            } else
            {
                com.cleanmaster.ui.app.market.d.a(d, s1);
            }
            d.a.b(e, s1);
        }
    }
}
