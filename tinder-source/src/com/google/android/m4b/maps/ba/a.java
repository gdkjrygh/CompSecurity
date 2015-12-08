// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ba;

import com.google.android.m4b.maps.ap.c;
import java.io.DataInput;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ba:
//            c

public final class a
{

    private static final com.google.android.m4b.maps.ba.c e = com.google.android.m4b.maps.ba.c.a(22);
    private static int f[] = null;
    private static int g[] = null;
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public a(int i, int j)
    {
        int k = a(j);
        if (i > 0x4c4b400)
        {
            i = 0x4c4b400;
        }
        j = i;
        if (i < 0xfb3b4c00)
        {
            j = 0xfb3b4c00;
        }
        a = j;
        b = k;
        com.google.android.m4b.maps.ba.c c1 = e;
        long l1 = (long)c1.a / 2L;
        long l2 = k;
        c = (int)(((long)c1.a * l2) / 0x15752a00L + l1);
        c1 = e;
        int j1 = Math.abs(j) / 0xf4240 + 1;
        i = Math.abs(j) % 0xf4240;
        int ai[] = a();
        k = (((ai[j1 - 1] * -1 + ai[j1] * 3) - ai[j1 + 1] * 3) + ai[j1 + 2]) / 6;
        int l = ((ai[j1 - 1] * 3 - ai[j1] * 6) + ai[j1 + 1] * 3) / 6;
        int i1 = (((ai[j1 - 1] * -2 - ai[j1] * 3) + ai[j1 + 1] * 6) - ai[j1 + 2]) / 6;
        j1 = ai[j1];
        i = (int)(((((long)k * (long)i * (long)i) / 0xf4240L) * (long)i) / 0xf4240L / 0xf4240L + ((long)l * (long)i * (long)i) / 0xf4240L / 0xf4240L + ((long)i1 * (long)i) / 0xf4240L + (long)j1);
        if (j < 0)
        {
            i = -i;
        }
        d = (int)((long)c1.a / 2L - (long)((int)(((long)i * (long)c1.a * 10L) / 0x15752a00L) / 10));
    }

    private static int a(int i)
    {
        int j;
        do
        {
            j = i;
            if (i >= 0xf5456b00)
            {
                break;
            }
            i += 0x15752a00;
        } while (true);
        for (; j > 0xaba9500; j -= 0x15752a00) { }
        return j;
    }

    public static a a(String s)
    {
        if (s.indexOf(',') != -1)
        {
            try
            {
                s = com.google.android.m4b.maps.aw.a.a(s, ',');
                s = new a(b(s[0]), b(s[1]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        } else
        {
            return null;
        }
    }

    private static int[] a()
    {
        com/google/android/m4b/maps/ba/a;
        JVM INSTR monitorenter ;
        if (f != null) goto _L2; else goto _L1
_L1:
        f = new int[84];
        DataInput datainput;
        int ai1[];
        datainput = com.google.android.m4b.maps.ap.c.a(new byte[] {
            -1, -16, -67, -115, 15, 66, 115, 15, 66, 115, 
            15, 67, -93, 15, 70, 6, 15, 73, -103, 15, 
            78, 97, 15, 84, 94, 15, 91, -109, 15, 100, 
            2, 15, 109, -80, 15, 120, -97, 15, -124, -44, 
            15, -110, 84, 15, -95, 38, 15, -79, 78, 15, 
            -62, -45, 15, -43, -67, 15, -22, 21, 15, -1, 
            -31, 16, 23, 45, 16, 48, 1, 16, 74, 107, 
            16, 102, 116, 16, -124, 43, 16, -93, -100, 16, 
            -60, -41, 16, -25, -19, 17, 12, -18, 17, 51, 
            -20, 17, 92, -4, 17, -120, 52, 17, -75, -87, 
            17, -27, 118, 18, 23, -76, 18, 76, -127, 18, 
            -125, -3, 18, -66, 70, 18, -5, -124, 19, 59, 
            -37, 19, 127, 119, 19, -58, -122, 20, 17, 56, 
            20, 95, -60, 20, -78, 100, 21, 9, 87, 21, 
            100, -27, 21, -59, 86, 22, 42, -1, 22, -106, 
            58, 23, 7, 109, 23, 127, 2, 23, -3, 117, 
            24, -125, 72, 25, 17, 20, 25, -89, 120, 26, 
            71, 46, 26, -15, 3, 27, -91, -39, 28, 102, 
            -77, 29, 52, -77, 30, 17, 31, 30, -3, 111, 
            31, -5, 74, 33, 12, -105, 34, 51, -120, 35, 
            114, -91, 36, -52, -30, 38, 69, -76, 39, -31, 
            42, 41, -92, 25, 43, -108, 70, 45, -72, -91, 
            48, 25, -84, 50, -63, -63, 53, -67, -47, 57, 
            30, 28, 60, -9, 105, 65, 100, -96, 70, -119, 
            82, 76, -107, 115, 83, -53, 79, 92, -119, 52, 
            103, 90, 12
        });
        ai1 = f;
        ai1[0] = datainput.readInt();
        int i = 1;
_L3:
        if (i >= ai1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ai1[i] = ai1[i - 1] + (datainput.readUnsignedByte() << 16 | datainput.readUnsignedByte() << 8 | datainput.readUnsignedByte());
        i++;
        if (true) goto _L3; else goto _L2
        Object obj;
        obj;
        throw new RuntimeException("Can't read mercator.dat");
        obj;
        com/google/android/m4b/maps/ba/a;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        int ai[] = f;
        com/google/android/m4b/maps/ba/a;
        JVM INSTR monitorexit ;
        return ai;
    }

    private static int b(String s)
    {
        byte byte0 = 1;
        s = s.trim();
        if (s.indexOf('.') != -1)
        {
            String as[] = com.google.android.m4b.maps.aw.a.a(s, '.');
            if (as.length > 2)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Coordinate has more than one decimal point: ".concat(s);
                } else
                {
                    s = new String("Coordinate has more than one decimal point: ");
                }
                throw new NumberFormatException(s);
            }
            int i = Integer.parseInt(as[0]);
            String s1;
            boolean flag;
            if (as[0].indexOf("-") != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = as[1].substring(0, Math.min(6, as[1].length()));
            if (s1.length() == 0 || s1.charAt(0) < '0' || s1.charAt(0) > '9')
            {
                throw new NumberFormatException((new StringBuilder(String.valueOf(s).length() + 29)).append("Invalid fractional part in \"").append(s).append("\"").toString());
            }
            int j = Integer.parseInt(com.google.android.m4b.maps.aw.a.a(s1));
            if (flag)
            {
                byte0 = -1;
            }
            return j * byte0 + i * 0xf4240;
        } else
        {
            return Integer.parseInt(s) * 0xf4240;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if ((a != ((a) (obj)).a || b != ((a) (obj)).b) && (c != ((a) (obj)).c || d != ((a) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a * 29 + b;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        String s = com.google.android.m4b.maps.aw.a.a(i);
        String s1 = com.google.android.m4b.maps.aw.a.a(j);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(',').append(s1).toString();
    }

}
