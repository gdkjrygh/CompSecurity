// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;


public final class bn
{

    public static boolean a(String s)
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && s.endsWith(".webp");
    }
}
