// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.support.v4.app.FragmentActivity;
import android.widget.ProgressBar;
import com.roidapp.baselib.view.FlowLayout;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.f;
import com.roidapp.cloudlib.sns.b.u;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ch, cm

final class ci extends aa
{

    final ch a;

    ci(ch ch1)
    {
        a = ch1;
        super();
    }

    private void a(f f1)
    {
        if (a.getActivity() == null || a.getActivity().isFinishing())
        {
            return;
        }
        if (f1 == null || f1.isEmpty())
        {
            ch.a(a);
            return;
        }
        ch.b(a).removeAllViews();
        if (ch.c(a) != null)
        {
            ch.c(a).b();
        }
        for (int i = 0; i < f1.size(); i++)
        {
            String s = ((u)f1.get(i)).a;
            ch.b(a).addView(ch.a(a, (new StringBuilder("#")).append(s).toString()));
            if (ch.c(a) != null)
            {
                ch.c(a).a(s);
            }
        }

        ch.a(a, f1);
        ch.d(a).setVisibility(8);
        ch.b(a).setVisibility(0);
    }

    public final void b(int i, Exception exception)
    {
        if (a.getActivity() == null || a.getActivity().isFinishing())
        {
            return;
        } else
        {
            ch.a(a);
            return;
        }
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
