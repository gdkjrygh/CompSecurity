// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.util.Base64;
import com.microsoft.onlineid.internal.h;
import com.microsoft.onlineid.sts.a.f;
import java.net.MalformedURLException;
import java.net.URL;

final class t
{

    static int a(String s, String s1)
        throws f
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s1, s, new Object[0]);
        }
        return i;
    }

    static byte[] a(String s)
        throws f
    {
        try
        {
            s = Base64.decode(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s);
        }
        return s;
    }

    static int b(String s)
        throws f
    {
        int i;
        try
        {
            i = h.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s);
        }
        return i;
    }

    static URL b(String s, String s1)
        throws f
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new f(s1, s, new Object[0]);
        }
        return s;
    }
}
