// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class elp
{

    private static String a = "overview";
    private eln b;

    public elp(elq elq)
    {
        b = new eln(elq);
    }

    public final void a(Context context, int i, String s, String s1)
    {
        String s2;
        if ("new_releases".equals(s))
        {
            s2 = "spotify:app:browse:new_releases";
            s = gms.a(context, "spotify:app:browse:new_releases").a(s1).a;
        } else
        {
            s2 = ekw.a(s);
            Intent intent = gms.a(context, s2).a((new StringBuilder()).append(s1).append(" \u2014 ").append(context.getString(0x7f0800dd)).toString()).a;
            intent.putExtra("genre", s);
            intent.putExtra("eternalScroll", true);
            s = intent;
        }
        context.startActivity(s);
        b.a(context, i, s1, s2, a);
    }
}
