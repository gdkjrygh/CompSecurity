// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gio extends mtf
{

    public gio()
    {
        super("RefreshDeviceAccountsTask");
    }

    protected final mue a(Context context)
    {
        context = (moo)olm.a(context, moo);
        try
        {
            context.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return new mue(true);
    }
}
