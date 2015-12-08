// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.TypeLiteral;

// Referenced classes of package com.google.inject.internal:
//            Errors

static final class nverter extends nverter
{

    public String toString(Key key)
    {
        if (key.getAnnotationType() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(key.getTypeLiteral()).append(" annotated with ");
            if (key.getAnnotation() != null)
            {
                key = key.getAnnotation();
            } else
            {
                key = key.getAnnotationType();
            }
            return stringbuilder.append(key).toString();
        } else
        {
            return key.getTypeLiteral().toString();
        }
    }

    public volatile String toString(Object obj)
    {
        return toString((Key)obj);
    }

    nverter(Class class1)
    {
        super(class1);
    }
}
