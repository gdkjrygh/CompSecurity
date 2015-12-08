// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.os.Bundle;
import android.os.Message;
import com.roidapp.videolib.core.a.b;
import com.roidapp.videolib.core.a.c;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.videolib.core:
//            VideoEncodeService

final class j
    implements b
{

    final VideoEncodeService a;

    j(VideoEncodeService videoencodeservice)
    {
        a = videoencodeservice;
        super();
    }

    public final void a()
    {
        VideoEncodeService.a(a, Message.obtain(null, 47872));
    }

    public final void a(int i, int k)
    {
        VideoEncodeService.a(a, Message.obtain(null, 47873, i, k));
    }

    public final void a(int i, int k, String s, String s1, String s2)
    {
        if (VideoEncodeService.a(a) != null)
        {
            c c1 = (c)VideoEncodeService.a(a).get();
            if (c1 != null)
            {
                c1.b();
            }
        }
        VideoEncodeService.a(a, i, k, s, s1, s2);
    }

    public final void a(String s)
    {
        if (VideoEncodeService.a(a) != null)
        {
            c c1 = (c)VideoEncodeService.a(a).get();
            if (c1 != null)
            {
                c1.b();
            }
        }
        Message message = Message.obtain(null, 47874);
        Bundle bundle = new Bundle();
        bundle.putString("videoPath", s);
        message.setData(bundle);
        VideoEncodeService.a(a, message);
    }

    public final void b()
    {
        if (VideoEncodeService.a(a) != null)
        {
            c c1 = (c)VideoEncodeService.a(a).get();
            if (c1 != null)
            {
                c1.b();
            }
        }
        VideoEncodeService.a(a, Message.obtain(null, 47876));
    }
}
