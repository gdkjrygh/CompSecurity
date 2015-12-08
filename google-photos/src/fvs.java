// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

final class fvs
    implements fvt
{

    private final Context a;
    private final gui b;
    private final ekk c = (new ekm()).a(gui.a()).a();

    fvs(Context context)
    {
        a = context;
        b = new gui(context);
    }

    public final ekk a()
    {
        return c;
    }

    public final elb a(gue gue1)
    {
        ekq ekq;
        Object obj;
        int i;
        i = gue1.a;
        obj = gue1.c;
        ekq = gue1.b;
        Object obj1 = (new gug()).a(gue1);
        obj1.g = b.a(((ekp) (obj)), gue1.h);
        obj1.i = true;
        obj1 = ((gug) (obj1)).a();
        gue1 = (Uri)b.a(((gue) (obj1))).a();
        if (((gue) (obj1)).h == gvl.b)
        {
            return b.b(obj);
        }
        obj = new hpm();
        obj.b = gue1.toString();
        gue1 = ((hpm) (obj)).a();
        gue1 = ((fkw)b.a(a, fkw, ekq)).a(i, ekq, gue1);
        return gue1;
        gue1;
_L2:
        return b.a(gue1);
        gue1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
