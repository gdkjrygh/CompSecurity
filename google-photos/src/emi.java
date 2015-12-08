// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class emi extends fud
    implements opl, ops, opv
{

    private final emj c;
    private Bundle d;

    public emi(am am, opd opd, int i, emj emj1)
    {
        super(am, opd, i);
        c = emj1;
    }

    public emi(ar ar, opd opd, int i, emj emj1)
    {
        super(ar, opd, i);
        c = emj1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new emh(b, (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection"), (ekk)bundle.getParcelable("com.google.android.apps.photos.core.loader.feature_class_names"));
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
        c.a(ei);
    }

    public final void a(ekq ekq1, ekk ekk1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
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
