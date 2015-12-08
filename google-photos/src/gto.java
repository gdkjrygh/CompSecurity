// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

final class gto extends mtf
{

    private final gue a;

    public gto(gue gue1)
    {
        super("SaveEditTask");
        p.b(gue1, "details cannot be null");
        a = gue1;
    }

    static gud a(Context context, ekp ekp1)
    {
        return (gud)b.a(context, gud, ekp1.a());
    }

    protected final mue a(Context context)
    {
        Object obj;
        obj = a(context, a.c);
        context = (gtp)olm.a(context, gtp);
        if (!context.a(a.a, a.c))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        context = ((gud) (obj)).b(a);
_L1:
        obj = new mue(true);
        ((mue) (obj)).a().putParcelable("com.google.android.apps.photos.core.media", (Parcelable)context.a());
        return ((mue) (obj));
        try
        {
            context = ((gud) (obj)).a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new mue(0, context, null);
            context.a().putParcelable("com.google.android.apps.photos.core.media", a.c);
            return context;
        }
          goto _L1
    }

    public final String b(Context context)
    {
        gue gue1 = a;
        if (gue1.c.c() == euv.c)
        {
            return context.getString(b.ue);
        }
        if (a(context, gue1.c).c(gue1))
        {
            return context.getString(b.uf);
        } else
        {
            return context.getString(b.ub);
        }
    }
}
