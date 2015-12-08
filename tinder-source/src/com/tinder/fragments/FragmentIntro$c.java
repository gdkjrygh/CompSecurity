// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package com.tinder.fragments:
//            FragmentIntro

private final class <init> extends LinkMovementMethod
{

    final FragmentIntro a;

    public final boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
label0:
        {
            if (motionevent.getAction() == 1)
            {
                int i = (int)motionevent.getX();
                int j = (int)motionevent.getY();
                int k = textview.getTotalPaddingLeft();
                int l = textview.getTotalPaddingTop();
                int i1 = textview.getScrollX();
                int j1 = textview.getScrollY();
                Layout layout = textview.getLayout();
                i = layout.getOffsetForHorizontal(layout.getLineForVertical((j - l) + j1), (i - k) + i1);
                URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(i, i, android/text/style/URLSpan);
                if (aurlspan.length != 0)
                {
                    spannable = aurlspan[0].getURL();
                    if (spannable.endsWith("#terms"))
                    {
                        textview.clearFocus();
                        if (a.d != null)
                        {
                            a.d.e();
                            return true;
                        }
                    } else
                    {
                        if (!spannable.endsWith("#privacy"))
                        {
                            break label0;
                        }
                        textview.clearFocus();
                        if (a.d != null)
                        {
                            a.d.f();
                        }
                    }
                    return true;
                }
            }
            return super.onTouchEvent(textview, spannable, motionevent);
        }
        return false;
    }

    private d(FragmentIntro fragmentintro)
    {
        a = fragmentintro;
        super();
    }

    d(FragmentIntro fragmentintro, byte byte0)
    {
        this(fragmentintro);
    }
}
