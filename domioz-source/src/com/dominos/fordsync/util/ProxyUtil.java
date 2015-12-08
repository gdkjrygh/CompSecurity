// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.util;

import com.dominos.android.sdk.common.StringHelper;
import com.ford.syncV4.e.c.a;
import com.ford.syncV4.e.c.a.g;
import com.ford.syncV4.e.c.a.o;
import com.ford.syncV4.e.c.aa;
import com.ford.syncV4.e.c.bl;
import com.ford.syncV4.e.c.h;
import com.ford.syncV4.e.c.q;
import com.ford.syncV4.e.c.y;
import com.ford.syncV4.e.i;
import com.ford.syncV4.e.j;
import java.util.Vector;

public class ProxyUtil
{

    public ProxyUtil()
    {
    }

    public static void addMenuCommand(i k, Integer integer, String s, Vector vector, Integer integer1, String s1)
    {
        if (StringHelper.isNotEmpty(s1))
        {
            g g1 = g.b;
            a a1 = new a();
            a1.a(integer1);
            a1.b(integer);
            if (vector != null)
            {
                a1.a(vector);
            }
            vector = null;
            integer = vector;
            if (s1 != null)
            {
                integer = vector;
                if (g1 != null)
                {
                    integer = new y();
                    integer.a(s1);
                    integer.a(g1);
                }
            }
            if (integer != null)
            {
                a1.a(integer);
            }
            if (s != null)
            {
                integer = new aa();
                integer.a(s);
                a1.a(integer);
            }
            k.a(a1);
            return;
        }
        s1 = new a();
        s1.a(integer1);
        s1.b(integer);
        s1.a(vector);
        if (s != null)
        {
            integer = new aa();
            integer.a(s);
            s1.a(integer);
        }
        k.a(s1);
    }

    public static h createChoice(Integer integer, String s, Vector vector, String s1)
    {
        h h1 = new h();
        h1.a(integer);
        h1.a(s);
        h1.a(vector);
        if (StringHelper.isNotEmpty(s1))
        {
            h1.a(getImage(s1));
        }
        return h1;
    }

    public static bl createSoftButton(int k, String s, y y1)
    {
        bl bl1 = new bl();
        bl1.a(Integer.valueOf(k));
        bl1.a(s);
        bl1.a(y1);
        bl1.a(o.c);
        return bl1;
    }

    public static y getImage(String s)
    {
        y y1 = new y();
        y1.a(s);
        y1.a(g.b);
        return y1;
    }

    public static boolean isProxyGraphicSupported(i k)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        flag = flag1;
        boolean flag2;
        try
        {
            if (k.b() == null)
            {
                break MISSING_BLOCK_LABEL_48;
            }
        }
        // Misplaced declaration of an exception variable
        catch (i k)
        {
            return false;
        }
        flag = flag1;
        if (k.b().a() == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        flag2 = k.b().a().booleanValue();
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        return flag;
    }
}
