// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Gservices
{

    public static final Uri CONTENT_PREFIX_URI = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern FALSE_PATTERN = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final Pattern TRUE_PATTERN = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static HashMap sCache;
    private static Context sPreCachePermissionCheckContext = null;
    private static String sPreloadedPrefixes[] = new String[0];
    private static Object sVersionToken;

    public Gservices()
    {
    }

    public static transient void bulkCacheByPrefix(ContentResolver contentresolver, String as[])
    {
        maybeEnforceCalingOrSelfPermission();
        Map map = getStringsByPrefix(contentresolver, as);
        com/google/android/gsf/Gservices;
        JVM INSTR monitorenter ;
        ensureCacheInitializedLocked(contentresolver);
        sPreloadedPrefixes = as;
        for (contentresolver = map.entrySet().iterator(); contentresolver.hasNext(); sCache.put(as.getKey(), as.getValue()))
        {
            as = (java.util.Map.Entry)contentresolver.next();
        }

        break MISSING_BLOCK_LABEL_79;
        contentresolver;
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        throw contentresolver;
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
    }

    private static void ensureCacheInitializedLocked(ContentResolver contentresolver)
    {
        if (sCache == null)
        {
            sCache = new HashMap();
            sVersionToken = new Object();
            (new Thread("Gservices", contentresolver) {

                final ContentResolver val$cr;

                public final void run()
                {
                    Looper.prepare();
                    cr.registerContentObserver(Gservices.CONTENT_URI, true, new ContentObserver(new Handler(Looper.myLooper())) {

                        final _cls1 this$0;

                        public final void onChange(boolean flag)
                        {
                            com/google/android/gsf/Gservices;
                            JVM INSTR monitorenter ;
                            Gservices.sCache.clear();
                            Gservices.sVersionToken = new Object();
                            if (Gservices.sPreloadedPrefixes.length > 0)
                            {
                                Gservices.bulkCacheByPrefix(cr, Gservices.sPreloadedPrefixes);
                            }
                            com/google/android/gsf/Gservices;
                            JVM INSTR monitorexit ;
                            return;
                            Exception exception;
                            exception;
                            com/google/android/gsf/Gservices;
                            JVM INSTR monitorexit ;
                            throw exception;
                        }

            
            {
                this$0 = _cls1.this;
                super(handler);
            }
                    });
                    Looper.loop();
                }

            
            {
                cr = contentresolver;
                super(s);
            }
            }).start();
        }
    }

    public static int getInt(ContentResolver contentresolver, String s, int i)
    {
        contentresolver = getString(contentresolver, s);
        if (contentresolver != null)
        {
            int j;
            try
            {
                j = Integer.parseInt(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return i;
            }
            return j;
        } else
        {
            return i;
        }
    }

    public static long getLong(ContentResolver contentresolver, String s, long l)
    {
        contentresolver = getString(contentresolver, s);
        if (contentresolver != null)
        {
            long l1;
            try
            {
                l1 = Long.parseLong(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return l;
            }
            return l1;
        } else
        {
            return l;
        }
    }

    private static String getString(ContentResolver contentresolver, String s)
    {
        return getString(contentresolver, s, null);
    }

    public static String getString(ContentResolver contentresolver, String s, String s1)
    {
        maybeEnforceCalingOrSelfPermission();
        com/google/android/gsf/Gservices;
        JVM INSTR monitorenter ;
        Object obj;
        ensureCacheInitializedLocked(contentresolver);
        obj = sVersionToken;
        if (!sCache.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        contentresolver = (String)sCache.get(s);
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        return s1;
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        String as[] = sPreloadedPrefixes;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (s.startsWith(as[i]))
            {
                break MISSING_BLOCK_LABEL_218;
            }
        }

        break MISSING_BLOCK_LABEL_94;
        contentresolver;
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        throw contentresolver;
        Cursor cursor;
        cursor = contentresolver.query(CONTENT_URI, null, null, new String[] {
            s
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        sCache.put(s, null);
        if (cursor != null)
        {
            cursor.close();
            return s1;
        }
        break MISSING_BLOCK_LABEL_218;
        contentresolver = cursor.getString(1);
        com/google/android/gsf/Gservices;
        JVM INSTR monitorenter ;
        if (obj == sVersionToken)
        {
            sCache.put(s, contentresolver);
        }
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        if (contentresolver == null)
        {
            contentresolver = s1;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return contentresolver;
        contentresolver;
        com/google/android/gsf/Gservices;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        if (cursor != null)
        {
            cursor.close();
        }
        throw contentresolver;
        return s1;
    }

    private static transient Map getStringsByPrefix(ContentResolver contentresolver, String as[])
    {
        maybeEnforceCalingOrSelfPermission();
        contentresolver = contentresolver.query(CONTENT_PREFIX_URI, null, null, as, null);
        as = new TreeMap();
        if (contentresolver == null)
        {
            return as;
        }
        for (; contentresolver.moveToNext(); as.put(contentresolver.getString(0), contentresolver.getString(1))) { }
        break MISSING_BLOCK_LABEL_69;
        as;
        contentresolver.close();
        throw as;
        contentresolver.close();
        return as;
    }

    private static void maybeEnforceCalingOrSelfPermission()
    {
        if (sPreCachePermissionCheckContext != null)
        {
            sPreCachePermissionCheckContext.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }




/*
    static Object access$102(Object obj)
    {
        sVersionToken = obj;
        return obj;
    }

*/

}
