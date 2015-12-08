// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            c

static abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/microsoft/onlineid/sts/b/a/c$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    public abstract Date a(String s)
        throws f;

    static 
    {
        a = new c.a("SecondsSinceEpoch") {

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
        b = new c.a("Iso8601DateTimeIgnoreTimeZone") {

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
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
