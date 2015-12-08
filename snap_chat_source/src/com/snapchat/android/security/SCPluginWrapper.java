// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.security;

import android.util.Pair;
import com.snapchat.android.analytics.framework.ErrorMetric;
import dA;
import iiiiii.wiiiii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kkkkkk.xxkxkk;

public final class SCPluginWrapper
{

    private static final byte DATA[] = {
        -5, -89, 92, -5, 5, -28, 36, 113, -50, -121, 
        -12, -74, 29, 47, -67, 88, -45, -49, 23, -77, 
        1, -70, 99, -63, -107, -92, -99, -91, 34, -53, 
        18, 35, 33, -14, 21, -115, -95, 35, 110, 54, 
        1, -69, -113, -25, -61, 66, 65, -13, -97, -13, 
        -96, 37, -123, -1, 87, 125, -60, -22, 23, 100, 
        -87, -123, -128, 65
    };
    public static final String SC_HEADER_NAME = "\"w\037;/?393G\001\030B@=GN\b\035RRG";
    public static int b043E043E043E043E043E043E = 0;
    public static int b043E043E043E043E043E043E = 2;
    public static int b043E043E043E043E043E043E = 7;
    public static int b043E043E043E043E043E043E = 1;

    public SCPluginWrapper()
    {
    }

    public static int b043E043E043E043E043E043E()
    {
        return 2;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 19;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 1;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 0;
    }

