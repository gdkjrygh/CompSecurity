// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class cgt
    implements np
{

    private cgp a;

    cgt(cgp cgp1)
    {
        a = cgp1;
        super();
    }

    public final void a(int i, float f, int j)
    {
    }

    public final void b(int i)
    {
    }

    public final void c_(int i)
    {
        cgx cgx1;
        for (cgx1 = cgp.c(a); i > cgx1.b.size() || i < 0 || ((bwg)cgx1.b.get(i)).a() == null;)
        {
            return;
        }

        android.view.View view;
        boolean flag;
        if (cgx1.b.size() == cgx1.c.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, String.valueOf(cgp.v()).concat(": mEntries and mPages should have equal size. "));
        view = cgx1.c[i];
        mry.a(cgp.g(cgx1.d), 4, (new msn()).a(view).a(cgx1.d()));
    }
}
