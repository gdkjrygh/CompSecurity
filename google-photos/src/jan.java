// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;

class jan
    implements izq, izt
{

    Context a;
    private Uri b;
    private final izu c;

    jan(Context context, Uri uri)
    {
        a = context;
        b = uri;
        c = (izu)olm.a(context, izu);
    }

    private void d()
    {
        izu izu1 = c;
        b.v();
        boolean flag;
        if ((int)((izu1.c.b() * 100L) / izu.a) >= 90)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b("com.google.android.apps.photos.trash.local.assistant.shouldShowCard");
            return;
        } else
        {
            c();
            return;
        }
    }

    public final void a()
    {
        d();
    }

    boolean a(String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(a).getBoolean(s, false);
    }

    public final void b()
    {
        d();
    }

    void b(String s)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(a);
        if (!sharedpreferences.getBoolean(s, false))
        {
            sharedpreferences.edit().putBoolean(s, true).apply();
        }
        a.getContentResolver().notifyChange(b, null);
    }

    final void c()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(a);
        if (sharedpreferences.getBoolean("com.google.android.apps.photos.trash.local.assistant.shouldShowCard", false))
        {
            sharedpreferences.edit().remove("com.google.android.apps.photos.trash.local.assistant.shouldShowCard").remove("com.google.android.apps.photos.trash.local.assistant.shouldShow").remove("com.google.android.apps.photos.trash.local.assistant.hasShown").apply();
            a.getContentResolver().notifyChange(b, null);
        }
    }
}
