// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;

public final class epv extends fyf
{

    private epw Y;
    String a;
    private boolean b;

    public epv()
    {
    }

    static epv a(String s, String s1)
    {
        epv epv1 = new epv();
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putString("feature_name", s1);
        }
        bundle.putString("user", s);
        epv1.f(bundle);
        return epv1;
    }

    final epr a()
    {
        ctz.b(b, "Cannot call getFeaturePersistence with no feature name");
        return Y;
    }

    public final void a(Bundle bundle)
    {
        a = (String)ctz.a(((Bundle)ctz.a(g())).getString("user"));
        if (g().containsKey("feature_name"))
        {
            Y = new epw(this, (String)ctz.a(g().getString("feature_name")));
            b = true;
        }
        super.a(bundle);
    }
}
