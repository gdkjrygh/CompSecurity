// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewCompatMarshmallow

static class  extends 
{

    public int getScrollIndicators(View view)
    {
        return ViewCompatMarshmallow.getScrollIndicators(view);
    }

    public void setScrollIndicators(View view, int i)
    {
        ViewCompatMarshmallow.setScrollIndicators(view, i);
    }

    public void setScrollIndicators(View view, int i, int j)
    {
        ViewCompatMarshmallow.setScrollIndicators(view, i, j);
    }

    ()
    {
    }
}
