// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            WebVideoFragment

final class tt
    implements android.view.View.OnTouchListener
{

    final WebVideoFragment a;

    tt(WebVideoFragment webvideofragment)
    {
        a = webvideofragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        WebVideoFragment.e(a);
        return false;
    }
}
