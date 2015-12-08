// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class oox
    implements opi
{

    private Activity a;

    oox(oow oow, Activity activity)
    {
        a = activity;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof oor)
        {
            ((oor)opv).a(a);
        }
    }
}
