// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.TextView;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.chat:
//            HeartsDialogAdapter

private final class description
{

    private SkypeAvatarView avatarView;
    private TextView description;
    private TextView fullName;
    final HeartsDialogAdapter this$0;

    public final SkypeAvatarView getAvatarView()
    {
        return avatarView;
    }

    public final TextView getDescription()
    {
        return description;
    }

    public final TextView getFullName()
    {
        return fullName;
    }

    public (View view)
    {
        this$0 = HeartsDialogAdapter.this;
        super();
        avatarView = (SkypeAvatarView)view.findViewById(0x7f10030c);
        fullName = (TextView)view.findViewById(0x7f10031a);
        description = (TextView)view.findViewById(0x7f10031b);
    }
}
