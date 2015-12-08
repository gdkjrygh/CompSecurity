// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fav extends mtf
{

    private static String a = fav.getSimpleName();
    private final fat b;

    fav(Context context)
    {
        super(a);
        b = (fat)olm.a(context, fat);
    }

    protected final mue a(Context context)
    {
        context = far.b(b.a);
        boolean flag;
        if (context != fas.a && context != fas.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return new mue(true);
        } else
        {
            b.a();
            return new mue(true);
        }
    }

}
