// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.content.Context;
import android.content.res.Resources;

// Referenced classes of package com.qihoo.security.ui.b:
//            a

class a
    implements Runnable
{

    int a[];
    final a b;

    public void run()
    {
        Resources resources;
        int ai[];
        int i;
        int j;
        int k;
        try
        {
            resources = com.qihoo.security.ui.b.a.a(b).getResources();
            ai = a;
            j = ai.length;
        }
        catch (Exception exception)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai[i];
        com.qihoo.security.ui.b.a.b(b).a(Integer.valueOf(k), resources.getDrawable(k));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
    }

    s(a a1, int ai[])
    {
        b = a1;
        super();
        a = ai;
    }
}
