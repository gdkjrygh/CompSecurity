// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;

final class cut
    implements cia
{

    Surface a;
    private cun b;

    cut(cun cun1)
    {
        b = cun1;
        super();
    }

    public final void a()
    {
        a(((Surface) (null)));
    }

    void a(Surface surface)
    {
        if (cun.a(b) != null && cun.b(b) != null)
        {
            cun.a(b).a(cun.b(b), 1, surface);
        }
        a = surface;
    }

    public final void a(Object obj)
    {
        b.a(obj instanceof Surface, "surface Object is not a android.view.Surface!");
        a((Surface)obj);
    }
}
