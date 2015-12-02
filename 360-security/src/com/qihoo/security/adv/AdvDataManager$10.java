// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import com.android.volley.ParseError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

class d
    implements com.android.volley.._cls10
{

    final WeakReference a;
    final String b;
    final Type c;
    final long d;
    final AdvDataManager e;

    public void a(VolleyError volleyerror)
    {
        d d1 = (d)a.get();
        char c1 = '\u2710';
        if (volleyerror instanceof ParseError)
        {
            long l = System.currentTimeMillis();
            AdvDataManager.a(e, b, 0L + l);
            c1 = '\u2713';
        }
        if (volleyerror instanceof TimeoutError)
        {
            c1 = '\u2711';
        }
        if (d1 != null)
        {
            d1.(c, Long.valueOf(d), c1);
        }
    }

    Type(AdvDataManager advdatamanager, WeakReference weakreference, String s, Type type, long l)
    {
        e = advdatamanager;
        a = weakreference;
        b = s;
        c = type;
        d = l;
        super();
    }
}
