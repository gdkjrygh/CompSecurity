// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class abb
    implements Runnable
{

    private abe a;
    private aay b;

    public abb(aay aay1, abe abe1)
    {
        b = aay1;
        super();
        a = abe1;
    }

    public final void run()
    {
        Object obj = b.c;
        if (((vu) (obj)).b != null)
        {
            ((vu) (obj)).b.a(((vu) (obj)));
        }
        obj = (View)b.e;
        if (obj != null && ((View) (obj)).getWindowToken() != null && a.c())
        {
            b.i = a;
        }
        b.k = null;
    }
}
