// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d.a;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

final class b extends ObjectInputStream
{

    final ClassLoader a;

    b(InputStream inputstream, ClassLoader classloader)
    {
        a = classloader;
        super(inputstream);
    }

    public final Class resolveClass(ObjectStreamClass objectstreamclass)
    {
        Class class2 = Class.forName(objectstreamclass.getName(), false, a);
        Class class1 = class2;
        if (class2 == null)
        {
            class1 = super.resolveClass(objectstreamclass);
        }
        return class1;
    }
}
