// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.a;

import android.net.Uri;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.attachments.a;
import com.facebook.orca.f.k;
import com.facebook.orca.f.z;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.q;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.c;
import com.facebook.widget.tiles.j;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.photos.a:
//            d, b

public class e
{

    private static final Class a = com/facebook/orca/photos/a/e;
    private static final l b = new l();
    private final a c;
    private final z d;
    private final c e;
    private final com.facebook.orca.photos.a.b f;
    private final com.facebook.user.tiles.a g;
    private final q h;
    private final k i;

    public e(a a1, z z1, c c1, com.facebook.orca.photos.a.b b1, com.facebook.user.tiles.a a2, q q1, k k1)
    {
        c = a1;
        d = z1;
        e = c1;
        f = b1;
        g = a2;
        h = q1;
        i = k1;
    }

    private ParticipantInfo a(List list, int j)
    {
        if (list == null || list.size() == 0 || j >= list.size())
        {
            return new ParticipantInfo(i.b(), null);
        } else
        {
            return (ParticipantInfo)list.get(j);
        }
    }

    public j a(ThreadSummary threadsummary)
    {
        if (threadsummary.r() || threadsummary.t())
        {
            Uri uri = c.a(threadsummary);
            if (uri.isAbsolute())
            {
                return new d(e, threadsummary.a(), com.facebook.orca.photos.a.b.a, c.a(threadsummary), false, es.d());
            }
            com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("Uri is not absolute - Uri: ").append(n.a(uri.getPath())).append(" TID: ").append(threadsummary.a()).toString());
        }
        Object obj = d.b(threadsummary);
        int j = d.c(threadsummary);
        if (j == 1)
        {
            obj = a(((List) (obj)), 0);
            return new d(e, threadsummary.a(), f.a(threadsummary), null, false, es.a(((ParticipantInfo) (obj)).e()));
        }
        if (j == 2)
        {
            obj = h.a(threadsummary);
            return new d(e, threadsummary.a(), f.a(threadsummary), null, false, es.a(((ThreadParticipant) (obj)).d()));
        }
        if (m.g(threadsummary.a()))
        {
            return new d(e, threadsummary.a(), com.facebook.orca.photos.a.b.b, null, true, es.d());
        }
        if (((List) (obj)).size() < 2)
        {
            return new d(e, threadsummary.a(), com.facebook.orca.photos.a.b.a, null, true, es.d());
        } else
        {
            return new d(e, threadsummary.a(), null, null, false, es.a(a(((List) (obj)), 0).e(), a(((List) (obj)), 1).e(), a(((List) (obj)), 2).e()));
        }
    }

    public j a(User user)
    {
        return new d(e, user.c().c(), g.a(user.a()), null, false, es.a(user.c()));
    }

    public j a(com.facebook.widget.tiles.a a1)
    {
        es es1 = es.d();
        return new d(e, "", a1, null, true, es1);
    }

}
