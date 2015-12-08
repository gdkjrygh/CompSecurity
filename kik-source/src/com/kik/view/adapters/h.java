// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ad;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.chat.b.c;
import kik.android.util.ac;
import kik.android.util.ae;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.widget.ClampedContentPreviewView;

// Referenced classes of package com.kik.view.adapters:
//            s

public final class h extends com.kik.view.adapters.s
{
    protected static final class a extends s.a
    {

        TextView a;

        protected a()
        {
        }
    }


    public h(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            n n, k k, kik.android.chat.b.d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, onclicklistener1, a1, ad, a2, n, k, d1, a3);
    }

    public static boolean b(kik.a.d.a.a a1)
    {
        boolean flag1 = false;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        String s1 = a1.g("text");
        if (cq.c(a1.g("title")) && cq.c(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !h(a1)) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        if (flag || c(a1))
        {
            flag1 = true;
        }
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean c(kik.a.d.a.a a1)
    {
        if (a1 != null)
        {
            String s1 = a1.g("text");
            boolean flag;
            if (!cq.c(a1.g("title")) && cq.c(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && h(a1))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean h(kik.a.d.a.a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        kik.a.d.o o = a1.a("png-preview");
        a1 = a1.a("preview");
        boolean flag;
        if (o != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L1; else goto _L3
_L3:
        return true;
    }

    protected final int a()
    {
        return 0x7f03006a;
    }

    protected final View a(ViewGroup viewgroup)
    {
        a a1 = new a();
        viewgroup = super.a(viewgroup, a1);
        a1.a = (TextView)viewgroup.findViewById(0x7f0e00de);
        viewgroup.setTag(a1);
        return viewgroup;
    }

    protected final d a(kik.a.d.a.a a1)
    {
        d d1 = (d)a1.a("png-preview");
        a1 = (d)a1.a("preview");
        if (a1 != null && a1.b() != null && d1 == null)
        {
            return a1;
        }
        if (d1 != null && d1.b() != null)
        {
            return d1;
        } else
        {
            return null;
        }
    }

    protected final void a(kik.a.d.a.a a1, n.a a2, boolean flag)
    {
label0:
        {
            super.a(a1, a2, flag);
            a2 = (a)a2;
            if (a1 != null && ae.b(a1))
            {
                a1 = a1.g("title");
                if (a1 == null)
                {
                    break label0;
                }
                ((a) (a2)).a.setVisibility(0);
                ((a) (a2)).a.setMaxLines(2);
                ((a) (a2)).a.setText(a1.trim());
            }
            return;
        }
        ((a) (a2)).a.setVisibility(8);
    }

    protected final void a(s s1, ar.b b1)
    {
        super.a(s1, b1);
        b1 = (a)b1;
        s1 = (kik.a.d.a.a)kik.a.d.a.a.a(s1, kik/a/d/a/a);
        ((a) (b1)).k.setBackgroundResource(0x7f070045);
        if (ae.b(s1))
        {
            ((a) (b1)).j.setTextColor(-1);
            cv.a(((a) (b1)).j, ac.a);
            cv.a(((a) (b1)).a, ac.a);
            cv.b(((a) (b1)).i, ((a) (b1)).i.getResources().getDimensionPixelSize(0x7f0d0006));
            cv.b(((a) (b1)).i, ((a) (b1)).e);
            ((a) (b1)).i.setBackgroundResource(0x7f02009c);
            ((a) (b1)).a.setTextColor(-1);
            ((a) (b1)).j.setTextColor(-1);
            ((a) (b1)).k.setImageResource(0x7f020269);
            return;
        } else
        {
            cv.a(((a) (b1)).j, ac.b);
            cv.a(((a) (b1)).a, ac.b);
            cv.a(((a) (b1)).i, ((a) (b1)).e);
            cv.b(((a) (b1)).i, -2);
            cv.e(new View[] {
                ((a) (b1)).a
            });
            kik.android.chat.b.c.a(((a) (b1)).i, d.d());
            kik.android.chat.b.c.a(((a) (b1)).a, d.d());
            kik.android.chat.b.c.a(((a) (b1)).j, d.d());
            kik.android.chat.b.c.a(((a) (b1)).k, d.d());
            ((a) (b1)).d.d(KikApplication.a(40));
            return;
        }
    }

    protected final void a(s s1, n.a a1)
    {
        super.a(s1, a1);
        a1 = (a)a1;
        ((a) (a1)).d.a(kik.android.widget.c.a.c);
        if (s1.d())
        {
            ((a) (a1)).d.a(q, p);
            return;
        } else
        {
            ((a) (a1)).d.a(p, q);
            return;
        }
    }

    protected final boolean a(ar.b b1)
    {
        return b1 instanceof a;
    }

    protected final View[] a(n.a a1)
    {
        a1 = (a)a1;
        return (new View[] {
            ((a) (a1)).h, ((a) (a1)).j, ((a) (a1)).k
        });
    }
}
