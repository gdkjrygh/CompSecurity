// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;

public class RevRepContentBuilder
{

    private ASN1EncodableVector a;
    private ASN1EncodableVector b;
    private ASN1EncodableVector c;

    public RevRepContentBuilder()
    {
        a = new ASN1EncodableVector();
        b = new ASN1EncodableVector();
        c = new ASN1EncodableVector();
    }
}
