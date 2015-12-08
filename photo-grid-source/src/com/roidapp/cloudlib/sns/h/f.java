// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.view.View;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.z;
import java.io.IOException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            a

final class f extends aa
{

    String a;
    private WeakReference b;

    public f(a a1)
    {
        b = new WeakReference(a1);
        a = com.roidapp.cloudlib.sns.h.a.h(a1);
    }

    public final void b(int i, Exception exception)
    {
        a a1 = (a)b.get();
        if (a1 != null)
        {
            if (!(exception instanceof z) && (exception instanceof IOException))
            {
                com.roidapp.cloudlib.sns.h.a.a(a1, at.e, true);
            } else
            {
                com.roidapp.cloudlib.sns.h.a.a(a1, at.be, false);
            }
            if (com.roidapp.cloudlib.sns.h.a.g(a1) != null)
            {
                com.roidapp.cloudlib.sns.h.a.g(a1).setVisibility(8);
            }
        }
    }

    public final void c(Object obj)
    {
        obj = (x)obj;
        q q1 = q.a(aj.a());
        p p1 = q1.c();
        if (p1 != null && p1.b != null)
        {
            p1.b.h = ((x) (obj)).h;
            q1.a(p1);
            com.roidapp.cloudlib.sns.g.b.a().b(p1, ((x) (obj)).h, a);
            obj = (a)b.get();
            if (obj != null)
            {
                com.roidapp.cloudlib.sns.h.a.i(((a) (obj)));
                if (com.roidapp.cloudlib.sns.h.a.g(((a) (obj))) != null)
                {
                    com.roidapp.cloudlib.sns.h.a.g(((a) (obj))).setVisibility(8);
                    return;
                }
            }
        }
    }
}
