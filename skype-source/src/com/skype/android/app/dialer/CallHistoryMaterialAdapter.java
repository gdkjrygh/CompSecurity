// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.app.Activity;
import com.skype.android.app.Navigation;
import com.skype.android.app.recents.RecentAdapter;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;

public class CallHistoryMaterialAdapter extends RecentAdapter
{

    ConversationUtil conversationUtil;
    ObjectIdMap map;
    Navigation navigation;

    public CallHistoryMaterialAdapter(Activity activity)
    {
        super(activity);
    }

    protected int getItemLayoutId()
    {
        return 0x7f0300ee;
    }

    protected boolean useCompoundDrawables()
    {
        return false;
    }
}
