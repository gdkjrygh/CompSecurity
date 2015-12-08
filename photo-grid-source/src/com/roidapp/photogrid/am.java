// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import com.roidapp.photogrid.release.ap;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class am
    implements Runnable
{

    final MainPage a;

    am(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void run()
    {
        MainPage.b((new StringBuilder()).append(ap.a()).append("/Content").toString());
        MainPage.b((new StringBuilder()).append(ap.a()).append("/Filter").toString());
        MainPage.b((new StringBuilder()).append(ap.a()).append("/Crop").toString());
    }
}
