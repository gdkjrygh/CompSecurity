// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.cz.a;

public final class bc
{
    static final class a
    {

        final SharedPreferences a;

        a(Context context)
        {
            a = context.getSharedPreferences("com.google.maps.api.android.lib6.impl.PREFERENCES_FILE", 0);
        }
    }


    private static final String d[] = {
        "anthias", "carp", "smelt", "sparrow", "sprat", "tetra", "wren"
    };
    public boolean a;
    public final boolean b;
    final a c;

    private bc(a a1)
    {
        a = false;
        c = a1;
        if (c.a.contains("IsLowBitDisplay"))
        {
            b = c.a.getBoolean("IsLowBitDisplay", false);
            return;
        } else
        {
            b = a(Build.DEVICE);
            return;
        }
    }

    public static bc a(Context context)
    {
        if (com.google.android.m4b.maps.cz.a.a(context))
        {
            return new bc(new a(context));
        } else
        {
            return null;
        }
    }

    private static boolean a(String s)
    {
        boolean flag1 = false;
        String as[] = d;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < 7)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final ah a()
    {
        if (b)
        {
            return ah.z;
        } else
        {
            return ah.y;
        }
    }

}
