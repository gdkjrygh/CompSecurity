// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import kik.android.gifs.a.b;

// Referenced classes of package kik.android.widget:
//            bk, GifSearchFragment

final class bl
    implements Runnable
{

    final bk a;

    bl(bk bk1)
    {
        a = bk1;
        super();
    }

    public final void run()
    {
        a.c.a(GifWidget.a.g);
        a.c.h().a("GIF_RESULT_KEY");
    }
}
