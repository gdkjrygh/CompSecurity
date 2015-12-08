// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

public final class this._cls0
    implements android.view.layHeaderListLayout._cls5
{

    final PlayHeaderListLayout this$0;

    public final boolean onHover(View view, MotionEvent motionevent)
    {
        view = PlayHeaderListLayout.this;
        return ((PlayHeaderListLayout) (view)).mControlsAreFloating || ((PlayHeaderListLayout) (view)).mAlwaysUseFloatingBackground;
    }

    public ()
    {
        this$0 = PlayHeaderListLayout.this;
        super();
    }
}
