// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.common.w.j;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.prefs.az;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.compose:
//            ay, az

public class LocationNuxView extends f
{

    private az a;
    private TextView b;
    private ImageButton c;
    private boolean d;
    private boolean e;

    public LocationNuxView(Context context)
    {
        super(context);
        a();
    }

    public LocationNuxView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public LocationNuxView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a();
    }

    private void a()
    {
        a = (az)getInjector().a(com/facebook/orca/prefs/az);
        setVisibility(8);
        setClickable(true);
    }

    static void a(LocationNuxView locationnuxview)
    {
        locationnuxview.d();
    }

    private void b()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            setContentView(k.orca_location_nux);
            b = (TextView)getView(i.compose_location_nux_text);
            c = (ImageButton)getView(i.compose_location_nux_close_button);
            Object obj = getResources();
            String s = ((Resources) (obj)).getString(o.compose_location_nux1);
            String s1 = ((Resources) (obj)).getString(o.compose_location_nux2);
            obj = Html.fromHtml(((Resources) (obj)).getString(o.compose_location_nux, new Object[] {
                TextUtils.htmlEncode(s), TextUtils.htmlEncode(s1)
            }));
            b.setText(((CharSequence) (obj)));
            c.setOnClickListener(new ay(this));
            return;
        }
    }

    static void b(LocationNuxView locationnuxview)
    {
        locationnuxview.b();
    }

    private void c()
    {
        if (!d)
        {
            return;
        } else
        {
            setVisibility(0);
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(250L);
            alphaanimation.setFillEnabled(true);
            alphaanimation.setInterpolator(new LinearInterpolator());
            setAnimation(alphaanimation);
            return;
        }
    }

    static void c(LocationNuxView locationnuxview)
    {
        locationnuxview.c();
    }

    private void d()
    {
        a.c("dismissed_location_nux");
        setVisibility(8);
    }

    void a(boolean flag)
    {
        d = flag;
        if (!flag)
        {
            setVisibility(8);
            return;
        } else
        {
            postDelayed(new com.facebook.orca.compose.az(this), 300L);
            return;
        }
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        super.onLayout(flag, l, i1, j1, k1);
        if (flag)
        {
            Rect rect = new Rect();
            c.getHitRect(rect);
            l = j.a(getContext(), 10F);
            rect.left = rect.left - l;
            rect.top = rect.top - l;
            rect.right = rect.right + l;
            rect.bottom = l + rect.bottom;
            setTouchDelegate(new TouchDelegate(rect, c));
        }
    }
}
