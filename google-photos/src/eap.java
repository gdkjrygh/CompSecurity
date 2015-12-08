// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class eap
    implements dwj
{

    private final mmr a;
    private final eas b;

    eap(Context context)
    {
        a = (mmr)olm.a(context, mmr);
        b = (eas)olm.a(context, eas);
    }

    public final void a(Context context, View view, ekq ekq, ekp ekp)
    {
        context = b;
        int i = a.d();
        context.d = ekp;
        context.e = null;
        context.f = null;
        ((eas) (context)).c.b(eas.a);
        ((eas) (context)).c.b("LoadPagerMediaTask");
        ((eas) (context)).c.a(new elc(ekq, eas.b, b.kG));
        if (ekp != null)
        {
            ((eas) (context)).c.a(new ear(i, ekp, ekq));
        }
    }
}
