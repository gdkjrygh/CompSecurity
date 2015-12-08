// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.popover;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.pinterest.ui.popover:
//            DismissingTouchEater

class val.finishOnTouchOutside
    implements android.view.ouchEater._cls1
{

    final DismissingTouchEater this$0;
    final boolean val$finishOnTouchOutside;

    public void onClick(View view)
    {
        if (val$finishOnTouchOutside)
        {
            ((Activity)view.getContext()).onBackPressed();
        }
    }

    ()
    {
        this$0 = final_dismissingtoucheater;
        val$finishOnTouchOutside = Z.this;
        super();
    }
}
