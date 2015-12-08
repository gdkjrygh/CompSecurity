// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Field;

// Referenced classes of package com.google.gson:
//            FieldNamingPolicy

static final class nit> extends FieldNamingPolicy
{

    public final String a(Field field)
    {
        return FieldNamingPolicy.a(field.getName(), "-").toLowerCase();
    }

    (String s)
    {
        super(s, 4, (byte)0);
    }
}
