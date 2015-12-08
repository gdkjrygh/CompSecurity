// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView

public static class  extends android.support.v7.widget.eLookup
{

    public int getSpanGroupIndex(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public int getSpanIndex(int i, int j)
    {
        return i % j;
    }

    public int getSpanSize(int i)
    {
        return 1;
    }

    public ()
    {
    }
}
