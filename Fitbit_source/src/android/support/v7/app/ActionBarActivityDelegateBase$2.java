// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

class this._cls0
    implements OnApplyWindowInsetsListener
{

    final ActionBarActivityDelegateBase this$0;

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        int i = windowinsetscompat.getSystemWindowInsetTop();
        int j = ActionBarActivityDelegateBase.access$300(ActionBarActivityDelegateBase.this, i);
        view = windowinsetscompat;
        if (i != j)
        {
            view = windowinsetscompat.replaceSystemWindowInsets(windowinsetscompat.getSystemWindowInsetLeft(), j, windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
        }
        return view;
    }

    ()
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
    }
}
