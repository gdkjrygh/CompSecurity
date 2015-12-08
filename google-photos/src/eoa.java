// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public final class eoa
    implements dho, omb, opv
{

    private final Activity a;
    private final am b = null;
    private mmr c;
    private ekb d;
    private eol e;
    private ekq f;

    public eoa(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    public final void a()
    {
        int i = c.d();
        eoc eoc1 = new eoc(a, i);
        eoc1.a = true;
        eoc1.c = d.a();
        if (f != null && epd.a(f))
        {
            eoc1.d = new epd(f);
        }
        eol eol1 = e;
        if (a != null)
        {
            Activity activity = a;
            eol1.a(activity, eoc1.a());
            return;
        } else
        {
            throw new NullPointerException();
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (ekb)olm1.a(ekb);
        c = (mmr)olm1.a(mmr);
        e = new eol(context, s.i);
        context = (ejz)olm1.b(ejz);
        if (context != null)
        {
            f = context.b();
        }
    }
}
