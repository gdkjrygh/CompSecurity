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

public class by extends p.dn.a
{

    public static final d g;
    public static final int h;

    public by(int i)
    {
        super(h, "PNDR_UPDATE_NOTICE", 1, a(i));
    }

    public by(byte abyte0[])
    {
        super(h, "PNDR_UPDATE_NOTICE", 1, abyte0);
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

    private String d()
    {
        int i = c();
        switch (i)
        {
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "PNDR_NOTICE_SKIP_LIMIT_REACHED";

        case 1: // '\001'
            return "PNDR_NOTICE_STATION_LIMIT_REACHED";

        case 2: // '\002'
            return "PNDR_NOTICE_ERROR_TRACK_RATING";

        case 8: // '\b'
            return "PNDR_NOTICE_ERROR_TRACK_EXPLAIN";

        case 3: // '\003'
            return "PNDR_NOTICE_ERROR_STATION_DELETE";

        case 4: // '\004'
            return "PNDR_NOTICE_ERROR_SEARCH_EXTENDED";

        case 5: // '\005'
            return "PNDR_NOTICE_ERROR_SEARCH_SELECT";

        case 6: // '\006'
            return "PNDR_NOTICE_ERROR_BOOKMARK";

        case 7: // '\007'
            return "PNDR_NOTICE_ERROR_MAINTENANCE";

        case 9: // '\t'
            return "PNDR_NOTICE_ERROR_SESSION_ALREADY_STARTED";

        case 10: // '\n'
            return "PNDR_NOTICE_ERROR_NO_ACTIVE_SESSION";

        case 11: // '\013'
            return "PNDR_NOTICE_ERROR_APP_URL_NOT_SUPPORTED";

        case 12: // '\f'
            return "PNDR_NOTICE_ERROR_STATION_DOES_NOT_EXIST";
        }
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("code=");
            g1.append(d());
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
        g = a.av;
        h = g.c();
    }
}
