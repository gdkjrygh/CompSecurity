// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            dn

private static final class pJ extends Exception
{

    private final int pJ;

    public int getErrorCode()
    {
        return pJ;
    }

    public (String s, int i)
    {
        super(s);
        pJ = i;
    }
}
