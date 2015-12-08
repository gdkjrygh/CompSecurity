// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgk

static final class zzvR extends Exception
{

    private final int zzvR;

    public final int getErrorCode()
    {
        return zzvR;
    }

    public (String s, int i)
    {
        super(s);
        zzvR = i;
    }
}
