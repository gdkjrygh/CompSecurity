// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import kik.a.d.a.a;
import kik.android.util.by;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class si
    implements android.view.View.OnClickListener
{

    final ViewPictureFragment a;

    si(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onClick(View view)
    {
        if (ViewPictureFragment.k(a) && ViewPictureFragment.l(a) == 4)
        {
            if (ViewPictureFragment.m(a) != null)
            {
                ViewPictureFragment.b(a, ViewPictureFragment.m(a));
                view = ViewPictureFragment.b(0x7f09035d);
                a._saveButton.setImageResource(0x7f02024d);
                a._saveButton.setClickable(false);
                by.a(a.f, true, ViewPictureFragment.e(a).u(), true, false);
            } else
            {
                view = ViewPictureFragment.b(0x7f090204);
                by.a(a.f, false, ViewPictureFragment.e(a).u(), true, false);
            }
            Toast.makeText(a._saveButton.getContext(), view, 0).show();
        }
    }
}
