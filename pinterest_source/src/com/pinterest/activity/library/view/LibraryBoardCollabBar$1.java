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
//            LibraryBoardCollabBar

class val.user
    implements android.view.ibraryBoardCollabBar._cls1
{

    final LibraryBoardCollabBar this$0;
    final User val$user;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.USER, val$user));
    }

    A()
    {
        this$0 = final_libraryboardcollabbar;
        val$user = User.this;
        super();
    }
}
