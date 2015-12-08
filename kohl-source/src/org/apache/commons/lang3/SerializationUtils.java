// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.lang3:
//            SerializationException

public class SerializationUtils
{
    static class ClassLoaderAwareObjectInputStream extends ObjectInputStream
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

        public ClassLoaderAwareObjectInputStream(InputStream inputstream, ClassLoader classloader)
            throws IOException
        {
            super(inputstream);
            classLoader = classloader;
        }
    }


    public SerializationUtils()
    {
    }

    public static Serializable clone(Serializable serializable)
    {
        if (serializable != null) goto _L2; else goto _L1
_L1:
        Serializable serializable1 = null;
_L4:
        return serializable1;
_L2:
        Serializable serializable2;
        Object obj1;
        ByteArrayInputStream bytearrayinputstream;
        bytearrayinputstream = new ByteArrayInputStream(serialize(serializable));
        serializable1 = null;
        obj1 = null;
        serializable2 = null;
        serializable = new ClassLoaderAwareObjectInputStream(bytearrayinputstream, serializable.getClass().getClassLoader());
        serializable2 = (Serializable)serializable.readObject();
        serializable1 = serializable2;
        if (serializable != null)
        {
            try
            {
                serializable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Serializable serializable)
            {
                throw new SerializationException("IOException on closing cloned object data InputStream.", serializable);
            }
            return serializable2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        serializable;
        serializable1 = serializable2;
_L8:
        throw new SerializationException("ClassNotFoundException while reading cloned object data", serializable);
        serializable;
_L5:
        if (serializable1 != null)
        {
            try
            {
                serializable1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Serializable serializable)
            {
                throw new SerializationException("IOException on closing cloned object data InputStream.", serializable);
            }
        }
        throw serializable;
        serializable;
        serializable1 = obj1;
_L6:
        throw new SerializationException("IOException while reading cloned object data", serializable);
        Object obj;
        obj;
        serializable1 = serializable;
        serializable = ((Serializable) (obj));
          goto _L5
        obj;
        serializable1 = serializable;
        serializable = ((Serializable) (obj));
          goto _L6
        obj;
        serializable1 = serializable;
        serializable = ((Serializable) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Object deserialize(InputStream inputstream)
    {
        Object obj;
        Object obj1;
        Object obj3;
        if (inputstream == null)
        {
            throw new IllegalArgumentException("The InputStream must not be null");
        }
        obj = null;
        obj3 = null;
        obj1 = null;
        inputstream = new ObjectInputStream(inputstream);
        obj = inputstream.readObject();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return obj;
            }
        }
        return obj;
        inputstream;
        obj = obj1;
_L4:
        throw new SerializationException(inputstream);
        inputstream;
_L1:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw inputstream;
        inputstream;
        obj = obj3;
_L2:
        throw new SerializationException(inputstream);
        Object obj2;
        obj2;
        obj = inputstream;
        inputstream = ((InputStream) (obj2));
          goto _L1
        obj2;
        obj = inputstream;
        inputstream = ((InputStream) (obj2));
          goto _L2
        obj2;
        obj = inputstream;
        inputstream = ((InputStream) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Object deserialize(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("The byte[] must not be null");
        } else
        {
            return deserialize(((InputStream) (new ByteArrayInputStream(abyte0))));
        }
    }

    public static void serialize(Serializable serializable, OutputStream outputstream)
    {
        OutputStream outputstream1;
        Object obj;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("The OutputStream must not be null");
        }
        outputstream1 = null;
        obj = null;
        outputstream = new ObjectOutputStream(outputstream);
        outputstream.writeObject(serializable);
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        outputstream.close();
        return;
        serializable;
        outputstream1 = obj;
_L4:
        throw new SerializationException(serializable);
        serializable;
_L2:
        if (outputstream1 != null)
        {
            try
            {
                outputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
        }
        throw serializable;
        serializable;
        return;
        serializable;
        outputstream1 = outputstream;
        if (true) goto _L2; else goto _L1
_L1:
        serializable;
        outputstream1 = outputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] serialize(Serializable serializable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(512);
        serialize(serializable, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }
}
