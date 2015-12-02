// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.common.e.h;
import com.facebook.common.time.a;
import com.facebook.common.w.q;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.f:
//            d, k, z

public class ac extends com.facebook.orca.f.d
{

    private static Class a = com/facebook/orca/f/ac;
    private final h b;

    public ac(d d1, k k, z z, h h1, a a1)
    {
        super(d1, k, z, h1, a1);
        b = h1;
    }

    protected ae a(UserKey userkey)
    {
        return n.a(userkey);
    }

    protected Object a(String s)
    {
        return c(s);
    }

    protected String a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return null;
        }
        if (boolean1.booleanValue())
        {
            return "1";
        } else
        {
            return "0";
        }
    }

    protected volatile String a(Object obj)
    {
        return a((Boolean)obj);
    }

    public void a(ThreadViewSpec threadviewspec, q q1)
    {
        a(threadviewspec, q1.asBooleanObject());
    }

    protected ae b(String s)
    {
        return n.b(s);
    }

    protected Object b(Object obj)
    {
        return c(obj);
    }

    public q c(ThreadViewSpec threadviewspec)
    {
        return q.valueOf((Boolean)a(threadviewspec));
    }

    protected Boolean c(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            b.a(a.getSimpleName(), "Unknown value type");
            return Boolean.valueOf(false);
        }
    }

    protected Boolean c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Boolean.valueOf(s.equals("1"));
        }
    }

}
