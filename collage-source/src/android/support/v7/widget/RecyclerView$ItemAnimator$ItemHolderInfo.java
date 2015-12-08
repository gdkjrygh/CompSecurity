// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static class 
{

    public int bottom;
    public int changeFlags;
    public int left;
    public int right;
    public int top;

    public  setFrom( )
    {
        return setFrom(, 0);
    }

    public setFrom setFrom(setFrom setfrom, int i)
    {
        setfrom = setfrom.setFrom;
        left = setfrom.getLeft();
        top = setfrom.getTop();
        right = setfrom.getRight();
        bottom = setfrom.getBottom();
        return this;
    }

    public ()
    {
    }
}
