// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.u;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

// Referenced classes of package com.google.a.b:
//            ae, f

class n
    implements ae
{

    final Type a;
    final f b;

    n(f f, Type type)
    {
        b = f;
        a = type;
        super();
    }

    public Object a()
    {
        if (a instanceof ParameterizedType)
        {
            Type type = ((ParameterizedType)a).getActualTypeArguments()[0];
            if (type instanceof Class)
            {
                return EnumSet.noneOf((Class)type);
            } else
            {
                throw new u((new StringBuilder()).append("Invalid EnumSet type: ").append(a.toString()).toString());
            }
        } else
        {
            throw new u((new StringBuilder()).append("Invalid EnumSet type: ").append(a.toString()).toString());
        }
    }
}
