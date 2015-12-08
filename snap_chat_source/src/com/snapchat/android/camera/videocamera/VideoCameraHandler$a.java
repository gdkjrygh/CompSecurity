// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;

import PG;
import android.media.MediaRecorder;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.camera.videocamera:
//            VideoCameraHandler

final class a
    implements android.media.istener
{

    C a;

    public final void onInfo(MediaRecorder mediarecorder, int i, int j)
    {
        Timber.c("VideoCameraHandler", "Video InfoListener: Info event #[%d, %d] has occured", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        switch (i)
        {
        default:
            return;

        case 800: 
        case 801: 
            PG.a(new Runnable() {

                private VideoCameraHandler.a a;

                public final void run()
                {
                    a.a.C();
                }

            
            {
                a = VideoCameraHandler.a.this;
                super();
            }
            });
            break;
        }
    }

    public _cls1.a(_cls1.a a1)
    {
        a = a1;
    }
}
