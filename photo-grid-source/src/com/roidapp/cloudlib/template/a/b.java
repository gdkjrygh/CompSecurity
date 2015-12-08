// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a;
import com.roidapp.cloudlib.template.c.f;
import com.roidapp.cloudlib.template.j;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template.a:
//            e, f

public final class b extends e
{

    private LinkedList h;
    private boolean i;
    private long j;
    private long k;

    public b(f f1, android.view.View.OnClickListener onclicklistener)
    {
        super(f1, onclicklistener);
        h = new LinkedList();
        i = al.g().d(a);
        long l = PreferenceManager.getDefaultSharedPreferences(a).getLong("newestHotID", 0L);
        j = l;
        k = l;
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

    final void a(com.roidapp.cloudlib.template.a.f f1, TemplateInfo templateinfo)
    {
        boolean flag1 = d.c(templateinfo);
        boolean flag;
        if (flag1 || i || com.roidapp.cloudlib.template.j.b(templateinfo.e()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!templateinfo.q() || flag)
        {
            f1.s.setVisibility(8);
        } else
        {
            f1.s.setImageResource(aq.I);
            f1.s.setVisibility(0);
        }
        if (f1.t != null)
        {
            if (templateinfo.e() > j)
            {
                f1.t.setImageResource(aq.ae);
                f1.t.setVisibility(0);
                if (templateinfo.e() > k)
                {
                    k = templateinfo.e();
                    PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putLong("newestHotID", k).apply();
                }
            } else
            {
                f1.t.setVisibility(8);
            }
        }
        if (e.d(templateinfo))
        {
            f1.p.setImageDrawable(g[1]);
        } else
        {
            f1.p.setImageDrawable(g[0]);
        }
        if (flag1)
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

    public final long b(int l)
    {
        return (long)l;
    }

    public final void d()
    {
        if (h != null && !h.isEmpty())
        {
            h.clear();
            c();
        }
    }

    public final TemplateInfo e(int l)
    {
        l = f(l);
        if (l >= 0 && h != null && l < h.size())
        {
            return (TemplateInfo)h.get(l);
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
