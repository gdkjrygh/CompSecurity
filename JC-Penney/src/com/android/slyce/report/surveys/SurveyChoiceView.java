// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.widget.CheckedTextView;

// Referenced classes of package com.android.slyce.report.surveys:
//            s

public class SurveyChoiceView extends CheckedTextView
{

    private Drawable a;
    private float b;
    private float c;

    public SurveyChoiceView(Context context)
    {
        super(context);
        a();
    }

    public SurveyChoiceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public SurveyChoiceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    static float a(SurveyChoiceView surveychoiceview, float f)
    {
        surveychoiceview.b = f;
        return f;
    }

    private void a()
    {
        b = 0.0F;
        c = 1.5F;
    }

    static float b(SurveyChoiceView surveychoiceview, float f)
    {
        surveychoiceview.c = f;
        return f;
    }

    protected void onDraw(Canvas canvas)
    {
        int i = 0;
        Drawable drawable = a;
        float f = getResources().getDisplayMetrics().density;
        int j;
        int k;
        int l;
        int i1;
        if (drawable != null && isChecked())
        {
            j = (int)(14F * f);
        } else
        {
            j = 0;
        }
        k = (int)(12F * f);
        l = (int)(f * 22F);
        setCheckMarkDrawable(null);
        setPadding((int)((float)l + c * (float)j), k, l, k);
        super.onDraw(canvas);
        i1 = (int)((float)l + b * (float)j);
        setPadding(i1, k, l, k);
        setCheckMarkDrawable(drawable);
        if (drawable == null) goto _L2; else goto _L1
_L1:
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 152
    //                   16: 210
    //                   80: 198;
           goto _L3 _L4 _L5
_L3:
        drawable.setBounds(i1 + getScrollX(), i, j + i1 + getScrollX(), i + j);
        drawable.draw(canvas);
_L2:
        setPadding(l, k, l, k);
        return;
_L5:
        i = getHeight() - j;
        continue; /* Loop/switch isn't completed */
_L4:
        i = (getHeight() - j) / 2;
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void setCheckMarkDrawable(Drawable drawable)
    {
        super.setCheckMarkDrawable(drawable);
        a = drawable;
    }

    public void setChecked(boolean flag)
    {
        boolean flag1 = isChecked();
        super.setChecked(flag);
        if (isChecked() && !flag1)
        {
            s s1 = new s(this, null);
            s1.setDuration(300L);
            startAnimation(s1);
        }
    }
}
