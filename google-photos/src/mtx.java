// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

final class mtx extends mtf
{

    public mtx()
    {
        super("SaveResultsTask");
    }

    public final mue a(Context context)
    {
        context = (mty)olm.a(context, mty);
        ((mty) (context)).f.c();
        PreferenceManager.getDefaultSharedPreferences(((mty) (context)).a).edit().putInt("bom_last_listener_id", ((mty) (context)).g).apply();
        return new mue(true);
    }
}
