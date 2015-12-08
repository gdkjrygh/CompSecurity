// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;

import android.content.Context;
import com.fitbit.analytics.platforms.fitbit.d;

// Referenced classes of package com.fitbit.analytics.core:
//            Interaction, c, b

public final class com.fitbit.analytics.core.a
{
    private static class a
    {

        public static com.fitbit.analytics.core.a a = new com.fitbit.analytics.core.a();


        private a()
        {
        }
    }


    public static final String a = "FitbitAnalytics";
    private com.fitbit.analytics.platforms.fitbit.a b;
    private d c;
    private b d;

    public com.fitbit.analytics.core.a()
    {
    }

    public static com.fitbit.analytics.core.a a()
    {
        return a.a;
    }

    public static void a(Interaction.DEFAULTS defaults)
    {
        a(new Interaction(defaults));
    }

    public static void a(Interaction interaction)
    {
        interaction = new c(a().d, a().c, interaction, System.currentTimeMillis());
        a().b.a(interaction);
    }

    public static void b()
    {
        a().b.a();
    }

    public void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        d = b1;
        c = new d(b1.a());
        b = com.fitbit.analytics.platforms.fitbit.a.a(b1.a());
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public void c()
    {
        d.e();
    }

    public Context d()
    {
        return d.a();
    }
}