    public static String generateHeader(Map map, String s)
    {
        Object obj;
        String as[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = unzipMap(map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        try
        {
            map = (String[])((Pair) (obj)).first;
            i = b043E043E043E043E043E043E;
            j = b043E043E043E043E043E043E;
            k = b043E043E043E043E043E043E;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 56
    //                   0 66;
           goto _L1 _L2
_L1:
        b043E043E043E043E043E043E = 18;
        b043E043E043E043E043E043E = 38;
_L2:
        obj = ((Pair) (obj)).second;
        i = b043E043E043E043E043E043E;
        (i * (b043E043E043E043E043E043E() + i)) % b043E043E043E043E043E043E;
        JVM INSTR tableswitch 0 0: default 186
    //                   0 115;
           goto _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_115;
_L3:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = 92;
        as = (String[])obj;
        i = b043E043E043E043E043E043E;
        j = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        l = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        if (((i + j) * k) % l == i1) goto _L6; else goto _L5
_L5:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
_L6:
        map = signRequest(map, as, s);
        return map;
    }

    public static String generateNewToken(String s)
    {
        String s1 = signToken(s);
_L2:
        switch (1)
        {
        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        default:
label0:
            while (true) 
            {
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    break label0;
                }
            }
            // fall through

        case 1: // '\001'
label1:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
            {
                b043E043E043E043E043E043E = 72;
                b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            }
            if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
            {
                if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E() != b043E043E043E043E043E043E)
                {
                    b043E043E043E043E043E043E = b043E043E043E043E043E043E();
                    b043E043E043E043E043E043E = b043E043E043E043E043E043E();
                }
                b043E043E043E043E043E043E = 53;
                b043E043E043E043E043E043E = 31;
            }
            return s1;
        }
        Throwable throwable;
        throwable;
        int i = b043E043E043E043E043E043E;
        int j = b043E043E043E043E043E043E();
        switch ((j * (b043E043E043E043E043E043E + j)) % b043E043E043E043E043E043E())
        {
        default:
            b043E043E043E043E043E043E = 23;
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            // fall through

        case 0: // '\0'
            throwable = s;
            break;
        }
        switch ((i * (b043E043E043E043E043E043E + i)) % b043E043E043E043E043E043E())
        {
        default:
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            b043E043E043E043E043E043E = 8;
            throwable = s;
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static native int patch(int i, byte abyte0[]);

    private static native String signRequest(String as[], String as1[], String s);

    private static synchronized native String signToken(String s);

    private static Pair unzipMap(Map map)
    {
        String as[];
        String as1[];
        int i = map.size();
        as = new String[i];
        as1 = new String[i];
        map = map.entrySet().iterator();
        int j = 0;
_L7:
        boolean flag = map.hasNext();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (java.util.Map.Entry)map.next();
        int k = b043E043E043E043E043E043E;
        switch ((k * (b043E043E043E043E043E043E() + k)) % b043E043E043E043E043E043E)
        {
        default:
            b043E043E043E043E043E043E = 1;
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            break;

        case 0: // '\0'
            break;
        }
        as[j] = (String)((java.util.Map.Entry) (obj)).getKey();
        int l = b043E043E043E043E043E043E;
        switch ((l * (b043E043E043E043E043E043E + l)) % b043E043E043E043E043E043E)
        {
        default:
            int i1 = b043E043E043E043E043E043E();
            if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
            {
                b043E043E043E043E043E043E = 94;
                b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            }
            b043E043E043E043E043E043E = i1;
            b043E043E043E043E043E043E = 71;
            break;

        case 0: // '\0'
            break;
        }
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 228
    //                   0 203
    //                   1 255;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 252
    //                   0 203
    //                   1 255;
           goto _L1 _L2 _L3
_L3:
        obj = ((java.util.Map.Entry) (obj)).getValue();
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        try
        {
            j1 = b043E043E043E043E043E043E;
            k1 = b043E043E043E043E043E043E;
            l1 = b043E043E043E043E043E043E;
            i2 = b043E043E043E043E043E043E;
            j2 = b043E043E043E043E043E043E;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        if (((j1 + k1) * l1) % i2 == j2)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        j1 = b043E043E043E043E043E043E;
        switch ((j1 * (b043E043E043E043E043E043E() + j1)) % b043E043E043E043E043E043E)
        {
        default:
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            b043E043E043E043E043E043E = 78;
            break;

        case 0: // '\0'
            break;
        }
        b043E043E043E043E043E043E = 76;
        b043E043E043E043E043E043E = 83;
        obj = dA.a((String)obj);
        try
        {
            j1 = b043E043E043E043E043E043E;
            k1 = b043E043E043E043E043E043E;
            l1 = b043E043E043E043E043E043E;
            i2 = b043E043E043E043E043E043E;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        j2 = b043E043E043E043E043E043E;
        if (((j1 + k1) * l1) % i2 == j2) goto _L5; else goto _L4
_L4:
        b043E043E043E043E043E043E = 8;
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
_L5:
        as1[j] = ((String) (obj));
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        map = Pair.create(as, as1);
        return map;
        map;
        throw map;
        map;
_L9:
        1;
        JVM INSTR tableswitch 0 1: default 476
    //                   0 453
    //                   1 503;
           goto _L8 _L9 _L10
_L8:
        0;
        JVM INSTR tableswitch 0 1: default 500
    //                   0 503
    //                   1 453;
           goto _L8 _L10 _L9
_L10:
        throw map;
    }

    static 
    {
        Object obj = SC_HEADER_NAME;
        Method method = kkkkkk/xxkxkk.getMethod(wiiiii.b041A041A041A041A041A041A("|\u04B7LQOcPUSgTYWk\u04C4Y^\\p", '\231', '\004'), new Class[] {
            java/lang/String, Character.TYPE, Character.TYPE, Character.TYPE
        });
        obj = method.invoke(null, new Object[] {
            obj, Character.valueOf('\215'), Character.valueOf('\272'), Character.valueOf('\003')
        });
        obj = (String)obj;
        int i;
        int j;
        int l;
        int j1;
        int l1;
        SC_HEADER_NAME = ((String) (obj));
        i = b043E043E043E043E043E043E;
        j = b043E043E043E043E043E043E;
        l = b043E043E043E043E043E043E;
        j1 = b043E043E043E043E043E043E();
        l1 = b043E043E043E043E043E043E;
        if (((i + j) * l) % j1 == l1)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        b043E043E043E043E043E043E = 62;
        b043E043E043E043E043E043E = 58;
        Object obj1;
        byte abyte0[];
        Object obj2;
        Object obj3;
        int k;
        int i1;
        int k1;
        int i2;
        try
        {
            i = b043E043E043E043E043E043E;
            k = b043E043E043E043E043E043E;
            i1 = b043E043E043E043E043E043E;
            k1 = b043E043E043E043E043E043E;
            i2 = b043E043E043E043E043E043E;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + k) * i1) % k1 != i2)
        {
            try
            {
                b043E043E043E043E043E043E = b043E043E043E043E043E043E();
                b043E043E043E043E043E043E = 3;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                throw obj2;
            }
        }
        if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E()) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
        {
            b043E043E043E043E043E043E = 13;
            b043E043E043E043E043E043E = 3;
        }
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        k1 = b043E043E043E043E043E043E;
        if (((i + k) * i1) % k1 != b043E043E043E043E043E043E)
        {
            b043E043E043E043E043E043E = 27;
            b043E043E043E043E043E043E = 0;
        }
        i = b043E043E043E043E043E043E;
        (i * (b043E043E043E043E043E043E + i)) % b043E043E043E043E043E043E();
        JVM INSTR tableswitch 0 0: default 1489
    //                   0 303;
           goto _L1 _L2
_L1:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = 68;
_L2:
        if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
        {
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        }
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        k1 = b043E043E043E043E043E043E;
        i2 = b043E043E043E043E043E043E;
        if (((i + k) * i1) % k1 == i2)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        b043E043E043E043E043E043E = 41;
        b043E043E043E043E043E043E = 2;
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        (i * (k + i)) % i1;
        JVM INSTR tableswitch 0 0: default 420
    //                   0 431;
           goto _L3 _L4
_L3:
        b043E043E043E043E043E043E = 90;
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
          goto _L4
_L20:
        i = b043E043E043E043E043E043E();
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E();
        k1 = b043E043E043E043E043E043E;
        i2 = b043E043E043E043E043E043E;
        if (((i + k) * i1) % k1 == i2) goto _L6; else goto _L5
_L5:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
          goto _L6
_L26:
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        (i * (k + i)) % i1;
        JVM INSTR tableswitch 0 0: default 524
    //                   0 534;
           goto _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_534;
_L7:
        b043E043E043E043E043E043E = 21;
        b043E043E043E043E043E043E = 12;
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        k1 = b043E043E043E043E043E043E;
        i2 = b043E043E043E043E043E043E;
        if (((i + k) * i1) % k1 == i2) goto _L10; else goto _L9
_L9:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
_L10:
        if (((b043E043E043E043E043E043E() + b043E043E043E043E043E043E) * b043E043E043E043E043E043E()) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
        {
            b043E043E043E043E043E043E = 18;
            b043E043E043E043E043E043E = 49;
        }
        i = b043E043E043E043E043E043E;
        k = b043E043E043E043E043E043E;
        i1 = b043E043E043E043E043E043E;
        (i * (k + i)) % i1;
        JVM INSTR tableswitch 0 0: default 652
    //                   0 662;
           goto _L11 _L12
_L11:
        b043E043E043E043E043E043E = 8;
        b043E043E043E043E043E043E = 9;
          goto _L12
_L28:
        obj1 = kkkkkk/xxkxkk.getMethod(wiiiii.b041A041A041A041A041A041A("H\u0402\024\027\023%\020\023\017!\f\017\013\035\u03F5\007\n\006\030", '\035', '\003', '\002'), new Class[] {
            java/lang/String, Character.TYPE, Character.TYPE, Character.TYPE
        });
        obj1 = ((Method) (obj1)).invoke(null, new Object[] {
            "J\023\024I^TN`TT", Character.valueOf('n'), Character.valueOf('\b'), Character.valueOf('\0')
        });
        obj1 = (String)obj1;
        System.loadLibrary(((String) (obj1)));
        obj1 = kkkkkk/xxkxkk.getMethod(wiiiii.b041A041A041A041A041A041A("\025\u0350`c_q\\_[mX[Wi\u0343SVRd", '\314', '\003'), new Class[] {
            java/lang/String, Character.TYPE, Character.TYPE, Character.TYPE
        });
        obj1 = ((Method) (obj1)).invoke(null, new Object[] {
            "/\036\035+1'*$", Character.valueOf('\346'), Character.valueOf('\242'), Character.valueOf('\002')
        });
        obj1 = (String)obj1;
        System.loadLibrary(((String) (obj1)));
        obj1 = kkkkkk/xxkxkk.getMethod(wiiiii.b041A041A041A041A041A041A("R\u048D\"'%9&+)=*/-A\u049A/42F", 'o', '\004'), new Class[] {
            java/lang/String, Character.TYPE, Character.TYPE, Character.TYPE
        });
        obj1 = ((Method) (obj1)).invoke(null, new Object[] {
            "\"\021\035\030 \021\022\026", Character.valueOf('\301'), Character.valueOf('\357'), Character.valueOf('\002')
        });
        obj1 = (String)obj1;
        System.loadLibrary(((String) (obj1)));
          goto _L13
_L16:
        if (i == -1) goto _L15; else goto _L14
_L14:
        abyte0 = DATA;
        i = patch(i, abyte0);
          goto _L16
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        obj3 = kkkkkk/xxkxkk.getMethod(wiiiii.b041A041A041A041A041A041A("o\u04AA?DBVCHFZGLJ^\u04B7LQOc", 'F', '\005'), new Class[] {
            java/lang/String, Character.TYPE, Character.TYPE, Character.TYPE
        });
        obj3 = ((Method) (obj3)).invoke(null, new Object[] {
            "7QXZRP\013^X\bSUFH\003VIE~L>PDP>wC?7F4DJp", Character.valueOf('^'), Character.valueOf('0'), Character.valueOf('\001')
        });
        obj3 = (String)obj3;
        (new ErrorMetric(((String) (obj3)))).a(((Throwable) (obj2))).e();
_L15:
        return;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw obj2;
        obj2;
        throw obj2;
        obj2;
        throw obj2;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw obj2;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw obj2;
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 1516
    //                   0 1492
    //                   1 434;
           goto _L17 _L4 _L18
_L18:
        if (true) goto _L20; else goto _L19
_L19:
_L17:
        1;
        JVM INSTR tableswitch 0 1: default 1540
    //                   0 1492
    //                   1 434;
           goto _L17 _L4 _L21
_L21:
        if (true) goto _L20; else goto _L22
_L22:
_L6:
        1;
        JVM INSTR tableswitch 0 1: default 1568
    //                   0 1543
    //                   1 486;
           goto _L23 _L6 _L24
_L24:
        if (true) goto _L26; else goto _L25
_L25:
_L23:
        0;
        JVM INSTR tableswitch 0 1: default 1592
    //                   0 486
    //                   1 1543;
           goto _L23 _L26 _L6
_L12:
        0;
        JVM INSTR tableswitch 0 1: default 1620
    //                   0 665
    //                   1 1595;
           goto _L27 _L28 _L12
_L27:
        0;
        JVM INSTR tableswitch 0 1: default 1644
    //                   0 665
    //                   1 1595;
           goto _L27 _L28 _L12
_L13:
        0;
        JVM INSTR tableswitch 0 1: default 1672
    //                   0 1751
    //                   1 1647;
           goto _L29 _L30 _L13
_L29:
        1;
        JVM INSTR tableswitch 0 1: default 1696
    //                   0 1672
    //                   1 1723;
           goto _L31 _L29 _L32
_L31:
        0;
        JVM INSTR tableswitch 0 1: default 1720
    //                   0 1723
    //                   1 1672;
           goto _L31 _L32 _L29
_L32:
        0;
        JVM INSTR tableswitch 0 1: default 1748
    //                   0 1751
    //                   1 1647;
           goto _L29 _L30 _L13
_L30:
        i = 0;
          goto _L16
    }
}
