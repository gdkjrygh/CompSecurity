// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            c

private static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private final String d;

    public static d a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        d d1 = c;
_L4:
        return d1;
_L2:
        d ad[] = values();
        int j = ad.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                d d2 = ad[i];
                d1 = d2;
                if (d2.d.equals(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/amazon/device/associates/c$b, s);
    }

    public static c[] values()
    {
        return (c[])e.clone();
    }

    static 
    {
        a = new <init>("MP3_ALBUM", 0, "Digital Music Album");
        b = new <init>("MP3_TRACK", 1, "Digital Music Track");
        c = new <init>("OTHERS", 2, "Others");
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }
}
