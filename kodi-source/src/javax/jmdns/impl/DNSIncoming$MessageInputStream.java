// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.DNSLabel;

// Referenced classes of package javax.jmdns.impl:
//            DNSIncoming

public static class _names extends ByteArrayInputStream
{

    private static Logger logger1 = Logger.getLogger(javax/jmdns/impl/DNSIncoming$MessageInputStream.getName());
    final Map _names;

    public byte[] readBytes(int i)
    {
        byte abyte0[] = new byte[i];
        read(abyte0, 0, i);
        return abyte0;
    }

    public int readInt()
    {
        return readUnsignedShort() << 16 | readUnsignedShort();
    }

    public String readName()
    {
        HashMap hashmap = new HashMap();
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        do
        {
label0:
            {
                int j;
label1:
                {
                    if (i == 0)
                    {
                        j = read();
                        if (j != 0)
                        {
                            break label1;
                        }
                    }
                    Integer integer;
                    for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); _names.put(integer, ((StringBuilder)hashmap.get(integer)).toString()))
                    {
                        integer = (Integer)iterator.next();
                    }

                    break label0;
                }
                switch (jmdns.impl.constants.DNSLabel[DNSLabel.labelForByte(j).ordinal()])
                {
                default:
                    logger1.severe((new StringBuilder()).append("unsupported dns label type: '").append(Integer.toHexString(j & 0xc0)).append("'").toString());
                    break;

                case 1: // '\001'
                    int k = pos;
                    String s = (new StringBuilder()).append(readUTF(j)).append(".").toString();
                    stringbuilder.append(s);
                    for (Iterator iterator1 = hashmap.values().iterator(); iterator1.hasNext(); ((StringBuilder)iterator1.next()).append(s)) { }
                    hashmap.put(Integer.valueOf(k - 1), new StringBuilder(s));
                    break;

                case 2: // '\002'
                    i = DNSLabel.labelValue(j) << 8 | read();
                    String s2 = (String)_names.get(Integer.valueOf(i));
                    String s1 = s2;
                    if (s2 == null)
                    {
                        logger1.severe((new StringBuilder()).append("bad domain name: possible circular name detected. Bad offset: 0x").append(Integer.toHexString(i)).append(" at 0x").append(Integer.toHexString(pos - 2)).toString());
                        s1 = "";
                    }
                    stringbuilder.append(s1);
                    for (Iterator iterator2 = hashmap.values().iterator(); iterator2.hasNext(); ((StringBuilder)iterator2.next()).append(s1)) { }
                    i = 1;
                    break;

                case 3: // '\003'
                    logger1.severe("Extended label are not currently supported.");
                    break;
                }
                continue;
            }
            return stringbuilder.toString();
        } while (true);
    }

    public String readNonNameString()
    {
        return readUTF(read());
    }

    public String readUTF(int i)
    {
        StringBuilder stringbuilder;
        int l;
        stringbuilder = new StringBuilder(i);
        l = 0;
_L2:
        int j;
        int k;
        int i1;
        if (l >= i)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        i1 = read();
        j = i1;
        k = l;
        switch (i1 >> 4)
        {
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        default:
            j = (i1 & 0x3f) << 4 | read() & 0xf;
            k = l + 1;
            break;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            break;

        case 12: // '\f'
        case 13: // '\r'
            break; /* Loop/switch isn't completed */

        case 14: // '\016'
            break MISSING_BLOCK_LABEL_172;
        }
_L3:
        stringbuilder.append((char)j);
        l = k + 1;
        if (true) goto _L2; else goto _L1
_L1:
        j = (i1 & 0x1f) << 6 | read() & 0x3f;
        k = l + 1;
          goto _L3
        j = (i1 & 0xf) << 12 | (read() & 0x3f) << 6 | read() & 0x3f;
        k = l + 1 + 1;
          goto _L3
        return stringbuilder.toString();
    }

    public int readUnsignedShort()
    {
        return read() << 8 | read();
    }


    public (byte abyte0[], int i)
    {
        this(abyte0, 0, i);
    }

    public <init>(byte abyte0[], int i, int j)
    {
        super(abyte0, i, j);
        _names = new HashMap();
    }
}
