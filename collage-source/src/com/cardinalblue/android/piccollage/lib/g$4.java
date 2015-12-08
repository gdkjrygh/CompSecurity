// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            g

class a
    implements Callable
{

    final Bitmap a;
    final g b;

    public File a()
        throws Exception
    {
        File file;
        try
        {
            file = k.a(a, "png");
        }
        catch (AssertionError assertionerror)
        {
            throw new com.cardinalblue.android.piccollage.model.<init>(assertionerror);
        }
        return file;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    a(g g1, Bitmap bitmap)
    {
        b = g1;
        a = bitmap;
        super();
    }
}
