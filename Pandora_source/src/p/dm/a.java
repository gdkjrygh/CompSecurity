// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;


// Referenced classes of package p.dm:
//            f, g

public class a extends f
{

    public a(byte byte0)
    {
        a = byte0;
    }

    public String a()
    {
        return "ACK";
    }

    public String a(g g1)
    {
        if (g1 == g.b)
        {
            return (new StringBuilder()).append("ACK  : [").append(super.toString()).append("]").toString();
        } else
        {
            return toString();
        }
    }

    public Object clone()
    {
        a a1 = new a(a);
        byte abyte0[] = new byte[c.length];
        System.arraycopy(c, 0, abyte0, 0, abyte0.length);
        a1.c = abyte0;
        return a1;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[");
        stringbuffer.append(a);
        stringbuffer.append("] ");
        stringbuffer.append(a());
        return stringbuffer.toString();
    }
}
