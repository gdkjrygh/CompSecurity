// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.common.w.j;
import com.facebook.common.w.o;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.ipc.k;
import com.facebook.orca.prefs.az;
import com.facebook.widget.f;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.orca.compose:
//            as, at, au

public class LocationDisabledNuxView extends f
{

    private az a;
    private TextView b;
    private ImageButton c;
    private k d;
    private boolean e;
    private boolean f;

    public LocationDisabledNuxView(Context context)
    {
        super(context);
        a();
    }

    public LocationDisabledNuxView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public LocationDisabledNuxView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a();
    }

    private void a()
    {
        t t1 = getInjector();
        a = (az)t1.a(com/facebook/orca/prefs/az);
        d = (k)t1.a(com/facebook/messages/ipc/k);
        setVisibility(8);
        setClickable(true);
    }

    static void a(LocationDisabledNuxView locationdisablednuxview)
    {
        locationdisablednuxview.e();
    }

    private void b()
    {
        if (f)
        {
            return;
        } else
        {
            f = true;
            setContentView(com.facebook.k.orca_location_disabled_nux);
            c = (ImageButton)getView(i.compose_location_nux_close_button);
            b = (TextView)getView(i.compose_location_nux_text2);
            b.setMovementMethod(LinkMovementMethod.getInstance());
            CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
            customurllikespan.a(new as(this));
            Resources resources = getResources();
            o o1 = new o(getResources());
            o1.a(resources.getString(com.facebook.o.compose_location_disabled_nux_text));
            o1.a("[[link]]", resources.getString(com.facebook.o.compose_location_disabled_nux_link), customurllikespan, 33);
            b.setText(o1.b());
            c.setOnClickListener(new at(this));
            return;
        }
    }

    static void b(LocationDisabledNuxView locationdisablednuxview)
    {
        locationdisablednuxview.d();
    }

    private void c()
    {
        if (!e)
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

    static void c(LocationDisabledNuxView locationdisablednuxview)
    {
        locationdisablednuxview.b();
    }

    private void d()
    {
        a.c("dismissed_location_disabled_nux");
        setVisibility(8);
    }

    static void d(LocationDisabledNuxView locationdisablednuxview)
    {
        locationdisablednuxview.c();
    }

    private void e()
    {
        Context context = getContext();
        context.startActivity(d.a(context));
    }

    void a(boolean flag)
    {
        e = flag;
        if (!flag)
        {
            setVisibility(8);
            return;
        } else
        {
            postDelayed(new au(this), 300L);
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
