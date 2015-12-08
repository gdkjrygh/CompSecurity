// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class dkd
    implements gbq
{

    private flk a;
    private final gcf b;

    dkd(flk flk1, gcf gcf1)
    {
        a = flk1;
        b = gcf1;
    }

    public final ekq a(int i)
    {
        return new dog(i);
    }

    public final List a()
    {
        int i = a.b();
        int j = a.c();
        return Collections.unmodifiableList(Arrays.asList(new gbr[] {
            new gbr(i, i, 200), new gbr(j, j, 200), new gbr(i, i, 2500)
        }));
    }

    public final boolean b(int i)
    {
        return b.a(i);
    }
}
