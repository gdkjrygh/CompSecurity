// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment

class this._cls0
    implements android.view.sationCreateFragment._cls2
{

    final ConversationCreateFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        _peopleFacetSearchBar.getFocus();
        return false;
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
