// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.backgroundtasks.a;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.background.MessagesTaskTag;
import com.facebook.orca.g.aa;
import com.facebook.orca.g.r;
import com.facebook.orca.prefs.n;
import com.facebook.orca.server.module.ThreadsQueue;
import com.facebook.orca.threads.m;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.user.User;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import com.google.common.d.a.s;
import com.google.common.d.a.u;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.sms:
//            ad, ae, af

public class ac extends a
{

    private static final Class a = com/facebook/orca/sms/ac;
    private final aa b;
    private final javax.inject.a c;
    private final javax.inject.a d;
    private final javax.inject.a e;
    private final r f;
    private final d g;
    private final af h;
    private final u i;
    private final com.facebook.common.time.a j;
    private Callable k;

    public ac(javax.inject.a a1, javax.inject.a a2, javax.inject.a a3, aa aa1, r r1, d d1, af af, 
            u u1, com.facebook.common.time.a a4)
    {
        super("MMS_SMS_LOG_EXTERNAL");
        k = new ad(this);
        e = a1;
        c = a2;
        d = a3;
        b = aa1;
        f = r1;
        g = d1;
        h = af;
        i = u1;
        j = a4;
    }

    private ae a(long l1)
    {
        Cursor cursor;
        int i1;
        int j1;
        int k1;
        int i2;
        cursor = b.e().rawQuery("SELECT msg_id, sender, timestamp_ms FROM messages WHERE handled_internally_time = 0 and timestamp_ms > ?", new String[] {
            Long.toString(l1)
        });
        k1 = 0;
        j1 = 0;
        i1 = 0;
        i2 = 0;
_L6:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        String s;
        ParticipantInfo participantinfo;
        User user;
        long l5;
        s = cursor.getString(0);
        if (!m.i(s) && !m.h(s))
        {
            break MISSING_BLOCK_LABEL_403;
        }
        participantinfo = f.a(cursor.getString(1));
        l5 = cursor.getLong(2);
        user = (User)e.b();
        if (user == null) goto _L4; else goto _L3
_L3:
        if (!Objects.equal(user.c(), participantinfo.e())) goto _L4; else goto _L5
_L5:
        boolean flag = m.i(s);
        if (flag)
        {
            k1++;
        } else
        {
            j1++;
        }
        l5 = Math.max(l1, l5);
        l1 = l5;
        int j2 = i2;
        i2 = k1;
        k1 = j1;
        j1 = i1;
        i1 = j2;
_L7:
        int k2 = i2;
        i2 = i1;
        i1 = j1;
        j1 = k1;
        k1 = k2;
          goto _L6
_L4:
        if (!participantinfo.c())
        {
            break MISSING_BLOCK_LABEL_403;
        }
        flag = m.i(s);
        if (flag)
        {
            int l2 = i2;
            i2 = i1 + 1;
            i1 = l2;
        } else
        {
            int j3 = i2 + 1;
            i2 = i1;
            i1 = j3;
        }
        l5 = Math.max(l1, l5);
        l1 = l5;
        int i3 = j1;
        int k4 = k1;
        j1 = i2;
        k1 = i3;
        i2 = k4;
          goto _L7
_L2:
        int k3;
        cursor.close();
        k3 = i1;
        i1 = k1;
_L9:
        return new ae(i1, j1, k3, i2, l1);
        Object obj;
        obj;
        k3 = k1;
        k1 = i1;
        i1 = k3;
_L10:
        cursor.close();
        k3 = k1;
        if (true) goto _L9; else goto _L8
_L8:
        obj;
        cursor.close();
        throw obj;
        obj;
        int l3 = k1;
        k1 = i1;
        i1 = l3;
          goto _L10
        obj;
        int i4 = i1;
        i1 = k1;
        k1 = i2;
        i2 = i4;
          goto _L10
        int j4 = i1;
        int l4 = j1;
        int i5 = k1;
        i1 = i2;
        j1 = j4;
        k1 = l4;
        i2 = i5;
          goto _L7
    }

    static af a(ac ac1)
    {
        return ac1.h;
    }

    static d b(ac ac1)
    {
        return ac1.g;
    }

    static com.facebook.common.time.a c(ac ac1)
    {
        return ac1.j;
    }

    private boolean l()
    {
        return g.a(n.j, -1L) == -1L;
    }

    public Set a()
    {
        return fi.b(com/facebook/orca/server/module/ThreadsQueue);
    }

    public boolean b()
    {
        long l1;
        if (d())
        {
            if (j.a() - (l1 = g.a(n.k, 0L)) > 0xa4cb80L)
            {
                return true;
            }
        }
        return false;
    }

    public s c()
    {
        return i.c(k);
    }

    boolean d()
    {
        return e.b() != null && ((Boolean)c.b()).booleanValue() && ((Boolean)d.b()).booleanValue();
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

    ae k()
    {
        if (l())
        {
            e e1 = g.b();
            e1.a(n.j, j.a());
            e1.a();
            return ae.f;
        } else
        {
            ae ae1 = a(g.a(n.j, 0L));
            long l1 = Math.max(ae1.e, j.a() - 0x5265c00L);
            e e2 = g.b();
            e2.a(n.j, l1);
            e2.a();
            return ae1;
        }
    }

}
