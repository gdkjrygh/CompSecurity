// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class gqh
{

    private static View a;

    public static boolean a(Context context)
    {
        gqh;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a == null)
        {
            a = new View(context.getApplicationContext());
        }
        flag = a.isInEditMode();
        gqh;
        JVM INSTR monitorexit ;
        return flag;
        context;
        throw context;
    }
}
