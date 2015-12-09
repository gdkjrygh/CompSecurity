// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package b.a:
//            fd, fe

public final class fc
{

    public static final fc a = new fc();
    private fe b;
    private ThreadLocal c;
    private ThreadLocal d;

    private fc()
    {
        b = new fd(this, (byte)0);
        c = new ThreadLocal();
        d = new ThreadLocal();
    }

    private SimpleDateFormat b()
    {
        SimpleDateFormat simpledateformat1 = (SimpleDateFormat)c.get();
        SimpleDateFormat simpledateformat = simpledateformat1;
        if (simpledateformat1 == null)
        {
            simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
            simpledateformat.setLenient(false);
            c.set(simpledateformat);
        }
        return simpledateformat;
    }

    public final long a(String s)
    {
        Date date = b().parse(s);
        s = date;
_L2:
        return s.getTime();
        ParseException parseexception;
        parseexception;
        SimpleDateFormat simpledateformat1 = (SimpleDateFormat)d.get();
        SimpleDateFormat simpledateformat = simpledateformat1;
        if (simpledateformat1 == null)
        {
            simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
            simpledateformat.setLenient(false);
            d.set(simpledateformat);
        }
        s = simpledateformat.parse(s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a()
    {
        return a(b.a());
    }

    public final String a(Date date)
    {
        return b().format(date);
    }

}
