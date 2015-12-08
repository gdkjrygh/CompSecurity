// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryHeaderMetaDataBar

class this._cls0
    implements android.view.aryHeaderMetaDataBar._cls2
{

    final LibraryHeaderMetaDataBar this$0;

    public void onClick(View view)
    {
        if (LibraryHeaderMetaDataBar.access$000(LibraryHeaderMetaDataBar.this) != null)
        {
            Events.post(new Navigation(Location.USER_LIBRARY_FOLLOWING, LibraryHeaderMetaDataBar.access$000(LibraryHeaderMetaDataBar.this).getUid()));
        }
    }

    ()
    {
        this$0 = LibraryHeaderMetaDataBar.this;
        super();
    }
}
