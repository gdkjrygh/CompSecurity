// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hia extends mtf
{

    private final int a;
    private final ekp b;
    private final ekq c;

    public hia(int i, ekp ekp, ekq ekq)
    {
        super("SetAlbumCoverTask");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Invalid account id.");
        a = i;
        b = ekp;
        c = ekq;
    }

    protected final mue a(Context context)
    {
        String s;
        String s1;
        hks hks1;
        try
        {
            s = b.a(b, c, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        s1 = b.b(c);
        hks1 = new hks(context, a, s, s1);
        hks1.d();
        if (hks1.l())
        {
            hks1.d("SetAlbumCoverTask");
            return new mue(((nxx) (hks1)).l, ((nxx) (hks1)).n, ((nxx) (hks1)).m);
        } else
        {
            mtj.b(context, new hlv(a, s1, s));
            return new mue(true);
        }
    }
}
