// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            JsonStringEncoder

public class SerializedString
    implements SerializableString, Serializable
{

    protected transient String _jdkSerializeValue;
    protected char _quotedChars[];
    protected byte _quotedUTF8Ref[];
    protected byte _unquotedUTF8Ref[];
    protected final String _value;

    public SerializedString(String s)
    {
        if (s == null)
        {
            throw new IllegalStateException("Null String illegal for SerializedString");
        } else
        {
            _value = s;
            return;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException
    {
        _jdkSerializeValue = objectinputstream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeUTF(_value);
    }

    public int appendQuoted(char ac[], int i)
    {
        char ac2[] = _quotedChars;
        char ac1[] = ac2;
        if (ac2 == null)
        {
            ac1 = JsonStringEncoder.getInstance().quoteAsString(_value);
            _quotedChars = ac1;
        }
        int j = ac1.length;
        if (i + j > ac.length)
        {
            return -1;
        } else
        {
            System.arraycopy(ac1, 0, ac, i, j);
            return j;
        }
    }

    public int appendQuotedUTF8(byte abyte0[], int i)
    {
        byte abyte2[] = _quotedUTF8Ref;
        byte abyte1[] = abyte2;
        if (abyte2 == null)
        {
            abyte1 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
            _quotedUTF8Ref = abyte1;
        }
        int j = abyte1.length;
        if (i + j > abyte0.length)
        {
            return -1;
        } else
        {
            System.arraycopy(abyte1, 0, abyte0, i, j);
            return j;
        }
    }

    public int appendUnquoted(char ac[], int i)
    {
        String s = _value;
        int j = s.length();
        if (i + j > ac.length)
        {
            return -1;
        } else
        {
            s.getChars(0, j, ac, i);
            return j;
        }
    }

    public int appendUnquotedUTF8(byte abyte0[], int i)
    {
        byte abyte2[] = _unquotedUTF8Ref;
        byte abyte1[] = abyte2;
        if (abyte2 == null)
        {
            abyte1 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
            _unquotedUTF8Ref = abyte1;
        }
        int j = abyte1.length;
        if (i + j > abyte0.length)
        {
            return -1;
        } else
        {
            System.arraycopy(abyte1, 0, abyte0, i, j);
            return j;
        }
    }

    public final char[] asQuotedChars()
    {
        char ac1[] = _quotedChars;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = JsonStringEncoder.getInstance().quoteAsString(_value);
            _quotedChars = ac;
        }
        return ac;
    }

    public final byte[] asQuotedUTF8()
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
            _quotedUTF8Ref = abyte0;
        }
        return abyte0;
    }

    public final byte[] asUnquotedUTF8()
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
            _unquotedUTF8Ref = abyte0;
        }
        return abyte0;
    }

    public final int charLength()
    {
        return _value.length();
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || obj.getClass() != getClass())
        {
            return false;
        } else
        {
            obj = (SerializedString)obj;
            return _value.equals(((SerializedString) (obj))._value);
        }
    }

    public final String getValue()
    {
        return _value;
    }

    public final int hashCode()
    {
        return _value.hashCode();
    }

    public int putQuotedUTF8(ByteBuffer bytebuffer)
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
            _quotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        if (i > bytebuffer.remaining())
        {
            return -1;
        } else
        {
            bytebuffer.put(abyte0, 0, i);
            return i;
        }
    }

    public int putUnquotedUTF8(ByteBuffer bytebuffer)
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
            _unquotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        if (i > bytebuffer.remaining())
        {
            return -1;
        } else
        {
            bytebuffer.put(abyte0, 0, i);
            return i;
        }
    }

    protected Object readResolve()
    {
        return new SerializedString(_jdkSerializeValue);
    }

    public final String toString()
    {
        return _value;
    }

    public int writeQuotedUTF8(OutputStream outputstream)
        throws IOException
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().quoteAsUTF8(_value);
            _quotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        outputstream.write(abyte0, 0, i);
        return i;
    }

    public int writeUnquotedUTF8(OutputStream outputstream)
        throws IOException
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = JsonStringEncoder.getInstance().encodeAsUTF8(_value);
            _unquotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        outputstream.write(abyte0, 0, i);
        return i;
    }
}
