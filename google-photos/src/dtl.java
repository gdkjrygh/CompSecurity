// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Map;

public final class dtl extends mtf
{

    private final Map a;
    private final dtn b;

    public dtl(dtn dtn1, Map map)
    {
        super("ScreenViewLogTask");
        a = map;
        b = dtn1;
    }

    private static boolean g(Context context)
    {
        return ((lzn)olm.a(context, lzn)).a(context) == 0;
    }

    protected final mue a(Context context)
    {
        lvz lvz1 = (lvz)olm.a(context, lvz);
        dtm.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 93
    //                   2 118
    //                   3 126;
           goto _L1 _L2 _L3 _L4
_L1:
        context = String.valueOf(b);
        throw new IllegalStateException((new StringBuilder(String.valueOf(context).length() + 19)).append("Unexpected filter: ").append(context).toString());
_L2:
        boolean flag = true;
_L6:
        if (flag)
        {
            lvz1.a(a);
        }
        return new mue(true);
_L3:
        flag = g(context);
        continue; /* Loop/switch isn't completed */
_L4:
        if (!g(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
