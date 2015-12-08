// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;


// Referenced classes of package kik.android.gifs.view:
//            GifView, a

final class d
    implements Runnable
{

    final a a;
    final GifView b;

    d(GifView gifview, a a1)
    {
        b = gifview;
        a = a1;
        super();
    }

    public final void run()
    {
        if (GifView.a(b) != null && a.a() != null && a.a().equals(GifView.a(b)))
        {
            b.setVisibility(0);
            b.b(a);
            a.start();
        }
    }
}
