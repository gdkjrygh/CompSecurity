// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.g.aq;
import com.kik.g.e;
import com.kik.g.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kik.a.e.r;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            bz, ca, cb, cc

public class KikContactImageThumbNailList extends HorizontalScrollView
{

    private HashMap a;
    private int b;
    private Context c;
    private LinearLayout d;
    private Space e;
    private HashMap f;
    private k g;
    private k h;
    private ad i;
    private a j;

    public KikContactImageThumbNailList(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public KikContactImageThumbNailList(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a = new HashMap();
        b = 0;
        f = new HashMap();
        g = new k(this);
        h = new k(this);
        attributeset = context.obtainStyledAttributes(attributeset, kik.android.ag.b.m);
        b = attributeset.getResourceId(0, 0);
        attributeset.recycle();
        c = context;
        d = new LinearLayout(context, null);
        e = new Space(context, null);
        context = new android.view.ViewGroup.LayoutParams(KikApplication.a(8), -1);
        e.setLayoutParams(context);
        context = new android.view.ViewGroup.LayoutParams(-2, -1);
        d.setLayoutParams(context);
        d.setGravity(5);
        addView(d);
        d.addView(e);
        b = 0x7f03006d;
    }

    static k a(KikContactImageThumbNailList kikcontactimagethumbnaillist)
    {
        return kikcontactimagethumbnaillist.g;
    }

    private void a(View view, kik.a.d.k k1, r r)
    {
        int l = 0;
        ContactImageView contactimageview = (ContactImageView)view.findViewById(0x7f0e0165);
        contactimageview.a(c.getResources().getDrawable(0x7f020305));
        contactimageview.a(k1, i, false, r, j);
        view = (ImageView)view.findViewById(0x7f0e0166);
        if (!k1.i())
        {
            l = 8;
        }
        view.setVisibility(l);
    }

    private void a(kik.a.d.k k1, int l, r r)
    {
        if (!a.containsKey(k1))
        {
            View view = LayoutInflater.from(c).inflate(b, d, false);
            a(view, k1, r);
            view.setTag(k1);
            Iterator iterator;
            kik.a.d.k k2;
            if (l < 0 || l > d.getChildCount())
            {
                d.addView(view);
            } else
            {
                d.addView(view, l);
            }
            for (iterator = a.keySet().iterator(); iterator.hasNext(); a((View)a.get(k2), k2, r))
            {
                k2 = (kik.a.d.k)iterator.next();
            }

            a.put(k1, view);
            view.setOnClickListener(new bz(this, k1));
            postDelayed(new ca(this), 100L);
        }
    }

    static k b(KikContactImageThumbNailList kikcontactimagethumbnaillist)
    {
        return kikcontactimagethumbnaillist.h;
    }

    public final aq a(kik.a.d.k k1)
    {
        k1 = (View)a.remove(k1);
        aq aq1 = new aq();
        if (k1 != null)
        {
            k1.setOnClickListener(null);
            d.removeView(k1);
            aq1.a();
            return aq1;
        } else
        {
            aq1.a(null);
            return aq1;
        }
    }

    public final e a()
    {
        return g.a();
    }

    public final void a(a a1)
    {
        j = a1;
    }

    public final void a(ad ad)
    {
        i = ad;
    }

    public final void a(String s)
    {
        s = (View)f.remove(s);
        if (s != null)
        {
            s.setOnClickListener(null);
            d.removeView(s);
        }
    }

    public final void a(String s, kik.a.d.k k1, r r)
    {
        s = (View)f.remove(s);
        if (s != null)
        {
            int l = d.indexOfChild(s);
            d.removeView(s);
            a(k1, l, r);
        }
    }

    public final void a(String s, r r)
    {
        if (!f.containsKey(s))
        {
            View view = LayoutInflater.from(c).inflate(b, d, false);
            ContactImageView contactimageview = (ContactImageView)view.findViewById(0x7f0e0165);
            contactimageview.a(c.getResources().getDrawable(0x7f020305));
            contactimageview.a(null, i, false, r, j);
            ((ImageView)view.findViewById(0x7f0e0166)).setVisibility(8);
            d.addView(view);
            f.put(s, view);
            view.setOnClickListener(new cb(this, s));
            postDelayed(new cc(this), 100L);
        }
    }

    public final void a(kik.a.d.k k1, r r)
    {
        a(k1, -1, r);
    }

    public final e b()
    {
        return h.a();
    }
}
