// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.view:
//            GravityCompat

static class A
    implements A
{

    public void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, 
            int j1)
    {
        Gravity.apply(i, j, k, rect, l, i1, rect1);
    }

    public void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
    {
        Gravity.apply(i, j, k, rect, rect1);
    }

    public void applyDisplay(int i, Rect rect, Rect rect1, int j)
    {
        Gravity.applyDisplay(i, rect, rect1);
    }

    public int getAbsoluteGravity(int i, int j)
    {
        return 0xff7fffff & i;
    }

    A()
    {
    }
}
