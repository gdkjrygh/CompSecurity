// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class Messages
{

    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("org.keyczar.i18n.messages");

    public static transient String getString(String s, Object aobj[])
    {
        try
        {
            aobj = MessageFormat.format(RESOURCE_BUNDLE.getString(s), aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return (new StringBuilder(String.valueOf(s).length() + 2)).append("!").append(s).append("!").toString();
        }
        return ((String) (aobj));
    }

}
