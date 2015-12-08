// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.user.UserImageDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryHeaderView

class this._cls0
    implements android.view.
{

    final LibraryHeaderView this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PROFILE_IMAGE, ComponentType.NAVIGATION, LibraryHeaderView.access$000(LibraryHeaderView.this).getUid());
        Events.post(new DialogEvent(UserImageDialog.newInstance(LibraryHeaderView.access$000(LibraryHeaderView.this).getUid())));
    }

    ()
    {
        this$0 = LibraryHeaderView.this;
        super();
    }
}
