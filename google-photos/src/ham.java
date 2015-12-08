// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ham
    implements ftu
{

    private final hgz a;

    public ham(hgz hgz1)
    {
        a = hgz1;
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(int i, int j, List list)
    {
        for (; i < j; i++)
        {
            hgo hgo = a.f(i);
            if (hgo instanceof frj)
            {
                list.add(((frj)hgo).b);
            }
        }

    }
}
