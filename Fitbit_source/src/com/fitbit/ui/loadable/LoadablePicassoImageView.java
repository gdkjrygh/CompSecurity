// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.fitbit.e.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;

// Referenced classes of package com.fitbit.ui.loadable:
//            b

public class LoadablePicassoImageView extends ImageView
    implements android.view.ViewTreeObserver.OnPreDrawListener
{
    public static final class MeasureMode extends Enum
    {

        public static final MeasureMode a;
        public static final MeasureMode b;
        private static final MeasureMode c[];

        public static MeasureMode valueOf(String s)
        {
            return (MeasureMode)Enum.valueOf(com/fitbit/ui/loadable/LoadablePicassoImageView$MeasureMode, s);
        }

        public static MeasureMode[] values()
        {
            return (MeasureMode[])c.clone();
        }

        static 
        {
            a = new MeasureMode("MEASURE_TO_VIEW_WIDTH", 0);
            b = new MeasureMode("MEASURE_TO_SQUARE", 1);
            c = (new MeasureMode[] {
                a, b
            });
        }

        private MeasureMode(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static final String k = "LoadablePicassoImageView";
    protected b a;
    protected b b;
    protected Drawable c;
    protected Drawable d;
    protected int e;
    protected int f;
    protected String g;
    protected int h;
    protected MeasureMode i;
    protected boolean j;
    private boolean l;

    public LoadablePicassoImageView(Context context)
    {
        super(context);
        j = false;
        l = false;
        a();
        d();
    }

    public LoadablePicassoImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = false;
        l = false;
        a();
        d();
        a(context, attributeset, 0);
    }

    public LoadablePicassoImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = false;
        l = false;
        a();
        d();
        a(context, attributeset, i1);
    }

    private void a(int i1, int j1)
    {
        i1 = Math.min(android.view.View.MeasureSpec.getSize(i1), android.view.View.MeasureSpec.getSize(j1));
        setMeasuredDimension(i1, i1);
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        if (i1 != 0)
        {
            context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.LoadablePicassoImageView, i1, 0);
        } else
        {
            context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.LoadablePicassoImageView);
        }
        if (context != null)
        {
            l = context.getBoolean(0, false);
            context.recycle();
        }
    }

    private void a(Picasso picasso, Target target, int i1)
    {
        picasso.cancelRequest(target);
        picasso = picasso.load(i1);
        a(((RequestCreator) (picasso)));
        picasso.into(target);
    }

    private void a(Picasso picasso, Target target, String s, boolean flag)
    {
        picasso.cancelRequest(target);
        picasso = picasso.load(s);
        a(((RequestCreator) (picasso)));
        if (!flag)
        {
            picasso.skipMemoryCache();
        }
        if (l && j)
        {
            int i1 = getWidth();
            int j1 = getHeight();
            com.fitbit.e.a.a("LoadablePicassoImageView", "load auto resize", new Object[0]);
            picasso.resize(i1, j1);
        }
        picasso.into(target);
    }

    private void a(RequestCreator requestcreator)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        requestcreator.placeholder(c);
_L8:
        if (d == null) goto _L4; else goto _L3
_L3:
        requestcreator.error(d);
_L6:
        return;
_L2:
        if (e != 0)
        {
            super.setImageResource(e);
            requestcreator.placeholder(e);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (f == 0) goto _L6; else goto _L5
_L5:
        requestcreator.error(f);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void c(int i1)
    {
        int k1 = 1;
        Drawable drawable = getDrawable();
        float f1;
        if (drawable == null)
        {
            f1 = 1.0F;
        } else
        {
            int i2 = drawable.getIntrinsicWidth();
            int l1 = drawable.getIntrinsicHeight();
            int j1 = i2;
            if (i2 <= 0)
            {
                j1 = 1;
            }
            if (l1 > 0)
            {
                k1 = l1;
            }
            f1 = (float)j1 / (float)k1;
        }
        i1 = android.view.View.MeasureSpec.getSize(i1);
        setMeasuredDimension(i1, (int)((double)i1 / (double)f1));
    }

    private void d()
    {
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    private void e()
    {
        a(com.fitbit.serverinteraction.c.a.a(), b, h);
    }

    private void f()
    {
        a(com.fitbit.serverinteraction.c.a.a(), b, g, true);
        a(com.fitbit.serverinteraction.c.a.b(), a, g, false);
    }

    protected void a()
    {
        b = new b(getContext(), this);
        a = new b(getContext(), this);
        a.d = false;
    }

    public void a(int i1)
    {
        e = i1;
    }

    public void a(Drawable drawable)
    {
        c = drawable;
    }

    public void a(MeasureMode measuremode)
    {
        i = measuremode;
    }

    public void a(b b1, b b2)
    {
        if (b != null)
        {
            com.fitbit.serverinteraction.c.a.a().cancelRequest(b);
        }
        b = b2;
        if (a != null)
        {
            com.fitbit.serverinteraction.c.a.b().cancelRequest(a);
        }
        a = b1;
        a.d = false;
    }

    public void a(String s)
    {
        while (a == null || b == null || TextUtils.equals(g, s)) 
        {
            return;
        }
        if (b != null)
        {
            com.fitbit.serverinteraction.c.a.a().cancelRequest(b);
        }
        g = s;
        h = -1;
        if (!l)
        {
            f();
            return;
        } else
        {
            j = true;
            com.fitbit.e.a.a("LoadablePicassoImageView", "setImageUri deferred", new Object[0]);
            return;
        }
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public MeasureMode b()
    {
        return i;
    }

    public void b(int i1)
    {
        f = i1;
    }

    public void b(Drawable drawable)
    {
        d = drawable;
    }

    protected void c()
    {
        if (!TextUtils.isEmpty(g))
        {
            f();
        } else
        if (h != -1)
        {
            e();
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        if (com.fitbit.ui.loadable.MeasureMode.a == i)
        {
            c(i1);
            return;
        }
        if (MeasureMode.b == i)
        {
            a(i1, j1);
            return;
        } else
        {
            super.onMeasure(i1, j1);
            return;
        }
    }

    public boolean onPreDraw()
    {
        if (j)
        {
            com.fitbit.e.a.a("LoadablePicassoImageView", "onPreDraw deferred", new Object[0]);
            c();
            j = false;
        }
        return true;
    }

    public void setImageResource(int i1)
    {
        while (b == null || i1 == h) 
        {
            return;
        }
        if (a != null)
        {
            com.fitbit.serverinteraction.c.a.b().cancelRequest(a);
        }
        h = i1;
        g = null;
        if (!l)
        {
            e();
            return;
        } else
        {
            j = true;
            com.fitbit.e.a.a("LoadablePicassoImageView", "setResourceId deferred", new Object[0]);
            return;
        }
    }
}
