// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.androidcompat;


public class AndroidCompat
{

    public AndroidCompat()
    {
    }

    public static void a(Throwable throwable, Throwable throwable1)
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            com/facebook/androidcompat/AndroidCompat.getName();
            return;
        } else
        {
            throwable.addSuppressed(throwable1);
            return;
        }
    }
}
