// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class idh extends mtf
{

    private final int a;

    public idh(int i)
    {
        super("com.google.android.apps.photos.settings.storage.SettingsRefreshTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        mtj.b(context, new htp(a, 2));
        context = (idi)olm.a(context, idi);
        try
        {
            context.c(a);
            context = new mue(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }
}
