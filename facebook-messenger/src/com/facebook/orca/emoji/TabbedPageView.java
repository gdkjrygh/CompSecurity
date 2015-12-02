// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.w.j;
import com.facebook.g;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.f;
import com.facebook.widget.images.UrlImage;
import com.facebook.widget.viewpageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.emoji:
//            ap, ag, al, an, 
//            aq, ao, am, ak

public class TabbedPageView extends f
{

    private View a;
    private TextView b;
    private TextView c;
    private FrameLayout d;
    private LinearLayout e;
    private FrameLayout f;
    private HorizontalScrollView g;
    private LinearLayout h;
    private LinearLayout i;
    private FrameLayout j;
    private View k;
    private ViewPager l;
    private CirclePageIndicator m;
    private ag n;
    private aq o;
    private an p;
    private List q;
    private List r;
    private boolean s;
    private int t;
    private int u;

    public TabbedPageView(Context context)
    {
        this(context, null);
    }

    public TabbedPageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabbedPageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        setContentView(k.orca_tabbed_page_view);
        a = getView(i.tab_loading_indicator);
        b = (TextView)getView(i.tab_loading_indicator_text);
        c = (TextView)getView(i.empty_message);
        d = (FrameLayout)getView(i.tabbed_page_view_tab_content);
        e = (LinearLayout)getView(i.tabbed_page_view_tab_bar);
        f = (FrameLayout)getView(i.tabbed_page_view_tabs_ellipsis_container);
        g = (HorizontalScrollView)getView(i.tabbed_page_view_tabs_scroll);
        h = (LinearLayout)getView(i.tabbed_page_view_tabs_scroll_container);
        i = (LinearLayout)getView(i.tabbed_page_view_tabs_container);
        j = (FrameLayout)getView(i.tabbed_page_view_tabs_backspace_container);
        k = getView(i.tabbed_page_view_tabs_backspace);
        l = (ViewPager)getView(i.view_pager);
        m = (CirclePageIndicator)getView(i.view_pager_indicator);
        l.setAdapter(new ap(this));
        m.setViewPager(l);
        context = getContext().obtainStyledAttributes(attributeset, q.TabbedPageView);
        if (context.peekValue(q.TabbedPageView_emptyMessage) != null)
        {
            c.setText(context.getString(q.TabbedPageView_emptyMessage));
        }
        context.recycle();
    }

    static int a(TabbedPageView tabbedpageview, int i1)
    {
        return tabbedpageview.b(i1);
    }

    private int a(List list)
    {
        return (int)Math.ceil((double)list.size() / (double)n.c());
    }

    private LinearLayout a(Context context, List list, int i1, String s1)
    {
        int l1 = list.size();
        int i2 = n.b();
        int j2 = n.a();
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        int j1 = 0;
        for (int k1 = i1; j1 < i2 && k1 < l1; j1++)
        {
            linearlayout.addView(b(context, list, k1, s1));
            k1 = (j1 + 1) * j2 + i1;
        }

        return linearlayout;
    }

    static LinearLayout a(TabbedPageView tabbedpageview, Context context, List list, int i1, String s1)
    {
        return tabbedpageview.a(context, list, i1, s1);
    }

    static an a(TabbedPageView tabbedpageview)
    {
        return tabbedpageview.p;
    }

    static void a(TabbedPageView tabbedpageview, String s1, int i1)
    {
        tabbedpageview.a(s1, i1);
    }

    private void a(String s1, int i1)
    {
        if (u == i1)
        {
            return;
        }
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((FrameLayout)iterator.next()).setSelected(false)) { }
        ((FrameLayout)r.get(i1)).setSelected(true);
        u = i1;
        a(s1, i1, 0);
    }

    private void a(String s1, int i1, int j1)
    {
        l.removeAllViews();
        Object obj = (List)q.get(i1);
        ArrayList arraylist = new ArrayList();
        int k1 = a(((List) (obj)));
        for (i1 = 0; i1 < k1; i1++)
        {
            arraylist.add(new FrameLayout(getContext()));
        }

        obj = new ap(this, s1, arraylist, ((List) (obj)));
        l.setAdapter(((android.support.v4.view.x) (obj)));
        m.a();
        m.setOnPageChangeListener(new al(this));
        l.setCurrentItem(j1);
        if (p != null)
        {
            p.a(s1);
            p.a(j1);
        }
    }

    private int b(int i1)
    {
        return n.c() * i1;
    }

    private LinearLayout b(Context context, List list, int i1, String s1)
    {
        int j1 = Math.min(n.a() + i1, list.size());
        int k1 = i1 / n.c();
        LinearLayout linearlayout = new LinearLayout(context);
        Object obj;
        for (list = list.subList(i1, j1).iterator(); list.hasNext(); linearlayout.addView(o.a(context, obj, s1, k1)))
        {
            obj = list.next();
        }

        return linearlayout;
    }

    protected FrameLayout a(Integer integer, Uri uri, Integer integer1, ViewGroup viewgroup, LayoutInflater layoutinflater, boolean flag)
    {
        viewgroup = (FrameLayout)layoutinflater.inflate(k.orca_tabbed_page_view_tab, viewgroup, false);
        if (flag)
        {
            viewgroup.getLayoutParams().width = com.facebook.common.w.j.a(getContext(), 52F);
        }
        viewgroup.setClickable(true);
        layoutinflater = (UrlImage)viewgroup.findViewById(i.tab_image);
        if (uri != null)
        {
            layoutinflater.setImageParams(uri);
        }
        if (integer != null)
        {
            layoutinflater.setPlaceHolderResourceId(integer.intValue());
        }
        if (integer1 != null)
        {
            integer = new ImageView(getContext());
            uri = new android.widget.FrameLayout.LayoutParams(-2, -2);
            uri.gravity = 53;
            integer.setLayoutParams(uri);
            integer.setImageResource(integer1.intValue());
            viewgroup.addView(integer);
        }
        return viewgroup;
    }

    public void a(int i1)
    {
        b.setText(i1);
    }

    public void a(ao ao1)
    {
        LinearLayout linearlayout;
        Object obj;
        int i1;
        if (s)
        {
            linearlayout = h;
        } else
        {
            linearlayout = i;
        }
        obj = LayoutInflater.from(getContext());
        obj = a(ao1.a, ao1.b, ao1.c, ((ViewGroup) (i)), ((LayoutInflater) (obj)), s);
        ((FrameLayout) (obj)).setOnClickListener(ao1.d);
        i1 = t;
        t = i1 + 1;
        linearlayout.addView(((View) (obj)), i1);
        ao1 = b();
        i1 = t;
        t = i1 + 1;
        linearlayout.addView(ao1, i1);
    }

    public void a(List list, List list1, ag ag1, aq aq1, an an1, boolean flag, String s1, 
            int i1)
    {
        n = ag1;
        o = aq1;
        p = an1;
        q = new ArrayList();
        r = new ArrayList();
        e.setVisibility(0);
        h.removeAllViews();
        i.removeAllViews();
        ag1 = g;
        float f1;
        int j1;
        if (flag)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        ag1.setVisibility(j1);
        ag1 = (android.widget.LinearLayout.LayoutParams)g.getLayoutParams();
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        ag1.weight = f1;
        ag1 = i;
        if (flag)
        {
            j1 = 8;
        } else
        {
            j1 = 0;
        }
        ag1.setVisibility(j1);
        ag1 = (android.widget.LinearLayout.LayoutParams)i.getLayoutParams();
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        ag1.weight = f1;
        s = flag;
        if (flag)
        {
            ag1 = h;
        } else
        {
            ag1 = i;
        }
        aq1 = LayoutInflater.from(getContext());
        t = 0;
        for (j1 = 0; j1 < list.size(); j1++)
        {
            a((ao)list.get(j1));
        }

        u = 0;
        int k1 = 0;
        j1 = 0;
        for (; k1 < list1.size(); k1++)
        {
            list = a(((am)list1.get(k1)).b, ((am)list1.get(k1)).c, null, ((ViewGroup) (ag1)), ((LayoutInflater) (aq1)), flag);
            an1 = ((am)list1.get(k1)).a;
            list.setOnClickListener(new ak(this, an1, k1));
            ag1.addView(list);
            ag1.addView(b());
            q.add(((am)list1.get(k1)).d);
            r.add(list);
            if (an1.equals(s1))
            {
                u = k1;
                j1 = i1;
            }
        }

        a.setVisibility(8);
        if (r.size() > 0)
        {
            c.setVisibility(8);
            d.setVisibility(0);
            i.setVisibility(0);
            ((FrameLayout)r.get(u)).setSelected(true);
            a(((am)list1.get(u)).a, u, j1);
            return;
        } else
        {
            d.setVisibility(8);
            c.setVisibility(0);
            i.setVisibility(0);
            return;
        }
    }

    public boolean a()
    {
        return q != null && n != null && o != null;
    }

    protected View b()
    {
        View view = new View(getContext());
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelSize(g.divider_width), -1));
        view.setBackgroundDrawable(getResources().getDrawable(com.facebook.f.emoji_attachment_popup_background_color));
        return view;
    }

    public View getBackspaceButtonContainer()
    {
        return j;
    }

    public void setBackspaceTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        k.setOnTouchListener(ontouchlistener);
        j.setVisibility(0);
    }

    public void setEllipsisClickListener(android.view.View.OnClickListener onclicklistener)
    {
        f.setOnClickListener(onclicklistener);
        f.setVisibility(0);
    }

    public void setEmptyMessage(int i1)
    {
        c.setText(i1);
    }
}
