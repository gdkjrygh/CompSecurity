// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

final class eol
    implements mpj
{

    private final int a;
    private final Context b;
    private final mpk c;
    private final ekb d;
    private final eox e;

    public eol(Context context, int i)
    {
        b = context;
        a = i;
        c = (mpk)olm.a(context, mpk);
        c.a(i, this);
        d = (ekb)olm.a(context, ekb);
        e = (eox)olm.a(context, eox);
    }

    public final void a(int i, Intent intent)
    {
        if (i != -1)
        {
            return;
        } else
        {
            d.b();
            e.a(b, intent);
            return;
        }
    }

    public final void a(Activity activity, Intent intent)
    {
        c.a(a, intent);
        activity.overridePendingTransition(b.mk, 0);
    }
}
