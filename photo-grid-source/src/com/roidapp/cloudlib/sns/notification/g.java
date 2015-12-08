// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.f;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f, n

final class g
    implements android.view.View.OnClickListener
{

    final n a;
    final com.roidapp.cloudlib.sns.notification.f b;

    g(com.roidapp.cloudlib.sns.notification.f f1, n n)
    {
        b = f1;
        a = n;
        super();
    }

    public final void onClick(View view)
    {
        if (!l.b(f.a(b)))
        {
            l.a(f.a(b), null);
        } else
        {
            int i = ((Integer)view.getTag()).intValue();
            view = (h)com.roidapp.cloudlib.sns.notification.f.b(b).get(i);
            com.roidapp.cloudlib.sns.g.b.a();
            c c1 = f.a(com.roidapp.cloudlib.sns.g.b.a(((h) (view)).c), ((h) (view)).c.q);
            if (c1 == c.b)
            {
                f.a(b, view);
                return;
            }
            if (c1 == c.c)
            {
                com.roidapp.cloudlib.sns.notification.f.b(b, view);
                return;
            }
        }
    }
}
