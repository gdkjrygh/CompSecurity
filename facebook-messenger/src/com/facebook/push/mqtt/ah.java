// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.push.mqtt:
//            t, ck

public class ah
    implements a
{

    private Set a;

    public ah(Set set)
    {
        a = set;
    }

    public Long a()
    {
        EnumSet enumset = EnumSet.noneOf(com/facebook/push/mqtt/t);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); enumset.addAll(((ck)iterator.next()).a())) { }
        return Long.valueOf(com.facebook.common.w.a.a(enumset));
    }

    public Object b()
    {
        return a();
    }
}
