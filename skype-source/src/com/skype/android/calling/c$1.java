// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Video;

// Referenced classes of package com.skype.android.calling:
//            c, VideoCall

final class a
    implements Runnable
{

    final Video a;
    final c b;

    public final void run()
    {
        b b1 = c.a(b).c();
        a.removeListener(b1);
        a.removeListener(b1);
    }

    oCall(c c1, Video video)
    {
        b = c1;
        a = video;
        super();
    }
}
