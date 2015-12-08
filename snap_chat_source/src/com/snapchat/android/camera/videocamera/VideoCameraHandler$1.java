// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;

import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.camera.videocamera:
//            VideoCameraHandler

final class a
    implements Runnable
{

    private B a;

    public final void run()
    {
        try
        {
            a.B();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.e("VideoCameraHandler", (new StringBuilder("Callback attempted illegally: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
