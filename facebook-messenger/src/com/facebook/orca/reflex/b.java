// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import com.facebook.common.w.q;
import com.facebook.orca.prefs.an;
import com.facebook.prefs.shared.d;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.reflex:
//            e

public class b
    implements a
{

    private final d a;
    private final a b;
    private final e c;

    public b(d d, a a1, e e1)
    {
        a = d;
        b = a1;
        c = e1;
    }

    public Boolean a()
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return Boolean.FALSE;
        }
        q q1 = an.a(a);
        if (q1.isSet())
        {
            return Boolean.valueOf(q1.asBoolean());
        }
        boolean flag;
        if (c.b() || ((q)b.b()).equals(q.YES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
