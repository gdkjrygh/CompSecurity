// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.main.a;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            b, f, d

final class c extends aa
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void b(int j, Exception exception)
    {
        if (!com.roidapp.cloudlib.sns.notification.b.j(a))
        {
            return;
        }
        com.roidapp.cloudlib.sns.notification.b.i(a).setEnabled(true);
        com.roidapp.cloudlib.sns.notification.b.i(a).a(a);
        if (com.roidapp.cloudlib.sns.notification.b.i(a).b())
        {
            com.roidapp.cloudlib.sns.notification.b.i(a).a(false);
        }
        if (com.roidapp.cloudlib.sns.notification.b.k(a) != null && com.roidapp.cloudlib.sns.notification.b.k(a).getCount() != 0)
        {
            a.v().a(a.getActivity().getString(at.ak));
        } else
        {
            com.roidapp.cloudlib.sns.notification.b.c(a).setVisibility(0);
            if (!l.b(a.getActivity()))
            {
                com.roidapp.cloudlib.sns.notification.b.d(a).setText(a.getActivity().getString(at.e));
                com.roidapp.cloudlib.sns.notification.b.e(a).setVisibility(0);
                com.roidapp.cloudlib.sns.notification.b.e(a).setOnClickListener(new d(this));
            } else
            {
                com.roidapp.cloudlib.sns.notification.b.d(a).setText(a.getActivity().getString(at.al));
                com.roidapp.cloudlib.sns.notification.b.e(a).setVisibility(8);
            }
        }
        com.roidapp.cloudlib.sns.notification.b.h(a).setVisibility(8);
    }

    public final void b(Object obj)
    {
        obj = (com.roidapp.cloudlib.sns.b.a.c)obj;
        if (com.roidapp.cloudlib.sns.notification.b.l(a))
        {
            com.roidapp.cloudlib.sns.notification.b.a(a, ((com.roidapp.cloudlib.sns.b.a.c) (obj)));
            if (com.roidapp.cloudlib.sns.notification.b.b(a) == null || com.roidapp.cloudlib.sns.notification.b.b(a).isEmpty())
            {
                com.roidapp.cloudlib.sns.notification.b.c(a).setVisibility(0);
                com.roidapp.cloudlib.sns.notification.b.d(a).setText(a.getActivity().getString(at.al));
                com.roidapp.cloudlib.sns.notification.b.e(a).setVisibility(8);
            } else
            {
                com.roidapp.cloudlib.sns.notification.b.c(a).setVisibility(8);
            }
            com.roidapp.cloudlib.sns.notification.b.b(a, ((com.roidapp.cloudlib.sns.b.a.c) (obj)));
            com.roidapp.cloudlib.sns.notification.b.h(a).setVisibility(8);
            super.b(obj);
        }
    }

    public final void c(Object obj)
    {
        obj = (com.roidapp.cloudlib.sns.b.a.c)obj;
        if (com.roidapp.cloudlib.sns.notification.b.a(a))
        {
            com.roidapp.cloudlib.sns.notification.b.a(a, ((com.roidapp.cloudlib.sns.b.a.c) (obj)));
            if (com.roidapp.cloudlib.sns.notification.b.b(a) == null || com.roidapp.cloudlib.sns.notification.b.b(a).isEmpty())
            {
                com.roidapp.cloudlib.sns.notification.b.c(a).setVisibility(0);
                com.roidapp.cloudlib.sns.notification.b.d(a).setText(a.getActivity().getString(at.al));
                com.roidapp.cloudlib.sns.notification.b.e(a).setVisibility(8);
            } else
            {
                com.roidapp.cloudlib.sns.notification.b.c(a).setVisibility(8);
            }
            if (obj != null)
            {
                long l1;
                if (((com.roidapp.cloudlib.sns.b.a.c) (obj)).isEmpty())
                {
                    l1 = 0L;
                } else
                {
                    l1 = ((h)((com.roidapp.cloudlib.sns.b.a.c) (obj)).get(0)).f;
                }
                if (com.roidapp.cloudlib.sns.notification.b.f(a) != null)
                {
                    com.roidapp.cloudlib.sns.notification.b.g(a).a(l1);
                }
            }
            com.roidapp.cloudlib.sns.notification.b.b(a, ((com.roidapp.cloudlib.sns.b.a.c) (obj)));
            com.roidapp.cloudlib.sns.notification.b.h(a).setVisibility(8);
            if (com.roidapp.cloudlib.sns.notification.b.i(a).b())
            {
                com.roidapp.cloudlib.sns.notification.b.i(a).a(false);
            }
        }
    }
}
