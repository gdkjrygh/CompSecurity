// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Typeface;

public class ju
{

    private static final cj a = new cj();

    public static Typeface a(Context context, String s)
    {
        cj cj1 = a;
        cj1;
        JVM INSTR monitorenter ;
        boolean flag = a.containsKey(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        context = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s.ttf", new Object[] {
            s
        }));
        a.put(s, context);
        cj1;
        JVM INSTR monitorexit ;
        return context;
        context;
        cj1;
        JVM INSTR monitorexit ;
        return null;
        context;
        cj1;
        JVM INSTR monitorexit ;
        throw context;
        context = (Typeface)a.get(s);
        cj1;
        JVM INSTR monitorexit ;
        return context;
    }

}
