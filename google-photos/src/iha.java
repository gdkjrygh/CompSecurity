// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.util.List;

public final class iha extends mtf
{

    private final List a;

    public iha(List list)
    {
        super("SaveRecentAppsTask");
        a = list;
    }

    protected final mue a(Context context)
    {
        context = (igz)olm.a(context, igz);
        try
        {
            context.a(a);
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
