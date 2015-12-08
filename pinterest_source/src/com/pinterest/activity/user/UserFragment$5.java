// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.user:
//            UserFragment

class this._cls0
    implements com.pinterest.base.bscriber
{

    final UserFragment this$0;

    public void onEventMainThread(com.pinterest.api.model. )
    {
        if (.wasDeleted())
        {
             = .getPin();
            if ( == null)
            {
                 = null;
            } else
            {
                 = .getUser();
            }
            if ( != null && UserFragment.access$1000(UserFragment.this).getId().equals(.getUid()))
            {
                loadData();
                return;
            }
        }
    }

    public void onEventMainThread(com.pinterest.api.model.t t)
    {
        t = t.getUser();
        if (t == null || !UserFragment.access$900(UserFragment.this).getId().equals(t.getUid()))
        {
            return;
        } else
        {
            UserFragment.access$602(UserFragment.this, t);
            UserFragment.access$700(UserFragment.this);
            return;
        }
    }

    n()
    {
        this$0 = UserFragment.this;
        super();
    }
}
