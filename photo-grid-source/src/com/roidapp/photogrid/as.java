// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import com.roidapp.photogrid.a.d;

// Referenced classes of package com.roidapp.photogrid:
//            ar, MainPage, at

final class as
    implements Runnable
{

    final ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void run()
    {
        try
        {
            MainPage.x(a.a).a(new at(this));
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
