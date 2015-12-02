// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.a;
import com.facebook.orca.background.MessagesTaskTag;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Set;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ao, ad

public class bk extends a
{

    private final ao a;
    private final com.facebook.common.v.a b;
    private final b c;
    private final com.facebook.common.time.a d;
    private long e;

    public bk(ao ao1, com.facebook.common.v.a a1, b b1, com.facebook.common.time.a a2)
    {
        super("DIVEBAR");
        a = ao1;
        b = a1;
        c = b1;
        d = a2;
    }

    public boolean b()
    {
        while (d.a() - e < 0x493e0L || !c.b() || !b.b()) 
        {
            return false;
        }
        return true;
    }

    public s c()
    {
        e = d.a();
        a.a().s();
        return com.google.common.d.a.i.a(new com.facebook.backgroundtasks.b(true));
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

    public long i()
    {
        while (!c.b() || !b.b()) 
        {
            return -1L;
        }
        return Math.max(d.a(), e + 0x493e0L);
    }
}
