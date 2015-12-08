// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ti, ViewPictureFragment

final class tk
    implements Runnable
{

    final ti a;

    tk(ti ti1)
    {
        a = ti1;
        super();
    }

    public final void run()
    {
        ViewPictureFragment.a(a.a);
    }
}
