// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class emq extends fud
    implements opl, ops, opv
{

    private final emr c;
    private Bundle d;

    public emq(am am, opd opd, emr emr1, int i)
    {
        super(am, opd, i);
        c = emr1;
    }

    public emq(ar ar, opd opd, emr emr1, int i)
    {
        super(ar, opd, i);
        c = emr1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new emp(a, (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection"), (ekw)bundle.getParcelable("com.google.android.apps.photos.core.query_options"), (ekk)bundle.getParcelable("com.google.android.apps.photos.core.loader.feature_class_names"));
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBundle("args");
        }
    }

    public final void a(ei ei, Object obj)
    {
        ei = (elb)obj;
        c.b(ei);
    }

    public final void a(ekq ekq1, ekw ekw1, ekk ekk1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
        bundle.putParcelable("com.google.android.apps.photos.core.query_options", ekw1);
        bundle.putParcelable("com.google.android.apps.photos.core.loader.feature_class_names", ekk1);
        if (b.a(bundle, d))
        {
            b(d);
            return;
        } else
        {
            d = bundle;
            c(d);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBundle("args", d);
    }
}
