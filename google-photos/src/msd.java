// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

public class msd
    implements omb, opl, ops, opv
{

    Context a;
    boolean b;
    private Set c;

    public msd(opd opd1)
    {
        b = true;
        opd1.a(this);
    }

    public msd(opd opd1, byte byte0)
    {
        b = true;
        opd1.a(this);
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        a = context;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getBoolean("analytics_log_impression", true);
            if (bundle.containsKey("analytics_log_impression_views"))
            {
                bundle = bundle.getIntegerArrayList("analytics_log_impression_views");
                c = new lvg();
                c.addAll(bundle);
            }
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("analytics_log_impression", b);
        if (c != null && !c.isEmpty())
        {
            bundle.putIntegerArrayList("analytics_log_impression_views", new ArrayList(c));
        }
    }
}
