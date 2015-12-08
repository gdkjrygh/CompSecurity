// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.View;
import com.skype.Conversation;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

final class this._cls0
    implements android.view.ner
{

    final InCallFragment this$0;

    public final void onClick(View view)
    {
        if (InCallFragment.access$200(InCallFragment.this).getLocalLiveStatusProp() == com.skype.L_LIVESTATUS.ON_HOLD_LOCALLY)
        {
            InCallFragment.access$300(InCallFragment.this);
        }
    }

    ()
    {
        this$0 = InCallFragment.this;
        super();
    }
}
