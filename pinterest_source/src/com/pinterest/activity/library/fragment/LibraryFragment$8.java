// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0 extends com.pinterest.api.remote.ponse
{

    final LibraryFragment this$0;

    public void onSuccess(User user)
    {
        LibraryFragment.access$302(LibraryFragment.this, user);
        LibraryFragment.access$1300(LibraryFragment.this);
        LibraryFragment.access$2502(LibraryFragment.this, true);
        LibraryFragment.access$2400(LibraryFragment.this);
    }

    ()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
