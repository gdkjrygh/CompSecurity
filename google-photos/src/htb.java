// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class htb
    implements mmu
{

    public final Context a;
    private final mmv b;
    private final noz c;

    htb(Context context, mmv mmv1)
    {
        a = context;
        b = mmv1;
        c = noz.a(context, 3, "PGOM", new String[0]);
    }

    private boolean a()
    {
        return PreferenceManager.getDefaultSharedPreferences(a).getBoolean("com.google.android.apps.photos.search.peoplegroupingonboarding.PGOM.new_user_onboarding", false);
    }

    private void d(int i)
    {
        if (c(i) == hto.b)
        {
            mtj.a(a, new htp(i, 1));
        }
    }

    public final void a(int i)
    {
        if (c.a())
        {
            noy.a(i);
            noy.a("Updating server?", Boolean.valueOf(a()));
        }
        if (a())
        {
            d(i);
        }
    }

    public final void a(int i, hto hto1)
    {
        if (c.a())
        {
            noy.a(i);
            noy.a("status", hto1);
        }
        p.a(hto1);
        b.b(i).h("com.google.android.apps.photos.search.peoplegroupingonboarding.PGOM").c("people_grouping_status", hto1.name()).d();
        d(i);
    }

    public final void b(int i)
    {
    }

    public final hto c(int i)
    {
        if (a())
        {
            return hto.b;
        } else
        {
            return hto.valueOf(b.a(i).d("com.google.android.apps.photos.search.peoplegroupingonboarding.PGOM").a("people_grouping_status", hto.a.name()));
        }
    }
}
