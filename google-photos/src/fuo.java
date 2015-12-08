// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.Set;

final class fuo
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final fbj b;

    fuo(Context context)
    {
        b = (fbj)olm.a(context, fbj);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        boolean flag;
        if (((fvm) (obj)).a.c == njx.a || ((fvm) (obj)).a.c == njx.b && fbj.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new gth(flag);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return gtg;
    }

}
