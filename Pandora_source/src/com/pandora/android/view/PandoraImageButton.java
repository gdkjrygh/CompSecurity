// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class PandoraImageButton extends ImageButton
{

    private String a;
    private boolean b;
    private boolean c;

    public PandoraImageButton(Context context)
    {
        super(context);
        a = null;
        b = false;
        c = false;
        a(context, null, 0);
    }

    public PandoraImageButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = false;
        c = false;
        a(context, attributeset, 0);
    }

    public PandoraImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        b = false;
        c = false;
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        if (!isInEditMode())
        {
            context = context.getTheme().obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.DynamicContentDescription, i, 0);
            a = context.getString(0);
            if (!TextUtils.isEmpty(a))
            {
                flag = true;
            }
            c = flag;
            context.recycle();
        }
    }

    private static boolean a(int ai[], int i)
    {
        if (ai != null)
        {
            int k = ai.length;
            int j = 0;
            while (j < k) 
            {
                if (ai[j] == i)
                {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        b = a(getDrawableState(), 0x10100a0);
    }

    public CharSequence getContentDescription()
    {
        if (b && c)
        {
            return a;
        } else
        {
            return super.getContentDescription();
        }
    }
}
