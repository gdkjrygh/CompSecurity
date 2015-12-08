// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.l.ab;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, ProgressDialogFragment

final class sv
    implements ProgressDialogFragment.a
{

    final ViewPictureFragment a;

    sv(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void a()
    {
        if (ViewPictureFragment.n(a))
        {
            a.j.a(ViewPictureFragment.e(a), ViewPictureFragment.o(a), ViewPictureFragment.c(a).f(), a.f);
        }
    }
}
