// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            sx, ViewPictureFragment

final class sz
    implements Runnable
{

    final sx a;

    sz(sx sx1)
    {
        a = sx1;
        super();
    }

    public final void run()
    {
        ViewPictureFragment.a(a.a, true);
        ViewPictureFragment.a(a.a);
    }
}
