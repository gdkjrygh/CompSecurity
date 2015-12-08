// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class Permission extends Enum
{

    public static final Permission a;
    public static final Permission b;
    public static final Permission c;
    public static final Permission d;
    public static final Permission e;
    public static final Permission f;
    public static final Permission g;
    public static final Permission h;
    public static final Permission i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final Set p;
    private static final Permission r[];
    private final String q;

    private Permission(String s, int i1, String s1)
    {
        super(s, i1);
        q = s1;
    }

    public static Permission a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 22: default 192
    //                   -2062386608: 569
    //                   -1928411001: 320
    //                   -1921431796: 479
    //                   -1888586689: 390
    //                   -1479758289: 584
    //                   -895679497: 599
    //                   -895673731: 554
    //                   -406040016: 614
    //                   -63024214: 404
    //                   -5573545: 464
    //                   52602690: 539
    //                   112197485: 434
    //                   214526995: 376
    //                   463403621: 348
    //                   603653886: 334
    //                   610633091: 494
    //                   952819282: 524
    //                   1365911975: 629
    //                   1786751355: 449
    //                   1831139720: 419
    //                   1977429404: 362
    //                   2133799037: 509;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_629;
_L24:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Permission model abused. This permission don't belong to any group: ")).append(s).toString());

        case 0: // '\0'
        case 1: // '\001'
            return i;

        case 2: // '\002'
            return b;

        case 3: // '\003'
        case 4: // '\004'
            return d;

        case 5: // '\005'
        case 6: // '\006'
            return h;

        case 7: // '\007'
            return c;

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return f;

        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            return e;

        case 20: // '\024'
        case 21: // '\025'
            return g;
        }
_L3:
        if (s.equals("android.permission.READ_CALENDAR"))
        {
            byte0 = 0;
        }
          goto _L24
_L16:
        if (s.equals("android.permission.WRITE_CALENDAR"))
        {
            byte0 = 1;
        }
          goto _L24
_L15:
        if (s.equals("android.permission.CAMERA"))
        {
            byte0 = 2;
        }
          goto _L24
_L22:
        if (s.equals("android.permission.READ_CONTACTS"))
        {
            byte0 = 3;
        }
          goto _L24
_L14:
        if (s.equals("android.permission.WRITE_CONTACTS"))
        {
            byte0 = 4;
        }
          goto _L24
_L5:
        if (s.equals("android.permission.ACCESS_FINE_LOCATION"))
        {
            byte0 = 5;
        }
          goto _L24
_L10:
        if (s.equals("android.permission.ACCESS_COARSE_LOCATION"))
        {
            byte0 = 6;
        }
          goto _L24
_L21:
        if (s.equals("android.permission.RECORD_AUDIO"))
        {
            byte0 = 7;
        }
          goto _L24
_L13:
        if (s.equals("android.permission.CALL_PHONE"))
        {
            byte0 = 8;
        }
          goto _L24
_L20:
        if (s.equals("android.permission.MODIFY_PHONE_STATE"))
        {
            byte0 = 9;
        }
          goto _L24
_L11:
        if (s.equals("android.permission.READ_PHONE_STATE"))
        {
            byte0 = 10;
        }
          goto _L24
_L4:
        if (s.equals("android.permission.READ_CALL_LOG"))
        {
            byte0 = 11;
        }
          goto _L24
_L17:
        if (s.equals("android.permission.WRITE_CALL_LOG"))
        {
            byte0 = 12;
        }
          goto _L24
_L23:
        if (s.equals("com.android.voicemail.permission.ADD_VOICEMAIL"))
        {
            byte0 = 13;
        }
          goto _L24
_L18:
        if (s.equals("android.permission.PROCESS_OUTGOING_CALLS"))
        {
            byte0 = 14;
        }
          goto _L24
_L12:
        if (s.equals("android.permission.SEND_SMS"))
        {
            byte0 = 15;
        }
          goto _L24
_L8:
        if (s.equals("android.permission.RECEIVE_SMS"))
        {
            byte0 = 16;
        }
          goto _L24
_L2:
        if (s.equals("android.permission.READ_SMS"))
        {
            byte0 = 17;
        }
          goto _L24
_L6:
        if (s.equals("android.permission.RECEIVE_WAP_PUSH"))
        {
            byte0 = 18;
        }
          goto _L24
_L7:
        if (s.equals("android.permission.RECEIVE_MMS"))
        {
            byte0 = 19;
        }
          goto _L24
_L9:
        if (s.equals("android.permission.READ_EXTERNAL_STORAGE"))
        {
            byte0 = 20;
        }
          goto _L24
        if (s.equals("android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            byte0 = 21;
        }
          goto _L24
    }

    public static Permission valueOf(String s)
    {
        return (Permission)Enum.valueOf(com/skype/android/util/permission/Permission, s);
    }

    public static Permission[] values()
    {
        return (Permission[])r.clone();
    }

    public final String a()
    {
        return q;
    }

    static 
    {
        a = new Permission("SENSORS", 0, "android.permission.BODY_SENSORS");
        b = new Permission("CAMERA", 1, "android.permission.CAMERA");
        c = new Permission("MICROPHONE", 2, "android.permission.RECORD_AUDIO");
        d = new Permission("CONTACTS", 3, "android.permission.WRITE_CONTACTS");
        e = new Permission("SMS", 4, "android.permission.SEND_SMS");
        f = new Permission("PHONE", 5, "android.permission.READ_PHONE_STATE");
        g = new Permission("STORAGE", 6, "android.permission.WRITE_EXTERNAL_STORAGE");
        h = new Permission("LOCATION", 7, "android.permission.ACCESS_FINE_LOCATION");
        i = new Permission("CALENDAR", 8, "android.permission.WRITE_CALENDAR");
        r = (new Permission[] {
            a, b, c, d, e, f, g, h, i
        });
        j = Collections.unmodifiableSet(EnumSet.of(b, c, f, g, d));
        k = Collections.unmodifiableSet(EnumSet.of(b, c, f));
        l = Collections.unmodifiableSet(EnumSet.of(b, c, g));
        m = Collections.unmodifiableSet(EnumSet.of(g, b));
        n = Collections.unmodifiableSet(EnumSet.of(c, f));
        o = Collections.unmodifiableSet(EnumSet.of(h, g));
        p = Collections.unmodifiableSet(EnumSet.of(d));
    }
}
