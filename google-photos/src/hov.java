// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hov
    implements hou, omb, opl, ops, opv
{

    final ar a;
    public ekq b;
    public ekp c;
    private mtj d;
    private mmr e;

    public hov(ar ar1, opd opd1)
    {
        a = ar1;
        opd1.a(this);
    }

    public void a()
    {
        (new hor()).a(a.c(), "report_abuse_dialog_tag");
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((mtj)olm1.a(mtj)).a("ReportAbuseTask", new how(this));
        e = (mmr)olm1.a(mmr);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = (ekp)bundle.getParcelable("com.google.android.apps.photos.core.media");
            b = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        }
    }

    public final void a(hoo hoo)
    {
        d.b(new hop(e.d(), b, c, hoo));
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.apps.photos.core.media", c);
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", b);
    }
}
