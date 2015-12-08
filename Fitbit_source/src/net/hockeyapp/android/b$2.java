// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.ref.WeakReference;

// Referenced classes of package net.hockeyapp.android:
//            b, c

static final class c
    implements android.content.ogInterface.OnClickListener
{

    final WeakReference a;
    final c b;
    final boolean c;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = null;
        if (a != null)
        {
            dialoginterface = (Context)a.get();
        }
        if (dialoginterface == null)
        {
            return;
        } else
        {
            PreferenceManager.getDefaultSharedPreferences(dialoginterface).edit().putBoolean("always_send_crash_reports", true).commit();
            net.hockeyapp.android.b.b(a, b, c);
            return;
        }
    }

    e(WeakReference weakreference, c c1, boolean flag)
    {
        a = weakreference;
        b = c1;
        c = flag;
        super();
    }
}
