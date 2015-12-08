// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class nzt
    implements omb, opt, opv
{

    private nzu a;
    private final qwc b = null;
    private oau c;
    private PreferenceScreen d;
    private boolean e;

    public nzt(nzu nzu1, opd opd1)
    {
        c = null;
        e = false;
        a = nzu1;
        opd1.a(this);
    }

    public final void X_()
    {
        if (c != null)
        {
            PreferenceScreen preferencescreen = c.b();
            d = preferencescreen;
            if (!e)
            {
                a.r();
            }
            e = true;
            return;
        } else
        {
            throw new NullPointerException();
        }
    }

    public final nzw a(nzw nzw)
    {
        d.b(nzw);
        return nzw;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (oau)olm1.a(oau);
    }
}
