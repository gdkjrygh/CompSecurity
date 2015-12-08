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

static final class nit> extends nit>
{

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

    (String s)
    {
        super(s, 1, (byte)0);
    }
}
