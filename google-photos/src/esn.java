// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;

public final class esn
    implements mti, omb, opr, opv
{

    private eso a;
    private mtj b;
    private Context c;
    private String d;

    public esn(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        a = (eso)olm1.b(eso);
        b = (mtj)olm1.a(mtj);
        b.a(this);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (a == null || TextUtils.isEmpty(d) || !d.equals(s) || mue1.c()) 
        {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(c).edit().putBoolean("com.google.android.apps.photos.database.DatabaseFileCleanerMixin.completed", true).apply();
    }

    public final void al_()
    {
        if (a != null && !PreferenceManager.getDefaultSharedPreferences(c).getBoolean("com.google.android.apps.photos.database.DatabaseFileCleanerMixin.completed", false))
        {
            mtf mtf1 = (mtf)p.a(a.b());
            d = (String)p.a(a.a());
            if (!b.a(d))
            {
                b.a(mtf1);
                return;
            }
        }
    }
}
