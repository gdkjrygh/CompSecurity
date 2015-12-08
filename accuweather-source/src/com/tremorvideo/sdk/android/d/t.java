// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;


// Referenced classes of package com.tremorvideo.sdk.android.d:
//            s

class t extends s
{

    private final int a;
    private final int b;

    t(int i, int j)
    {
        a = i;
        b = j;
    }

    public static t a(int i, int j)
    {
        return new t(i, j);
    }

    public String a()
    {
        return (new StringBuilder()).append("screenSize: { width: ").append(a).append(", height: ").append(b).append(" }").toString();
    }
}
