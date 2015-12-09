// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.spotify.android.glue.organisms.header.transformations.TransformationSet;
import dco;
import dek;
import del;
import det;
import dew;
import dex;
import dey;
import dez;
import dfa;
import dfb;
import dgm;
import dik;
import diw;
import java.util.Arrays;
import jz;

// Referenced classes of package com.spotify.android.glue.organisms.header:
//            GlueBaseHeaderView

public class GlueLargeHeaderView extends GlueBaseHeaderView
    implements diw
{

    public final ImageView c;
    private Context d;
    private dik e;
    private final TransformationSet f;
    private final TransformationSet g;

    public GlueLargeHeaderView(Context context)
    {
        this(context, null);
    }

    public GlueLargeHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new ImageView(context);
        c.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        addView(c, 0);
        d = new ContextThemeWrapper(context, 0x7f0b018c);
        b.a(0);
        e = new dik(c);
        f = ((dex)dew.a(0.1F, 0.8F).a().a(1.0F, 0.0F).a(dco.a).a(new dfb[] {
            det.a(a, View.ALPHA)
        }).a().a(1.0F, 0.5F).a(new dfb[] {
            det.a(a, Arrays.asList(new Property[] {
                View.SCALE_X, View.SCALE_Y
            }))
        }).a(0.0F, -128F).a(new dfb[] {
            det.a(a, View.TRANSLATION_Y)
        }).b()).b().c();
        context = new dfb() {

            private GlueLargeHeaderView a;

            public final void a(float f1)
            {
                a.b.a((int)(255F * (1.0F - f1)));
            }

            
            {
                a = GlueLargeHeaderView.this;
                super();
            }
        };
        g = ((dfa)dew.a(0.0F, 0.5F).a().a(1.0F, 0.0F).a(dco.a).a(new dfb[] {
            det.a(c, View.ALPHA), context
        }).b()).a;
        setLayerType(2, null);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(int i, float f1)
    {
        super.a(i, f1);
        f.a(f1);
        e.a(i);
        g.a(f1);
        invalidate();
    }

    public final volatile void a(Button button)
    {
        super.a(button);
    }

    public final void a(del del1)
    {
        a.addView(del1.a(), -1, new android.widget.LinearLayout.LayoutParams(-2, -2));
    }

    public final ViewGroup b()
    {
        return this;
    }

    public final volatile void b(int i)
    {
        super.b(i);
    }

    public final ImageView c()
    {
        return c;
    }

    public final volatile void c(int i)
    {
        super.c(i);
    }

    public final Context d()
    {
        return d;
    }

    public final volatile void d(int i)
    {
        super.d(i);
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        if (view == c)
        {
            boolean flag = super.drawChild(canvas, view, l);
            b.a(canvas);
            return flag;
        } else
        {
            return super.drawChild(canvas, view, l);
        }
    }

    public final dgm e()
    {
        return new dgm() {

            private GlueLargeHeaderView a;

            public final View a()
            {
                return a;
            }

            public final void a(View view)
            {
                throw new UnsupportedOperationException("setContentView is not supported in GlueHeaderView.");
            }

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
            }

            public final void a(jz jz)
            {
                throw new UnsupportedOperationException("setAdapter is not supported in GlueHeaderView.");
            }

            public final ImageView b()
            {
                throw new IllegalStateException("Only a header with media type IMAGE can have ImageView.");
            }

            public final void b(View view)
            {
                throw new UnsupportedOperationException("setContentView is not supported in GlueHeaderView.");
            }

            
            {
                a = GlueLargeHeaderView.this;
                super();
            }
        };
    }

    public final volatile void e(int i)
    {
        super.e(i);
    }

    public final void f()
    {
        e.a = true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        e.a();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        e.a(getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight());
    }
}
