// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import com.roidapp.imagelib.ImageLibrary;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class al
    implements Runnable
{

    final String a;
    final MainPage b;

    al(MainPage mainpage, String s)
    {
        b = mainpage;
        a = s;
        super();
    }

    public final void run()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(a);
        ImageLibrary.a();
        MainPage.b(stringbuilder.append(ImageLibrary.b()).toString());
        stringbuilder = (new StringBuilder()).append(a);
        ImageLibrary.a();
        MainPage.b(stringbuilder.append(ImageLibrary.c()).toString());
        stringbuilder = (new StringBuilder()).append(a);
        ImageLibrary.a();
        MainPage.b(stringbuilder.append(ImageLibrary.e()).toString());
        stringbuilder = (new StringBuilder()).append(a);
        ImageLibrary.a();
        MainPage.b(stringbuilder.append(ImageLibrary.f()).toString());
        MainPage.O(b);
    }
}
