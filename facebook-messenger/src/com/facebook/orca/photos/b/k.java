// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import android.os.Bundle;
import com.facebook.common.time.a;
import com.facebook.common.w.n;
import com.facebook.fbservice.ops.m;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.f.r;
import com.facebook.orca.j.c;
import com.facebook.orca.server.aq;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.orca.photos.b:
//            l, m, n

public class k
{

    private final com.facebook.fbservice.ops.k a;
    private final c b;
    private final a c;
    private final r d;
    private final Map e = ik.a();

    public k(com.facebook.fbservice.ops.k k1, c c1, a a1, r r)
    {
        a = k1;
        b = c1;
        c = a1;
        d = r;
    }

    static Map a(k k1)
    {
        return k1.e;
    }

    private void a(MediaResource mediaresource)
    {
        if (a(a(mediaresource.j())))
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("mediaResource", mediaresource);
            i.a(a.a(aq.L, bundle).a(), new l(this, mediaresource));
            e.put(mediaresource.j(), new com.facebook.orca.photos.b.m(this, n.IN_PROGRESS));
            return;
        }
    }

    private boolean a(com.facebook.orca.photos.b.m m1)
    {
        return m1 != null && (m1.a == n.SUCCESS || m1.a == n.IN_PROGRESS);
    }

    static r b(k k1)
    {
        return k1.d;
    }

    public com.facebook.orca.photos.b.m a(String s)
    {
        if (!e.containsKey(s))
        {
            return new com.facebook.orca.photos.b.m(this, n.NOT_ACTIVE);
        } else
        {
            return (com.facebook.orca.photos.b.m)e.get(s);
        }
    }

    public MediaResource a(MediaResource mediaresource, String s)
    {
        MediaResource mediaresource1;
        boolean flag;
        if (mediaresource.c() == g.PHOTO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The MediaResource has to have a type of Photo");
        mediaresource1 = mediaresource;
        if (n.a(mediaresource.f()))
        {
            s = (new StringBuilder(40)).append(s).append("_").append(c.a()).append(".jpg");
            mediaresource1 = MediaResource.a(mediaresource, b.b(s.toString(), true));
        }
        a(mediaresource1);
        return mediaresource1;
    }

    public void a(Message message)
    {
        if (message.C())
        {
            message = message.B().iterator();
            while (message.hasNext()) 
            {
                MediaResource mediaresource = (MediaResource)message.next();
                if (!a((com.facebook.orca.photos.b.m)e.get(mediaresource.j())))
                {
                    a(mediaresource);
                }
            }
        }
    }
}
