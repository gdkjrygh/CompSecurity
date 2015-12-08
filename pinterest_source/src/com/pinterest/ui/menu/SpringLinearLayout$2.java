// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.spring.Spring;

// Referenced classes of package com.pinterest.ui.menu:
//            SpringLinearLayout

class this._cls0
    implements Runnable
{

    final SpringLinearLayout this$0;

    public void run()
    {
        int i = 0;
_L11:
        View view;
        int j;
        if (i >= SpringLinearLayout.access$100(SpringLinearLayout.this).length)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i);
        j = 0;
_L8:
        Spring spring;
        if (j >= SpringLinearLayout.access$100(SpringLinearLayout.this)[i].length)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        spring = SpringLinearLayout.access$100(SpringLinearLayout.this)[i][j];
        if (spring == null || !spring.isStillMoving()) goto _L2; else goto _L1
_L1:
        float f1;
        f1 = spring.getNextFrame();
        setVisibility(0);
        view.setVisibility(0);
        j;
        JVM INSTR tableswitch 0 3: default 124
    //                   0 189
    //                   1 197
    //                   2 205
    //                   3 229;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_229;
_L9:
        if (!spring.isStillMoving() && SpringLinearLayout.access$200(SpringLinearLayout.this)[i][j] != null)
        {
            SpringLinearLayout.access$200(SpringLinearLayout.this)[i][j].onAnimationComplete();
            SpringLinearLayout.access$200(SpringLinearLayout.this)[i][j] = null;
        }
_L2:
        j++;
          goto _L8
_L4:
        view.setTranslationX(f1);
          goto _L9
_L5:
        view.setTranslationY(f1);
          goto _L9
_L6:
        view.setScaleX(f1);
        view.setScaleY(f1);
        if (f1 == 0.0F)
        {
            view.setVisibility(4);
        }
          goto _L9
        float f;
        if (f1 > 1.0F)
        {
            f = 1.0F;
        } else
        {
            f = f1;
            if (f1 < 0.0F)
            {
                f = 0.0F;
            }
        }
        view.setAlpha(f);
          goto _L9
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        if (SpringLinearLayout.this == null)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        ViewCompat.postInvalidateOnAnimation(SpringLinearLayout.this);
        return;
        Exception exception;
        exception;
        CrashReporting.a(exception);
        return;
    }

    imListener()
    {
        this$0 = SpringLinearLayout.this;
        super();
    }
}
