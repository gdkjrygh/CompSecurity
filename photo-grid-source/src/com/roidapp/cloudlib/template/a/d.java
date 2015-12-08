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
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template.a:
//            e, f

public final class d extends e
{

    private LinkedList h;

    public d(f f1, android.view.View.OnClickListener onclicklistener)
    {
        super(f1, onclicklistener);
        h = new LinkedList();
    }

    public final int a()
    {
        if (h != null && !h.isEmpty())
        {
            return h.size() + f();
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
        if (d.c(templateinfo))
        {
            f1.m.setVisibility(0);
            return;
        } else
        {
            f1.m.setVisibility(8);
            return;
        }
    }

    public final void a(List list)
    {
        if (h != null)
        {
            h.addAll(list);
        }
    }

    public final long b(int i)
    {
        return (long)i;
    }

    public final void d()
    {
        if (h != null && !h.isEmpty())
        {
            h.clear();
            c();
        }
    }

    public final TemplateInfo e(int i)
    {
        i = f(i);
        if (i >= 0 && h != null && i < h.size())
        {
            return (TemplateInfo)h.get(i);
        } else
        {
            return null;
        }
    }

    public final void e()
    {
        if (h != null && !h.isEmpty())
        {
            h.clear();
            h = null;
        }
    }
}
