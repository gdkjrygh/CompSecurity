// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.View;

// Referenced classes of package com.skype.android.app.calling:
//            CallActivity, InCallFragment

final class val.fragment
    implements android.view.tener
{

    final CallActivity this$0;
    final InCallFragment val$fragment;

    public final void onClick(View view)
    {
        if (val$fragment != null)
        {
            val$fragment.hideRoster();
        }
    }

    ()
    {
        this$0 = final_callactivity;
        val$fragment = InCallFragment.this;
        super();
    }
}
