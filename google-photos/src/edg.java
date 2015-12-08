// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

final class edg
    implements dup, omb
{

    icf a;
    private final dzi b = new dzi();
    private Context c;
    private gcf d;
    private dwj e;

    edg()
    {
        e = new edh(this);
    }

    private static List a(dzl dzl1)
    {
        return Collections.singletonList(dzl1.h.get(0));
    }

    public final hgo a(dum dum1)
    {
        if (d.a(dum1.a.a())) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        dzl dzl2;
        obj = a;
        b.v();
        obj = ((icf) (obj)).d.a(((icf) (obj)).c);
        switch (edl.a[((ich) (obj)).ordinal()])
        {
        default:
            dum1 = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(dum1).length() + 20)).append("Unrecognized state: ").append(dum1).toString());

        case 3: // '\003'
            break;

        case 1: // '\001'
            dzl dzl1 = (dzl)dum1.a(dzl);
            dwh dwh1 = b.a(dum1, dzl1);
            mjw mjw1 = (new mjw()).a();
            mjw1.a(16);
            mjw1.a(32768);
            mjw1.a(4);
            dwh1.p = mjw1;
            dwh1.o = true;
            dwh1.d = c.getString(b.kN);
            obj = dwh1.a(b.kO, new edk(this, ((ich) (obj))), pws.q).a(b.kP, new edj(this, ((ich) (obj))), pws.r);
            obj.k = e;
            obj.j = a(dzl1);
            return new dzg(dum1, ((dwh) (obj)).a());

        case 2: // '\002'
            dzl2 = (dzl)dum1.a(dzl);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        dwh dwh2 = b.a(dum1, dzl2);
        dwh2.k = e;
        dwh2.j = a(dzl2);
        return new dzg(dum1, dwh2.b(b.kM, new edi(this, ((ich) (obj))), pws.s).a());
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        d = (gcf)olm1.a(gcf);
        a = (icf)olm1.a(icf);
    }

    public final void a(olm olm1)
    {
    }

    public final hhg b()
    {
        return new dwm();
    }
}
