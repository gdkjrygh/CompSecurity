// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class gfu extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a(jdy).a();
    private final ekp b;
    private final ekq c;
    private final boolean j;

    private gfu(ekp ekp1, ekq ekq, boolean flag)
    {
        super("GetMovieMediaTask");
        boolean flag1;
        if (!flag || ekp1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "movie cannot be null while in isDoorstep.");
        b = ekp1;
        c = ekq;
        j = flag;
    }

    public static gfu a(ekp ekp1, ekq ekq)
    {
        return new gfu(ekp1, ekq, true);
    }

    public static gfu a(ekq ekq)
    {
        return new gfu(null, ekq, false);
    }

    protected final mue a(Context context)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        context = (ekp)b.a(context, b).a(b, a).a();
_L3:
        mue mue1 = new mue(true);
        mue1.a().putParcelable("extra_movie_media", context);
        mue1.a().putParcelable("extra_movie_collection", c);
        mue1.a().putBoolean("extra_doorstep", j);
        return mue1;
_L2:
        try
        {
            context = (List)b.a(context, c).a(c, ekw.a, a).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_151;
        }
        context = new mue(false);
        return context;
        context = (ekp)context.get(0);
          goto _L3
    }

}
