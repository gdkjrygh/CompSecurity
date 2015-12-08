// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompatLollipop, WindowInsetsCompat, OnApplyWindowInsetsListener

class  extends 
{

    public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return ViewCompatLollipop.dispatchApplyWindowInsets(view, windowinsetscompat);
    }

    public boolean dispatchNestedFling(View view, float f, float f1, boolean flag)
    {
        return ViewCompatLollipop.dispatchNestedFling(view, f, f1, flag);
    }

    public boolean dispatchNestedPreFling(View view, float f, float f1)
    {
        return ViewCompatLollipop.dispatchNestedPreFling(view, f, f1);
    }

    public boolean dispatchNestedPreScroll(View view, int i, int j, int ai[], int ai1[])
    {
        return ViewCompatLollipop.dispatchNestedPreScroll(view, i, j, ai, ai1);
    }

    public boolean dispatchNestedScroll(View view, int i, int j, int k, int l, int ai[])
    {
        return ViewCompatLollipop.dispatchNestedScroll(view, i, j, k, l, ai);
    }

    public ColorStateList getBackgroundTintList(View view)
    {
        return ViewCompatLollipop.getBackgroundTintList(view);
    }

    public android.graphics.atImpl getBackgroundTintMode(View view)
    {
        return ViewCompatLollipop.getBackgroundTintMode(view);
    }

    public float getElevation(View view)
    {
        return ViewCompatLollipop.getElevation(view);
    }

    public String getTransitionName(View view)
    {
        return ViewCompatLollipop.getTransitionName(view);
    }

    public float getTranslationZ(View view)
    {
        return ViewCompatLollipop.getTranslationZ(view);
    }

    public float getZ(View view)
    {
        return ViewCompatLollipop.getZ(view);
    }

    public boolean hasNestedScrollingParent(View view)
    {
        return ViewCompatLollipop.hasNestedScrollingParent(view);
    }

    public boolean isImportantForAccessibility(View view)
    {
        return ViewCompatLollipop.isImportantForAccessibility(view);
    }

    public boolean isNestedScrollingEnabled(View view)
    {
        return ViewCompatLollipop.isNestedScrollingEnabled(view);
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return ViewCompatLollipop.onApplyWindowInsets(view, windowinsetscompat);
    }

    public void requestApplyInsets(View view)
    {
        ViewCompatLollipop.requestApplyInsets(view);
    }

    public void setBackgroundTintList(View view, ColorStateList colorstatelist)
    {
        ViewCompatLollipop.setBackgroundTintList(view, colorstatelist);
    }

    public void setBackgroundTintMode(View view, android.graphics.atImpl atimpl)
    {
        ViewCompatLollipop.setBackgroundTintMode(view, atimpl);
    }

    public void setElevation(View view, float f)
    {
        ViewCompatLollipop.setElevation(view, f);
    }

    public void setNestedScrollingEnabled(View view, boolean flag)
    {
        ViewCompatLollipop.setNestedScrollingEnabled(view, flag);
    }

    public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        ViewCompatLollipop.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
    }

    public void setTransitionName(View view, String s)
    {
        ViewCompatLollipop.setTransitionName(view, s);
    }

    public void setTranslationZ(View view, float f)
    {
        ViewCompatLollipop.setTranslationZ(view, f);
    }

    public boolean startNestedScroll(View view, int i)
    {
        return ViewCompatLollipop.startNestedScroll(view, i);
    }

    public void stopNestedScroll(View view)
    {
        ViewCompatLollipop.stopNestedScroll(view);
    }

    ()
    {
    }
}
