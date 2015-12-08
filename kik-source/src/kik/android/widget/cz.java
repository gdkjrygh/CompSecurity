// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package kik.android.widget:
//            cx

final class cz
    implements android.view.View.OnTouchListener
{

    final cx a;

    cz(cx cx1)
    {
        a = cx1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.dismiss();
        return true;
    }
}
