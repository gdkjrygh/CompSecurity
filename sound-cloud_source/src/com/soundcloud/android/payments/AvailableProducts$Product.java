// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


// Referenced classes of package com.soundcloud.android.payments:
//            AvailableProducts

public static class planId
{

    private static final String EMPTY = "unavailable";
    public final String id;
    public final String planId;

    public static planId empty()
    {
        return new <init>("unavailable", "unavailable");
    }

    public boolean isEmpty()
    {
        return id.equals("unavailable");
    }

    public (String s, String s1)
    {
        id = s;
        planId = s1;
    }
}
