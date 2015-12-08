// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.m4b.maps.aq.r;
import com.google.android.m4b.maps.aq.w;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.bt.d;
import com.google.android.m4b.maps.bv.f;
import com.google.android.m4b.maps.y.i;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bj, av, bn, o, 
//            by, cb, bc, p

public class ao
{

    private static final String a;
    private static final String b;

    public ao()
    {
    }

    static av a(String s, bj bj1)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 71 71: default 24
    //                   71 72;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unsupported renderer: ".concat(s);
            } else
            {
                s = new String("Unsupported renderer: ");
            }
            throw new IllegalArgumentException(s);

        case 0: // '\0'
            return f.a(bj1);
        }
_L2:
        if (s.equals("G"))
        {
            byte0 = 0;
        }
          goto _L1
    }

    static p a(String s, bj bj1, ScheduledExecutorService scheduledexecutorservice, View view, bn bn, boolean flag, String s1, boolean flag1, 
            TextView textview, o o, by by, cb cb, bc bc)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   71: 99
    //                   76: 84;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_99;
_L4:
        switch (byte0)
        {
        default:
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unsupported renderer: ".concat(s);
            } else
            {
                s = new String("Unsupported renderer: ");
            }
            throw new IllegalArgumentException(s);

        case 0: // '\0'
            return d.a(bj1.a, bj1.b, bj1.d, scheduledexecutorservice, view, bn, by, o, textview, bj1.e, bj1.i, cb, bc);

        case 1: // '\001'
            break;
        }
        break MISSING_BLOCK_LABEL_152;
_L3:
        if (s.equals("L"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("G"))
        {
            byte0 = 1;
        }
          goto _L4
        if (ag.a(flag))
        {
            return r.a(bj1, scheduledexecutorservice, view, bn, s1, flag1, textview, o, cb, bc);
        } else
        {
            return w.a(bj1, scheduledexecutorservice, view, bn, s1, flag1, textview, o, cb, bc);
        }
    }

    static String a(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "L";
        } else
        {
            s = "G";
        }
        if (ab.a(a, 4))
        {
            String s2 = a;
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "Selected map renderer: ".concat(s1);
            } else
            {
                s1 = new String("Selected map renderer: ");
            }
            Log.i(s2, s1);
        }
        if (b != null)
        {
            if (ab.a(a, 4))
            {
                s1 = a;
                s = String.valueOf(b);
                if (s.length() != 0)
                {
                    s = "Overriding map renderer from system property: ".concat(s);
                } else
                {
                    s = new String("Overriding map renderer from system property: ");
                }
                Log.i(s1, s);
            }
            s = b;
        }
        return s;
    }

    static 
    {
        String s;
        String s1;
        byte byte0;
        a = com/google/android/m4b/maps/cg/ao.getSimpleName();
        s = (String)ag.a("debug.mapview.renderer").a("NOTHING");
        s1 = s.toUpperCase();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 68
    //                   -1447660627: 169
    //                   2191599: 141
    //                   2336942: 155;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_169;
_L5:
        switch (byte0)
        {
        default:
            if (ab.a(a, 6))
            {
                s1 = a;
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Unsupported map renderer: ".concat(s);
                } else
                {
                    s = new String("Unsupported map renderer: ");
                }
                Log.e(s1, s);
            }
            b = null;
            return;

        case 0: // '\0'
            b = "G";
            return;

        case 1: // '\001'
            b = "L";
            return;

        case 2: // '\002'
            b = null;
            return;
        }
_L3:
        if (s1.equals("GMM6"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s1.equals("LITE"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s1.equals("NOTHING"))
        {
            byte0 = 2;
        }
          goto _L5
    }
}
