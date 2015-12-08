// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout

class enerAdapter extends ViewPropertyAnimatorListenerAdapter
{

    final TextInputLayout this$0;

    public void onAnimationEnd(View view)
    {
        view.setVisibility(4);
        TextInputLayout.access$100(TextInputLayout.this, true);
    }

    enerAdapter()
    {
        this$0 = TextInputLayout.this;
        super();
    }
}
