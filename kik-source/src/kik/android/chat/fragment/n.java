// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kik.android.c.a;
import kik.android.e.c;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class n
    implements android.view.View.OnTouchListener
{

    final CameraFragment a;

    n(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag = CameraFragment.r(a).a(motionevent);
        if (motionevent.getAction() == 1 && !CameraFragment.i(a) && !flag && kik.android.chat.fragment.CameraFragment.c(a).a())
        {
            android.widget.FrameLayout.LayoutParams layoutparams;
            BitmapDrawable bitmapdrawable;
            int i;
            int j;
            if (CameraFragment.n(a))
            {
                CameraFragment.u(a);
            } else
            {
                CameraFragment.v(a);
            }
            layoutparams = (android.widget.FrameLayout.LayoutParams)a._touchFocusImage.getLayoutParams();
            bitmapdrawable = (BitmapDrawable)a.getResources().getDrawable(0x7f0202e1);
            i = bitmapdrawable.getBitmap().getWidth() / 2;
            j = bitmapdrawable.getBitmap().getHeight() / 2;
            layoutparams.leftMargin = ((int)motionevent.getX() + view.getLeft()) - i;
            layoutparams.topMargin = ((int)motionevent.getY() + view.getTop()) - j;
            layoutparams.rightMargin = -250;
            layoutparams.bottomMargin = -250;
            a._touchFocusImage.setLayoutParams(layoutparams);
            a._touchFocusImage.bringToFront();
            kik.android.chat.fragment.CameraFragment.a(a, motionevent.getX() + (float)view.getLeft(), motionevent.getY() + (float)view.getTop());
        }
        return true;
    }
}
