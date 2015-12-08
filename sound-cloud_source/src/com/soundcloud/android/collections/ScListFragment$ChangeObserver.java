// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.soundcloud.android.collections:
//            ScListFragment

private class this._cls0 extends ContentObserver
{

    final ScListFragment this$0;

    public boolean deliverSelfNotifications()
    {
        return true;
    }

    public void onChange(boolean flag)
    {
        if (ScListFragment.access$400(ScListFragment.this) != null)
        {
            onContentChanged();
        }
    }

    public ()
    {
        this$0 = ScListFragment.this;
        super(new Handler());
    }
}
