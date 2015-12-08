// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import sp;

public class MediaRouteVolumeSlider extends AppCompatSeekBar
{

    public int a;
    private final float b;
    private boolean c;
    private Drawable d;

    public MediaRouteVolumeSlider(Context context)
    {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f01013f);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = sp.b(context);
    }

    public final void a(boolean flag)
    {
        if (c == flag)
        {
            return;
        }
        c = flag;
        Drawable drawable;
        if (c)
        {
            drawable = null;
        } else
        {
            drawable = d;
        }
        super.setThumb(drawable);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int i;
        if (isEnabled())
        {
            i = 255;
        } else
        {
            i = (int)(255F * b);
        }
        d.setColorFilter(a, android.graphics.PorterDuff.Mode.SRC_IN);
        d.setAlpha(i);
        getProgressDrawable().setColorFilter(a, android.graphics.PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    public void setThumb(Drawable drawable)
    {
        d = drawable;
        if (c)
        {
            drawable = null;
        } else
        {
            drawable = d;
        }
        super.setThumb(drawable);
    }
}
