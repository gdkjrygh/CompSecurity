// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.google.common.base.Joiner;

// Referenced classes of package com.facebook.widget:
//            HorizontalOrVerticalViewGroup

class i
{

    public final int a;
    public final int b;
    final HorizontalOrVerticalViewGroup c;

    public i(HorizontalOrVerticalViewGroup horizontalorverticalviewgroup, int j, int k)
    {
        c = horizontalorverticalviewgroup;
        super();
        a = j;
        b = k;
    }

    public String toString()
    {
        return Joiner.on("x").join(Integer.valueOf(a), Integer.valueOf(b), new Object[0]);
    }
}
