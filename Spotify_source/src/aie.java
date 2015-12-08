// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import android.util.Log;
import java.util.Locale;

final class aie extends aid
{

    private final String c;

    private aie(String s, String s1)
    {
        super(s1, (byte)0);
        c = s;
    }

    aie(String s, String s1, byte byte0)
    {
        this(s, s1);
    }

    final int a()
    {
        return Process.myTid();
    }

    protected final transient void a(int i, String s, Object aobj[])
    {
        if (i < aid.a) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            String s1 = String.format("[atid=%d,apid=%d,tid=%d] %s: %s", new Object[] {
                Integer.valueOf(a()), Integer.valueOf(b()), Long.valueOf(Thread.currentThread().getId()), super.b, s
            });
            s = s1;
            if (aobj == null)
            {
                s = s1;
                if (s1 != null)
                {
                    s = s1.replace('%', '?');
                }
            }
            s = String.format(Locale.ENGLISH, s, aobj);
        } else
        {
            s = (new StringBuilder()).append(super.b).append(": No message to log").toString();
        }
        i;
        JVM INSTR tableswitch 2 6: default 136
    //                   2 196
    //                   3 208
    //                   4 220
    //                   5 232
    //                   6 244;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        Log.w(c, (new StringBuilder("Unsupported log level: ")).append(i).toString());
_L10:
        aic.a(i, c, s);
_L2:
        return;
_L4:
        Log.v(c, s);
        continue; /* Loop/switch isn't completed */
_L5:
        Log.d(c, s);
        continue; /* Loop/switch isn't completed */
_L6:
        Log.i(c, s);
        continue; /* Loop/switch isn't completed */
_L7:
        Log.w(c, s);
        continue; /* Loop/switch isn't completed */
_L8:
        Log.e(c, s);
        if (true) goto _L10; else goto _L9
_L9:
    }

    final int b()
    {
        return Process.myPid();
    }

    protected final void finalize()
    {
        aic.a();
    }
}
