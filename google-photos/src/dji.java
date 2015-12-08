// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;

final class dji
    implements gsj
{

    private static ekk a = (new ekm()).a(hpe).a(gsn).a();
    private final Context b;
    private final djj c;
    private final gsl d;
    private final noz e;

    dji(Context context)
    {
        this(context, new djj());
    }

    private dji(Context context, djj djj1)
    {
        b = context;
        c = djj1;
        d = new gsl(context);
        e = noz.a(context, 3, "AddPendingRemoteMedia", new String[0]);
    }

    public final void a(ekq ekq1)
    {
        boolean flag = ekq1 instanceof dnd;
        String s = String.valueOf(ekq1);
        p.a(flag, (new StringBuilder(String.valueOf(s).length() + 25)).append("Unrecognized collection: ").append(s).toString());
        ekq1 = (dnd)(ekq)b.b(b, ekq1).a(ekq1, a).a();
        int i = ((dnd) (ekq1)).a;
        s = ((hpe)ekq1.a(hpe)).a.a;
        flag = ((gsn)ekq1.a(gsn)).a;
        ekq1 = gsr.a(b, i, s, flag);
        ((nxv)olm.a(b, nxv)).a(ekq1);
        if (!((gsr) (ekq1)).a)
        {
            throw new eke(((nxx) (ekq1)).n);
        }
        if (e.a())
        {
            noy.a(i);
            noy.a("added item media keys", Collections.unmodifiableList(((gsr) (ekq1)).b));
            noy.a("added collection media keys", Collections.unmodifiableList(((gsr) (ekq1)).c));
        }
        d.a(i, Collections.unmodifiableList(((gsr) (ekq1)).b), Collections.unmodifiableList(((gsr) (ekq1)).c));
    }

}
