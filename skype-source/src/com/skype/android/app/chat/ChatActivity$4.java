// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.AudioManager;
import com.skype.android.app.Navigation;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity

final class onHandlerAdapter extends PermissionHandlerAdapter
{

    final ChatActivity this$0;

    public final void onGranted()
    {
        if (DeviceFeatures.d() && audioManager.getMode() != 3)
        {
            audioManager.setMode(3);
        }
        navigation.joinCall(ChatActivity.access$100(ChatActivity.this));
    }

    onHandlerAdapter()
    {
        this$0 = ChatActivity.this;
        super();
    }
}
