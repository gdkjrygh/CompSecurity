// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;


// Referenced classes of package com.c.a.a.b:
//            g

static final class 
{

    private static final String a[] = {
        "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
    };
    private static final String b[];
    private static final String c[];

    static String a(boolean flag, int i, int j, byte byte0, byte byte1)
    {
        String s;
        String s2;
        if (byte0 < a.length)
        {
            s2 = a[byte0];
        } else
        {
            s2 = String.format("0x%02x", new Object[] {
                Byte.valueOf(byte0)
            });
        }
        if (byte1 != 0) goto _L2; else goto _L1
_L1:
        s = "";
_L4:
        String s1;
        if (flag)
        {
            s1 = "<<";
        } else
        {
            s1 = ">>";
        }
        return String.format("%s 0x%08x %5d %-13s %s", new Object[] {
            s1, Integer.valueOf(i), Integer.valueOf(j), s2, s
        });
_L2:
        switch (byte0)
        {
        case 5: // '\005'
        default:
            if (byte1 < b.length)
            {
                s1 = b[byte1];
            } else
            {
                s1 = c[byte1];
            }
            if (byte0 == 5 && (byte1 & 4) != 0)
            {
                s = s1.replace("HEADERS", "PUSH_PROMISE");
            } else
            {
                s = s1;
                if (byte0 == 0)
                {
                    s = s1;
                    if ((byte1 & 0x20) != 0)
                    {
                        s = s1.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            break;

        case 4: // '\004'
        case 6: // '\006'
            if (byte1 == 1)
            {
                s = "ACK";
            } else
            {
                s = c[byte1];
            }
            break;

        case 2: // '\002'
        case 3: // '\003'
        case 7: // '\007'
        case 8: // '\b'
            s = c[byte1];
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        int ai[] = new int[1];
        ai[0] = 1;
        b[8] = "PADDED";
        for (int j = 0; j <= 0; j++)
        {
            int l = ai[j];
            b[l | 8] = (new StringBuilder()).append(b[l]).append("|PADDED").toString();
        }

        b[4] = "END_HEADERS";
        b[32] = "PRIORITY";
        b[36] = "END_HEADERS|PRIORITY";
        int k = 0;
        int i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (k >= 3)
            {
                break;
            }
            int j1 = (new int[] {
                4, 32, 36
            })[k];
            for (i1 = 0; i1 <= 0; i1++)
            {
                int k1 = ai[i1];
                b[k1 | j1] = (new StringBuilder()).append(b[k1]).append('|').append(b[j1]).toString();
                b[k1 | j1 | 8] = (new StringBuilder()).append(b[k1]).append('|').append(b[j1]).append("|PADDED").toString();
            }

            k++;
        } while (true);
        for (; i1 < b.length; i1++)
        {
            if (b[i1] == null)
            {
                b[i1] = c[i1];
            }
        }

    }

    ()
    {
    }
}
