// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewCompatLollipop, WindowInsetsCompat, OnApplyWindowInsetsListener

static class  extends 
{

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return ViewCompatLollipop.onApplyWindowInsets(view, windowinsetscompat);
    }

    public void requestApplyInsets(View view)
    {
        ViewCompatLollipop.requestApplyInsets(view);
    }

    public void setElevation(View view, float f)
    {
        ViewCompatLollipop.setElevation(view, f);
    }

    public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        ViewCompatLollipop.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
    }

    public void stopNestedScroll(View view)
    {
        ViewCompatLollipop.stopNestedScroll(view);
    }

    ()
    {
    }
}
