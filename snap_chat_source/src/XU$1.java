// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

static final class > extends ThreadLocal
{

    protected final Object initialValue()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpledateformat.setLenient(false);
        simpledateformat.setTimeZone(XU.a());
        return simpledateformat;
    }

    >()
    {
    }
}
