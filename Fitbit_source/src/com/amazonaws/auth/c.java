// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth;

import com.amazonaws.d;
import com.amazonaws.regions.Regions;
import com.amazonaws.regions.a;
import com.amazonaws.services.cognitoidentity.b;

// Referenced classes of package com.amazonaws.auth:
//            d, o

public abstract class c extends com.amazonaws.auth.d
{

    public c(String s, String s1)
    {
        this(s, s1, new d());
    }

    public c(String s, String s1, d d1)
    {
        this(s, s1, ((com.amazonaws.services.cognitoidentity.a) (new b(new o(), d1))));
    }

    public c(String s, String s1, d d1, Regions regions)
    {
        this(s, s1, ((com.amazonaws.services.cognitoidentity.a) (new b(new o(), d1))));
        a.a(com.amazonaws.regions.a.a(regions));
    }

    public c(String s, String s1, Regions regions)
    {
        this(s, s1, new d(), regions);
    }

    public c(String s, String s1, com.amazonaws.services.cognitoidentity.a a1)
    {
        super(s, s1, a1);
    }

    public abstract String a();
}
