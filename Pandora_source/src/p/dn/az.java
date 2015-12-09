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

public class az extends p.dn.a
{

    public static final d g;
    public static final int h;

    public az(int i)
    {
        super(h, "PNDR_RETURN_GENRE_CATEGORY_COUNT", 1, a(i));
    }

    public az(byte abyte0[])
    {
        super(h, "PNDR_RETURN_GENRE_CATEGORY_COUNT", 1, abyte0);
    }

    private static byte[] a(int i)
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new d(i)).b());
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
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("count=");
            g1.append(c());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public int c()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    static 
    {
        g = a.aW;
        h = g.c();
    }
}
