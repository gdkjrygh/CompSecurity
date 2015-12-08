// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.WeakHashMap;

public class fn
{

    private static final WeakHashMap a = new WeakHashMap();

    fn()
    {
    }

    public static fn a(Context context)
    {
        WeakHashMap weakhashmap = a;
        weakhashmap;
        JVM INSTR monitorenter ;
        fn fn1 = (fn)a.get(context);
        Object obj = fn1;
        if (fn1 != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new fo(context);
_L3:
        a.put(context, obj);
_L2:
        weakhashmap;
        JVM INSTR monitorexit ;
        return ((fn) (obj));
        obj = new fp(context);
          goto _L3
        context;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw context;
    }

}
