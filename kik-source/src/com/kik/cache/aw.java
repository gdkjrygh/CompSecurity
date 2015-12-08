// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import kik.android.util.DeviceUtils;

// Referenced classes of package com.kik.cache:
//            y

public final class aw extends y
{

    private final String f;

    private aw(String s, String s1, com.android.volley.r.b b, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(s, s1, b, 0, 0, config, a1);
        f = s;
    }

    public static aw a(String s, com.android.volley.r.b b, com.android.volley.r.a a1)
    {
        String s1 = e(s);
        if (s1 == null)
        {
            return null;
        } else
        {
            return new aw(s, s1, b, a, a1);
        }
    }

    public static String d(String s)
    {
        return e(s);
    }

    private static String e(String s)
    {
        byte byte0;
        byte byte1;
        byte1 = 60;
        if (s == null)
        {
            return null;
        }
        s = (new StringBuilder("http://smiley-cdn.kik.com/smileys/")).append(s).append("/");
        byte0 = byte1;
        DeviceUtils.b();
        JVM INSTR lookupswitch 5: default 84
    //                   120: 122
    //                   160: 128
    //                   240: 134
    //                   320: 140
    //                   480: 86;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = byte1;
_L8:
        return s.append((new StringBuilder()).append(byte0).append("x").append(byte0).toString()).append(".png").toString();
_L2:
        byte0 = 15;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 20;
        continue; /* Loop/switch isn't completed */
_L4:
        byte0 = 30;
        continue; /* Loop/switch isn't completed */
_L5:
        byte0 = 40;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final String u()
    {
        return f;
    }
}
