// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.a;

import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a;
import com.roidapp.cloudlib.template.b;
import com.roidapp.cloudlib.template.c.f;
import com.roidapp.cloudlib.template.j;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template.a:
//            e, f

public final class c extends e
{

    public c(f f1, android.view.View.OnClickListener onclicklistener)
    {
        super(f1, onclicklistener);
    }

    public final int a()
    {
        if (d != null)
        {
            return d.a();
        } else
        {
            return 0;
        }
    }

    protected final void a(com.roidapp.cloudlib.template.a.f f1, TemplateInfo templateinfo)
    {
        if (e.d(templateinfo))
        {
            f1.p.setImageDrawable(g[1]);
        } else
        {
            f1.p.setImageDrawable(g[0]);
        }
        if (j.a(templateinfo.e()))
        {
            f1.q.setVisibility(8);
        } else
        {
            f1.q.setVisibility(0);
        }
        f1.m.setVisibility(0);
    }

    public final void a(List list)
    {
        d.a(list);
    }

    public final long b(int i)
    {
        return (long)i;
    }

    public final void d()
    {
    }

    public final TemplateInfo e(int i)
    {
        return d.a(i);
    }

    public final void e()
    {
        super.e();
        d.b();
    }
}
