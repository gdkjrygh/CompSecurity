// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PI;
import android.content.SharedPreferences;
import android.view.View;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.ui.ChatCameraButton;
import com.snapchat.android.ui.here.HereTooltip;
import com.snapchat.videochat.view.HoldToStreamView;
import com.snapchat.videochat.view.StreamView;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class b
    implements android.view.Listener
{

    private boolean a;
    private boolean b;
    private ChatFragment c;

    public final boolean onLongClick(View view)
    {
        if (ChatFragment.o(c).c || ChatFragment.o(c).a || ChatFragment.o(c).b)
        {
            return false;
        }
        if (a && !HoldToStreamView.i)
        {
            c.u();
            ((StreamView)c.g.a()).c();
            view = ChatFragment.u(c).a.edit();
            view.putInt(SharedPreferenceKey.TIMES_DISPLAYED_HERE_TOOLTIP.getKey(), 3);
            view.apply();
        } else
        if (b)
        {
            ChatFragment.u(c).a(true);
        } else
        {
            ChatFragment.D(c);
        }
        return true;
    }

    _cls9(ChatFragment chatfragment, boolean flag, boolean flag1)
    {
        c = chatfragment;
        a = flag;
        b = flag1;
        super();
    }
}
