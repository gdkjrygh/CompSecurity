// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

// Referenced classes of package org.bouncycastle.i18n:
//            LocalizedMessage

public class LocaleString extends LocalizedMessage
{

    public LocaleString(String s, String s1)
    {
        super(s, s1);
    }

    public LocaleString(String s, String s1, String s2)
        throws NullPointerException, UnsupportedEncodingException
    {
        super(s, s1, s2);
    }

    public String getLocaleString(Locale locale)
    {
        return getEntry(null, locale, null);
    }
}
