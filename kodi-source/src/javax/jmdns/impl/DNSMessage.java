// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package javax.jmdns.impl:
//            DNSQuestion, DNSRecord

public abstract class DNSMessage
{

    protected final List _additionals = Collections.synchronizedList(new LinkedList());
    protected final List _answers = Collections.synchronizedList(new LinkedList());
    protected final List _authoritativeAnswers = Collections.synchronizedList(new LinkedList());
    private int _flags;
    private int _id;
    boolean _multicast;
    protected final List _questions = Collections.synchronizedList(new LinkedList());

    protected DNSMessage(int i, int j, boolean flag)
    {
        _flags = i;
        _id = j;
        _multicast = flag;
    }

    public Collection getAdditionals()
    {
        return _additionals;
    }

    public Collection getAllAnswers()
    {
        ArrayList arraylist = new ArrayList(_answers.size() + _authoritativeAnswers.size() + _additionals.size());
        arraylist.addAll(_answers);
        arraylist.addAll(_authoritativeAnswers);
        arraylist.addAll(_additionals);
        return arraylist;
    }

    public Collection getAnswers()
    {
        return _answers;
    }

    public Collection getAuthorities()
    {
        return _authoritativeAnswers;
    }

    public int getFlags()
    {
        return _flags;
    }

    public int getId()
    {
        if (_multicast)
        {
            return 0;
        } else
        {
            return _id;
        }
    }

    public int getNumberOfAdditionals()
    {
        return getAdditionals().size();
    }

    public int getNumberOfAnswers()
    {
        return getAnswers().size();
    }

    public int getNumberOfAuthorities()
    {
        return getAuthorities().size();
    }

    public int getNumberOfQuestions()
    {
        return getQuestions().size();
    }

    public Collection getQuestions()
    {
        return _questions;
    }

    public boolean isEmpty()
    {
        return getNumberOfQuestions() + getNumberOfAnswers() + getNumberOfAuthorities() + getNumberOfAdditionals() == 0;
    }

    public boolean isMulticast()
    {
        return _multicast;
    }

    public boolean isQuery()
    {
        return (_flags & 0x8000) == 0;
    }

    public boolean isTruncated()
    {
        return (_flags & 0x200) != 0;
    }

    String print()
    {
        StringBuffer stringbuffer = new StringBuffer(200);
        stringbuffer.append(toString());
        stringbuffer.append("\n");
        for (Iterator iterator = _questions.iterator(); iterator.hasNext(); stringbuffer.append("\n"))
        {
            DNSQuestion dnsquestion = (DNSQuestion)iterator.next();
            stringbuffer.append("\tquestion:      ");
            stringbuffer.append(dnsquestion);
        }

        for (Iterator iterator1 = _answers.iterator(); iterator1.hasNext(); stringbuffer.append("\n"))
        {
            DNSRecord dnsrecord = (DNSRecord)iterator1.next();
            stringbuffer.append("\tanswer:        ");
            stringbuffer.append(dnsrecord);
        }

        for (Iterator iterator2 = _authoritativeAnswers.iterator(); iterator2.hasNext(); stringbuffer.append("\n"))
        {
            DNSRecord dnsrecord1 = (DNSRecord)iterator2.next();
            stringbuffer.append("\tauthoritative: ");
            stringbuffer.append(dnsrecord1);
        }

        for (Iterator iterator3 = _additionals.iterator(); iterator3.hasNext(); stringbuffer.append("\n"))
        {
            DNSRecord dnsrecord2 = (DNSRecord)iterator3.next();
            stringbuffer.append("\tadditional:    ");
            stringbuffer.append(dnsrecord2);
        }

        return stringbuffer.toString();
    }

    protected String print(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(4000);
        int j = 0;
        int k = abyte0.length;
        do
        {
label0:
            {
                if (j < k)
                {
                    int l = Math.min(32, k - j);
                    if (j < 16)
                    {
                        stringbuilder.append(' ');
                    }
                    if (j < 256)
                    {
                        stringbuilder.append(' ');
                    }
                    if (j < 4096)
                    {
                        stringbuilder.append(' ');
                    }
                    stringbuilder.append(Integer.toHexString(j));
                    stringbuilder.append(':');
                    int i;
                    for (i = 0; i < l; i++)
                    {
                        if (i % 8 == 0)
                        {
                            stringbuilder.append(' ');
                        }
                        stringbuilder.append(Integer.toHexString((abyte0[j + i] & 0xf0) >> 4));
                        stringbuilder.append(Integer.toHexString((abyte0[j + i] & 0xf) >> 0));
                    }

                    if (i < 32)
                    {
                        for (; i < 32; i++)
                        {
                            if (i % 8 == 0)
                            {
                                stringbuilder.append(' ');
                            }
                            stringbuilder.append("  ");
                        }

                    }
                    stringbuilder.append("    ");
                    i = 0;
                    while (i < l) 
                    {
                        if (i % 8 == 0)
                        {
                            stringbuilder.append(' ');
                        }
                        int i1 = abyte0[j + i] & 0xff;
                        char c;
                        if (i1 > 32 && i1 < 127)
                        {
                            c = (char)i1;
                        } else
                        {
                            c = '.';
                        }
                        stringbuilder.append(c);
                        i++;
                    }
                    stringbuilder.append("\n");
                    if (j + 32 < 2048)
                    {
                        break label0;
                    }
                    stringbuilder.append("....\n");
                }
                return stringbuilder.toString();
            }
            j += 32;
        } while (true);
    }

    public void setFlags(int i)
    {
        _flags = i;
    }

    public void setId(int i)
    {
        _id = i;
    }
}
