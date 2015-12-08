// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            tl, ViewPictureFragment

final class tm
    implements Runnable
{

    final tl a;

    tm(tl tl1)
    {
        a = tl1;
        super();
    }

    public final void run()
    {
        ViewPictureFragment.f(a.a);
    }
}
