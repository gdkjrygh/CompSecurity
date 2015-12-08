// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gi;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public final class CastMediaControlIntent
{

    public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
    public static final String CATEGORY_CAST = "com.google.android.gms.cast.CATEGORY_CAST";
    public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
    public static final int ERROR_CODE_REQUEST_FAILED = 1;
    public static final int ERROR_CODE_SESSION_START_FAILED = 2;
    public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
    public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
    public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
    public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
    public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
    public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
    public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
    public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    private CastMediaControlIntent()
    {
    }

    private static String a(String s, String s1, Collection collection)
        throws IllegalArgumentException
    {
        s = new StringBuffer(s);
        if (s1 != null)
        {
            if (!s1.matches("[A-F0-9]+") && !s1.equals("00000000-0000-0000-0000-000000000000"))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid application ID: ").append(s1).toString());
            }
            s.append("/").append(s1);
        }
        if (collection != null)
        {
            if (collection.isEmpty())
            {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            for (Iterator iterator = collection.iterator(); iterator.hasNext();)
            {
                String s2 = (String)iterator.next();
                if (TextUtils.isEmpty(s2) || s2.trim().equals(""))
                {
                    throw new IllegalArgumentException("Namespaces must not be null or empty");
                }
            }

            if (s1 == null)
            {
                s.append("/");
            }
            s.append("/").append(TextUtils.join(",", collection));
        }
        return s.toString();
    }

    public static String categoryForCast(String s)
        throws IllegalArgumentException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else
        {
            return a("com.google.android.gms.cast.CATEGORY_CAST", s, null);
        }
    }

    public static String categoryForCast(String s, Collection collection)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection == null)
        {
            throw new IllegalArgumentException("namespaces cannot be null");
        } else
        {
            return a("com.google.android.gms.cast.CATEGORY_CAST", s, collection);
        }
    }

    public static String categoryForCast(Collection collection)
        throws IllegalArgumentException
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("namespaces cannot be null");
        } else
        {
            return a("com.google.android.gms.cast.CATEGORY_CAST", null, collection);
        }
    }

    public static String categoryForRemotePlayback()
    {
        return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", null, null);
    }

    public static String categoryForRemotePlayback(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("applicationId cannot be null or empty");
        } else
        {
            return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", s, null);
        }
    }

    public static String languageTagForLocale(Locale locale)
    {
        return gi.b(locale);
    }
}
