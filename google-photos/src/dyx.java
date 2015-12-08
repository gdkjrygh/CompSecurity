// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class dyx
    implements nus, omb, opt, opu, opv
{

    private mtj a;
    private am b;
    private nur c;
    private Context d;
    private olm e;

    dyx(am am1, opd opd1)
    {
        b = am1;
        opd1.a(this);
    }

    public final void V_()
    {
        c.b(this);
    }

    public final void X_()
    {
        c.a(this);
    }

    public final String a()
    {
        return "OfflineRetryTagAddStoriesCard";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mtj)olm1.a(mtj);
        c = (nur)olm1.a(nur);
        d = context;
        e = olm1;
    }

    public final void a(nup nup1, ekq ekq1, long l)
    {
        if (!b.w(d))
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
            bundle.putLong("OfflineRetryExtraStableId", l);
            bundle.putString("OfflineRetryExtraAction", nup1.name());
            ekq1 = b.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup1;
            nuq1.c = "OfflineRetryTagAddStoriesCard";
            nuq1.b = bundle;
            nuq1.e = true;
            nuo.a(ekq1, nuq1);
            return;
        }
        if (l != -1L)
        {
            ((eeq)e.a(eeq)).a(l);
        }
        a.a(new gsm(ekq1));
    }

    public final void c_(Bundle bundle)
    {
        ekq ekq1 = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        long l = bundle.getLong("OfflineRetryExtraStableId");
        a(nup.valueOf(bundle.getString("OfflineRetryExtraAction")), ekq1, l);
    }
}
