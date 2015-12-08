// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            d

public class SerializedString
    implements f, Serializable
{

    protected char _quotedChars[];
    protected byte _quotedUTF8Ref[];
    protected byte _unquotedUTF8Ref[];
    protected final String _value;
    protected transient String a;

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
        a = objectinputstream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeUTF(_value);
    }

    public int a(OutputStream outputstream)
        throws IOException
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().b(_value);
            _quotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        outputstream.write(abyte0, 0, i);
        return i;
    }

    public int a(ByteBuffer bytebuffer)
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().b(_value);
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

    public int a(byte abyte0[], int i)
    {
        byte abyte2[] = _quotedUTF8Ref;
        byte abyte1[] = abyte2;
        if (abyte2 == null)
        {
            abyte1 = com.fasterxml.jackson.core.io.d.a().b(_value);
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

    public int a(char ac[], int i)
    {
        char ac2[] = _quotedChars;
        char ac1[] = ac2;
        if (ac2 == null)
        {
            ac1 = com.fasterxml.jackson.core.io.d.a().a(_value);
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

    public final String a()
    {
        return _value;
    }

    public final int b()
    {
        return _value.length();
    }

    public int b(OutputStream outputstream)
        throws IOException
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().c(_value);
            _unquotedUTF8Ref = abyte0;
        }
        int i = abyte0.length;
        outputstream.write(abyte0, 0, i);
        return i;
    }

    public int b(ByteBuffer bytebuffer)
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().c(_value);
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

    public int b(byte abyte0[], int i)
    {
        byte abyte2[] = _unquotedUTF8Ref;
        byte abyte1[] = abyte2;
        if (abyte2 == null)
        {
            abyte1 = com.fasterxml.jackson.core.io.d.a().c(_value);
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

    public int b(char ac[], int i)
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

    public final char[] c()
    {
        char ac1[] = _quotedChars;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = com.fasterxml.jackson.core.io.d.a().a(_value);
            _quotedChars = ac;
        }
        return ac;
    }

    public final byte[] d()
    {
        byte abyte1[] = _unquotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().c(_value);
            _unquotedUTF8Ref = abyte0;
        }
        return abyte0;
    }

    public final byte[] e()
    {
        byte abyte1[] = _quotedUTF8Ref;
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = com.fasterxml.jackson.core.io.d.a().b(_value);
            _quotedUTF8Ref = abyte0;
        }
        return abyte0;
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

    public final int hashCode()
    {
        return _value.hashCode();
    }

    protected Object readResolve()
    {
        return new SerializedString(a);
    }

    public final String toString()
    {
        return _value;
    }
}
