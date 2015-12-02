// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.os.Build;

public class d extends Exception
{

    private static final long serialVersionUID = 1L;

    public d(String s)
    {
        super((new StringBuilder()).append("Current Android platform is not supported: ").append(s).append(" ").append(moreInfo()).toString());
    }

    private static final String moreInfo()
    {
        return String.format("[%d, %s]", new Object[] {
            Integer.valueOf(android.os.Build.VERSION.SDK_INT), Build.MODEL
        });
    }
}
