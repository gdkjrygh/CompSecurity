// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class god
    implements ftu
{

    private final gqb a;

    public god(gqb gqb1)
    {
        a = gqb1;
    }

    public final int a()
    {
        return a.b();
    }

    public final void a(int i, int j, List list)
    {
        for (; i < j; i++)
        {
            ekp ekp = a.a(i);
            if (ekp != null)
            {
                list.add(ekp);
            }
        }

    }
}
