// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.SharedPreferences;
import com.soundcloud.android.rx.PreferenceChangeOnSubscribe;
import rx.b;
import rx.b.f;

public class OfflineSettingsStorage
{

    private static final String ENCRYPTION_TEST_DONE = "encryption_test_run";
    private static final f FILTER_WIFI_ONLY_KEY = new _cls1();
    private static final String OFFLINE_CONTENT = "has_content_offline";
    private static final String OFFLINE_STORAGE_LIMIT = "offline_storage_limit";
    private static final String OFFLINE_WIFI_ONLY = "offline_wifi_only";
    public static final long UNLIMITED = 0x7fffffffffffffffL;
    private final SharedPreferences sharedPreferences;
    private final f toValue = new _cls2();

    public OfflineSettingsStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void clear()
    {
        sharedPreferences.edit().clear().apply();
    }

    public long getStorageLimit()
    {
        return sharedPreferences.getLong("offline_storage_limit", 0x7fffffffffffffffL);
    }

    b getWifiOnlyOfflineSyncStateChange()
    {
        return b.create(new PreferenceChangeOnSubscribe(sharedPreferences)).filter(FILTER_WIFI_ONLY_KEY).map(toValue);
    }

    public boolean hasOfflineContent()
    {
        return sharedPreferences.getBoolean("has_content_offline", false);
    }

    public boolean hasRunEncryptionTest()
    {
        return sharedPreferences.getBoolean("encryption_test_run", false);
    }

    public boolean hasStorageLimit()
    {
        return getStorageLimit() != 0x7fffffffffffffffL;
    }

    public boolean isWifiOnlyEnabled()
    {
        return sharedPreferences.getBoolean("offline_wifi_only", true);
    }

    public void setEncryptionTestRun()
    {
        sharedPreferences.edit().putBoolean("encryption_test_run", true).apply();
    }

    public void setHasOfflineContent(boolean flag)
    {
        sharedPreferences.edit().putBoolean("has_content_offline", flag).apply();
    }

    public void setStorageLimit(long l)
    {
        sharedPreferences.edit().putLong("offline_storage_limit", l).apply();
    }

    public void setStorageUnlimited()
    {
        setStorageLimit(0x7fffffffffffffffL);
    }

    public void setWifiOnlyEnabled(boolean flag)
    {
        sharedPreferences.edit().putBoolean("offline_wifi_only", flag).apply();
    }



    private class _cls2
        implements f
    {

        final OfflineSettingsStorage this$0;

        public Boolean call(String s)
        {
            return Boolean.valueOf(sharedPreferences.getBoolean(s, false));
        }

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        _cls2()
        {
            this$0 = OfflineSettingsStorage.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(String s)
        {
            return Boolean.valueOf("offline_wifi_only".equals(s));
        }

        public final volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        _cls1()
        {
        }
    }

}
