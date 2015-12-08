// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.a;

import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b;
import com.roidapp.cloudlib.template.c.f;
import com.roidapp.cloudlib.template.j;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template.a:
//            e, f

public final class a extends e
{

    private boolean h;

    public a(f f1, android.view.View.OnClickListener onclicklistener)
    {
        super(f1, onclicklistener);
        h = al.g().d(a);
    }

    public final int a()
    {
        return e.e();
    }

    protected final void a(com.roidapp.cloudlib.template.a.f f1, TemplateInfo templateinfo)
    {
        boolean flag = d.c(templateinfo);
        if (!flag && !h && templateinfo.q() && !j.b(templateinfo.e()))
        {
            f1.s.setImageResource(aq.I);
            f1.s.setVisibility(0);
        } else
        {
            f1.s.setVisibility(8);
        }
        f1.p.setImageDrawable(g[1]);
        if (flag)
        {
            f1.m.setVisibility(0);
        } else
        {
            f1.m.setVisibility(8);
        }
        f1.l.setText(templateinfo.i());
    }

    public final void a(List list)
    {
        e.a(list);
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
        return e.a(i);
    }

    public final void e()
    {
        super.e();
        e.g();
    }
}
