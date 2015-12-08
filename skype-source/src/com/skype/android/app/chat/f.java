// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.PathClippedImageView;

// Referenced classes of package com.skype.android.app.chat:
//            j

abstract class f extends j
{

    public TextView authorText;
    public PathClippedImageView avatar;
    public ViewGroup messageContent;

    public f(View view)
    {
        super(view);
        avatar = (PathClippedImageView)ViewUtil.a(view, 0x7f100289);
        avatar.setClipCircleEnabled(false);
        authorText = (TextView)ViewUtil.a(view, 0x7f100288);
        messageContent = (ViewGroup)ViewUtil.a(view, 0x7f100286);
    }

    public ViewGroup getInlineContent()
    {
        return messageContent;
    }
}
