// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class bmo
{

    private static volatile bma a = new bnt();

    public static void a(String s)
    {
        bmp bmp1 = bmp.b();
        if (bmp1 == null) goto _L2; else goto _L1
_L1:
        bmp1.d(s);
_L4:
        s = a;
        return;
_L2:
        if (a(1))
        {
            Log.i((String)bnz.b.a, s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, Object obj)
    {
        bmp bmp1 = bmp.b();
        if (bmp1 == null) goto _L2; else goto _L1
_L1:
        bmp1.e(s, obj);
_L4:
        s = a;
        return;
_L2:
        if (a(3))
        {
            String s1 = s;
            if (obj != null)
            {
                s1 = (new StringBuilder()).append(s).append(":").append(obj).toString();
            }
            Log.e((String)bnz.b.a, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    public static void b(String s)
    {
        bmp bmp1 = bmp.b();
        if (bmp1 == null) goto _L2; else goto _L1
_L1:
        bmp1.b(s);
_L4:
        s = a;
        return;
_L2:
        if (a(0))
        {
            Log.v((String)bnz.b.a, s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(String s)
    {
        bmp bmp1 = bmp.b();
        if (bmp1 == null) goto _L2; else goto _L1
_L1:
        bmp1.e(s);
_L4:
        s = a;
        return;
_L2:
        if (a(2))
        {
            Log.w((String)bnz.b.a, s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
