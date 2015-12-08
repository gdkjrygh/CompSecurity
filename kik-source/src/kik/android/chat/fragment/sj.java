// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ImageButton;
import com.kik.g.p;
import kik.a.d.d;
import kik.a.h.e;
import kik.android.util.a;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, sk

final class sj
    implements android.view.View.OnClickListener
{

    final d a;
    final ViewPictureFragment b;

    sj(ViewPictureFragment viewpicturefragment, d d)
    {
        b = viewpicturefragment;
        a = d;
        super();
    }

    public final void onClick(View view)
    {
        if ((kik.android.chat.fragment.ViewPictureFragment.e(b) != null && ViewPictureFragment.l(b) == 4 || kik.android.chat.fragment.ViewPictureFragment.e(b) == null && ViewPictureFragment.l(b) == 7) && ViewPictureFragment.k(b) && !e.a().a(a) && !ViewPictureFragment.n(b))
        {
            b._saveButton.setClickable(false);
            kik.android.util.a.a().a(kik.android.chat.fragment.ViewPictureFragment.e(b), ViewPictureFragment.o(b), ViewPictureFragment.j(b), b.b, b.contentImageView, kik.android.chat.fragment.ViewPictureFragment.p(b), b.f).a(new sk(this));
        }
    }
}
