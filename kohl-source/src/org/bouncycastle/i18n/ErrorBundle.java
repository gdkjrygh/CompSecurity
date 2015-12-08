// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.bouncycastle.i18n:
//            MessageBundle, MissingEntryException

public class ErrorBundle extends MessageBundle
{

    public static final String DETAIL_ENTRY = "details";
    public static final String SUMMARY_ENTRY = "summary";

    public ErrorBundle(String s, String s1)
        throws NullPointerException
    {
        super(s, s1);
    }

    public ErrorBundle(String s, String s1, String s2)
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2);
    }

    public ErrorBundle(String s, String s1, String s2, Object aobj[])
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2, aobj);
    }

    public ErrorBundle(String s, String s1, Object aobj[])
        throws NullPointerException
    {
        super(s, s1, aobj);
    }

    public String getDetail(Locale locale)
        throws MissingEntryException
    {
        return getEntry("details", locale, TimeZone.getDefault());
    }

    public String getDetail(Locale locale, TimeZone timezone)
        throws MissingEntryException
    {
        return getEntry("details", locale, timezone);
    }

    public String getSummary(Locale locale)
        throws MissingEntryException
    {
        return getEntry("summary", locale, TimeZone.getDefault());
    }

    public String getSummary(Locale locale, TimeZone timezone)
        throws MissingEntryException
    {
        return getEntry("summary", locale, timezone);
    }
}
