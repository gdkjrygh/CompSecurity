// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.DERBitString;

public class ReasonFlags extends DERBitString
{

    public ReasonFlags(DERBitString derbitstring)
    {
        super(derbitstring.c(), derbitstring.d());
    }
}
