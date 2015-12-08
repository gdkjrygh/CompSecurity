// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import gad;
import gbv;
import gex;
import gjk;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            StickyHeaderView

public class ShufflePlayHeaderView extends StickyHeaderView
{

    public boolean a;
    private View g;
    private View h;
    private View i;
    private View j;
    private LinearLayout k;
    private gbv l;

    public ShufflePlayHeaderView(Context context)
    {
        super(context);
    }

    public ShufflePlayHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static ShufflePlayHeaderView a(Context context, ListView listview, android.view.View.OnClickListener onclicklistener)
    {
        Object obj = null;
        Object obj1 = listview;
        do
        {
            obj1 = ((View) (obj1)).getParent();
            if (obj1 instanceof View)
            {
                obj1 = (View)obj1;
                obj = ((View) (obj1)).findViewById(0x7f110405);
            } else
            {
                obj1 = null;
            }
        } while (obj == null && obj1 != null);
        obj1 = (ViewGroup)obj;
        obj = (ShufflePlayHeaderView)LayoutInflater.from(context).inflate(0x7f030138, listview, false);
        obj.b = listview;
        obj.d = ((ViewGroup) (obj1));
        ((StickyHeaderView) (obj)).c.addView(((View) (obj)));
        obj.e = true;
        ((StickyHeaderView) (obj)).c.setVisibility(8);
        context = gad.a(context, listview);
        context.setOnClickListener(onclicklistener);
        listview = new android.widget.LinearLayout.LayoutParams(-2, -1);
        obj.j = context;
        ((ShufflePlayHeaderView) (obj)).k.addView(((ShufflePlayHeaderView) (obj)).j, listview);
        (new gjk(context)).a();
        return ((ShufflePlayHeaderView) (obj));
    }

    public static void a(gbv gbv1, View view)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.95F, 1.0F, 0.95F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setDuration(100L);
        ScaleAnimation scaleanimation1 = new ScaleAnimation(0.95F, 1.05F, 0.95F, 1.05F, 1, 0.5F, 1, 0.5F);
        scaleanimation1.setDuration(150L);
        ScaleAnimation scaleanimation2 = new ScaleAnimation(1.05F, 1.0F, 1.05F, 1.0F, 1, 0.5F, 1, 0.5F);
        scaleanimation2.setDuration(100L);
        gbv1.a(view, scaleanimation, false);
        gbv1.a(view, scaleanimation1, false);
        gbv1.a(view, scaleanimation2, false);
    }

    public final void a()
    {
        a(l, i);
    }

    protected final void a(boolean flag)
    {
        if (h != null)
        {
            View view = h;
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    public final void a(boolean flag, Flags flags)
    {
        boolean flag2 = true;
        boolean flag1;
        if (!gex.a(flags))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flags = super.c;
        if (flag)
        {
            flag = flag2;
            if (!a)
            {
                if (flag1)
                {
                    flag = flag2;
                } else
                {
                    flag = false;
                }
            }
            b(flag);
            flags.setVisibility(0);
            return;
        } else
        {
            b(false);
            flags.setVisibility(8);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        g = findViewById(0x7f11026e);
        h = findViewById(0x7f11046f);
        i = findViewById(0x7f11032d);
        l = new gbv();
        k = (LinearLayout)findViewById(0x7f1104cd);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        g.setEnabled(flag);
    }
}
