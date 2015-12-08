// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.arist.model.skin:
//            m, b

public class ColorImageView extends ImageView
    implements m
{

    private int a;
    private boolean b;

    public ColorImageView(Context context)
    {
        super(context);
        b = true;
    }

    public ColorImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = true;
    }

    public ColorImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = true;
    }

    public final void a(int i)
    {
        if (a != i)
        {
            a = i;
            if (b)
            {
                setColorFilter(new LightingColorFilter(i, 1));
            }
        }
    }

    public final void a(boolean flag)
    {
        b = flag;
        if (flag)
        {
            setColorFilter(new LightingColorFilter(a, 1));
            return;
        } else
        {
            setColorFilter(null);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }
}
