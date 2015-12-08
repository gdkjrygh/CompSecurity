// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

abstract class a extends AlgorithmProvider
{

    a()
    {
    }

    protected static void a(ConfigurableProvider configurableprovider, String s, String s1, String s2)
    {
        String s3 = (new StringBuilder("HMAC")).append(s).toString();
        configurableprovider.a((new StringBuilder("Mac.")).append(s3).toString(), s1);
        configurableprovider.a((new StringBuilder("Alg.Alias.Mac.HMAC-")).append(s).toString(), s3);
        configurableprovider.a((new StringBuilder("Alg.Alias.Mac.HMAC/")).append(s).toString(), s3);
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(s3).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.HMAC-")).append(s).toString(), s3);
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.HMAC/")).append(s).toString(), s3);
    }

    protected static void a(ConfigurableProvider configurableprovider, String s, ASN1ObjectIdentifier asn1objectidentifier)
    {
        s = (new StringBuilder("HMAC")).append(s).toString();
        configurableprovider.a((new StringBuilder("Alg.Alias.Mac.")).append(asn1objectidentifier).toString(), s);
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.")).append(asn1objectidentifier).toString(), s);
    }
}
