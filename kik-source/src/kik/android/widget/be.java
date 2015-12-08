// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            at, GifSearchFragment

final class be extends at
{

    final GifSearchFragment a;

    be(GifSearchFragment gifsearchfragment)
    {
        a = gifsearchfragment;
        super();
    }

    public final void a()
    {
        GifSearchFragment.a(a, true);
        GifSearchFragment.c(a);
    }

    public final void b()
    {
        GifSearchFragment.a(a, false);
        GifSearchFragment.d(a);
    }

    public final void c()
    {
        GifSearchFragment.a(a, true);
    }
}
