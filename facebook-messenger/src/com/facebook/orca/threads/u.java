// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.google.common.a.es;
import java.util.AbstractList;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadParticipant

class u extends AbstractList
{

    private final es a;
    private final es b;

    u(es es1, es es2)
    {
        a = es1;
        b = es2;
    }

    public ThreadParticipant a(int i)
    {
        if (i < a.size())
        {
            return (ThreadParticipant)a.get(i);
        } else
        {
            return (ThreadParticipant)b.get(i - a.size());
        }
    }

    public Object get(int i)
    {
        return a(i);
    }

    public int size()
    {
        return a.size() + b.size();
    }
}
