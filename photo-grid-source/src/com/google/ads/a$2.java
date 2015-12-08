// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.ads:
//            a

final class nit>
    implements Callable
{

    final ArrayList a;
    final Context b;
    final String c;

    public final a a()
    {
        String as[] = new String[a.size()];
        int i = 0;
_L4:
        if (i >= a.size())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        as[i] = (String)((Future)a.get(i)).get();
        if (as[i] == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_80;
        a a1 = new a(b, c, as);
        return a1;
        Object obj;
        obj;
_L2:
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object call()
    {
        return a();
    }

    text(ArrayList arraylist, Context context, String s)
    {
        a = arraylist;
        b = context;
        c = s;
        super();
    }
}
