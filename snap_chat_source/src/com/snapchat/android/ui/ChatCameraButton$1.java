// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.os.SystemClock;

// Referenced classes of package com.snapchat.android.ui:
//            ChatCameraButton

final class a
    implements Runnable
{

    private ChatCameraButton a;

    public final void run()
    {
        ChatCameraButton.a(a);
        if (ChatCameraButton.b(a))
        {
            ChatCameraButton.c(a);
            return;
        } else
        {
            ChatCameraButton.a(a, SystemClock.elapsedRealtime());
            ChatCameraButton.d(a);
            a.invalidate();
            return;
        }
    }

    (ChatCameraButton chatcamerabutton)
    {
        a = chatcamerabutton;
        super();
    }
}
