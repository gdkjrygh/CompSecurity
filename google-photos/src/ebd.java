// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;

final class ebd
    implements gsj
{

    private static ekk a = (new ekm()).a(gsp).a();
    private final Context b;
    private final ebe c;
    private final gsk d;
    private final nxv e;
    private final gsl f;
    private final noz g;
    private final noz h;

    ebd(Context context)
    {
        this(context, new ebe());
    }

    private ebd(Context context, ebe ebe1)
    {
        b = context;
        c = ebe1;
        d = (gsk)olm.a(context, gsk);
        e = (nxv)olm.a(context, nxv);
        f = new gsl(context);
        g = noz.a(context, "AddPendingRemoteMedia", new String[0]);
        h = noz.a(context, 3, "AddPendingRemoteMedia", new String[0]);
    }

    public final void a(ekq ekq1)
    {
        Object obj;
        int i;
        boolean flag = ekq1 instanceof ebv;
        obj = String.valueOf(ekq1);
        p.a(flag, (new StringBuilder(String.valueOf(obj).length() + 25)).append("Unrecognized collection: ").append(((String) (obj))).toString());
        ekq1 = (ebv)(ekq)b.b(b, ekq1).a(ekq1, a).a();
        i = ((ebv) (ekq1)).a;
        obj = (gsp)ekq1.a(gsp);
        if (!d.a(i, ((ebv) (ekq1)).c))
        {
            d.b(i, ((ebv) (ekq1)).c);
            throw new eke("failed dismissing notification");
        }
        int j;
        j = ((ebv) (ekq1)).a;
        obj = gsr.a(b, ((ebv) (ekq1)).a, ((gsp) (obj)).a);
        e.a(((nxx) (obj)));
        if (!((gsr) (obj)).a)
        {
            throw new eke(((nxx) (obj)).n);
        }
        break MISSING_BLOCK_LABEL_198;
        obj;
        d.b(i, ((ebv) (ekq1)).c);
        throw obj;
        if (h.a())
        {
            noy.a(j);
            b.a(ekq1);
            noy.a("added item media keys", Collections.unmodifiableList(((gsr) (obj)).b));
            noy.a("added collection media keys", Collections.unmodifiableList(((gsr) (obj)).c));
        }
        f.a(j, Collections.unmodifiableList(((gsr) (obj)).b), Collections.unmodifiableList(((gsr) (obj)).c));
        return;
    }

}
