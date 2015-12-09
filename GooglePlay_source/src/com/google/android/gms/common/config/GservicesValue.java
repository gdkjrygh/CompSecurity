// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.config;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gsf.Gservices;

public abstract class GservicesValue
{
    private static interface GservicesReader
    {

        public abstract Boolean getBoolean(String s, Boolean boolean1);

        public abstract Double getDouble(String s, Double double1);

        public abstract Float getFloat(String s, Float float1);

        public abstract Integer getInt(String s, Integer integer);

        public abstract Long getLong(String s, Long long1);

        public abstract String getString(String s, String s1);
    }

    private static final class GservicesReaderImpl
        implements GservicesReader
    {

        private final ContentResolver mContentResolver;

        public final Boolean getBoolean(String s, Boolean boolean1)
        {
            return Boolean.valueOf(Gservices.getBoolean(mContentResolver, s, boolean1.booleanValue()));
        }

        public final Double getDouble(String s, Double double1)
        {
            String s1 = Gservices.getString(mContentResolver, s, null);
            s = double1;
            if (s1 != null)
            {
                double d;
                try
                {
                    d = Double.parseDouble(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return double1;
                }
                s = Double.valueOf(d);
            }
            return s;
        }

        public final Float getFloat(String s, Float float1)
        {
            String s1 = Gservices.getString(mContentResolver, s, null);
            s = float1;
            if (s1 != null)
            {
                float f;
                try
                {
                    f = Float.parseFloat(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return float1;
                }
                s = Float.valueOf(f);
            }
            return s;
        }

        public final Integer getInt(String s, Integer integer)
        {
            return Integer.valueOf(Gservices.getInt(mContentResolver, s, integer.intValue()));
        }

        public final Long getLong(String s, Long long1)
        {
            return Long.valueOf(Gservices.getLong(mContentResolver, s, long1.longValue()));
        }

        public final String getString(String s, String s1)
        {
            return Gservices.getString(mContentResolver, s, s1);
        }

        public GservicesReaderImpl(ContentResolver contentresolver)
        {
            mContentResolver = contentresolver;
        }
    }


    private static String READ_PERMISSION = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    static GservicesReader sGservicesReader = null;
    private static final Object sLock = new Object();
    private static int sSharedUserId = 0;
    protected final Object mDefaultValue;
    protected final String mKey;
    private Object mOverride;

    protected GservicesValue(String s, Object obj)
    {
        mOverride = null;
        mKey = s;
        mDefaultValue = obj;
    }

    public static void init(Context context)
    {
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        int i;
        if (sGservicesReader == null)
        {
            sGservicesReader = new GservicesReaderImpl(context.getContentResolver());
        }
        i = sSharedUserId;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        sSharedUserId = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.e("GservicesValue", context.toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static GservicesValue value(String s, Double double1)
    {
        return new GservicesValue(s, double1) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getDouble(mKey, (Double)mDefaultValue);
            }

        };
    }

    public static GservicesValue value(String s, Float float1)
    {
        return new GservicesValue(s, float1) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getFloat(mKey, (Float)mDefaultValue);
            }

        };
    }

    public static GservicesValue value(String s, Integer integer)
    {
        return new GservicesValue(s, integer) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getInt(mKey, (Integer)mDefaultValue);
            }

        };
    }

    public static GservicesValue value(String s, Long long1)
    {
        return new GservicesValue(s, long1) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getLong(mKey, (Long)mDefaultValue);
            }

        };
    }

    public static GservicesValue value(String s, String s1)
    {
        return new GservicesValue(s, s1) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getString(mKey, (String)mDefaultValue);
            }

        };
    }

    public static GservicesValue value(String s, boolean flag)
    {
        return new GservicesValue(s, Boolean.valueOf(flag)) {

            protected final volatile Object retrieve$9543ced()
            {
                return GservicesValue.sGservicesReader.getBoolean(mKey, (Boolean)mDefaultValue);
            }

        };
    }

    public final Object get()
    {
        return retrieve$9543ced();
    }

    public final Object getBinderSafe()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = retrieve$9543ced();
        Binder.restoreCallingIdentity(l);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

    public final String getKey()
    {
        return mKey;
    }

    protected abstract Object retrieve$9543ced();

}
