// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.support;

import bo.app.gq;
import bo.app.gr;
import com.appboy.Constants;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.appboy.support:
//            AppboyLogger

public final class ValidationUtils
{

    public static final int APPBOY_STRING_MAX_LENGTH = 255;
    public static final gq CUSTOM_ATTRIBUTE_RESERVED_KEYS = (new gr()).c("first_name").c("last_name").c("email").c("bio").c("gender").c("dob").c("country").c("home_city").c("email_subscribe").c("push_subscribe").c("phone").c("facebook").c("twitter").c("image_url").a();
    public static final gq CUSTOM_ATTRIBUTE_RESERVED_KEY_PREFIXES = (new gr()).c("appboy").a();
    private static final String a;
    private static String b = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static String c = "^[0-9 .\\(\\)\\+\\-]+$";

    public ValidationUtils()
    {
    }

    public static boolean customAttributeKeyHasReservedPrefix(String s)
    {
        s = s.trim();
        for (bo.app.hv hv = CUSTOM_ATTRIBUTE_RESERVED_KEY_PREFIXES.a(); hv.hasNext();)
        {
            String s1 = (String)hv.next();
            if (s.toLowerCase().startsWith(s1))
            {
                AppboyLogger.w(a, String.format("'%s' contains a reserved prefix. Cannot use the given key.", new Object[] {
                    s
                }));
                return true;
            }
        }

        return false;
    }

    public static boolean customAttributeKeyIsReservedKey(String s)
    {
        s = s.trim();
        if (CUSTOM_ATTRIBUTE_RESERVED_KEYS.contains(s))
        {
            AppboyLogger.w(a, String.format("'%s' is a reserved attribute key. Cannot use the given key.", new Object[] {
                s
            }));
            return true;
        } else
        {
            return false;
        }
    }

    public static String ensureAppboyFieldLength(String s)
    {
        String s1 = s.trim();
        s = s1;
        if (s1.length() > 255)
        {
            AppboyLogger.w(a, String.format("Provided string field is too long [%d]. The max length is %d, truncating provided field.", new Object[] {
                Integer.valueOf(s1.length()), Integer.valueOf(255)
            }));
            s = s1.substring(0, 255);
        }
        return s;
    }

    public static String[] ensureCustomAttributeArrayValues(String as[])
    {
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                as[i] = ensureAppboyFieldLength(as[i]);
            }

        }
        return as;
    }

    public static boolean isBlacklistedCustomAttributeKey(String s, Set set)
    {
        if (set.contains(s))
        {
            AppboyLogger.w(a, String.format("Custom attribute key cannot be blacklisted attribute: %s.", new Object[] {
                s
            }));
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean isValidCustomAttributeKey(String s)
    {
        if (s == null)
        {
            AppboyLogger.w(a, "Custom attribute key cannot be null.");
        } else
        if (!customAttributeKeyHasReservedPrefix(s) && !customAttributeKeyIsReservedKey(s))
        {
            return true;
        }
        return false;
    }

    public static boolean isValidCustomAttributeValue(String s)
    {
        if (s == null)
        {
            AppboyLogger.w(a, "Custom attribute value cannot be null.");
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean isValidEmailAddress(String s)
    {
        return s != null && s.toLowerCase().matches(b);
    }

    public static boolean isValidPhoneNumber(String s)
    {
        return s != null && s.matches(c);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/support/ValidationUtils.getName()
        });
    }
}
