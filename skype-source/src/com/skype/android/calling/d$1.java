// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Video;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.calling:
//            d, VideoCall

final class a
    implements Runnable
{

    final d a;

    public final void run()
    {
        for (Iterator iterator = a.b().iterator(); iterator.hasNext(); d.a(a))
        {
            ((Video)iterator.next()).stop();
        }

        Video video;
        b b;
        for (Iterator iterator1 = d.b(a).iterator(); iterator1.hasNext(); video.removeListener(b))
        {
            video = (Video)iterator1.next();
            b = d.c(a).c();
            video.removeListener(b);
        }

    }

    oCall(d d1)
    {
        a = d1;
        super();
    }
}
