// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import com.google.common.a.fi;
import com.google.common.a.fk;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.f:
//            f

public class e
{

    public e()
    {
    }

    public static fi a(Set set)
    {
        fk fk1 = fi.e();
        for (set = set.iterator(); set.hasNext(); fk1.b(((f)set.next()).a())) { }
        return fk1.b();
    }
}
