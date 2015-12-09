// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.o;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            u

class a
    implements Callable
{

    final u a;

    public Void a()
        throws Exception
    {
        if (a.a == null || ((o)a.a).m() == null)
        {
            throw new IOException("the image scrap and drawable should not be null");
        }
        java.io.File file = k.a(((o)a.a).m(), "png");
        if (file == null)
        {
            throw new IOException("the image scrap's bitmap can't save into a file");
        } else
        {
            ((o)a.a).a(file);
            return null;
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (u u1)
    {
        a = u1;
        super();
    }
}
