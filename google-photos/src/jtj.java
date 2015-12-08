// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class jtj
{

    private static volatile jqs a = new jta();

    public static jqs a()
    {
        return a;
    }

    public static void a(String s)
    {
        jso jso1 = jso.b();
        if (jso1 == null) goto _L2; else goto _L1
_L1:
        jso1.e(s);
_L4:
        jqs jqs1 = a;
        if (jqs1 != null)
        {
            jqs1.a(s);
        }
        return;
_L2:
        if (a(2))
        {
            Log.w((String)jsl.b.a(), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        jso jso1 = jso.b();
        if (jso1 == null) goto _L2; else goto _L1
_L1:
        jso1.e(s, obj);
_L4:
        obj = a;
        if (obj != null)
        {
            ((jqs) (obj)).b(s);
        }
        return;
_L2:
        if (a(3))
        {
            if (obj != null)
            {
                obj = (new StringBuilder()).append(s).append(":").append(obj).toString();
            } else
            {
                obj = s;
            }
            Log.e((String)jsl.b.a(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(jqs jqs1)
    {
        a = jqs1;
    }

    private static boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.a() <= i)
            {
                flag = true;
            }
        }
        return flag;
    }

}
