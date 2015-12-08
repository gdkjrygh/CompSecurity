// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.bouncycastle.i18n:
//            TextBundle, MissingEntryException

public class MessageBundle extends TextBundle
{

    public static final String TITLE_ENTRY = "title";

    public MessageBundle(String s, String s1)
        throws NullPointerException
    {
        super(s, s1);
    }

    public MessageBundle(String s, String s1, String s2)
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2);
    }

    public MessageBundle(String s, String s1, String s2, Object aobj[])
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2, aobj);
    }

    public MessageBundle(String s, String s1, Object aobj[])
        throws NullPointerException
    {
        super(s, s1, aobj);
    }

    public String getTitle(Locale locale)
        throws MissingEntryException
    {
        return getEntry("title", locale, TimeZone.getDefault());
    }

    public String getTitle(Locale locale, TimeZone timezone)
        throws MissingEntryException
    {
        return getEntry("title", locale, timezone);
    }
}
