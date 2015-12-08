// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer, UUIDDeserializer, StackTraceElementDeserializer, AtomicBooleanDeserializer, 
//            ByteBufferDeserializer

public class JdkDeserializers
{

    private static final HashSet _classNames;

    public static JsonDeserializer find(Class class1, String s)
    {
        if (_classNames.contains(s))
        {
            s = FromStringDeserializer.findDeserializer(class1);
            if (s != null)
            {
                return s;
            }
            if (class1 == java/util/UUID)
            {
                return new UUIDDeserializer();
            }
            if (class1 == java/lang/StackTraceElement)
            {
                return new StackTraceElementDeserializer();
            }
            if (class1 == java/util/concurrent/atomic/AtomicBoolean)
            {
                return new AtomicBooleanDeserializer();
            }
            if (class1 == java/nio/ByteBuffer)
            {
                return new ByteBufferDeserializer();
            }
        }
        return null;
    }

    static 
    {
        _classNames = new HashSet();
        Class aclass[] = new Class[4];
        aclass[0] = java/util/UUID;
        aclass[1] = java/util/concurrent/atomic/AtomicBoolean;
        aclass[2] = java/lang/StackTraceElement;
        aclass[3] = java/nio/ByteBuffer;
        int k = aclass.length;
        for (int i = 0; i < k; i++)
        {
            Class class1 = aclass[i];
            _classNames.add(class1.getName());
        }

        aclass = FromStringDeserializer.types();
        k = aclass.length;
        for (int j = 0; j < k; j++)
        {
            Class class2 = aclass[j];
            _classNames.add(class2.getName());
        }

    }
}
