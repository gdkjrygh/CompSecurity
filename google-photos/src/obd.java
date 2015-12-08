// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class obd extends omp
    implements nzu
{

    public String a;
    public Intent b;
    private oac c;

    public obd()
    {
        new nzt(this, af);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            a = bundle.getString("go_to_about_text");
            b = (Intent)bundle.getParcelable("go_to_about_intent");
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("go_to_about_text", a);
        bundle.putParcelable("go_to_about_intent", b);
    }

    public final void r()
    {
        c = new oac(ad);
        c.a(s.cn).b(c.a(a, null, b));
    }
}
