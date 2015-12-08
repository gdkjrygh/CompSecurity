// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fd

private static final class tq extends Exception
{

    private final int tq;

    public int getErrorCode()
    {
        return tq;
    }

    public (String s, int i)
    {
        super(s);
        tq = i;
    }
}
