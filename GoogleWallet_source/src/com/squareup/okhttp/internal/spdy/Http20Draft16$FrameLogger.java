// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Http20Draft16

static final class A
{

    private static final String BINARY[];
    private static final String FLAGS[];
    private static final String TYPES[] = {
        "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
    };

    private static String formatFlags(byte byte0, byte byte1)
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
                if (byte1 < FLAGS.length)
                {
                    s = FLAGS[byte1];
                } else
                {
                    s = BINARY[byte1];
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
                    return BINARY[byte1];
                }

            case 2: // '\002'
            case 3: // '\003'
            case 7: // '\007'
            case 8: // '\b'
                return BINARY[byte1];
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

    static String formatHeader(boolean flag, int i, int j, byte byte0, byte byte1)
    {
        String s;
        String s1;
        String s2;
        if (byte0 < TYPES.length)
        {
            s = TYPES[byte0];
        } else
        {
            s = String.format("0x%02x", new Object[] {
                Byte.valueOf(byte0)
            });
        }
        s2 = formatFlags(byte0, byte1);
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
        FLAGS = new String[64];
        BINARY = new String[256];
        for (int i = 0; i < BINARY.length; i++)
        {
            BINARY[i] = String.format("%8s", new Object[] {
                Integer.toBinaryString(i)
            }).replace(' ', '0');
        }

        FLAGS[0] = "";
        FLAGS[1] = "END_STREAM";
        int ai[] = new int[1];
        ai[0] = 1;
        FLAGS[8] = "PADDED";
        for (int j = 0; j <= 0; j++)
        {
            int i1 = ai[j];
            FLAGS[i1 | 8] = (new StringBuilder()).append(FLAGS[i1]).append("|PADDED").toString();
        }

        FLAGS[4] = "END_HEADERS";
        FLAGS[32] = "PRIORITY";
        FLAGS[36] = "END_HEADERS|PRIORITY";
        for (int k = 0; k < 3; k++)
        {
            int k1 = (new int[] {
                4, 32, 36
            })[k];
            for (int j1 = 0; j1 <= 0; j1++)
            {
                int l1 = ai[j1];
                FLAGS[l1 | k1] = (new StringBuilder()).append(FLAGS[l1]).append('|').append(FLAGS[k1]).toString();
                FLAGS[l1 | k1 | 8] = (new StringBuilder()).append(FLAGS[l1]).append('|').append(FLAGS[k1]).append("|PADDED").toString();
            }

        }

        for (int l = 0; l < FLAGS.length; l++)
        {
            if (FLAGS[l] == null)
            {
                FLAGS[l] = BINARY[l];
            }
        }

    }

    A()
    {
    }
}
