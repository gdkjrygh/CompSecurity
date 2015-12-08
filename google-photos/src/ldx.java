// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

abstract class ldx extends jzb
{

    public ldx(jym jym, jyn jyn)
    {
        super(jym, jyn);
    }

    public ldx(jyn jyn)
    {
        this(lnq.a, jyn);
    }

    protected jyw a(Status status)
    {
        return d(status);
    }

    protected lnw d(Status status)
    {
        return new ldy(this, status);
    }
}
