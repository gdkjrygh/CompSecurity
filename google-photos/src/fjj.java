// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class fjj
    implements hqh
{

    private mmv a;
    private myf b;

    fjj(Context context)
    {
        a = (mmv)olm.a(context, mmv);
        b = (myf)olm.a(context, myf);
    }

    public final String a()
    {
        return "ExperimentSyncJob";
    }

    public final void a(int i, hqo hqo)
    {
        String s;
        for (hqo = a.a(new String[] {
    "logged_in"
}).iterator(); hqo.hasNext(); b.a(s))
        {
            i = ((Integer)hqo.next()).intValue();
            s = a.a(i).b("account_name");
        }

    }

    public final String b()
    {
        return "com.google.android.apps.photos.experiments.ExperimentSyncJob";
    }

    public final long c()
    {
        return TimeUnit.HOURS.toMillis(24L);
    }
}
