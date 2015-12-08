// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


// Referenced classes of package com.crashlytics.android.core.internal.models:
//            ThreadData

public static final class importance
{

    public final long address;
    public final String file;
    public final int importance;
    public final long offset;
    public final String symbol;

    public (long l, int i)
    {
        this(l, "", i);
    }

    public <init>(long l, String s, int i)
    {
        this(l, s, "", 0L, i);
    }

    public <init>(long l, String s, String s1, long l1, int i)
    {
        address = l;
        symbol = s;
        file = s1;
        offset = l1;
        importance = i;
    }
}
