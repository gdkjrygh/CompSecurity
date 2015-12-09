// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CollapsingToolbarLayout

class this._cls0
    implements OnApplyWindowInsetsListener
{

    final CollapsingToolbarLayout this$0;

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        CollapsingToolbarLayout.access$002(CollapsingToolbarLayout.this, windowinsetscompat);
        requestLayout();
        return windowinsetscompat.consumeSystemWindowInsets();
    }

    ()
    {
        this$0 = CollapsingToolbarLayout.this;
        super();
    }
}
