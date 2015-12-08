// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class b
    implements s
{

    final Class a;
    final r b;

    public final r a(e e, a a1)
    {
        if (a.isAssignableFrom(a1.a))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[typeHierarchy=")).append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }

    (Class class1, r r)
    {
        a = class1;
        b = r;
        super();
    }
}
