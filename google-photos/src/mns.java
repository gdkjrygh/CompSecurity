// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mns
    implements mnd
{

    mns(mnn mnn)
    {
    }

    public final String a()
    {
        return "add_effective_gaia_id";
    }

    public final void a(Context context, mmz mmz1)
    {
        if (mmz1.c("is_managed_account"))
        {
            mmz1.b("effective_gaia_id", mmz1.b("gaia_id"));
        }
    }
}
