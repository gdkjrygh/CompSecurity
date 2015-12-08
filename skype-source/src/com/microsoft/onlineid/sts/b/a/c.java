// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a

public final class c extends com.microsoft.onlineid.sts.b.a.a
{
    static abstract class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/sts/b/a/c$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        public abstract Date a(String s)
            throws f;

        static 
        {
            a = new a("SecondsSinceEpoch") {

                public final Date a(String s)
                    throws f
                {
                    Date date;
                    try
                    {
                        date = new Date(1000L * Long.parseLong(s));
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw new f("Cannot parse date node: %s", illegalargumentexception, new Object[] {
                            s
                        });
                    }
                    return date;
                }

            };
            b = new a("Iso8601DateTimeIgnoreTimeZone") {

                public final Date a(String s)
                    throws f
                {
                    try
                    {
                        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
                        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        s = simpledateformat.parse(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new f(s);
                    }
                    return s;
                }

            };
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private final a d;
    private Date e;

    public c(XmlPullParser xmlpullparser, a a1)
        throws XmlPullParserException
    {
        super(xmlpullparser, null, null);
        d = a1;
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        e = d.a(d());
    }

    final Date j()
    {
        i();
        return e;
    }
}
