// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.view.ViewGroup;
import com.kik.g.p;
import kik.android.b.g;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, sg

final class sf
    implements android.view.View.OnClickListener
{

    final ViewPictureFragment a;

    sf(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new g();
        com.kik.f.a.a.a a1 = ViewPictureFragment.i(a).a();
        view.a(a.openButton.getContext(), a1, com.kik.ui.fragment.FragmentBase.a.a.a).a(new sg(this));
    }
}
