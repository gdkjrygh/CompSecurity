// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsFragment

class this._cls0
    implements com.pinterest.base.tsFragment._cls2
{

    final UploadContactsFragment this$0;

    public void onEventMainThread(loadContactsDismissEvent loadcontactsdismissevent)
    {
        UploadContactsFragment.access$000(UploadContactsFragment.this);
        Events.removeStickyEvent(loadcontactsdismissevent);
    }

    loadContactsDismissEvent()
    {
        this$0 = UploadContactsFragment.this;
        super();
    }
}
