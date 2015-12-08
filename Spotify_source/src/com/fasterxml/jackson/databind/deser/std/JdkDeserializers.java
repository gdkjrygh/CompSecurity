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
        boolean flag = false;
        _classNames = new HashSet();
        for (int i = 0; i < 4; i++)
        {
            Class class1 = (new Class[] {
                java/util/UUID, java/util/concurrent/atomic/AtomicBoolean, java/lang/StackTraceElement, java/nio/ByteBuffer
            })[i];
            _classNames.add(class1.getName());
        }

        Class aclass[] = FromStringDeserializer.types();
        int k = aclass.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            Class class2 = aclass[j];
            _classNames.add(class2.getName());
        }

    }
}
