// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils.config;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gsf.Gservices;

public abstract class GservicesValue
{
    private static interface GservicesReader
    {

        public abstract Boolean getBoolean(String s, Boolean boolean1);

        public abstract Float getFloat(String s, Float float1);

        public abstract Integer getInt(String s, Integer integer);

        public abstract Long getLong(String s, Long long1);

        public abstract String getPartnerString(String s, String s1);

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

        public final String getPartnerString(String s, String s1)
        {
            return com.google.android.gsf.GoogleSettingsContract.Partner.getString(mContentResolver, s, s1);
        }

        public final String getString(String s, String s1)
        {
            return Gservices.getString(mContentResolver, s, s1);
        }

        public GservicesReaderImpl(ContentResolver contentresolver, String as[])
        {
            mContentResolver = contentresolver;
            Gservices.bulkCacheByPrefix(mContentResolver, as);
        }
    }


    static GservicesReader sGservicesReader = null;
    private final String mKey;
    private Object mOverride;

    private GservicesValue(String s)
    {
        mOverride = null;
        mKey = s;
    }

    GservicesValue(String s, byte byte0)
    {
        this(s);
    }

    public static void init(Context context, String as[])
    {
        sGservicesReader = new GservicesReaderImpl(context.getContentResolver(), as);
    }

    public static GservicesValue partnerSetting(String s, String s1)
    {
        return new GservicesValue(s, s, s1) {

            final String val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getPartnerString(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = s2;
                super(s, (byte)0);
            }
        };
    }

    public static GservicesValue value(String s, Boolean boolean1)
    {
        return new GservicesValue(s, s, boolean1) {

            final Boolean val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getBoolean(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = boolean1;
                super(s, (byte)0);
            }
        };
    }

    public static GservicesValue value(String s, Float float1)
    {
        return new GservicesValue(s, s, float1) {

            final Float val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getFloat(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = float1;
                super(s, (byte)0);
            }
        };
    }

    public static GservicesValue value(String s, Integer integer)
    {
        return new GservicesValue(s, s, integer) {

            final Integer val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getInt(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = integer;
                super(s, (byte)0);
            }
        };
    }

    public static GservicesValue value(String s, Long long1)
    {
        return new GservicesValue(s, s, long1) {

            final Long val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getLong(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = long1;
                super(s, (byte)0);
            }
        };
    }

    public static GservicesValue value(String s, String s1)
    {
        return new GservicesValue(s, s, s1) {

            final String val$defaultValue;
            final String val$key;

            protected final volatile Object retrieve()
            {
                return GservicesValue.sGservicesReader.getString(key, defaultValue);
            }

            
            {
                key = s1;
                defaultValue = s2;
                super(s, (byte)0);
            }
        };
    }

    public final Object get()
    {
        return retrieve();
    }

    protected abstract Object retrieve();

}
