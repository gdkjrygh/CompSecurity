// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.api.client.util:
//            ByteCountingOutputStream, StreamingContent, ByteStreams, Throwables

public class IOUtils
{

    public IOUtils()
    {
    }

    public static long computeLength(StreamingContent streamingcontent)
        throws IOException
    {
        ByteCountingOutputStream bytecountingoutputstream = new ByteCountingOutputStream();
        streamingcontent.writeTo(bytecountingoutputstream);
        bytecountingoutputstream.close();
        return bytecountingoutputstream.count;
        streamingcontent;
        bytecountingoutputstream.close();
        throw streamingcontent;
    }

    public static void copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        copy(inputstream, outputstream, true);
    }

    public static void copy(InputStream inputstream, OutputStream outputstream, boolean flag)
        throws IOException
    {
        ByteStreams.copy(inputstream, outputstream);
        if (flag)
        {
            inputstream.close();
        }
        return;
        outputstream;
        if (flag)
        {
            inputstream.close();
        }
        throw outputstream;
    }

    public static Serializable deserialize(InputStream inputstream)
        throws IOException
    {
        Serializable serializable = (Serializable)(new ObjectInputStream(inputstream)).readObject();
        inputstream.close();
        return serializable;
        Object obj;
        obj;
        IOException ioexception = new IOException("Failed to deserialize object");
        ioexception.initCause(((Throwable) (obj)));
        throw ioexception;
        obj;
        inputstream.close();
        throw obj;
    }

    public static Serializable deserialize(byte abyte0[])
        throws IOException
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return deserialize(((InputStream) (new ByteArrayInputStream(abyte0))));
        }
    }

    public static boolean isSymbolicLink(File file)
        throws IOException
    {
        boolean flag = false;
        boolean flag2;
        Class class1 = Class.forName("java.nio.file.Files");
        Class class2 = Class.forName("java.nio.file.Path");
        Object obj1 = java/io/File.getMethod("toPath", new Class[0]).invoke(file, new Object[0]);
        flag2 = ((Boolean)class1.getMethod("isSymbolicLink", new Class[] {
            class2
        }).invoke(null, new Object[] {
            obj1
        })).booleanValue();
        flag = flag2;
_L2:
        return flag;
        file;
        file = file.getCause();
        Throwables.propagateIfPossible(file, java/io/IOException);
        throw new RuntimeException(file);
        Object obj;
        obj;
_L3:
        if (File.separatorChar == '\\') goto _L2; else goto _L1
_L1:
        File file1 = file;
        if (file.getParent() != null)
        {
            file1 = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        boolean flag1;
        if (!file1.getCanonicalFile().equals(file1.getAbsoluteFile()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
        file1;
          goto _L3
        file1;
          goto _L3
        file1;
          goto _L3
        file1;
          goto _L3
    }

    public static void serialize(Object obj, OutputStream outputstream)
        throws IOException
    {
        (new ObjectOutputStream(outputstream)).writeObject(obj);
        outputstream.close();
        return;
        obj;
        outputstream.close();
        throw obj;
    }

    public static byte[] serialize(Object obj)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        serialize(obj, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }
}
