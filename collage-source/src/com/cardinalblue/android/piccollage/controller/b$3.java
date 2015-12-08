// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.view.g;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            b

class a
    implements i
{

    final b a;

    public Bitmap a(j j1)
        throws Exception
    {
        Bitmap bitmap = (Bitmap)j1.e();
        j1 = bitmap;
        if (bitmap == null)
        {
            j1 = ((g)a.a).m();
        }
        try
        {
            j1 = b.a(a, j1.copy(android.graphics.ap.Config.ARGB_8888, false));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new com.cardinalblue.android.piccollage.model.<init>(j1);
        }
        return j1;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
