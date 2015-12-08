// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.photos.settings.PhotosTracingSettingsActivity;

public final class ibn extends omp
    implements nzu
{

    Intent a;
    int b;
    private oac c;

    public ibn()
    {
        new nzt(this, af);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = bundle.getInt("account_id");
            a = (Intent)bundle.getParcelable("developer_settings_intent");
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("account_id", b);
        bundle.putParcelable("developer_settings_intent", a);
    }

    public final void r()
    {
        c = new oac(ad);
        Intent intent = new Intent(ad, com/google/android/apps/photos/settings/PhotosTracingSettingsActivity);
        intent.putExtra("account_id", b);
        a.putExtra("args_show_tracing_pref", intent);
        c.a(a(p.aZ), a);
    }
}
