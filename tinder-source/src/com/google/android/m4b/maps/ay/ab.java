// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.google.android.m4b.maps.y.i;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ag

public final class ab
{

    private static final int a;

    public static void a(int j, String s)
    {
        Log.println(j, "Google Maps Android API", s);
    }

    public static void a(String s)
    {
        a(6, s);
    }

    public static final boolean a(String s, int j)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        a;
        JVM INSTR tableswitch 0 7: default 52
    //                   0 56
    //                   1 54
    //                   2 58
    //                   3 67
    //                   4 76
    //                   5 85
    //                   6 94
    //                   7 104;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        flag = false;
_L3:
        return flag;
_L2:
        return false;
_L4:
        flag = flag1;
        if (j >= 2) goto _L3; else goto _L10
_L10:
        return false;
_L5:
        flag = flag1;
        if (j >= 3) goto _L3; else goto _L11
_L11:
        return false;
_L6:
        flag = flag1;
        if (j >= 4) goto _L3; else goto _L12
_L12:
        return false;
_L7:
        flag = flag1;
        if (j >= 5) goto _L3; else goto _L13
_L13:
        return false;
_L8:
        flag = flag1;
        if (j >= 6) goto _L3; else goto _L14
_L14:
        return false;
_L9:
        return Log.isLoggable(s, j);
    }

    static 
    {
        String s;
        int j;
        s = ((String)ag.a("debug.mapview.logs").a("NOTHING")).toUpperCase();
        j = -1;
        s.hashCode();
        JVM INSTR lookupswitch 8: default 96
    //                   -1938386595: 250
    //                   -1447660627: 165
    //                   64897: 151
    //                   2251950: 207
    //                   2656902: 221
    //                   64921139: 193
    //                   66247144: 235
    //                   1069090146: 179;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        j;
        JVM INSTR tableswitch 0 7: default 144
    //                   0 265
    //                   1 270
    //                   2 275
    //                   3 280
    //                   4 285
    //                   5 290
    //                   6 295
    //                   7 301;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L10:
        j = 0;
_L19:
        a = j;
        return;
_L4:
        if (s.equals("ALL"))
        {
            j = 0;
        }
          goto _L1
_L3:
        if (s.equals("NOTHING"))
        {
            j = 1;
        }
          goto _L1
_L9:
        if (s.equals("VERBOSE"))
        {
            j = 2;
        }
          goto _L1
_L7:
        if (s.equals("DEBUG"))
        {
            j = 3;
        }
          goto _L1
_L5:
        if (s.equals("INFO"))
        {
            j = 4;
        }
          goto _L1
_L6:
        if (s.equals("WARN"))
        {
            j = 5;
        }
          goto _L1
_L8:
        if (s.equals("ERROR"))
        {
            j = 6;
        }
          goto _L1
_L2:
        if (s.equals("PERTAG"))
        {
            j = 7;
        }
          goto _L1
_L11:
        j = 1;
          goto _L19
_L12:
        j = 0;
          goto _L19
_L13:
        j = 2;
          goto _L19
_L14:
        j = 3;
          goto _L19
_L15:
        j = 4;
          goto _L19
_L16:
        j = 5;
          goto _L19
_L17:
        j = 6;
          goto _L19
_L18:
        j = 7;
          goto _L19
    }
}
