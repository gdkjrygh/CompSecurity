// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aviary.android.feather.library.a.a;
import com.aviary.android.feather.library.services.BadgeService;
import com.aviary.android.feather.sdk.AviaryMainController;
import com.aviary.android.feather.sdk.FeatherActivity;

public class AviaryBadgeToolLayout extends LinearLayout
    implements com.aviary.android.feather.library.services.BadgeService.a
{

    View a;
    ImageView b;
    TextView c;
    BadgeService d;

    public AviaryBadgeToolLayout(Context context)
    {
        this(context, null);
    }

    public AviaryBadgeToolLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AviaryBadgeToolLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
    }

    protected void a()
    {
        Object obj = (FeatherActivity)getContext();
        if (obj != null)
        {
            obj = ((FeatherActivity) (obj)).A();
            if (obj != null)
            {
                d = (BadgeService)((AviaryMainController) (obj)).a(com/aviary/android/feather/library/services/BadgeService);
                d.a(this);
            }
        }
    }

    public void a(BadgeService badgeservice)
    {
label0:
        {
            a a1 = (a)getTag();
            if (a1 != null)
            {
                if (!badgeservice.b(a1.c))
                {
                    break label0;
                }
                d();
            }
            return;
        }
        c();
    }

    public void a(BadgeService badgeservice, com.aviary.android.feather.library.filters.a.a a1)
    {
label0:
        {
            a a2 = (a)getTag();
            if (a2 != null && a2.c == a1)
            {
                Log.i("AviaryBadgeToolLayout", (new StringBuilder()).append("onToolBadgeSingleUpdate: ").append(a1).toString());
                if (!badgeservice.b(a2.c))
                {
                    break label0;
                }
                d();
            }
            return;
        }
        c();
    }

    protected void a(Object obj)
    {
        if (obj != null)
        {
            obj = (a)obj;
            b.setImageResource(((a) (obj)).b);
            c.setText(((a) (obj)).a);
            if (getContext() != null)
            {
                setContentDescription(getContext().getString(((a) (obj)).a));
            }
            if (d != null)
            {
                a(d);
            }
            postInvalidate();
        }
    }

    protected void b()
    {
        if (d != null)
        {
            d.b(this);
        }
    }

    protected void c()
    {
        if (a != null)
        {
            a.setVisibility(8);
        }
    }

    protected void d()
    {
        if (a != null)
        {
            a.setVisibility(0);
        }
    }

    protected void finalize()
        throws Throwable
    {
        b();
        super.finalize();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (d != null)
        {
            a(d);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(com.aviary.android.feather.sdk.R.id.aviary_badge);
        c = (TextView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_text);
        b = (ImageView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_image);
        a();
    }

    public void setTag(Object obj)
    {
        super.setTag(obj);
        a(obj);
    }
}
