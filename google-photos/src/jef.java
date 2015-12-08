// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;

public final class jef
    implements dhf, omb, opv
{

    private Context a;
    private grn b;

    public jef()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = (grn)olm1.a(grn);
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag = true;
        boolean flag1 = euv.c.equals(b.b.c());
        menuitem.setVisible(flag1);
        if (!flag1 || !PreferenceManager.getDefaultSharedPreferences(a).getBoolean("com.google.android.apps.photos.videoplayer.loop_video", true))
        {
            flag = false;
        }
        menuitem.setChecked(flag);
    }

    public final void b(MenuItem menuitem)
    {
        boolean flag;
        if (!menuitem.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setChecked(flag);
        PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("com.google.android.apps.photos.videoplayer.loop_video", flag).apply();
    }
}
