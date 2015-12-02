// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.bb;
import android.support.v4.app.q;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.facebook.base.h;
import com.facebook.base.i;
import com.facebook.d;
import com.facebook.reflex.view.a.a;
import com.facebook.reflex.view.b.r;
import com.facebook.reflex.view.e;
import com.facebook.reflex.view.g;
import com.facebook.reflex.view.o;
import com.facebook.reflex.view.p;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.refreshablelistview.RefreshableListViewContainer;
import com.facebook.widget.refreshablelistview.RefreshableListViewItem;
import com.facebook.widget.refreshablelistview.RefreshableListViewOverflowItem;
import java.util.EnumSet;
import java.util.HashMap;

// Referenced classes of package com.facebook.reflex:
//            ReflexActivity, m, k, l

public class j extends ReflexActivity
    implements h
{

    private static final int g[];
    private static final HashMap h;
    protected m a;
    protected View b;
    private final i c = new i();
    private bb d;
    private com.facebook.reflex.view.b.p e;
    private boolean f;

    public j()
    {
    }

    static com.facebook.reflex.view.b.p a(j j1)
    {
        return j1.e;
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = c.a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    protected String a(String s)
    {
        return (String)h.get(s);
    }

    public void a(Fragment fragment)
    {
    }

    public void a(ViewGroup viewgroup, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(viewgroup, layoutparams);
    }

    public void a(r r)
    {
        if (a != null)
        {
            e.a(r);
            b.invalidate();
        }
    }

    public void a(Object obj, Object obj1)
    {
        c.a(obj, obj1);
    }

    public void a(EnumSet enumset)
    {
        a.setAndroidTouchMode(enumset);
    }

    protected final boolean a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, g, 0, 0);
        boolean flag = context.getBoolean(0, false);
        context.recycle();
        return flag;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.addView(view, layoutparams);
    }

    public q f()
    {
        return d.r();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        f = true;
        d.l();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().takeSurface(null);
        e = new com.facebook.reflex.view.b.p(this);
        a = new m(this, this);
        super.setContentView(a, new android.view.ViewGroup.LayoutParams(-1, -1));
        super.addContentView(com.facebook.reflex.m.a(a), new android.view.ViewGroup.LayoutParams(-1, -1));
        a(a.a());
        b = new k(this, this);
        super.addContentView(b, new android.view.ViewGroup.LayoutParams(-1, -1));
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        d = new l(this, (ViewGroup)getWindow().getDecorView());
        d.k();
        findViewById(0x1020002).setId(-1);
        a.setId(0x1020002);
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view = null;
        if ("fragment".equals(s))
        {
            view = d.onCreateView(s, context, attributeset);
        } else
        if (a(context, attributeset))
        {
            context = a(s);
            if (context == null)
            {
                throw new RuntimeException((new StringBuilder()).append("Failed to find a reflex substitute for ").append(s).append(" element. Make sure the class names are valid.").toString());
            }
            try
            {
                attributeset = getLayoutInflater().createView(context, null, attributeset);
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                throw new RuntimeException((new StringBuilder()).append("Failed to create an instance of ").append(context).append(" while trying to replace ").append(s).toString(), attributeset);
            }
            return attributeset;
        }
        return view;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        f = false;
        d.q();
    }

    protected void onPause()
    {
        super.onPause();
        d.o();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        d.n();
    }

    public void setContentView(int i1)
    {
        a.g();
        getWindow().getLayoutInflater().inflate(i1, a);
    }

    public void setContentView(View view)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.addView(view);
            return;
        }
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a.g();
        a.addView(view, layoutparams);
    }

    static 
    {
        g = (new int[] {
            d.reflexAware
        });
        h = new HashMap();
        h.put(com/facebook/widget/listview/BetterListView.getName(), com/facebook/reflex/view/h.getName());
        h.put(com/facebook/widget/refreshablelistview/RefreshableListViewContainer.getName(), com/facebook/reflex/view/a/a.getName());
        h.put(com/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem.getName(), android/view/View.getSimpleName());
        h.put(com/facebook/widget/refreshablelistview/RefreshableListViewItem.getName(), android/view/View.getSimpleName());
        h.put(android/widget/ScrollView.getSimpleName(), com/facebook/reflex/view/p.getName());
        h.put(android/widget/Button.getSimpleName(), com/facebook/reflex/view/a.getName());
        h.put(android/widget/LinearLayout.getSimpleName(), com/facebook/reflex/view/g.getName());
        h.put(android/widget/FrameLayout.getSimpleName(), com/facebook/reflex/view/d.getName());
        h.put(android/widget/RelativeLayout.getSimpleName(), com/facebook/reflex/view/o.getName());
        h.put(android/widget/ImageView.getSimpleName(), com/facebook/reflex/view/e.getName());
    }
}
