// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.view:
//            f

static final class 
    implements 
{

    public final int a(int i, int j)
    {
        return Gravity.getAbsoluteGravity(i, j);
    }

    public final void a(int i, int j, int k, Rect rect, Rect rect1, int l)
    {
        Gravity.apply(i, j, k, rect, rect1, l);
    }

    ()
    {
    }
}
