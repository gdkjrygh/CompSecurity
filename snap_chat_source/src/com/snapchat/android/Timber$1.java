// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Lw;
import android.util.Log;

// Referenced classes of package com.snapchat.android:
//            Timber

static final class g
    implements Runnable
{

    private String a;
    private Object b[];
    private gType c;
    private String d;
    private boolean e;
    private long f;
    private Throwable g;

    public final void run()
    {
        String s;
        s = a;
        if (b.length > 0)
        {
            s = String.format(a, b);
        }
        a[c.ordinal()];
        JVM INSTR tableswitch 1 6: default 76
    //                   1 103
    //                   2 130
    //                   3 157
    //                   4 184
    //                   5 211
    //                   6 238;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
        }
_L9:
        return;
_L2:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (e)
        {
            Lw.a(c.name(), d, s, f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        String s1 = Log.getStackTraceString(g);
        if (e)
        {
            Lw.a(c.name(), d, s1, f);
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    gType(String s, Object aobj[], gType gtype, String s1, boolean flag, long l, 
            Throwable throwable)
    {
        a = s;
        b = aobj;
        c = gtype;
        d = s1;
        e = flag;
        f = l;
        g = throwable;
        super();
    }
}
