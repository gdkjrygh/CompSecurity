// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.core.b;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.savedstate.ServerSavedState;
import java.util.UUID;

public class a
    implements b
{

    private Context a;
    private UUID b;

    public a()
    {
        a = FitBitApplication.a().getApplicationContext();
    }

    public Context a()
    {
        return a;
    }

    public String b()
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            return profile.F();
        } else
        {
            return null;
        }
    }

    public UUID c()
    {
        if (b == null)
        {
            e();
        }
        return b;
    }

    public String d()
    {
        String s = ServerSavedState.h();
        if (s.equalsIgnoreCase("https://android-api.fitbit.com"))
        {
            return "prod";
        }
        if (s.contains("qa1"))
        {
            return "qa1";
        }
        if (s.contains("qa2"))
        {
            return "qa2";
        }
        if (s.contains("qa3"))
        {
            return "qa3";
        } else
        {
            return "local";
        }
    }

    public void e()
    {
        b = UUID.randomUUID();
    }
}
