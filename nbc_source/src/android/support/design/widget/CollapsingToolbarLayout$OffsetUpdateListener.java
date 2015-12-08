// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CollapsingToolbarLayout, AppBarLayout, ViewOffsetHelper, CollapsingTextHelper

private class <init>
    implements <init>
{

    final CollapsingToolbarLayout this$0;

    public void onOffsetChanged(AppBarLayout appbarlayout, int i)
    {
        View view;
        <init> <init>1;
        ViewOffsetHelper viewoffsethelper;
        int j;
        int i1;
        CollapsingToolbarLayout.access$302(CollapsingToolbarLayout.this, i);
        int k;
        int j1;
        if (CollapsingToolbarLayout.access$000(CollapsingToolbarLayout.this) != null)
        {
            j = CollapsingToolbarLayout.access$000(CollapsingToolbarLayout.this).getSystemWindowInsetTop();
        } else
        {
            j = 0;
        }
        i1 = appbarlayout.getTotalScrollRange();
        k = 0;
        j1 = getChildCount();
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        view = getChildAt(k);
        <init>1 = (this._cls0)view.getLayoutParams();
        viewoffsethelper = CollapsingToolbarLayout.access$400(view);
        switch (<init>1.eMode)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_153;
_L4:
        k++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_49;
_L1:
        if ((getHeight() - j) + i >= view.getHeight())
        {
            viewoffsethelper.setTopAndBottomOffset(-i);
        }
        continue; /* Loop/switch isn't completed */
        viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * <init>1.xMult));
        if (true) goto _L4; else goto _L3
_L3:
        int l;
        int k1;
        if (CollapsingToolbarLayout.access$500(CollapsingToolbarLayout.this) != null || CollapsingToolbarLayout.access$600(CollapsingToolbarLayout.this) != null)
        {
            if (getHeight() + i < getScrimTriggerOffset() + j)
            {
                CollapsingToolbarLayout.access$700(CollapsingToolbarLayout.this);
            } else
            {
                CollapsingToolbarLayout.access$800(CollapsingToolbarLayout.this);
            }
        }
        if (CollapsingToolbarLayout.access$600(CollapsingToolbarLayout.this) != null && j > 0)
        {
            ViewCompat.postInvalidateOnAnimation(CollapsingToolbarLayout.this);
        }
        l = getHeight();
        k1 = ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this);
        CollapsingToolbarLayout.access$900(CollapsingToolbarLayout.this).setExpansionFraction((float)Math.abs(i) / (float)(l - k1 - j));
        if (Math.abs(i) == i1)
        {
            ViewCompat.setElevation(appbarlayout, appbarlayout.getTargetElevation());
            return;
        } else
        {
            ViewCompat.setElevation(appbarlayout, 0.0F);
            return;
        }
    }

    private ()
    {
        this$0 = CollapsingToolbarLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
