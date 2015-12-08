// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.skype.android.app.vim:
//            FilterRosterView

final class val.this._cls0 extends ViewOutlineProvider
{

    final val.this._cls0 this$1;
    final FilterRosterView val$this$0;

    public final void getOutline(View view, Outline outline)
    {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }

    ()
    {
        this$1 = final_;
        val$this$0 = FilterRosterView.this;
        super();
    }
}
