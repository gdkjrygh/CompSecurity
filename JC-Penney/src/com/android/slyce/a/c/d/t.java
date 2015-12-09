// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


final class t
{

    private static final String a[] = {
        "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
    };
    private static final String b[];
    private static final String c[];

    static String a(byte byte0, byte byte1)
    {
        String s1;
        if (byte1 == 0)
        {
            s1 = "";
        } else
        {
            String s;
            switch (byte0)
            {
            case 5: // '\005'
            default:
                if (byte1 < b.length)
                {
                    s = b[byte1];
                } else
                {
                    s = c[byte1];
                }
                if (byte0 == 5 && (byte1 & 4) != 0)
                {
                    return s.replace("HEADERS", "PUSH_PROMISE");
                }
                break;

            case 4: // '\004'
            case 6: // '\006'
                if (byte1 == 1)
                {
                    return "ACK";
                } else
                {
                    return c[byte1];
                }

            case 2: // '\002'
            case 3: // '\003'
            case 7: // '\007'
            case 8: // '\b'
                return c[byte1];
            }
            s1 = s;
            if (byte0 == 0)
            {
                s1 = s;
                if ((byte1 & 0x20) != 0)
                {
                    return s.replace("PRIORITY", "COMPRESSED");
                }
            }
        }
        return s1;
    }

    static String a(boolean flag, int i, int j, byte byte0, byte byte1)
    {
        String s;
        String s1;
        String s2;
        if (byte0 < a.length)
        {
            s = a[byte0];
        } else
        {
            s = String.format("0x%02x", new Object[] {
                Byte.valueOf(byte0)
            });
        }
        s2 = a(byte0, byte1);
        if (flag)
        {
            s1 = "<<";
        } else
        {
            s1 = ">>";
        }
        return String.format("%s 0x%08x %5d %-13s %s", new Object[] {
            s1, Integer.valueOf(i), Integer.valueOf(j), s, s2
        });
    }

    static 
    {
        boolean flag = false;
        b = new String[64];
        c = new String[256];
        for (int i = 0; i < c.length; i++)
        {
            c[i] = String.format("%8s", new Object[] {
                Integer.toBinaryString(i)
            }).replace(' ', '0');
        }

        b[0] = "";
        b[1] = "END_STREAM";
        b[2] = "END_SEGMENT";
        b[3] = "END_STREAM|END_SEGMENT";
        int ai[] = new int[3];
        int[] _tmp = ai;
        ai[0] = 1;
        ai[1] = 2;
        ai[2] = 3;
        b[8] = "PADDED";
        int l = ai.length;
        for (int j = 0; j < l; j++)
        {
            int i1 = ai[j];
            b[i1 | 8] = (new StringBuilder()).append(b[i1]).append("|PADDED").toString();
        }

        b[4] = "END_HEADERS";
        b[32] = "PRIORITY";
        b[36] = "END_HEADERS|PRIORITY";
        int ai1[] = new int[3];
        int[] _tmp1 = ai1;
        ai1[0] = 4;
        ai1[1] = 32;
        ai1[2] = 36;
        int j1 = ai1.length;
        int k = 0;
        do
        {
            l = ((flag) ? 1 : 0);
            if (k >= j1)
            {
                break;
            }
            int k1 = ai1[k];
            int l1 = ai.length;
            for (l = 0; l < l1; l++)
            {
                int i2 = ai[l];
                b[i2 | k1] = (new StringBuilder()).append(b[i2]).append('|').append(b[k1]).toString();
                b[i2 | k1 | 8] = (new StringBuilder()).append(b[i2]).append('|').append(b[k1]).append("|PADDED").toString();
            }

            k++;
        } while (true);
        for (; l < b.length; l++)
        {
            if (b[l] == null)
            {
                b[l] = c[l];
            }
        }

    }
}
