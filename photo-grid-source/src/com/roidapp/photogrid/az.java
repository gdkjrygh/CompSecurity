// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;


// Referenced classes of package com.roidapp.photogrid:
//            MainPage

public final class az
    implements Runnable
{

    final MainPage a;

    public az(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void run()
    {
        MainPage.y(a);
    }
}
