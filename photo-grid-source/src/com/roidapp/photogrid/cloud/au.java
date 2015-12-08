// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.CheckBox;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.f;
import com.roidapp.cloudlib.sns.b.u;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class au extends aa
{

    final PGShareActivity a;

    au(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    private void a(f f1)
    {
        if (f1 == null || f1.isEmpty())
        {
            return;
        } else
        {
            PGShareActivity.a(a, ((u)f1.get(0)).a);
            PGShareActivity.d(a).setText((new StringBuilder("#")).append(PGShareActivity.j(a)).toString());
            return;
        }
    }

    public final void b(int i, Exception exception)
    {
    }

    public final void b(Object obj)
    {
        obj = (f)obj;
        a(((f) (obj)));
        super.b(obj);
    }

    public final void c(Object obj)
    {
        a((f)obj);
    }
}
