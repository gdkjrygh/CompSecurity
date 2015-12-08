// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class sq
    implements android.view.View.OnClickListener
{

    final ViewPictureFragment a;

    sq(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onClick(View view)
    {
        ViewPictureFragment.f(a);
    }
}
