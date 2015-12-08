// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.kik.android.c.b;

public final class ci extends LinkMovementMethod
{

    private static ci a;

    private ci()
    {
    }

    public static MovementMethod a()
    {
        if (a == null)
        {
            a = new ci();
        }
        return a;
    }

    public final boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i == 1 || i == 0)
        {
            int j = (int)motionevent.getX();
            int k = (int)motionevent.getY();
            int l = textview.getTotalPaddingLeft();
            int i1 = textview.getTotalPaddingTop();
            int j1 = textview.getScrollX();
            int k1 = textview.getScrollY();
            Layout layout = textview.getLayout();
            j = layout.getOffsetForHorizontal(layout.getLineForVertical((k - i1) + k1), (j - l) + j1);
            b ab[] = (b[])spannable.getSpans(j, j, com/kik/android/c/b);
            if (ab.length != 0)
            {
                if (i == 1)
                {
                    ab[0].a();
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textview, spannable, motionevent);
    }
}
