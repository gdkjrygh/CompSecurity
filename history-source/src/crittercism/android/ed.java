// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package crittercism.android:
//            ee

public final class ed
{
    final class a
        implements ee
    {

        final ed a;

        public final Date a()
        {
            return new Date();
        }

        private a()
        {
            a = ed.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public static final ed a = new ed();
    private ee b;
    private SimpleDateFormat c;

    private ed()
    {
        b = new a((byte)0);
        c = null;
        try
        {
            c = b();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static SimpleDateFormat b()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpledateformat;
    }

    public final long a(String s)
    {
        return c.parse(s).getTime();
    }

    public final String a()
    {
        return a(b.a());
    }

    public final String a(Date date)
    {
        if (c != null)
        {
            return c.format(date);
        } else
        {
            b();
            return "";
        }
    }

}
