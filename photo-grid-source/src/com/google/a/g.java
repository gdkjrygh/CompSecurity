// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.lang.reflect.Field;

// Referenced classes of package com.google.a:
//            d

final class g extends d
{

    g(String s)
    {
        super(s, 2, (byte)0);
    }

    public final String a(Field field)
    {
        return d.a(d.a(field.getName(), " "));
    }
}
