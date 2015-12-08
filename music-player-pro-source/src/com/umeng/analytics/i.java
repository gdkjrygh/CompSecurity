// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Vector;

// Referenced classes of package com.umeng.analytics:
//            h

public class i
{

    private static final int b = 4;
    private Vector a;
    private String c;

    public i(String s)
    {
        a = new Vector(4);
        c = s;
    }

    public i(String s, int j)
    {
        c = s;
        if (j < 0)
        {
            a = new Vector(4);
            return;
        } else
        {
            a = new Vector(j);
            return;
        }
    }

    public static i a(Context context, String s)
    {
        return a(s, h.e(context).getString(s, null));
    }

    public static i a(String s, String s1)
    {
        s = new i(s);
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        int j;
        int k;
        s1 = s1.split(",");
        k = s1.length;
        j = 0;
_L6:
        if (j >= k) goto _L1; else goto _L3
_L3:
        String s2 = s1[j].trim();
        if (!TextUtils.isEmpty(s2)) goto _L5; else goto _L4
_L4:
        j++;
          goto _L6
_L5:
        long l = Long.parseLong(s2);
        s.a(Long.valueOf(l));
          goto _L4
        Exception exception;
        exception;
          goto _L4
    }

    public Long a()
    {
        int j = a.size();
        if (j <= 0)
        {
            return Long.valueOf(-1L);
        } else
        {
            return (Long)a.remove(j - 1);
        }
    }

    public void a(Context context)
    {
        String s = toString();
        context = h.e(context).edit();
        if (TextUtils.isEmpty(s))
        {
            context.remove(c).commit();
            return;
        } else
        {
            context.putString(c, s).commit();
            return;
        }
    }

    public void a(Long long1)
    {
        do
        {
            if (a.size() < 4)
            {
                a.add(long1);
                return;
            }
            a.remove(0);
        } while (true);
    }

    public int b()
    {
        return a.size();
    }

    public String toString()
    {
        int k = a.size();
        if (k <= 0)
        {
            return null;
        }
        StringBuffer stringbuffer = new StringBuffer(4);
        int j = 0;
        do
        {
            if (j >= k)
            {
                a.clear();
                return stringbuffer.toString();
            }
            stringbuffer.append(a.get(j));
            if (j != k - 1)
            {
                stringbuffer.append(",");
            }
            j++;
        } while (true);
    }
}
