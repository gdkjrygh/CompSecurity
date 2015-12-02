// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import android.net.Uri;
import com.facebook.common.w.q;
import com.facebook.i.a.a.a;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;

// Referenced classes of package com.facebook.b.a:
//            b

class c
    implements a
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void a(Uri uri, boolean flag, f f1)
    {
        if (d.k.equals(uri))
        {
            com.facebook.b.a.b.a(a, q.valueOf(Boolean.TRUE.equals(f1.a(uri))));
        } else
        {
            if ("disconnected".equals(uri.getLastPathSegment()) && d.e.getAuthority().equals(uri.getAuthority()))
            {
                com.facebook.b.a.b.a(a, q.UNSET);
                return;
            }
            if (d.f.equals(uri))
            {
                com.facebook.b.a.b.a(a, q.UNSET);
                return;
            }
        }
    }
}
