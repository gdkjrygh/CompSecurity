// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.overlays;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.aviary.android.feather.library.filters.a;

// Referenced classes of package com.aviary.android.feather.sdk.overlays:
//            AviaryOverlay

public class BlemishOutOverlay extends AviaryOverlay
{

    private Drawable h;
    private Drawable i;
    private Drawable j;
    private CharSequence k;
    private CharSequence l;
    private final android.text.Layout.Alignment m;
    private final float n;
    private final float o;

    public BlemishOutOverlay(Context context, int i1)
    {
        super(context, (new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a(com.aviary.android.feather.library.filters.a.a.l)).append("_out").toString(), i1, 4);
        context = context.getResources();
        h = context.getDrawable(com.aviary.android.feather.sdk.R.drawable.aviary_overlay_blur_blue);
        k = c(context);
        l = d(context);
        o = a(context);
        n = b(context);
        m = android.text.Layout.Alignment.ALIGN_CENTER;
        a(new int[] {
            9, 12
        });
    }

    private Rect a(Drawable drawable, Rect rect, int i1, CharSequence charsequence)
    {
        DisplayMetrics displaymetrics = getDisplayMetrics();
        int j1 = drawable.getIntrinsicWidth();
        int k1 = drawable.getIntrinsicHeight();
        drawable = new Rect(0, 0, j1, k1);
        if ("top".equals(charsequence))
        {
            drawable.offsetTo((displaymetrics.widthPixels - j1) / 2, rect.top - k1 - i1);
            return drawable;
        } else
        {
            drawable.offsetTo((displaymetrics.widthPixels - j1) / 2, rect.bottom + i1);
            return drawable;
        }
    }

    private void o()
    {
        if (!j())
        {
            return;
        } else
        {
            Object obj = getDisplayMetrics();
            int k2 = h.getIntrinsicWidth();
            int i1 = h.getIntrinsicHeight();
            int j1 = getWidth() / 2;
            int k1 = k2 / 2;
            int l1 = getHeight() / 2;
            int i2 = i1 / 2;
            int j2 = getWidth() / 2;
            k2 /= 2;
            int l2 = getHeight() / 2;
            Rect rect = new Rect(j1 - k1, l1 - i2, k2 + j2, i1 / 2 + l2);
            h.setBounds(rect);
            i1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (n / 100F));
            j1 = (int)((float)((DisplayMetrics) (obj)).widthPixels * (o / 100F));
            i = a(getContext(), k, i1, m);
            obj = a(i, h.getBounds(), getTextMargins(), "top");
            i.setBounds(((Rect) (obj)));
            i.setAlpha(0);
            j = c(getContext(), l, j1, m);
            obj = a(j, h.getBounds(), getTextMargins(), "bottom");
            j.setBounds(((Rect) (obj)));
            j.setAlpha(0);
            return;
        }
    }

    protected float a(Resources resources)
    {
        return resources.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_blemish_text4_width, 100, 100);
    }

    protected float b(Resources resources)
    {
        return resources.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_blemish_text3_width, 100, 100);
    }

    protected CharSequence c(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_blemish_close_title);
    }

    protected CharSequence d(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_blemish_close_text);
    }

    protected void d()
    {
        f.b("calculatePositions");
        o();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (getVisibility() != 0 || !j())
        {
            return;
        } else
        {
            canvas.drawColor(getBackgroundColor());
            h.draw(canvas);
            j.draw(canvas);
            i.draw(canvas);
            super.dispatchDraw(canvas);
            return;
        }
    }

    protected void e()
    {
        f.b("doShow");
        if (!j())
        {
            return;
        } else
        {
            m();
            return;
        }
    }

    protected void f()
    {
        if (getCloseButton() != null)
        {
            getCloseButton().setVisibility(0);
        }
    }

    public void onClick(View view)
    {
        f.b((new StringBuilder()).append("onClick: ").append(view).toString());
        if (view == getCloseButton() && g != null)
        {
            a("button");
            g.a(this);
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g != null)
        {
            a("background");
            g.a(this);
        } else
        if (motionevent.getAction() == 0)
        {
            b("background");
            return true;
        }
        return true;
    }

    public void setAlpha(float f1)
    {
        h.setAlpha((int)(f1 * 255F));
        i.setAlpha((int)(f1 * 255F));
        j.setAlpha((int)(f1 * 255F));
        super.setAlpha(f1);
    }
}
