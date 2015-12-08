// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.bl;

// Referenced classes of package com.kik.d.b:
//            a, d

public static final class D extends Enum
    implements bl
{

    private static com.c.b. A = new d();
    private static final nit> B[] = values();
    private static final values E[];
    public static final values a;
    public static final values b;
    public static final values c;
    public static final values d;
    public static final values e;
    public static final values f;
    public static final values g;
    public static final values h;
    public static final values i;
    public static final values j;
    public static final values k;
    public static final values l;
    public static final values m;
    public static final values n;
    public static final values o;
    public static final values p;
    public static final values q;
    public static final values r;
    public static final values s;
    public static final values t;
    public static final values u;
    public static final values v;
    public static final values w;
    public static final values x;
    public static final values y;
    public static final values z;
    private final int C;
    private final int D;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/kik/d/b/a$c, s1);
    }

    public static [] values()
    {
        return ([])E.clone();
    }

    public final int a()
    {
        return D;
    }

    static 
    {
        a = new <init>("PROFILE_PIC", 0, 0, 100);
        b = new <init>("NOTIFY_SOUND", 1, 1, 101);
        c = new <init>("NOTIFY_VIBRATION", 2, 2, 102);
        d = new <init>("NOTIFY_MESSAGE_PREVIEW", 3, 3, 103);
        e = new <init>("IGNORE_NEW_PEOPLE", 4, 4, 104);
        f = new <init>("TELL_SMS", 5, 5, 105);
        g = new <init>("TELL_EMAIL", 6, 6, 106);
        h = new <init>("TELL_SOCIAL", 7, 7, 107);
        i = new <init>("CHANGE_NAME", 8, 8, 108);
        j = new <init>("CHANGE_EMAIL", 9, 9, 109);
        k = new <init>("CHANGE_PASSWORD", 10, 10, 110);
        l = new <init>("RESET_KIK", 11, 11, 111);
        m = new <init>("ADDRESS_BOOK", 12, 12, 112);
        n = new <init>("BLOCK_LIST", 13, 13, 113);
        o = new <init>("BUBBLE_COLOR", 14, 14, 114);
        p = new <init>("ENTER_KEY_SEND", 15, 15, 115);
        q = new <init>("AUTO_ADD_ON_REPLY", 16, 16, 116);
        r = new <init>("HELP", 17, 17, 117);
        s = new <init>("UPDATE_KIK", 18, 18, 118);
        t = new <init>("LICENSES", 19, 19, 119);
        u = new <init>("PRIVACY_POLICY", 20, 20, 120);
        v = new <init>("DEVELOPER_MODE", 21, 21, 121);
        w = new <init>("TELL_OTHER", 22, 22, 122);
        x = new <init>("NOTIFY_LED_COLOR", 23, 23, 123);
        y = new <init>("NOTIFY_FOR_NEW_PEOPLE", 24, 24, 124);
        z = new <init>("AUTO_DOWNLOAD_VIDEOS", 25, 25, 125);
        E = (new E[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z
        });
    }

    private (String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        C = j1;
        D = k1;
    }
}
