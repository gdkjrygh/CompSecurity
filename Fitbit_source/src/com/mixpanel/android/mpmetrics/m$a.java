// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            m

public static class b extends m
{

    private final String a;

    protected Class a()
    {
        return android/R$drawable;
    }

    protected String a(Context context)
    {
        return (new StringBuilder()).append(a).append(".R$drawable").toString();
    }

    protected (String s, Context context)
    {
        super(context);
        a = s;
        b();
    }
}
