// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import a.a.a.a.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.arist.model.skin:
//            m, b

public class ColorTextView extends TextView
    implements m
{

    private boolean a;
    private boolean b;
    private boolean c;

    public ColorTextView(Context context)
    {
        super(context);
        a = true;
        b = false;
        c = false;
    }

    public ColorTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        b = false;
        c = false;
        context = getResources().obtainAttributes(attributeset, b.d);
        a = context.getBoolean(0, a);
        c = context.getBoolean(1, c);
        b = context.getBoolean(2, b);
        context.recycle();
    }

    public ColorTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
        b = false;
        c = false;
    }

    public final void a()
    {
        a = false;
        c = false;
        b = true;
    }

    public final void a(int i)
    {
        if (a)
        {
            setTextColor(i);
        }
        if (!c) goto _L2; else goto _L1
_L1:
        Drawable adrawable[];
        int j;
        int k;
        adrawable = getCompoundDrawables();
        k = adrawable.length;
        j = 0;
_L5:
        if (j < k) goto _L3; else goto _L2
_L2:
        if (b)
        {
            if (getBackground() == null)
            {
                break; /* Loop/switch isn't completed */
            }
            getBackground().setColorFilter(new LightingColorFilter(i, 1));
        }
        return;
_L3:
        Drawable drawable = adrawable[j];
        if (drawable != null)
        {
            drawable.setColorFilter(new LightingColorFilter(i, 1));
        }
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        setBackgroundColor(i);
        return;
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
