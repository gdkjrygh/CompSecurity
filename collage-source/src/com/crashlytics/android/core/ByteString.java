// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.core:
//            CodedOutputStream

final class ByteString
{
    static final class CodedBuilder
    {

        private final byte buffer[];
        private final CodedOutputStream output;

        public ByteString build()
        {
            output.checkNoSpaceLeft();
            return new ByteString(buffer);
        }

        public CodedOutputStream getCodedOutput()
        {
            return output;
        }

        private CodedBuilder(int i)
        {
            buffer = new byte[i];
            output = CodedOutputStream.newInstance(buffer);
        }

    }

    static final class Output extends FilterOutputStream
    {

        private final ByteArrayOutputStream bout;

        public ByteString toByteString()
        {
            return new ByteString(bout.toByteArray());
        }

        private Output(ByteArrayOutputStream bytearrayoutputstream)
        {
            super(bytearrayoutputstream);
            bout = bytearrayoutputstream;
        }

    }


    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private final byte bytes[];
    private volatile int hash;

    private ByteString(byte abyte0[])
    {
        hash = 0;
        bytes = abyte0;
    }


    public static ByteString copyFrom(String s, String s1)
        throws UnsupportedEncodingException
    {
        return new ByteString(s.getBytes(s1));
    }

    public static ByteString copyFrom(ByteBuffer bytebuffer)
    {
        return copyFrom(bytebuffer, bytebuffer.remaining());
    }

    public static ByteString copyFrom(ByteBuffer bytebuffer, int i)
    {
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        return new ByteString(abyte0);
    }

    public static ByteString copyFrom(List list)
    {
        if (list.size() == 0)
        {
            return EMPTY;
        }
        if (list.size() == 1)
        {
            return (ByteString)list.get(0);
        }
        Iterator iterator = list.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((ByteString)iterator.next()).size() + i) { }
        byte abyte0[] = new byte[i];
        list = list.iterator();
        ByteString bytestring;
        for (int j = 0; list.hasNext(); j = bytestring.size() + j)
        {
            bytestring = (ByteString)list.next();
            System.arraycopy(bytestring.bytes, 0, abyte0, j, bytestring.size());
        }

        return new ByteString(abyte0);
    }

    public static ByteString copyFrom(byte abyte0[])
    {
        return copyFrom(abyte0, 0, abyte0.length);
    }

    public static ByteString copyFrom(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new ByteString(abyte1);
    }

    public static ByteString copyFromUtf8(String s)
    {
        try
        {
            s = new ByteString(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return s;
    }

    static CodedBuilder newCodedBuilder(int i)
    {
        return new CodedBuilder(i);
    }

    public static Output newOutput()
    {
        return newOutput(32);
    }

    public static Output newOutput(int i)
    {
        return new Output(new ByteArrayOutputStream(i));
    }

    public ByteBuffer asReadOnlyByteBuffer()
    {
        return ByteBuffer.wrap(bytes).asReadOnlyBuffer();
    }

    public byte byteAt(int i)
    {
        return bytes[i];
    }

    public void copyTo(ByteBuffer bytebuffer)
    {
        bytebuffer.put(bytes, 0, bytes.length);
    }

    public void copyTo(byte abyte0[], int i)
    {
        System.arraycopy(bytes, 0, abyte0, i, bytes.length);
    }

    public void copyTo(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(bytes, i, abyte0, j, k);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ByteString))
            {
                return false;
            }
            ByteString bytestring = (ByteString)obj;
            int j = bytes.length;
            if (j != bytestring.bytes.length)
            {
                return false;
            }
            obj = bytes;
            byte abyte0[] = bytestring.bytes;
            int i = 0;
            while (i < j) 
            {
                if (obj[i] != abyte0[i])
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i = hash;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = bytes;
            int l = bytes.length;
            k = 0;
            int j;
            byte byte0;
            for (j = l; k < l; j = byte0 + j * 31)
            {
                byte0 = abyte0[k];
                k++;
            }

            k = j;
            if (j == 0)
            {
                k = 1;
            }
            hash = k;
        }
        return k;
    }

    public boolean isEmpty()
    {
        return bytes.length == 0;
    }

    public InputStream newInput()
    {
        return new ByteArrayInputStream(bytes);
    }

    public int size()
    {
        return bytes.length;
    }

    public byte[] toByteArray()
    {
        int i = bytes.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(bytes, 0, abyte0, 0, i);
        return abyte0;
    }

    public String toString(String s)
        throws UnsupportedEncodingException
    {
        return new String(bytes, s);
    }

    public String toStringUtf8()
    {
        String s;
        try
        {
            s = new String(bytes, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported?", unsupportedencodingexception);
        }
        return s;
    }

}
