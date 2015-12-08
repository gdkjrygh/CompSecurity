// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            eo, dh, fe

public class dk
{

    private static final String a = com/flurry/sdk/dk.getSimpleName();
    private boolean b;
    private List c;
    private long d;

    public dk()
    {
        d = -1L;
    }

    private static String a(String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = s;
            if (s.length() > 4)
            {
                obj = new StringBuilder();
                for (int i = 0; i < s.length() - 4; i++)
                {
                    ((StringBuilder) (obj)).append('*');
                }

                ((StringBuilder) (obj)).append(s.substring(s.length() - 4));
                obj = ((StringBuilder) (obj)).toString();
            }
        }
        return ((String) (obj));
    }

    private boolean a(String s, DataInputStream datainputstream)
        throws IOException
    {
        int i = datainputstream.readUnsignedShort();
        eo.a(3, a, (new StringBuilder("File version: ")).append(i).toString());
        if (i > 2)
        {
            eo.a(6, a, (new StringBuilder("Unknown agent file version: ")).append(i).toString());
            throw new IOException((new StringBuilder("Unknown agent file version: ")).append(i).toString());
        }
        if (i >= 2)
        {
            Object obj = datainputstream.readUTF();
            eo.a(3, a, (new StringBuilder("Loading API key: ")).append(a(s)).toString());
            if (((String) (obj)).equals(s))
            {
                s = new ArrayList();
                datainputstream.readUTF();
                boolean flag = datainputstream.readBoolean();
                long l = datainputstream.readLong();
                eo.a(3, a, "Loading session reports");
                i = 0;
                do
                {
                    int j = datainputstream.readUnsignedShort();
                    if (j != 0)
                    {
                        obj = new byte[j];
                        datainputstream.readFully(((byte []) (obj)));
                        s.add(0, new dh(((byte []) (obj))));
                        obj = a;
                        StringBuilder stringbuilder = new StringBuilder("Session report added: ");
                        i++;
                        eo.a(3, ((String) (obj)), stringbuilder.append(i).toString());
                    } else
                    {
                        eo.a(3, a, "Persistent file loaded");
                        a(flag);
                        a(l);
                        a(((List) (s)));
                        return true;
                    }
                } while (true);
            } else
            {
                eo.a(3, a, (new StringBuilder("Api keys do not match, old: ")).append(a(s)).append(", new: ").append(a(((String) (obj)))).toString());
                return false;
            }
        } else
        {
            eo.a(5, a, (new StringBuilder("Deleting old file version: ")).append(i).toString());
            return false;
        }
    }

    public void a(long l)
    {
        d = l;
    }

    public void a(DataOutputStream dataoutputstream, String s, String s1)
        throws IOException
    {
        int i;
        dataoutputstream.writeShort(46586);
        dataoutputstream.writeShort(2);
        dataoutputstream.writeUTF(s);
        dataoutputstream.writeUTF(s1);
        dataoutputstream.writeBoolean(b);
        dataoutputstream.writeLong(d);
        i = c.size() - 1;
_L2:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        int j;
        s = ((dh)c.get(i)).a();
        j = s.length;
        if (j + 2 + dataoutputstream.size() <= 50000)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        eo.a(6, a, (new StringBuilder("discarded sessions: ")).append(i).toString());
        dataoutputstream.writeShort(0);
        fe.a(dataoutputstream);
        return;
        dataoutputstream.writeShort(j);
        dataoutputstream.write(s);
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        eo.a(6, a, "", s);
        throw new IOException(s.getMessage());
        s;
        fe.a(dataoutputstream);
        throw s;
    }

    public void a(List list)
    {
        c = list;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public boolean a(DataInputStream datainputstream, String s)
        throws IOException
    {
        boolean flag = false;
        int i;
        i = datainputstream.readUnsignedShort();
        eo.a(4, a, (new StringBuilder("Magic: ")).append(i).toString());
        if (i != 46586) goto _L2; else goto _L1
_L1:
        flag = a(s, datainputstream);
_L4:
        fe.a(datainputstream);
        return flag;
_L2:
        eo.a(3, a, "Unexpected file type");
        if (true) goto _L4; else goto _L3
_L3:
        s;
        eo.a(6, a, "Error when loading persistent file", s);
        throw new IOException(s.getMessage());
        s;
        fe.a(datainputstream);
        throw s;
    }

    public List b()
    {
        return c;
    }

    public long c()
    {
        return d;
    }

}
