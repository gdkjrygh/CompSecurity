// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.lang.reflect.Field;

// Referenced classes of package com.google.a:
//            c

final class f extends c
{

    f(String s, int i)
    {
        super(s, i, null);
    }

    public String a(Field field)
    {
        return c.a(c.a(field.getName(), " "));
    }
}
