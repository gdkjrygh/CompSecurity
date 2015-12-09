// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookRequestError

private static class <init>
{

    private final int end;
    private final int start;

    boolean contains(int i)
    {
        return start <= i && i <= end;
    }

    private (int i, int j)
    {
        start = i;
        end = j;
    }

    end(int i, int j, end end1)
    {
        this(i, j);
    }
}
