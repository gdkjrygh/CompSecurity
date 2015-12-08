// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

// Referenced classes of package org.apache.commons.lang3:
//            SerializationUtils

static class classLoader extends ObjectInputStream
{

    private ClassLoader classLoader;

    protected Class resolveClass(ObjectStreamClass objectstreamclass)
        throws IOException, ClassNotFoundException
    {
        objectstreamclass = objectstreamclass.getName();
        Class class1;
        try
        {
            class1 = Class.forName(objectstreamclass, false, classLoader);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return Class.forName(objectstreamclass, false, Thread.currentThread().getContextClassLoader());
        }
        return class1;
    }

    public (InputStream inputstream, ClassLoader classloader)
        throws IOException
    {
        super(inputstream);
        classLoader = classloader;
    }
}
