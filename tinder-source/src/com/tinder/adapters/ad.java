// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.b.a;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a.a.a.a.f;
import com.taplytics.a.j;
import com.tinder.utils.r;
import com.tinder.views.CustomTextView;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.tinder.adapters:
//            ae, af, ag, ah, 
//            ai, aj

public final class ad extends android.support.v7.widget.RecyclerView.Adapter
{
    static final class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        CustomTextView a;

        public a(View view, boolean flag, float f1)
        {
            super(view);
            a = (CustomTextView)view.findViewById(0x7f0e01ef);
            if (flag && a != null)
            {
                a.setTextSize(0, f1);
            }
        }
    }


    private String a;
    private Context b;
    private LayoutInflater c;
    private Pattern d;
    private List e;
    private StateListDrawable f;
    private StateListDrawable g;

    public ad(Context context, List list, Pattern pattern)
    {
        b = context;
        e = list;
        d = pattern;
        c = LayoutInflater.from(context);
        a = b.getResources().getString(0x7f060173);
        list = String.format("#%06X", new Object[] {
            Integer.valueOf(android.support.v4.b.a.b(context, 0x7f0d00c6) & 0xffffff)
        });
        context = String.format("#%06X", new Object[] {
            Integer.valueOf(android.support.v4.b.a.b(context, 0x7f0d00c9) & 0xffffff)
        });
        new j("Paywall Dialog Best Background Color", list, new ae(this));
        new j("Paywall Dialog Other Background Color", context, new af(this));
    }

    private static int a(int i, int k, int l, int i1)
    {
        return Color.argb(i, (int)((double)(255 - k) * 0.050000000000000003D) + k, (int)((double)(255 - l) * 0.050000000000000003D) + l, (int)((double)(255 - i1) * 0.050000000000000003D) + i1);
    }

    static void a(a a1, Object obj)
    {
        if (a1.a != null)
        {
            a1.a.setTextSize(0, ((Float)obj).floatValue());
        }
    }

    static void a(ad ad1, Object obj)
    {
        int i = Color.parseColor((String)obj);
        int k = Color.red(i);
        int l = Color.green(i);
        int i1 = Color.blue(i);
        k = a(Color.alpha(i), k, l, i1);
        obj = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(k);
        ((StateListDrawable) (obj)).addState(new int[] {
            0x10100a7
        }, colordrawable);
        colordrawable = new ColorDrawable(i);
        ((StateListDrawable) (obj)).addState(new int[0], colordrawable);
        ad1.f = ((StateListDrawable) (obj));
    }

    static void b(a a1, Object obj)
    {
        if (a1.a != null)
        {
            a1.a.setTextColor(Color.parseColor((String)obj));
        }
    }

    static void b(ad ad1, Object obj)
    {
        int i = Color.parseColor((String)obj);
        int k = Color.red(i);
        int l = Color.green(i);
        int i1 = Color.blue(i);
        k = a(Color.alpha(i), k, l, i1);
        obj = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(k);
        ((StateListDrawable) (obj)).addState(new int[] {
            0x10100a7
        }, colordrawable);
        colordrawable = new ColorDrawable(i);
        ((StateListDrawable) (obj)).addState(new int[0], colordrawable);
        ad1.g = ((StateListDrawable) (obj));
    }

    static void c(a a1, Object obj)
    {
        if (a1.a != null)
        {
            a1.a.setTextSize(0, ((Float)obj).floatValue());
        }
    }

    static void d(a a1, Object obj)
    {
        if (a1.a != null)
        {
            a1.a.setTextColor(Color.parseColor((String)obj));
        }
    }

    public final f a(int i)
    {
        if (i == e.size())
        {
            return null;
        } else
        {
            return (f)e.get(i);
        }
    }

    public final int getItemCount()
    {
        return e.size();
    }

    public final void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        a a1 = (a)viewholder;
        Object obj1 = a(i);
        if (obj1 != null)
        {
            Object obj = "1";
            Matcher matcher = d.matcher(((f) (obj1)).a);
            viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj));
            if (matcher.matches())
            {
                viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj));
                if (matcher.groupCount() == 1)
                {
                    viewholder = matcher.group(1);
                }
            }
            obj = new BigDecimal(((f) (obj1)).f.doubleValue());
            int k = Integer.parseInt(viewholder);
            float f1;
            if (k > 1)
            {
                viewholder = ((BigDecimal) (obj)).divide(new BigDecimal(k), 2).setScale(2, 2);
            } else
            {
                viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj));
            }
            viewholder = r.a(viewholder, ((f) (obj1)).e);
            obj = NumberFormat.getIntegerInstance();
            f1 = b.getResources().getDimension(0x7f09000f);
            obj1 = String.format("#%06X", new Object[] {
                Integer.valueOf(android.support.v4.b.a.b(b, 0x7f0d0113) & 0xffffff)
            });
            if (getItemCount() > 3)
            {
                f1 = b.getResources().getDimension(0x7f090010);
            }
            if (k == 12)
            {
                new j("Paywall Dialog 12 Month Text Size", Float.valueOf(f1), new ag(a1));
                new j("Paywall Dialog 12 Month Text Color", obj1, new ah(a1));
            } else
            if (k == 1)
            {
                new j("Paywall Dialog 1 Month Text Size", Float.valueOf(f1), new ai(a1));
                new j("Paywall Dialog 1 Month Text Color", obj1, new aj(a1));
            }
            viewholder = b.getResources().getQuantityString(0x7f08000b, k, new Object[] {
                ((NumberFormat) (obj)).format(k), viewholder
            });
            if (viewholder.contains(a))
            {
                obj = new SpannableString(viewholder);
                k = viewholder.indexOf(a);
                int l = ((Spannable) (obj)).length();
                ((Spannable) (obj)).setSpan(new RelativeSizeSpan(0.75F), k, l, 33);
                if (a1.a != null)
                {
                    a1.a.setText(((CharSequence) (obj)));
                }
            } else
            if (a1.a != null)
            {
                a1.a.setText(viewholder);
            }
        }
        if (i == 0)
        {
            com.tinder.utils.ad.a(a1.itemView, f);
            return;
        } else
        {
            com.tinder.utils.ad.a(a1.itemView, g);
            return;
        }
    }

    public final android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        boolean flag = false;
        viewgroup = c.inflate(0x7f03007b, viewgroup, false);
        if (getItemCount() > 3 && viewgroup != null)
        {
            i = b.getResources().getDimensionPixelSize(0x7f090159);
            viewgroup.setPadding(i, i, i, i);
        }
        float f1 = b.getResources().getDimension(0x7f090010);
        if (getItemCount() > 3)
        {
            flag = true;
        }
        return new a(viewgroup, flag, f1);
    }
}
