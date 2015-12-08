// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.b;

import android.content.Context;
import android.view.WindowManager;
import java.util.WeakHashMap;

// Referenced classes of package p.b:
//            b

public abstract class p.b.a
{
    private static class a extends p.b.a
    {

        private final Object a;

        public a(Context context)
        {
            a = p.b.b.a(context);
        }
    }

    private static class b extends p.b.a
    {

        private final WindowManager a;

        public b(Context context)
        {
            a = (WindowManager)context.getSystemService("window");
        }
    }


    private static final WeakHashMap a = new WeakHashMap();

    p.b.a()
    {
    }

    public static p.b.a a(Context context)
    {
        WeakHashMap weakhashmap = a;
        weakhashmap;
        JVM INSTR monitorenter ;
        p.b.a a1 = (p.b.a)a.get(context);
        Object obj = a1;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = new a(context);
_L3:
        a.put(context, obj);
_L2:
        weakhashmap;
        JVM INSTR monitorexit ;
        return ((p.b.a) (obj));
        obj = new b(context);
          goto _L3
        context;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw context;
    }

}
