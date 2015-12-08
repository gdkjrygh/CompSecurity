// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

// Referenced classes of package javax.jmdns.impl:
//            DNSMessage, DNSRecord, DNSQuestion, DNSIncoming

public final class DNSOutgoing extends DNSMessage
{
    public static class MessageOutputStream extends ByteArrayOutputStream
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
            MessageOutputStream messageoutputstream;
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
            messageoutputstream = new MessageOutputStream(512, _out, _offset + size() + 2);
            dnsrecord.write(messageoutputstream);
            dnsrecord = messageoutputstream.toByteArray();
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

        MessageOutputStream(int i, DNSOutgoing dnsoutgoing)
        {
            this(i, dnsoutgoing, 0);
        }

        MessageOutputStream(int i, DNSOutgoing dnsoutgoing, int j)
        {
            super(i);
            _out = dnsoutgoing;
            _offset = j;
        }
    }


    public static boolean USE_DOMAIN_NAME_COMPRESSION = true;
    private final MessageOutputStream _additionalsAnswersBytes;
    private final MessageOutputStream _answersBytes;
    private final MessageOutputStream _authoritativeAnswersBytes;
    private int _maxUDPPayload;
    Map _names;
    private final MessageOutputStream _questionsBytes;

    public DNSOutgoing(int i)
    {
        this(i, true, 1460);
    }

    public DNSOutgoing(int i, boolean flag, int j)
    {
        super(i, 0, flag);
        _names = new HashMap();
        if (j > 0)
        {
            i = j;
        } else
        {
            i = 1460;
        }
        _maxUDPPayload = i;
        _questionsBytes = new MessageOutputStream(j, this);
        _answersBytes = new MessageOutputStream(j, this);
        _authoritativeAnswersBytes = new MessageOutputStream(j, this);
        _additionalsAnswersBytes = new MessageOutputStream(j, this);
    }

    public void addAnswer(DNSIncoming dnsincoming, DNSRecord dnsrecord)
        throws IOException
    {
        if (dnsincoming == null || !dnsrecord.suppressedBy(dnsincoming))
        {
            addAnswer(dnsrecord, 0L);
        }
    }

    public void addAnswer(DNSRecord dnsrecord, long l)
        throws IOException
    {
label0:
        {
            if (dnsrecord != null && (l == 0L || !dnsrecord.isExpired(l)))
            {
                MessageOutputStream messageoutputstream = new MessageOutputStream(512, this);
                messageoutputstream.writeRecord(dnsrecord, l);
                byte abyte0[] = messageoutputstream.toByteArray();
                if (abyte0.length >= availableSpace())
                {
                    break label0;
                }
                _answers.add(dnsrecord);
                _answersBytes.write(abyte0, 0, abyte0.length);
            }
            return;
        }
        throw new IOException("message full");
    }

    public void addAuthorativeAnswer(DNSRecord dnsrecord)
        throws IOException
    {
        MessageOutputStream messageoutputstream = new MessageOutputStream(512, this);
        messageoutputstream.writeRecord(dnsrecord, 0L);
        byte abyte0[] = messageoutputstream.toByteArray();
        if (abyte0.length < availableSpace())
        {
            _authoritativeAnswers.add(dnsrecord);
            _authoritativeAnswersBytes.write(abyte0, 0, abyte0.length);
            return;
        } else
        {
            throw new IOException("message full");
        }
    }

    public void addQuestion(DNSQuestion dnsquestion)
        throws IOException
    {
        MessageOutputStream messageoutputstream = new MessageOutputStream(512, this);
        messageoutputstream.writeQuestion(dnsquestion);
        byte abyte0[] = messageoutputstream.toByteArray();
        if (abyte0.length < availableSpace())
        {
            _questions.add(dnsquestion);
            _questionsBytes.write(abyte0, 0, abyte0.length);
            return;
        } else
        {
            throw new IOException("message full");
        }
    }

    public int availableSpace()
    {
        return _maxUDPPayload - 12 - _questionsBytes.size() - _answersBytes.size() - _authoritativeAnswersBytes.size() - _additionalsAnswersBytes.size();
    }

    public byte[] data()
    {
        long l = System.currentTimeMillis();
        _names.clear();
        MessageOutputStream messageoutputstream = new MessageOutputStream(_maxUDPPayload, this);
        int i;
        if (_multicast)
        {
            i = 0;
        } else
        {
            i = getId();
        }
        messageoutputstream.writeShort(i);
        messageoutputstream.writeShort(getFlags());
        messageoutputstream.writeShort(getNumberOfQuestions());
        messageoutputstream.writeShort(getNumberOfAnswers());
        messageoutputstream.writeShort(getNumberOfAuthorities());
        messageoutputstream.writeShort(getNumberOfAdditionals());
        for (Iterator iterator = _questions.iterator(); iterator.hasNext(); messageoutputstream.writeQuestion((DNSQuestion)iterator.next())) { }
        for (Iterator iterator1 = _answers.iterator(); iterator1.hasNext(); messageoutputstream.writeRecord((DNSRecord)iterator1.next(), l)) { }
        for (Iterator iterator2 = _authoritativeAnswers.iterator(); iterator2.hasNext(); messageoutputstream.writeRecord((DNSRecord)iterator2.next(), l)) { }
        for (Iterator iterator3 = _additionals.iterator(); iterator3.hasNext(); messageoutputstream.writeRecord((DNSRecord)iterator3.next(), l)) { }
        return messageoutputstream.toByteArray();
    }

    public int getMaxUDPPayload()
    {
        return _maxUDPPayload;
    }

    public boolean isQuery()
    {
        return (getFlags() & 0x8000) == 0;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        Object obj;
        if (isQuery())
        {
            obj = "dns[query:";
        } else
        {
            obj = "dns[response:";
        }
        stringbuffer.append(((String) (obj)));
        stringbuffer.append(" id=0x");
        stringbuffer.append(Integer.toHexString(getId()));
        if (getFlags() != 0)
        {
            stringbuffer.append(", flags=0x");
            stringbuffer.append(Integer.toHexString(getFlags()));
            if ((getFlags() & 0x8000) != 0)
            {
                stringbuffer.append(":r");
            }
            if ((getFlags() & 0x400) != 0)
            {
                stringbuffer.append(":aa");
            }
            if ((getFlags() & 0x200) != 0)
            {
                stringbuffer.append(":tc");
            }
        }
        if (getNumberOfQuestions() > 0)
        {
            stringbuffer.append(", questions=");
            stringbuffer.append(getNumberOfQuestions());
        }
        if (getNumberOfAnswers() > 0)
        {
            stringbuffer.append(", answers=");
            stringbuffer.append(getNumberOfAnswers());
        }
        if (getNumberOfAuthorities() > 0)
        {
            stringbuffer.append(", authorities=");
            stringbuffer.append(getNumberOfAuthorities());
        }
        if (getNumberOfAdditionals() > 0)
        {
            stringbuffer.append(", additionals=");
            stringbuffer.append(getNumberOfAdditionals());
        }
        if (getNumberOfQuestions() > 0)
        {
            stringbuffer.append("\nquestions:");
            DNSQuestion dnsquestion;
            for (obj = _questions.iterator(); ((Iterator) (obj)).hasNext(); stringbuffer.append(dnsquestion))
            {
                dnsquestion = (DNSQuestion)((Iterator) (obj)).next();
                stringbuffer.append("\n\t");
            }

        }
        if (getNumberOfAnswers() > 0)
        {
            stringbuffer.append("\nanswers:");
            DNSRecord dnsrecord;
            for (Iterator iterator = _answers.iterator(); iterator.hasNext(); stringbuffer.append(dnsrecord))
            {
                dnsrecord = (DNSRecord)iterator.next();
                stringbuffer.append("\n\t");
            }

        }
        if (getNumberOfAuthorities() > 0)
        {
            stringbuffer.append("\nauthorities:");
            DNSRecord dnsrecord1;
            for (Iterator iterator1 = _authoritativeAnswers.iterator(); iterator1.hasNext(); stringbuffer.append(dnsrecord1))
            {
                dnsrecord1 = (DNSRecord)iterator1.next();
                stringbuffer.append("\n\t");
            }

        }
        if (getNumberOfAdditionals() > 0)
        {
            stringbuffer.append("\nadditionals:");
            DNSRecord dnsrecord2;
            for (Iterator iterator2 = _additionals.iterator(); iterator2.hasNext(); stringbuffer.append(dnsrecord2))
            {
                dnsrecord2 = (DNSRecord)iterator2.next();
                stringbuffer.append("\n\t");
            }

        }
        stringbuffer.append("\nnames=");
        stringbuffer.append(_names);
        stringbuffer.append("]");
        return stringbuffer.toString();
    }

}
