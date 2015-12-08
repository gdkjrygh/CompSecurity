// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mnq
    implements mnd
{

    mnq(mnn mnn)
    {
    }

    public final String a()
    {
        return "upgrade:active_to_logged_in";
    }

    public final void a(Context context, mmz mmz1)
    {
        if (mmz1.c("active"))
        {
            mmz1.e("active");
            mmz1.b("logged_in", true);
        }
    }
}
