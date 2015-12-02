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
import com.facebook.contacts.server.d;
import com.facebook.fbservice.ops.m;
import com.google.common.a.fi;
import com.google.common.d.a.s;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            MessagesTaskTag

public class p extends a
{

    private static final Class a = com/facebook/orca/background/p;
    private final b b;
    private final javax.inject.a c;
    private final k d;
    private final com.facebook.fbservice.ops.k e;

    public p(b b1, javax.inject.a a1, k k1, com.facebook.fbservice.ops.k k2)
    {
        super("SYNC_MOBILE_APP_DATA_FOR_TOP_CONTACTS");
        b = b1;
        c = a1;
        d = k1;
        e = k2;
    }

    public boolean b()
    {
        while (!b.b() || !((Boolean)c.b()).booleanValue()) 
        {
            return false;
        }
        long l = d.a(i.g, 0L);
        boolean flag;
        if (System.currentTimeMillis() - l > 0x5265c00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public s c()
    {
        com.facebook.debug.log.b.c(a, "Starting SyncMobileAppData");
        com.facebook.fbservice.ops.n n = e.a(d.k, new Bundle()).a();
        r r1 = new r(a);
        com.google.common.d.a.i.a(n, r1);
        return r1;
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

}
