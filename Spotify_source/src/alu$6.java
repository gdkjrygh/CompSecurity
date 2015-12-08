// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.lang.ref.WeakReference;

final class ang.Object
    implements hbx
{

    private alu a;

    public final Object a(hbz hbz1)
    {
        Object obj = ((gyh) (a)).i;
        boolean flag;
        if (((gya) (obj)).c != null)
        {
            obj = (Activity)((gya) (obj)).c.get();
        } else
        {
            obj = null;
        }
        if (obj != null && !((Activity) (obj)).isFinishing() && a.h())
        {
            flag = alu.a(a, ((Activity) (obj)), hbz1.c);
        } else
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    (alu alu1)
    {
        a = alu1;
        super();
    }
}
