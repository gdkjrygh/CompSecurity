// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

abstract class kzg extends jzb
{

    final kzb g;

    public kzg(kzb kzb1, jyn jyn)
    {
        g = kzb1;
        super(kzb.c(kzb1), jyn);
    }

    protected final jyw a(Status status)
    {
        return new juy(status);
    }
}
