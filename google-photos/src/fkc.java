// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;

public final class fkc
    implements gud
{

    private final gui a;

    public fkc(Context context)
    {
        a = new gui(context);
    }

    public final ekk a()
    {
        return gui.a();
    }

    public final elb a(gue gue1)
    {
        Object obj;
        ekp ekp;
        ekp = gue1.c;
        obj = gue1;
        if (gue1.g == null)
        {
            obj = (new gug()).a(gue1);
            obj.g = a.a(ekp, gue1.h);
            obj.i = true;
            obj = ((gug) (obj)).a();
        }
        a.a(((gue) (obj))).a();
        gue1 = b.b(ekp);
        return gue1;
        gue1;
_L2:
        return b.a(gue1);
        gue1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final elb b(gue gue1)
    {
        return a(gue1);
    }

    public final boolean c(gue gue1)
    {
        return false;
    }
}
