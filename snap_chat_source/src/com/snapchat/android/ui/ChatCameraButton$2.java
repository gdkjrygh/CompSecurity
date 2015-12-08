// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            ChatCameraButton

final class a extends Thread
{

    private Context a;
    private ChatCameraButton b;

    public final void run()
    {
        ChatCameraButton.a(b, MediaPlayer.create(a, 0x7f070006));
    }

    (ChatCameraButton chatcamerabutton, Context context)
    {
        b = chatcamerabutton;
        a = context;
        super();
    }
}
