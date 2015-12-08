// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

final class ept
    implements epv, omb, opv
{

    private mmr a;
    private final Activity b;
    private Context c;

    public ept(Activity activity, opd opd1)
    {
        b = activity;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        a = (mmr)olm1.a(mmr);
    }

    public final void a(ekp ekp, ekq ekq)
    {
        int i = a.d();
        ekp = (new gne(c, i)).a(ekq).a(ekp).a;
        b.startActivity(ekp);
    }
}
