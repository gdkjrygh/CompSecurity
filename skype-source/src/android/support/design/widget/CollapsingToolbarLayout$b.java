// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.am;
import android.support.v4.view.x;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CollapsingToolbarLayout, AppBarLayout, v, d

private final class <init>
    implements <init>
{

    final CollapsingToolbarLayout a;

    public final void a(AppBarLayout appbarlayout, int i)
    {
        View view;
        <init> <init>1;
        v v1;
        int j;
        int i1;
        CollapsingToolbarLayout.b(a, i);
        int k;
        int j1;
        if (CollapsingToolbarLayout.a(a) != null)
        {
            j = CollapsingToolbarLayout.a(a).b();
        } else
        {
            j = 0;
        }
        i1 = appbarlayout.a();
        k = 0;
        j1 = a.getChildCount();
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        view = a.getChildAt(k);
        <init>1 = (tChildAt)view.getLayoutParams();
        v1 = CollapsingToolbarLayout.a(view);
        switch (<init>1.a)
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
        if ((a.getHeight() - j) + i >= view.getHeight())
        {
            v1.a(-i);
        }
        continue; /* Loop/switch isn't completed */
        v1.a(Math.round((float)(-i) * <init>1.b));
        if (true) goto _L4; else goto _L3
_L3:
        int l;
        int k1;
        if (CollapsingToolbarLayout.b(a) != null || CollapsingToolbarLayout.c(a) != null)
        {
            if (a.getHeight() + i < x.r(a) * 2 + j)
            {
                CollapsingToolbarLayout.d(a);
            } else
            {
                CollapsingToolbarLayout.e(a);
            }
        }
        if (CollapsingToolbarLayout.c(a) != null && j > 0)
        {
            x.d(a);
        }
        l = a.getHeight();
        k1 = x.r(a);
        CollapsingToolbarLayout.f(a).b((float)Math.abs(i) / (float)(l - k1 - j));
        if (Math.abs(i) == i1)
        {
            x.f(appbarlayout, appbarlayout.g());
            return;
        } else
        {
            x.f(appbarlayout, 0.0F);
            return;
        }
    }

    private (CollapsingToolbarLayout collapsingtoolbarlayout)
    {
        a = collapsingtoolbarlayout;
        super();
    }

    a(CollapsingToolbarLayout collapsingtoolbarlayout, byte byte0)
    {
        this(collapsingtoolbarlayout);
    }
}
