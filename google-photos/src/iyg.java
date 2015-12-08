// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

final class iyg
    implements mud
{

    private Context a;
    private iyf b;

    iyg(iyf iyf, Context context)
    {
        b = iyf;
        a = context;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        if (mue1 != null && !mue1.c())
        {
            mue1 = b;
            PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("photos.trash.cleanup.is_completed", true).apply();
        }
    }
}
