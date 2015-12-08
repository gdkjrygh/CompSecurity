// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.bouncycastle.i18n:
//            LocalizedMessage, MissingEntryException

public class TextBundle extends LocalizedMessage
{

    public static final String TEXT_ENTRY = "text";

    public TextBundle(String s, String s1)
        throws NullPointerException
    {
        super(s, s1);
    }

    public TextBundle(String s, String s1, String s2)
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2);
    }

    public TextBundle(String s, String s1, String s2, Object aobj[])
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2, aobj);
    }

    public TextBundle(String s, String s1, Object aobj[])
        throws NullPointerException
    {
        super(s, s1, aobj);
    }

    public String getText(Locale locale)
        throws MissingEntryException
    {
        return getEntry("text", locale, TimeZone.getDefault());
    }

    public String getText(Locale locale, TimeZone timezone)
        throws MissingEntryException
    {
        return getEntry("text", locale, timezone);
    }
}
