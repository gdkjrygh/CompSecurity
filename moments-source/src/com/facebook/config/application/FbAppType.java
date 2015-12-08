// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.application;

import com.facebook.common.build.SignatureType;

// Referenced classes of package com.facebook.config.application:
//            PlatformAppConfig, IntendedAudience, Product

public class FbAppType
    implements PlatformAppConfig
{

    private static volatile FbAppType a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final IntendedAudience i;
    private final Product j;
    private final SignatureType k;

    public FbAppType(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            IntendedAudience intendedaudience, Product product, SignatureType signaturetype)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        i = intendedaudience;
        j = product;
        k = signaturetype;
    }

    public static FbAppType a()
    {
        return a;
    }

    public static void a(FbAppType fbapptype)
    {
        a = fbapptype;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final String f()
    {
        return h;
    }

    public final IntendedAudience g()
    {
        return i;
    }

    public final Product h()
    {
        return j;
    }

    public final SignatureType i()
    {
        return k;
    }
}
