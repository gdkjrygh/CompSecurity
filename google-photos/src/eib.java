// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

final class eib
    implements dhc, omb, opv
{

    private final eid a;
    private eie b;
    private SharedPreferences c;
    private final rx d = new eic(this);

    public eib(opd opd1, eid eid)
    {
        a = eid;
        opd1.a(this);
    }

    static eid a(eib eib1)
    {
        return eib1.a;
    }

    static void a(eib eib1, int i)
    {
        eib1.c.edit().putInt("collection_type_spinner_selection", i).apply();
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        b = new eie(context);
        c = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public final void a(rv rv1)
    {
        rv1.d(0);
        rv1.c(true);
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.d(1);
        rv1.c(false);
        rv1.a(b, d);
        rv1.b(c.getInt("collection_type_spinner_selection", 0));
    }
}
