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

static final class 
    implements s
{

    public final r a(e e, a a1)
    {
        a1 = a1.a;
        if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
        {
            return null;
        }
        e = a1;
        if (!a1.isEnum())
        {
            e = a1.getSuperclass();
        }
        return new init>(e);
    }

    ()
    {
    }
}
