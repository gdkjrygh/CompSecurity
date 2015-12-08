// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fph extends fyl
{

    public fph()
    {
    }

    public static fph a(String s, Flags flags)
    {
        fph fph1 = new fph();
        Bundle bundle = new Bundle();
        bundle.putString("license_url", s);
        fph1.f(bundle);
        fyw.a(fph1, flags);
        return fph1;
    }

    protected final void a()
    {
        c(g().getString("license_url"));
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        s();
    }
}
