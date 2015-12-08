// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.d.s;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.util.cv;

// Referenced classes of package com.kik.view.adapters:
//            ar

public abstract class ay extends ar
{
    public static class a extends ar.b
    {

        ImageView s;

        public a()
        {
        }
    }


    static final int p = KikApplication.a(5);
    static final int q = KikApplication.a(1);
    protected final ad o;

    public ay(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, ar.a a1, com.kik.android.a a2, ad ad, kik.a.e.n n1, 
            com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, a1, a2, n1, a3);
        o = ad;
    }

    public void a(ar.b b, s s1, boolean flag, Context context, au.b b1)
    {
        super.a(b, s1, flag, context, b1);
        b = (a)b;
        if (b == null || s1 == null)
        {
            return;
        }
        if (s1.d())
        {
            cv.e(new View[] {
                ((a) (b)).p, ((a) (b)).q
            });
            cv.b(new View[] {
                ((a) (b)).s
            });
            switch (s1.c())
            {
            default:
                ((a) (b)).s.setImageResource(0x7f02022e);
                return;

            case 200: 
                ((a) (b)).s.setImageResource(0x7f020232);
                return;

            case 500: 
                ((a) (b)).s.setImageResource(0x7f020231);
                return;

            case 600: 
                ((a) (b)).s.setImageResource(0x7f02022f);
                return;

            case 300: 
                ((a) (b)).s.setImageResource(0x7f020230);
                return;

            case 400: 
                ((a) (b)).s.setImageResource(0x7f02022d);
                return;
            }
        }
        cv.d(new View[] {
            ((a) (b)).s
        });
        cv.b(new View[] {
            ((a) (b)).p
        });
        context = f.a(s1.i(), false);
        boolean flag1;
        if (context != null && (context instanceof n) && ((n)context).I())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1 = m.a(s1);
        if (!context.v() && !flag1 && (s1 == null || !s1.p()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((a) (b)).p.a(s1, o, flag, f, e);
        if (s1 != null && s1.i())
        {
            cv.b(new View[] {
                ((a) (b)).q
            });
            return;
        } else
        {
            cv.e(new View[] {
                ((a) (b)).q
            });
            return;
        }
    }

}
