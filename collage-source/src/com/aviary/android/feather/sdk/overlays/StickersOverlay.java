// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.overlays;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.library.filters.a;

// Referenced classes of package com.aviary.android.feather.sdk.overlays:
//            AviaryOverlay

public class StickersOverlay extends AviaryOverlay
{

    private final Rect h;
    private View i;
    private Drawable j;
    private DynamicLayout k;
    private DynamicLayout l;
    private Rect m;
    private Rect n;
    private CharSequence o;
    private CharSequence p;
    private float q;
    private CharSequence r;
    private android.text.Layout.Alignment s;

    public StickersOverlay(Context context, int i1, View view)
    {
        this(context, i1, view, com.aviary.android.feather.library.filters.a.a.j, 1);
    }

    public StickersOverlay(Context context, int i1, View view, com.aviary.android.feather.library.filters.a.a a1, int j1)
    {
        super(context, com.aviary.android.feather.library.filters.a.a(a1), i1, j1);
        context = context.getResources();
        h = new Rect();
        j = a();
        i = view;
        o = c(context);
        p = d(context);
        q = b(context);
        r = a(context);
        context = context.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_default_text_align);
        if (android.text.Layout.Alignment.ALIGN_CENTER.name().equals(context))
        {
            s = android.text.Layout.Alignment.ALIGN_CENTER;
        } else
        if (android.text.Layout.Alignment.ALIGN_OPPOSITE.equals(context))
        {
            s = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else
        {
            s = android.text.Layout.Alignment.ALIGN_NORMAL;
        }
        a(new int[] {
            12, 9
        });
    }

    private void o()
    {
        if (!j())
        {
            return;
        }
        i.getGlobalVisibleRect(h);
        int i1 = h.centerX();
        h.centerY();
        int j1 = h.top;
        int k1 = h.left;
        j.setBounds(h.centerX(), h.top - j.getIntrinsicHeight(), h.centerX() + j.getIntrinsicWidth(), h.top);
        DisplayMetrics displaymetrics = getDisplayMetrics();
        int l1 = (int)((float)displaymetrics.widthPixels * (q / 100F));
        l = b(p, l1, s);
        m = new Rect();
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (a.equals(r))
        {
            m.left = k1 - l1 / 2;
        } else
        if (b.equals(r))
        {
            m.left = i1 - l1 / 2;
        } else
        {
            m.left = h.right;
        }
        m.right = m.left + l.getWidth();
        m.top = j1 - j.getIntrinsicHeight() - l.getHeight() - getTextMargins();
        m.bottom = m.top + l.getHeight();
        if (m.right > displaymetrics.widthPixels)
        {
            m.offset(displaymetrics.widthPixels - m.right - getTextMargins(), 0);
        } else
        if (m.left < 0)
        {
            m.left = getTextMargins();
        }
        k = a(o, l1, s);
        n = new Rect();
        n.left = m.left;
        n.right = m.right;
        n.top = m.top - k.getHeight() - getTitleMargins();
        n.bottom = n.top + k.getHeight();
        layoutparams = (android.widget.RelativeLayout.LayoutParams)generateDefaultLayoutParams();
        layoutparams.addRule(12);
        if (h.centerX() < displaymetrics.widthPixels / 2)
        {
            layoutparams.addRule(11);
        } else
        {
            layoutparams.addRule(9);
        }
        layoutparams.setMargins(d, d, d, d);
        getCloseButton().setLayoutParams(layoutparams);
    }

    private void p()
    {
        if (getContext() != null)
        {
            com.aviary.android.feather.common.b.b.a(getContext()).a((new StringBuilder()).append(getToolName()).append(": tutorial_pack_selected").toString());
        }
    }

    protected CharSequence a(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.aviary_overlay_stickers_text_position);
    }

    public void a(View view)
    {
        f.b("update");
        i = view;
        l = null;
        d();
        postInvalidate();
    }

    protected float b(Resources resources)
    {
        return resources.getFraction(com.aviary.android.feather.sdk.R.fraction.aviary_overlay_stickers_text_width, 100, 100);
    }

    protected CharSequence c(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_stickers);
    }

    protected CharSequence d(Resources resources)
    {
        return resources.getString(com.aviary.android.feather.sdk.R.string.feather_overlay_stickers_text);
    }

    protected void d()
    {
        f.b("calculatePositions");
        o();
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (getVisibility() != 0 || !j() || i == null)
        {
            return;
        }
        canvas.drawColor(getBackgroundColor());
        o();
        j.draw(canvas);
        if (l != null)
        {
            canvas.save();
            canvas.translate(m.left, m.top);
            l.draw(canvas);
            canvas.restore();
        }
        if (k != null)
        {
            canvas.save();
            canvas.translate(n.left, n.top);
            k.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(h.left, h.top);
        i.draw(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
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
        f.b("inAnimationCompleted");
        if (getCloseButton() != null)
        {
            getCloseButton().setVisibility(0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        float f1 = Math.abs(motionevent.getRawX() - (float)h.centerX());
        float f2 = Math.abs(motionevent.getRawY() - (float)h.centerY());
        double d1 = Math.pow(f1, 2D);
        Math.sqrt(Math.pow(f2, 2D) + d1);
        int i1 = (int)((float)h.width() / 1.5F);
        if (h.contains((int)motionevent.getRawX(), (int)motionevent.getRawY()))
        {
            p();
            flag = false;
        } else
        if (motionevent.getAction() == 0)
        {
            b("background");
            return true;
        }
        return flag;
    }

    public void setAlpha(float f1)
    {
        if (k != null)
        {
            k.getPaint().setAlpha((int)(f1 * 255F));
        }
        if (l != null)
        {
            l.getPaint().setAlpha((int)(f1 * 255F));
        }
        j.setAlpha((int)(f1 * 255F));
        super.setAlpha(f1);
    }

    public void setText(int i1)
    {
        setText(((CharSequence) (getContext().getString(i1))));
    }

    public void setText(CharSequence charsequence)
    {
        p = charsequence;
        l = null;
        postInvalidate();
    }

    public void setTitle(int i1)
    {
        setTitle(((CharSequence) (getContext().getString(i1))));
    }

    public void setTitle(CharSequence charsequence)
    {
        o = charsequence;
        k = null;
        postInvalidate();
    }
}
