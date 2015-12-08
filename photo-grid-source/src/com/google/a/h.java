// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.lang.reflect.Field;

// Referenced classes of package com.google.a:
//            d

final class h extends d
{

    h(String s)
    {
        super(s, 3, (byte)0);
    }

    public final String a(Field field)
    {
        return d.a(field.getName(), "_").toLowerCase();
    }
}
