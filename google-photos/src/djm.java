// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class djm
    implements fkw
{

    private final drw a;

    public djm(drw drw1)
    {
        a = drw1;
    }

    private elb a(int i, hpk hpk1)
    {
        boolean flag = false;
        if (hpk1.a() || hpk1.e())
        {
            flag = true;
        }
        p.a(flag, "Must set a mediaKey or a localContentUri");
        String s = hpk1.c;
        hpk1 = hpk1.a;
        try
        {
            hpk1 = a.a(i, ekw.a, ekk.a, new drx[] {
                new djn(this, s, hpk1)
            });
            if (hpk1.isEmpty())
            {
                return b.a(new eke("Could not find matching Media item"));
            }
            hpk1 = b.b(hpk1.get(0));
        }
        // Misplaced declaration of an exception variable
        catch (hpk hpk1)
        {
            return b.a(new eke("Failed to load features", hpk1));
        }
        return hpk1;
    }

    public final elb a(int i, ekq ekq, hpk hpk1)
    {
        boolean flag;
        if ((ekq instanceof dke) || (ekq instanceof dnx) || (ekq instanceof dnd))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ekq = String.valueOf(ekq);
        p.a(flag, (new StringBuilder(String.valueOf(ekq).length() + 20)).append("Invalid collection: ").append(ekq).toString());
        return a(i, hpk1);
    }
}
