// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api;


public final class e
{

    public static int a()
    {
        if (android.os.Build.VERSION.RELEASE.startsWith("1.5"))
        {
            return 3;
        } else
        {
            return android.os.Build.VERSION.SDK_INT;
        }
    }
}
