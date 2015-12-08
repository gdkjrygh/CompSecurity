// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mopub.mraid:
//            MraidController

final class j
    implements android.view.View.OnTouchListener
{

    final MraidController a;

    j(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return true;
    }
}
