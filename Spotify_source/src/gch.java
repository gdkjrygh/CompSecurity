// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class gch extends gcd
{

    private final Context a;

    public gch(Context context)
    {
        ctz.a(context);
        a = context;
    }

    public final void a()
    {
        Configuration configuration = a.getResources().getConfiguration();
        akk.d().a.a("user-locale", String.valueOf(configuration.locale));
        akk.d().a.a("font-scale", String.valueOf(configuration.fontScale));
    }
}
