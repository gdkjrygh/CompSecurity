// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzee

protected static final class zzyl extends Exception
{

    private final int zzyl;

    public int getErrorCode()
    {
        return zzyl;
    }

    public (String s, int i)
    {
        super(s);
        zzyl = i;
    }
}
