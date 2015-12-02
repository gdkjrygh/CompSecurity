// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.os.Bundle;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.a;
import com.facebook.backgroundtasks.r;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.server.SyncToCacheParams;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.s;
import com.google.common.a.fi;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            MessagesTaskTag

public class o extends a
{

    private static final Class a = com/facebook/orca/background/o;
    private final b b;
    private final k c;
    private final com.facebook.fbservice.ops.k d;

    public o(b b1, k k1, com.facebook.fbservice.ops.k k2)
    {
        super("SYNC_LAST_ACTIVE_FOR_TOP_CONTACTS");
        b = b1;
        c = k1;
        d = k2;
    }

    public boolean b()
    {
        long l;
        if (b.b())
        {
            if (System.currentTimeMillis() - (l = c.a(i.f, 0L)) > 0xa4cb80L)
            {
                return true;
            }
        }
        return false;
    }

    public com.google.common.d.a.s c()
    {
        com.facebook.debug.log.b.c(a, "Starting SyncTopLastActive");
        Object obj = new Bundle();
        ((Bundle) (obj)).putParcelable("syncToCacheParams", new SyncToCacheParams(s.CHECK_SERVER_FOR_NEW_DATA));
        obj = d.a(d.o, ((Bundle) (obj))).a();
        r r1 = new r(a);
        com.google.common.d.a.i.a(((com.google.common.d.a.s) (obj)), r1);
        return r1;
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

}
