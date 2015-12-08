// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;

import android.net.Uri;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.camera.videocamera:
//            VideoCameraHandler

final class b
    implements Runnable
{

    private b a;
    private Uri b;

    public final void run()
    {
        try
        {
            a.a(b);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.e("VideoCameraHandler", (new StringBuilder("Callback attempted illegally: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
        }
    }

    ( , Uri uri)
    {
        a = ;
        b = uri;
        super();
    }
}
