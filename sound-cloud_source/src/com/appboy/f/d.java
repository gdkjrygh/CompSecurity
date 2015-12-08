// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import android.content.Context;

public class d
{

    private static final String a;

    public d()
    {
    }

    public static boolean a(Context context, String s)
    {
        int i;
        try
        {
            i = context.checkCallingOrSelfPermission(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            String.format("Failure checking permission %s", new Object[] {
                s
            });
            return false;
        }
        return i == 0;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            com.appboy.d.a, com/appboy/f/d.getName()
        });
    }
}
