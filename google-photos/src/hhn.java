// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class hhn
{

    private final mmv a;

    public hhn(Context context)
    {
        a = (mmv)olm.a(context, mmv);
    }

    private String a(int i)
    {
        return a.a(i).b("gaia_id");
    }

    public final qbx a(int i, ekq ekq1)
    {
        ekq1 = ((hpe)ekq1.a(hpe)).a;
        qbx qbx1 = new qbx();
        qbx1.a = ((hpc) (ekq1)).a;
        if (((hpc) (ekq1)).b != null)
        {
            qbx1.b = new qby();
            qbx1.b.b = Long.toString(((hpc) (ekq1)).b.longValue());
            qbx1.b.a = a(i);
        }
        return qbx1;
    }

    public final qeo a(int i, ekp ekp1)
    {
        ekp1 = ((hpg)ekp1.a(hpg)).b();
        p.a(ekp1.a(), "media must have a remote media key");
        qeo qeo1 = new qeo();
        qeo1.a = ((hpk) (ekp1)).c;
        qeo1.b = new qep();
        qeo1.b.b = Long.toString(Long.parseLong(((hpk) (ekp1)).b));
        qeo1.b.a = a(i);
        return qeo1;
    }
}
