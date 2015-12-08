// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Bundle;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.b;

// Referenced classes of package com.roidapp.photogrid:
//            an, MainPage

final class ao extends aa
{

    final Bundle a;
    final boolean b;
    final an c;

    ao(an an1, Bundle bundle, boolean flag)
    {
        c = an1;
        a = bundle;
        b = flag;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (c.b.isFinishing())
        {
            return;
        } else
        {
            MainPage.a(c.b, b);
            return;
        }
    }

    public final void c(Object obj)
    {
        if (!c.b.isFinishing())
        {
            obj = q.a(aj.a());
            p p1 = ((q) (obj)).c();
            if (p1 != null && p1.b != null)
            {
                String s = a.getString("nickname");
                if (s != null && !s.isEmpty())
                {
                    p1.b.b = s;
                }
                s = a.getString("gender");
                if (s != null && !s.isEmpty())
                {
                    p1.b.d = s;
                }
                ((q) (obj)).a(p1);
                com.roidapp.cloudlib.sns.g.b.a().a(p1, p1.b.b, p1.b.d);
            }
            MainPage.a(c.b, b);
        }
    }
}
