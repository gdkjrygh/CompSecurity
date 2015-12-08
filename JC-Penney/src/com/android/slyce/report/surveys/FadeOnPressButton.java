// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class FadeOnPressButton extends Button
{

    private boolean a;

    public FadeOnPressButton(Context context)
    {
        super(context);
    }

    public FadeOnPressButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FadeOnPressButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setAlphaBySDK(float f)
    {
        setAlpha(f);
    }

    protected void drawableStateChanged()
    {
        boolean flag1 = false;
        int ai[] = getDrawableState();
        int j = ai.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (ai[i] != 0x10100a7)
                    {
                        break label0;
                    }
                    if (!a)
                    {
                        setAlphaBySDK(0.5F);
                    }
                    flag = true;
                }
                if (a && !flag)
                {
                    setAlphaBySDK(1.0F);
                    a = true;
                }
                super.drawableStateChanged();
                return;
            }
            i++;
        } while (true);
    }
}
