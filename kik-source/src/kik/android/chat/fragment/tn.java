// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.v;

// Referenced classes of package kik.android.chat.fragment:
//            tl, ViewPictureFragment

final class tn
    implements Runnable
{

    final Throwable a;
    final tl b;

    tn(tl tl1, Throwable throwable)
    {
        b = tl1;
        a = throwable;
        super();
    }

    public final void run()
    {
        if (a instanceof v)
        {
            ViewPictureFragment.g(b.a);
            return;
        } else
        {
            ViewPictureFragment.h(b.a);
            return;
        }
    }
}
