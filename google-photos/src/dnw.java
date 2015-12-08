// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class dnw
    implements dle
{

    private final eto a;

    dnw(Context context)
    {
        a = (eto)olm.a(context, eto);
    }

    public final void a(ekq ekq, hpk hpk1)
    {
        if (ekq instanceof dnx)
        {
            ekq = (dnx)ekq;
            int i = ((dnx) (ekq)).c;
            p.a(hpk1.a(), "Must set a mediaKey");
            ekq = ((dnx) (ekq)).a;
            qgg qgg1 = new qgg();
            qgg1.c = new qeq();
            qgg1.b = new qeo();
            qgg1.b.a = hpk1.c;
            a.a(i, ekq, new qgg[] {
                qgg1
            }, true);
        } else
        if (!(ekq instanceof dnd) && !(ekq instanceof dke))
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 33)).append("Unexpected MediaCollection type: ").append(ekq).toString());
        }
    }
}
