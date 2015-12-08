// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;


public final class ScopeChecker
{

    public static boolean hasScopeRequiringUpgrade(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s.startsWith("https://www.googleapis.com/auth/games") || s.contains("plus.") && !s.endsWith("plus.me"))
            {
                return true;
            }
        }

        return false;
    }
}
