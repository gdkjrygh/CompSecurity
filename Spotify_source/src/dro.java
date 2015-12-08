// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class dro
    implements PorcelainMetricsLogger
{

    private final Context b;
    private final gjn c;

    public dro(Context context, gjn gjn1)
    {
        b = (Context)ctz.a(context);
        c = (gjn)ctz.a(gjn1);
    }

    public final void a()
    {
        dmz.a(fop);
        Context context = b;
        String s = c.v_().toString();
        String s1 = com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.ImpressionType.a.toString();
        gcf gcf1 = gcf.a;
        fop.a(context, new dnn(s, -1L, -1L, s1, gcf.a()));
    }

    public final void a(String s, com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.InteractionType interactiontype, com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.InteractionAction interactionaction, drp drp1)
    {
        dmz.a(fop);
        Context context = b;
        String s1 = drp1.b;
        String s2 = c.v_().toString();
        String s3 = drp1.c;
        long l = drp1.e;
        long l1 = drp1.d;
        interactiontype = interactiontype.toString();
        interactionaction = interactionaction.toString();
        drp1 = gcf.a;
        fop.a(context, new dnp(s1, s2, s3, l, l1, s, interactiontype, interactionaction, gcf.a()));
    }
}
