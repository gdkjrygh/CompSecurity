// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fws extends fud
    implements omb, opl, ops, opv
{

    private final fwt c;
    private mmr d;
    private Bundle e;

    public fws(am am, opd opd, fwt fwt1)
    {
        super(am, opd, aa.s);
        c = fwt1;
    }

    public final ei a(int i, Bundle bundle)
    {
        return new fxg(b, d.d(), bundle.getInt("extra_photo_limit"), (ekk)bundle.getParcelable("com.google.android.apps.photos.core.loader.feature_class_names"));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        d = (mmr)olm1.a(mmr);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getBundle("args");
        }
    }

    public final void a(ei ei, Object obj)
    {
        ei = (elb)obj;
        c.a(ei);
    }

    final void a(ekk ekk1, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.loader.feature_class_names", ekk1);
        bundle.putInt("extra_photo_limit", i);
        if (b.a(bundle, e))
        {
            b(e);
            return;
        } else
        {
            e = bundle;
            c(e);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBundle("args", e);
    }
}
