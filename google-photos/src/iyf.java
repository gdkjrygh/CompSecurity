// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public final class iyf
    implements omb, opt, opv
{

    private Context a;
    private mmv b;
    private mtj c;

    public iyf(opd opd1)
    {
        opd1.a(this);
    }

    public final void X_()
    {
        if (PreferenceManager.getDefaultSharedPreferences(a).getBoolean("photos.trash.cleanup.is_completed", false) || c.a("LocalTrashCleanupTask"))
        {
            return;
        } else
        {
            c.a(new iyh(b));
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = (mmv)olm1.a(mmv);
        c = ((mtj)olm1.a(mtj)).a("LocalTrashCleanupTask", new iyg(this, context));
    }
}
