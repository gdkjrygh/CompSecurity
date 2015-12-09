// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.a.f;
import com.squareup.a.b;

public final class d
{

    private static b a = new b();

    private d()
    {
    }

    public static b a()
    {
        return a;
    }

    public static void a(Object obj)
    {
        try
        {
            a().b(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.a(((Throwable) (obj)));
        }
    }

    public static void b(Object obj)
    {
        try
        {
            a().a(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.a(((Throwable) (obj)));
        }
    }

}
