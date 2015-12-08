// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class td
    implements android.view.View.OnClickListener
{

    final ViewPictureFragment a;

    td(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void onClick(View view)
    {
        if (a.getActivity() != null)
        {
            view = a;
            boolean flag;
            if (!ViewPictureFragment.b(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewPictureFragment.b(view, flag);
        }
    }
}
