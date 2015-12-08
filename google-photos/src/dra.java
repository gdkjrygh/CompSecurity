// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class dra
    implements ftu
{

    private dqz a;

    dra(dqz dqz1)
    {
        a = dqz1;
        super();
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(int i, int j, List list)
    {
        for (; i < j; i++)
        {
            list.add(Integer.valueOf(i));
        }

    }
}
