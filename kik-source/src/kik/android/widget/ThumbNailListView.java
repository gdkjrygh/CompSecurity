// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.kik.cache.c;
import com.kik.g.aq;
import com.kik.g.e;
import com.kik.g.k;
import com.kik.sdkutils.b.a;
import com.kik.sdkutils.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package kik.android.widget:
//            ee, ef

public abstract class ThumbNailListView extends HorizontalScrollView
{

    private HashMap a;
    private int b;
    private Context c;
    private LinearLayout d;
    private HashMap e;
    private k f;
    private k g;

    public ThumbNailListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThumbNailListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new HashMap();
        b = 0;
        e = new HashMap();
        f = new k(this);
        g = new k(this);
        attributeset = context.obtainStyledAttributes(attributeset, kik.android.ag.b.m);
        b = attributeset.getResourceId(0, 0);
        attributeset.recycle();
        c = context;
        d = new LinearLayout(context, null);
        context = new android.view.ViewGroup.LayoutParams(-2, -1);
        d.setLayoutParams(context);
        d.setGravity(5);
        addView(d);
    }

    static k a(ThumbNailListView thumbnaillistview)
    {
        return thumbnaillistview.f;
    }

    public final aq a(Object obj)
    {
        obj = (View)a.remove(obj);
        aq aq1 = new aq();
        if (obj != null)
        {
            ((View) (obj)).setOnClickListener(null);
            d.removeView(((View) (obj)));
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
        return f.a();
    }

    protected abstract void a(c c1, a a1, b b1, View view, Object obj);

    public final void a(c c1, a a1, b b1, Object obj)
    {
        if (!a.containsKey(obj))
        {
            View view = LayoutInflater.from(c).inflate(b, d, false);
            a(c1, a1, b1, view, obj);
            view.setTag(obj);
            d.addView(view);
            Object obj1;
            for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); a(c1, a1, b1, (View)a.get(obj1), obj1))
            {
                obj1 = iterator.next();
            }

            a.put(obj, view);
            view.setOnClickListener(new ee(this, obj));
            postDelayed(new ef(this), 100L);
        }
    }

    public final void b()
    {
        b = 0x7f0300a1;
    }
}
