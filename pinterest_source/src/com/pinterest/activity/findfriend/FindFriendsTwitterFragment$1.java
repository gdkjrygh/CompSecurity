// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.os.Handler;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsTwitterFragment

class this._cls0
    implements com.pinterest.base.tterFragment._cls1
{

    final FindFriendsTwitterFragment this$0;

    public void onEventMainThread(com.pinterest.base.tterFragment._cls1 _pcls1)
    {
        if (_pcls1.() != com.pinterest.base. || !refreshState())
        {
            return;
        } else
        {
            class _cls1
                implements Runnable
            {

                final FindFriendsTwitterFragment._cls1 this$1;

                public void run()
                {
                    loadData();
                }

            _cls1()
            {
                this$1 = FindFriendsTwitterFragment._cls1.this;
                super();
            }
            }

            _handler.postDelayed(new _cls1(), 2000L);
            return;
        }
    }

    _cls1()
    {
        this$0 = FindFriendsTwitterFragment.this;
        super();
    }
}
