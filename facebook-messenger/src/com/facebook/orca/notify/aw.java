// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.net.Uri;
import com.facebook.debug.log.b;
import com.facebook.i.a.a.a;
import com.facebook.i.a.a.f;

// Referenced classes of package com.facebook.orca.notify:
//            av

class aw
    implements a
{

    final av a;

    aw(av av1)
    {
        a = av1;
        super();
    }

    public void a(Uri uri, boolean flag, f f)
    {
        if (!flag)
        {
            b.b(av.c(), "PeerState changed on uri %s ", new Object[] {
                uri
            });
            uri = uri.getLastPathSegment();
            a.b(uri);
        }
    }
}
