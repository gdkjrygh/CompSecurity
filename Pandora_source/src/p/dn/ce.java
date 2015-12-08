// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dm.g;
import p.dm.m;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class ce extends a
{

    public static final d g;
    public static final int h;

    public ce(int i)
    {
        super(h, "PNDR_UPDATE_STATUS", 1, b(i));
    }

    public ce(byte abyte0[])
    {
        super(h, "PNDR_UPDATE_STATUS", 1, abyte0);
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 1: // '\001'
            return "PNDR_STATUS_PLAYING";

        case 2: // '\002'
            return "PNDR_STATUS_PAUSED";

        case 3: // '\003'
            return "PNDR_STATUS_INCOMPATIBLE_API_VERSION";

        case 4: // '\004'
            if (m.g(2))
            {
                return "PNDR_STATUS_UNKNOWN_ERROR";
            } else
            {
                return "PNDR_STATUS_SEE_DEVICE";
            }

        case 5: // '\005'
            return "PNDR_STATUS_NO_STATIONS";

        case 6: // '\006'
            return "PNDR_STATUS_NO_STATION_ACTIVE";

        case 7: // '\007'
            return "PNDR_STATUS_INSUFFICIENT_CONNECTIVITY";

        case 8: // '\b'
            return "PNDR_STATUS_LICENSING_RESTRICTIONS";

        case 9: // '\t'
            return "PNDR_STATUS_INVALID_LOGIN";
        }
    }

    private static byte[] b(int i)
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
            g1.append("status=");
            g1.append(a(c()));
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
        g = at;
        h = g.c();
    }
}
