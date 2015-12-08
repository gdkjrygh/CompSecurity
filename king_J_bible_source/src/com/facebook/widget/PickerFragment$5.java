// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

class this._cls0
    implements com.facebook.lback
{

    final PickerFragment this$0;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (!session.isOpened())
        {
            PickerFragment.access$5(PickerFragment.this);
        }
    }

    ()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
