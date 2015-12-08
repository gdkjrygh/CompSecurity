// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.utils;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.n;
import java.util.HashMap;

// Referenced classes of package com.cleanmaster.ui.app.utils:
//            a

final class b
    implements n
{

    final String a;
    final a b;

    b(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public final void a(String s)
    {
        com.cleanmaster.ui.app.utils.a.a(b).remove(a);
        if (!TextUtils.isEmpty(s))
        {
            com.cleanmaster.ui.app.utils.a.a(b, a, s);
        }
        com.cleanmaster.ui.app.utils.a.b(b);
    }
}
