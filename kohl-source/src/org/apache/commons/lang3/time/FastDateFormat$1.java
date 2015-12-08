// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FormatCache, FastDateFormat

static class  extends FormatCache
{

    protected volatile Format createInstance(String s, TimeZone timezone, Locale locale)
    {
        return createInstance(s, timezone, locale);
    }

    protected FastDateFormat createInstance(String s, TimeZone timezone, Locale locale)
    {
        return new FastDateFormat(s, timezone, locale);
    }

    ()
    {
    }
}
