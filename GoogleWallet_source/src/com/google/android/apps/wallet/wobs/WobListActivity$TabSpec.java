// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;


// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListActivity

public static final class fragmentClass
{

    private final Class fragmentClass;
    private final long labelOrdinal;
    private final String title;

    public final Class getFragmentClass()
    {
        return fragmentClass;
    }

    public final long getLabelOrdinal()
    {
        return labelOrdinal;
    }



    public A(long l, String s, Class class1)
    {
        labelOrdinal = l;
        title = s;
        fragmentClass = class1;
    }
}
