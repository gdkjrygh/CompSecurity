// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class e extends p.dn.a
{

    public static final d g;
    public static final int h;

    public e(boolean flag, byte abyte0[])
    {
        super(h, "PNDR_ECHO_RESPONSE", 1, d(abyte0));
    }

    public e(byte abyte0[])
    {
        super(h, "PNDR_ECHO_RESPONSE", 1, abyte0);
    }

    private static byte[] d(byte abyte0[])
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write(abyte0);
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return new byte[0];
        }
        return abyte0;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("data=");
            g1.append("[");
            g1.append(b(c()));
            g1.append("]");
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public byte[] c()
    {
        byte abyte0[] = new byte[100];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    static 
    {
        g = a.bf;
        h = g.c();
    }
}
