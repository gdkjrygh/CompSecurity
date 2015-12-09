// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Collection;

// Referenced classes of package com.google.a.a:
//            w, ai, ah, ag, 
//            ae

public final class af
{

    private static final w a = w.a();

    public static ae a()
    {
        return ai.d;
    }

    public static ae a(Object obj)
    {
        if (obj == null)
        {
            return ai.c;
        } else
        {
            return new ah(obj, (byte)0);
        }
    }

    public static ae a(Collection collection)
    {
        return new ag(collection, (byte)0);
    }

}
