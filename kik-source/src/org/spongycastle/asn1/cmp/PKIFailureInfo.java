// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.DERBitString;

public class PKIFailureInfo extends DERBitString
{

    public String toString()
    {
        return (new StringBuilder("PKIFailureInfo: 0x")).append(Integer.toHexString(e())).toString();
    }
}
