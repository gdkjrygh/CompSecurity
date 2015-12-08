// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            v, w, t

public final class x extends v
{
    final class a extends BaseAdapter
    {

        final x a;

        public final int getCount()
        {
            return x.a(a).size();
        }

        public final Object getItem(int i)
        {
            return x.a(a).get(i);
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view != null && (view instanceof FrameLayout))
            {
                view = (FrameLayout)view;
                Object obj;
                View view1;
                android.widget.RelativeLayout.LayoutParams layoutparams;
                if (view.getChildCount() == 2 && (view.getChildAt(0) instanceof WebView))
                {
                    WebView webview = (WebView)view.getChildAt(0);
                    viewgroup = view;
                    view = webview;
                } else
                {
                    Object obj1 = null;
                    viewgroup = view;
                    view = obj1;
                }
            } else
            {
                view = null;
                viewgroup = null;
            }
            if (viewgroup != null && view != null)
            {
                obj = viewgroup;
                viewgroup = view;
            } else
            {
                view = new FrameLayout(a.a);
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-2, a.a(72F)));
                obj = new android.widget.FrameLayout.LayoutParams(-2, a.a(72F));
                viewgroup = new WebView(a.a);
                viewgroup.setVerticalScrollBarEnabled(false);
                viewgroup.setHorizontalScrollBarEnabled(false);
                viewgroup.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                view.addView(viewgroup);
                obj = new RelativeLayout(a.a);
                ((RelativeLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, a.a(72F)));
                ((RelativeLayout) (obj)).setClickable(true);
                ((RelativeLayout) (obj)).setOnClickListener(new android.view.View.OnClickListener(this, i) {

                    private int a;
                    private a b;

                    public final void onClick(View view)
                    {
                        b.a.a(a);
                    }

            
            {
                b = a1;
                a = i;
                super();
            }
                });
                view1 = new View(a.a);
                layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, a.a(12F));
                layoutparams.addRule(12);
                view1.setLayoutParams(layoutparams);
                view1.setBackgroundDrawable(new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                    0, -1
                }));
                ((RelativeLayout) (obj)).addView(view1);
                view.addView(((View) (obj)));
                obj = view;
            }
            viewgroup.loadData(((t)x.a(a).get(i)).d(), "text/html; charset=UTF-8", null);
            return ((View) (obj));
        }

        private a()
        {
            a = x.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final int d = Color.parseColor("#E2E2E2");
    private final List e;
    private ListView f;

    public x(Context context, Resources resources, w w1, List list)
    {
        super(context, resources, w1);
        e = list;
        context = new ListView(context);
        context.setAdapter(new a((byte)0));
        context.setDivider(new ColorDrawable(d));
        context.setDividerHeight(a(0.5F));
        resources = new android.widget.LinearLayout.LayoutParams(0, -2);
        resources.weight = 1.0F;
        int i = a(11F);
        resources.setMargins(i, i, 0, i);
        context.setLayoutParams(resources);
        context.setTag("GoogleMapMapsEngineInfolistListView");
        f = context;
        a(context, true);
    }

    static List a(x x1)
    {
        return x1.e;
    }

    public final void a(int i)
    {
        c.a(i);
    }

}
