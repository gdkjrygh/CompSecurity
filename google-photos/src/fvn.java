// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fvn
    implements emf
{

    private final Context a;
    private final neq b;

    public fvn(Context context, neq neq1)
    {
        a = context;
        b = neq1;
    }

    private elm a(fuv fuv1, ekk ekk)
    {
        fux fux1 = (fux)fuv1.f;
        ekk = new fvp(a, fux1, ekk);
        try
        {
            fuv1 = (ekp)b.a(fuv1, ekk, fux1.b());
        }
        // Misplaced declaration of an exception variable
        catch (fuv fuv1)
        {
            throw new eke(fuv1);
        }
        if (fuv1 == null)
        {
            throw new eke("Failed to load features.");
        } else
        {
            return ((fuv)fuv1).e;
        }
    }

    public final ekp a(ekp ekp1, elm elm)
    {
        ekp1 = (fuv)ekp1;
        return new fuv(((fuv) (ekp1)).a, ((fuv) (ekp1)).b, ((fuv) (ekp1)).c, ((fuv) (ekp1)).d, ((fuv) (ekp1)).f, ((fuv) (ekp1)).g, elm);
    }

    public final volatile elm a(ekp ekp1, ekk ekk)
    {
        return a((fuv)ekp1, ekk);
    }

    public final Class a()
    {
        return fuv;
    }
}
