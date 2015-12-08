// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            rl

final class rn
    implements android.view.View.OnTouchListener
{

    final int a;
    final rl b;

    rn(rl rl1, int i)
    {
        b = rl1;
        a = i;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return rl.a(b).a(motionevent, a);
    }
}
