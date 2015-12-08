// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// Referenced classes of package retrofit.mime:
//            TypedInput, TypedOutput

public class TypedByteArray
    implements TypedInput, TypedOutput
{

    private final byte bytes[];
    private final String mimeType;

    public TypedByteArray(String s, byte abyte0[])
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "application/unknown";
        }
        if (abyte0 == null)
        {
            throw new NullPointerException("bytes");
        } else
        {
            mimeType = s1;
            bytes = abyte0;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TypedByteArray)obj;
            if (!Arrays.equals(bytes, ((TypedByteArray) (obj)).bytes))
            {
                return false;
            }
            if (!mimeType.equals(((TypedByteArray) (obj)).mimeType))
            {
                return false;
            }
        }
        return true;
    }

    public String fileName()
    {
        return null;
    }

    public byte[] getBytes()
    {
        return bytes;
    }

    public int hashCode()
    {
        return mimeType.hashCode() * 31 + Arrays.hashCode(bytes);
    }

    public InputStream in()
    {
        return new ByteArrayInputStream(bytes);
    }

    public long length()
    {
        return (long)bytes.length;
    }

    public String mimeType()
    {
        return mimeType;
    }

    public String toString()
    {
        return (new StringBuilder("TypedByteArray[length=")).append(length()).append("]").toString();
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream.write(bytes);
    }
}
