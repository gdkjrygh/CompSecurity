// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class sh
    implements android.view.View.OnClickListener
{

    final ViewPictureFragment a;

    sh(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new Bundle();
        view.putString("photoUrl", ViewPictureFragment.j(a));
        a.a(view);
        a.J();
    }
}
