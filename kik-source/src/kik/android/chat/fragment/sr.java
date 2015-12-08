// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class sr
    implements android.view.View.OnTouchListener
{

    final ViewPictureFragment a;

    sr(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
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
            if (ViewPictureFragment.u(a) != null)
            {
                if (ViewPictureFragment.b(a))
                {
                    break label0;
                }
                ViewPictureFragment.u(a).show(0);
            }
            return false;
        }
        ViewPictureFragment.u(a).hide();
        return false;
    }
}
