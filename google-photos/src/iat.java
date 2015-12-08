// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.photos.settings.AssistantSettingsActivity;

public final class iat extends omp
    implements nzu
{

    private final nzt a;
    private Intent b;

    public iat()
    {
        a = new nzt(this, af);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        int i = ((mmr)ae.a(mmr)).d();
        b = new Intent(O_(), com/google/android/apps/photos/settings/AssistantSettingsActivity);
        b.putExtra("account_id", i);
    }

    public final void r()
    {
        oac oac1 = new oac(ad);
        a.a(oac1.a(a(p.bm), a(p.bl), b)).b(2);
    }
}
