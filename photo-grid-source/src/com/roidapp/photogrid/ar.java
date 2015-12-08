// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import com.roidapp.photogrid.a.j;
import com.roidapp.photogrid.a.l;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage, as

final class ar
    implements j
{

    final MainPage a;

    ar(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void a(l l1)
    {
        if (l1.c())
        {
            a.i.post(new as(this));
        }
    }
}
