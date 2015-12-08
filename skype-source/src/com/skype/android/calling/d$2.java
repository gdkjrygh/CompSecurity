// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Video;

// Referenced classes of package com.skype.android.calling:
//            d

final class a
    implements Runnable
{

    final Video a;
    final d b;

    public final void run()
    {
        d.a(b, a, d.d(b));
        a.start();
    }

    (d d1, Video video)
    {
        b = d1;
        a = video;
        super();
    }
}
