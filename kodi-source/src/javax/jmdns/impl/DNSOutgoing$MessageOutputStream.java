// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSOutgoing, DNSQuestion, DNSRecord

public static class _offset extends ByteArrayOutputStream
{

    private final int _offset;
    private final DNSOutgoing _out;

    void writeByte(int i)
    {
        write(i & 0xff);
    }

    void writeBytes(byte abyte0[], int i, int j)
    {
        for (int k = 0; k < j; k++)
        {
            writeByte(abyte0[i + k]);
        }

    }

    void writeInt(int i)
    {
        writeShort(i >> 16);
        writeShort(i);
    }

    void writeName(String s)
    {
        writeName(s, true);
    }

    void writeName(String s, boolean flag)
    {
        do
        {
            do
            {
                int j = s.indexOf('.');
                int i = j;
                if (j < 0)
                {
                    i = s.length();
                }
                if (i <= 0)
                {
                    writeByte(0);
                    return;
                }
                String s1 = s.substring(0, i);
                if (flag && DNSOutgoing.USE_DOMAIN_NAME_COMPRESSION)
                {
                    Integer integer = (Integer)_out._names.get(s);
                    if (integer != null)
                    {
                        i = integer.intValue();
                        writeByte(i >> 8 | 0xc0);
                        writeByte(i & 0xff);
                        return;
                    }
                    _out._names.put(s, Integer.valueOf(size() + _offset));
                    writeUTF(s1, 0, s1.length());
                } else
                {
                    writeUTF(s1, 0, s1.length());
                }
                s1 = s.substring(i);
                s = s1;
            } while (!s1.startsWith("."));
            s = s1.substring(1);
        } while (true);
    }

    void writeQuestion(DNSQuestion dnsquestion)
    {
        writeName(dnsquestion.getName());
        writeShort(dnsquestion.getRecordType().indexValue());
        writeShort(dnsquestion.getRecordClass().indexValue());
    }

    void writeRecord(DNSRecord dnsrecord, long l)
    {
        writeName(dnsrecord.getName());
        writeShort(dnsrecord.getRecordType().indexValue());
        int j = dnsrecord.getRecordClass().indexValue();
        lue lue;
        int i;
        if (dnsrecord.isUnique() && _out.isMulticast())
        {
            i = 32768;
        } else
        {
            i = 0;
        }
        writeShort(i | j);
        if (l == 0L)
        {
            i = dnsrecord.getTTL();
        } else
        {
            i = dnsrecord.getRemainingTTL(l);
        }
        writeInt(i);
        lue = new <init>(512, _out, _offset + size() + 2);
        dnsrecord.write(lue);
        dnsrecord = lue.toByteArray();
        writeShort(dnsrecord.length);
        write(dnsrecord, 0, dnsrecord.length);
    }

    void writeShort(int i)
    {
        writeByte(i >> 8);
        writeByte(i);
    }

    void writeUTF(String s, int i, int j)
    {
        int k = 0;
        int l = 0;
        while (l < j) 
        {
            char c1 = s.charAt(i + l);
            if (c1 >= '\001' && c1 <= '\177')
            {
                k++;
            } else
            if (c1 > '\u07FF')
            {
                k += 3;
            } else
            {
                k += 2;
            }
            l++;
        }
        writeByte(k);
        k = 0;
        while (k < j) 
        {
            char c = s.charAt(i + k);
            if (c >= '\001' && c <= '\177')
            {
                writeByte(c);
            } else
            if (c > '\u07FF')
            {
                writeByte(c >> 12 & 0xf | 0xe0);
                writeByte(c >> 6 & 0x3f | 0x80);
                writeByte(c >> 0 & 0x3f | 0x80);
            } else
            {
                writeByte(c >> 6 & 0x1f | 0xc0);
                writeByte(c >> 0 & 0x3f | 0x80);
            }
            k++;
        }
    }

    (int i, DNSOutgoing dnsoutgoing)
    {
        this(i, dnsoutgoing, 0);
    }

    <init>(int i, DNSOutgoing dnsoutgoing, int j)
    {
        super(i);
        _out = dnsoutgoing;
        _offset = j;
    }
}
