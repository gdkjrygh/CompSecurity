// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.text.TextUtils;
import com.picksinit.PicksMob;
import com.picksinit.b;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            d, k, i, o, 
//            m

final class l
    implements Runnable
{

    final String a;
    final k b;

    l(k k1, String s)
    {
        b = k1;
        a = s;
        super();
    }

    public final void run()
    {
        if (TextUtils.isEmpty(a) || d.a(a))
        {
            i.a(b.d, a);
            return;
        } else
        {
            o o1 = new o(PicksMob.getInstance().getContext());
            o1.a(new m(this));
            o1.a(a, b.a, b.b, b.c);
            return;
        }
    }
}
