// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;

public final class inh extends mtf
{

    private final int a;
    private final iuj b;
    private final String c;
    private final String j;
    private final boolean k = true;
    private final boolean l = false;
    private final Point m[];
    private iul n;

    public inh(int i, iuj iuj1, String s, String s1, boolean flag, boolean flag1, Point apoint[], 
            iul iul1)
    {
        super("GetStoryTask");
        a = i;
        b = iuj1;
        c = s;
        j = s1;
        m = apoint;
        n = iul1;
    }

    protected final mue a(Context context)
    {
        Object obj;
        Object obj1;
        boolean flag;
        flag = true;
        obj1 = new ing(context, a, b, c, j, k, l, m, true, false);
        ((ing) (obj1)).d();
        if (((ing) (obj1)).l())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj = ((pbm)((ing) (obj1)).t()).a.a;
        ite.a(((pev) (obj)), b.a);
        if (!iun.a(((pev) (obj)))) goto _L2; else goto _L1
_L1:
        Object obj2 = n;
        if (((iul) (obj2)).a != null) goto _L4; else goto _L3
_L3:
        obj2.a = new iuh(((pev) (obj)));
_L5:
        obj2 = n.a;
        obj2.d = true;
        obj2.c = System.currentTimeMillis();
_L7:
        iun.a(context, a, ((pev) (obj)), true);
        context = ((Context) (obj));
_L6:
        obj = new mue(((nxx) (obj1)).l, ((nxx) (obj1)).n, null);
        obj1 = ((mue) (obj)).a();
        if (context == null || ((pev) (context)).g == null || ((pev) (context)).g.b == null)
        {
            flag = false;
        }
        ((Bundle) (obj1)).putBoolean("has_share", flag);
        return ((mue) (obj));
_L4:
        ((iul) (obj2)).a.a = ((pev) (obj));
          goto _L5
        context;
        Log.e("GetStoryTask", "Failed to insertStory", context);
        context = ((Context) (obj));
          goto _L6
_L2:
        n.a = null;
          goto _L7
        context = null;
          goto _L6
    }
}
