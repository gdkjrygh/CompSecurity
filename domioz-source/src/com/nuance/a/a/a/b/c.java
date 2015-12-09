// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import android.content.Context;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.b.a.l;
import java.util.Vector;

public final class c
{

    private e a;
    private Context b;
    private boolean c;

    public c(Vector vector)
    {
        boolean flag = false;
        super();
        a = d.a(getClass());
        b = null;
        c = false;
        if (vector != null)
        {
            int i = 0;
            while (i < vector.size()) 
            {
                com.nuance.a.a.a.c.c.c c1 = (com.nuance.a.a.a.c.c.c)vector.get(i);
                String s = c1.a();
                if (c1.d() == com.nuance.a.a.a.c.c.d.a)
                {
                    if (s.equals("Android_Context"))
                    {
                        b = (Context)c1.c();
                        if (a.b())
                        {
                            (new StringBuilder("NMSP_DEFINES_ANDROID_CONTEXT is passed in as")).append(b);
                        }
                    } else
                    if (s.equals("Disable_Bluetooth") && (new String(c1.b())).equalsIgnoreCase("TRUE"))
                    {
                        a.b();
                        c = true;
                    }
                }
                i++;
            }
        }
        if (b != null)
        {
            if (b.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0)
            {
                flag = true;
            }
            c = flag;
        }
    }

    public final boolean a()
    {
        if (!c)
        {
            if (b == null)
            {
                if (a.e())
                {
                    a.b("ANDROID_CONTEXT parameter is not passed in!!!");
                    return false;
                }
            } else
            {
                l l1 = l.a(b);
                boolean flag = l1.a();
                l1.b();
                return flag;
            }
        }
        return false;
    }
}
