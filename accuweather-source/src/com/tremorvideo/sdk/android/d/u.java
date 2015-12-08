// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;


// Referenced classes of package com.tremorvideo.sdk.android.d:
//            s

class u extends s
{

    private final v.m a;

    u(v.m m)
    {
        a = m;
    }

    public static u a(v.m m)
    {
        return new u(m);
    }

    public String a()
    {
        return (new StringBuilder()).append("state: '").append(a.toString().toLowerCase()).append("'").toString();
    }
}
