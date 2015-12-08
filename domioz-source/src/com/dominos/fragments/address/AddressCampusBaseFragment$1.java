// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.dominos.fragments.address:
//            AddressCampusBaseFragment

class this._cls0
    implements android.view.usBaseFragment._cls1
{

    final AddressCampusBaseFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        mRoomEntry.setCursorVisible(true);
        return false;
    }

    ()
    {
        this$0 = AddressCampusBaseFragment.this;
        super();
    }
}
