// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.WeakHashMap;

public abstract class ec
{

    private static final WeakHashMap a = new WeakHashMap();

    ec()
    {
    }

    public static ec a(Context context)
    {
        WeakHashMap weakhashmap = a;
        weakhashmap;
        JVM INSTR monitorenter ;
        ec ec1 = (ec)a.get(context);
        Object obj = ec1;
        if (ec1 != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new ed(context);
_L3:
        a.put(context, obj);
_L2:
        weakhashmap;
        JVM INSTR monitorexit ;
        return ((ec) (obj));
        obj = new ee(context);
          goto _L3
        context;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw context;
    }

}
