// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.CheckBox;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.f;
import com.roidapp.cloudlib.sns.b.u;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br

final class by extends aa
{

    final br a;

    by(br br1)
    {
        a = br1;
        super();
    }

    private void a(f f1)
    {
        if (f1 == null || f1.isEmpty())
        {
            return;
        } else
        {
            br.a(a, ((u)f1.get(0)).a);
            br.d(a).setText((new StringBuilder("#")).append(br.i(a)).toString());
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
