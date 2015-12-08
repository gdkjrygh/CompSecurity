// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ay

public class az extends ay
{

    private final String a;

    public az(String s, Context context)
    {
        super(context);
        a = s;
        b();
    }

    protected Class a()
    {
        return android/R$id;
    }

    protected String a(Context context)
    {
        return (new StringBuilder()).append(a).append(".R$id").toString();
    }
}
