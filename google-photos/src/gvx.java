// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gvx
{

    gvx()
    {
    }

    static ekp a(Context context, int i, ekq ekq, hpk hpk)
    {
        context = (fkw)b.a(context, fkw, ekq);
        try
        {
            context = (ekp)context.a(i, ekq, hpk).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new gwa("Failed to find saved media", context);
        }
        return context;
    }
}
