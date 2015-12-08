// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;


// Referenced classes of package com.tremorvideo.sdk.android.d:
//            s

class r extends s
{

    private final v.l a;

    r(v.l l)
    {
        a = l;
    }

    public static r a(v.l l)
    {
        return new r(l);
    }

    public String a()
    {
        return (new StringBuilder()).append("placementType: '").append(a.toString().toLowerCase()).append("'").toString();
    }
}
