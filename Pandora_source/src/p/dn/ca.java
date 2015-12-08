// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.ds.c;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class ca extends p.dn.a
{

    public static final d g;
    public static final int h;

    public ca(int i)
    {
        super(h, "PNDR_UPDATE_STATION_ACTIVE", 1, a(i));
    }

    public ca(byte abyte0[])
    {
        super(h, "PNDR_UPDATE_STATION_ACTIVE", 1, abyte0);
    }

    private static byte[] a(int i)
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i)).b());
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            return new byte[0];
        }
        return abyte0;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            StringBuffer stringbuffer = new StringBuffer(a());
            stringbuffer.append(" {");
            stringbuffer.append("stationId=");
            int i = c();
            if (i == 0)
            {
                g1 = "PNDR_STATION_NONE";
            } else
            {
                g1 = Integer.toString(i);
            }
            stringbuffer.append(g1);
            stringbuffer.append("}");
            return stringbuffer.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public int c()
    {
        byte abyte0[] = new byte[4];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new c(abyte0)).c();
    }

    static 
    {
        g = a.aN;
        h = g.c();
    }
}
