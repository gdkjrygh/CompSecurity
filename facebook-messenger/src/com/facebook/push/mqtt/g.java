// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.google.common.a.fi;
import com.google.common.a.fk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.push.mqtt:
//            as, ar

public class g
    implements a
{

    private final Set a;

    public g(Set set)
    {
        a = set;
    }

    public ar a()
    {
        fk fk1 = fi.e();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); fk1.b(((as)iterator.next()).a())) { }
        if (fk1.b().isEmpty())
        {
            return ar.APP_USE;
        } else
        {
            return (ar)Collections.max(fk1.b());
        }
    }

    public Object b()
    {
        return a();
    }
}
