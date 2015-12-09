// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.sharedpreferences;

import android.content.SharedPreferences;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class SharedPreference
{
    static final class BooleanSharedPreference extends SharedPreference
    {

        private Boolean get(SharedPreferences sharedpreferences)
        {
            return Boolean.valueOf(sharedpreferences.getBoolean(getKey(), ((Boolean)getDefaultValue()).booleanValue()));
        }

        private android.content.SharedPreferences.Editor putIntoEditor(Boolean boolean1, android.content.SharedPreferences.Editor editor)
        {
            return editor.putBoolean(getKey(), boolean1.booleanValue());
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((Boolean)obj, editor);
        }

        private BooleanSharedPreference(String s, Boolean boolean1)
        {
            super(s, boolean1, null);
        }

    }

    static final class ByteArraySharedPreference extends SharedPreference
    {

        private final String stringDefaultValue;

        private byte[] get(SharedPreferences sharedpreferences)
        {
            return BaseEncoding.base64().decode(sharedpreferences.getString(getKey(), stringDefaultValue));
        }

        private android.content.SharedPreferences.Editor putIntoEditor(byte abyte0[], android.content.SharedPreferences.Editor editor)
        {
            return editor.putString(getKey(), BaseEncoding.base64().encode(abyte0));
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((byte[])obj, editor);
        }

        private ByteArraySharedPreference(String s, byte abyte0[])
        {
            super(s, abyte0, null);
            stringDefaultValue = BaseEncoding.base64().encode(abyte0);
        }

    }

    static final class IntSharedPreference extends SharedPreference
    {

        private Integer get(SharedPreferences sharedpreferences)
        {
            return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)getDefaultValue()).intValue()));
        }

        private android.content.SharedPreferences.Editor putIntoEditor(Integer integer, android.content.SharedPreferences.Editor editor)
        {
            return editor.putInt(getKey(), integer.intValue());
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((Integer)obj, editor);
        }

        private IntSharedPreference(String s, Integer integer)
        {
            super(s, integer, null);
        }

    }

    static final class LongSharedPreference extends SharedPreference
    {

        private Long get(SharedPreferences sharedpreferences)
        {
            return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)getDefaultValue()).longValue()));
        }

        private android.content.SharedPreferences.Editor putIntoEditor(Long long1, android.content.SharedPreferences.Editor editor)
        {
            return editor.putLong(getKey(), long1.longValue());
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((Long)obj, editor);
        }

        private LongSharedPreference(String s, Long long1)
        {
            super(s, long1, null);
        }

    }

    static final class StringSetPreference extends SharedPreference
    {

        private Set get(SharedPreferences sharedpreferences)
        {
            return sharedpreferences.getStringSet(getKey(), (Set)getDefaultValue());
        }

        private android.content.SharedPreferences.Editor putIntoEditor(Set set, android.content.SharedPreferences.Editor editor)
        {
            return editor.putStringSet(getKey(), set);
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((Set)obj, editor);
        }

        private StringSetPreference(String s, Set set)
        {
            super(s, set, null);
        }

    }

    static final class StringSharedPreference extends SharedPreference
    {

        private String get(SharedPreferences sharedpreferences)
        {
            return sharedpreferences.getString(getKey(), (String)getDefaultValue());
        }

        private android.content.SharedPreferences.Editor putIntoEditor(String s, android.content.SharedPreferences.Editor editor)
        {
            return editor.putString(getKey(), s);
        }

        public final volatile Object get(SharedPreferences sharedpreferences)
        {
            return get(sharedpreferences);
        }

        public final volatile android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor)
        {
            return putIntoEditor((String)obj, editor);
        }

        private StringSharedPreference(String s, String s1)
        {
            super(s, s1, null);
        }

    }


    public static final SharedPreference ACCOUNT_NAME = newStringKey("USER_ID", "");
    public static final SharedPreference ADD_GIFT_CARD_WARNING_DIALOG_DISPLAYED = newBooleanKey("ADD_GIFT_CARD_WARNING_DIALOG_DISPLAYED", Boolean.valueOf(false));
    public static final SharedPreference ALLOW_REMOVING_GEOFENCING_NOTIFICATION = newBooleanKey("WALLET_ALLOW_REMOVING_GEOFENCING_NOTIFICATION", Boolean.valueOf(true));
    public static final SharedPreference BANK_ACCOUNTS_DB_CACHE_HAS_DATA = newBooleanKey("BANK_ACCOUNTS_DB_CACHE_HAS_DATA", Boolean.valueOf(false));
    public static final SharedPreference BOOT_OR_UPGRADE_GENERATION_NUMBER = newLongKey("BOOT_OR_UPGRADE_GENERATION_NUMBER", Long.valueOf(0L));
    public static final SharedPreference CACHED_MCC_MNC = newStringKey("CACHED_MCC_MNC", "");
    public static final SharedPreference CACHED_OPERATOR_NAME = newStringKey("KEY_CACHED_OPERATOR_NAME", "");
    public static final SharedPreference CHANGED_USER = newBooleanKey("CHANGED_USER", Boolean.valueOf(false));
    public static final SharedPreference CLIENT_CONFIGURATION_INTITIALIZED = newBooleanKey("KEY_CLIENT_CONFIGURATION_INTITIALIZED", Boolean.valueOf(false));
    public static final SharedPreference DEACTIVATED_PLASTIC_CARD_TILE_DISMISSED = newBooleanKey("DEACTIVATED_PLASTIC_CARD_TILE_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference DISPLAYED_NOTIFICATION_IDS = newStringSetKey("DISPLAYED_NOTIFICATION_IDS", new LinkedHashSet());
    public static final SharedPreference GEOFENCING_SETTINGS_REMINDER_DIALOG_DISMISSED = newBooleanKey("GEOFENCING_SETTINGS_REMINDER_DIALOG_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference GET_HCE_BUNDLE_CALL_ERROR = newByteArrayKey("KEY_GET_HCE_BUNDLE_CALL_ERROR", new byte[0]);
    public static final SharedPreference HCE_HANDLED_BY_GMS_CORE = newBooleanKey("HCE_HANDLED_BY_GMS_CORE", Boolean.valueOf(false));
    public static final SharedPreference HCE_PAYMENT_SETUP_STATE = newIntKey("HCE_PAYMENT_SETUP_STATE", Integer.valueOf(0));
    public static final SharedPreference HCE_PAYMENT_SETUP_TYPE = newIntKey("HCE_PAYMENT_SETUP_TYPE", Integer.valueOf(2));
    public static final SharedPreference KEY_LAST_P2P_PAYMENT_CARD_CDP_ID = newStringKey("KEY_LAST_P2P_PAYMENT_CARD_CDP_ID", null);
    public static final SharedPreference LAST_KNOWN_NFC_PROXY_STATUS = newIntKey("KEY_LAST_KNOWN_NFC_PROXY_STATUS", Integer.valueOf(-1));
    public static final SharedPreference LAST_REGISTERED_FOR_GCM = newStringKey("LAST_REGISTERED_FOR_GCM", "");
    public static final SharedPreference LAST_SEEN_CONFIDENTIAL_WARNING = newStringKey("LAST_SEEN_CONFIDENTIAL_WARNING", "");
    public static final SharedPreference LAST_SOURCE_INSTRUMENT_CDP_ID = newStringKey("KEY_LAST_SOURCE_INSTRUMENT_CDP_ID", null);
    public static final SharedPreference LAST_SYNC_TIMESTAMP = newLongKey("LAST_SYNC_TIMESTAMP", Long.valueOf(0L));
    public static final SharedPreference LOCATION_SERVICES_TEACHING_TILE_DISMISSED = newBooleanKey("LOCATION_SERVICES_TEACHING_TILE_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference NFC_TILE_DISMISSED = newBooleanKey("NFC_TILE_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference OCR_LOYALTY_TEACHING_CARD_DISMISSED = newBooleanKey("OCR_LOYALTY_TEACHING_CARD_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference OLD_ACCOUNT_NAME = newStringKey("OLD_ACCOUNT_NAME", "");
    public static final SharedPreference ORDER_PLASTIC_CARD_TILE_DISMISSED = newBooleanKey("ORDER_PLASTIC_CARD_TILE_DISMISSED", Boolean.valueOf(false));
    public static final SharedPreference PROFILE_TOKEN = newByteArrayKey("PROFILE_TOKEN", new byte[0]);
    public static final SharedPreference PROXIMITY_ALERT_ERROR_NO_NETWORK = newBooleanKey("KEY_WALLET_PROXIMITY_ALERT_HANDLER_SERVICE_ERROR_NO_NETWORK", Boolean.valueOf(false));
    public static final SharedPreference PROXIMITY_ALERT_RETRY_INTERVAL = newLongKey("KEY_WALLET_PROXIMITY_ALERT_HANDLER_SERVICE_RETRY_INTERVAL", Long.valueOf(-1L));
    public static final SharedPreference SETUP_COMPLETE = newBooleanKey("SETUP_COMPLETE", Boolean.valueOf(false));
    public static final SharedPreference SETUP_COMPLETION_TIME_MILLIS = newLongKey("SETUP_COMPLETION_TIME_MILLIS", Long.valueOf(-1L));
    public static final SharedPreference START_TIME_SWITCH_USER = newLongKey("START_TIME_SWITCH_USER", Long.valueOf(0L));
    public static final SharedPreference WARM_WELCOME_VIEWED = newBooleanKey("WARM_WELCOME_VIEWED", Boolean.valueOf(false));
    public static final SharedPreference WOBS_CACHE_CONFIGURATION_ID = newByteArrayKey("WOBS_CACHE_CONFIGURATION_ID", new byte[0]);
    public static final SharedPreference WOBS_LAST_SYNC_TIME = newLongKey("KEY_WOBS_LAST_SYNC_TIME", Long.valueOf(0L));
    public static final SharedPreference WOBS_UI_LABELS_VERSION = newStringKey("KEY_WOBS_UI_LABELS_VERSION", "NO_LABELS_VERSION");
    private final Object defaultValue;
    private final String key;

    private SharedPreference(String s, Object obj)
    {
        key = (String)Preconditions.checkNotNull(s);
        defaultValue = obj;
    }


    public static MessageNano messageFromPreference(SharedPreference sharedpreference, MessageNano messagenano, SharedPreferences sharedpreferences)
    {
        sharedpreference = (byte[])sharedpreference.get(sharedpreferences);
        if (sharedpreference != null && sharedpreference.length > 0)
        {
            try
            {
                sharedpreference = MessageNano.mergeFrom(messagenano, sharedpreference);
            }
            // Misplaced declaration of an exception variable
            catch (SharedPreference sharedpreference)
            {
                throw Throwables.propagate(sharedpreference);
            }
            return sharedpreference;
        } else
        {
            return null;
        }
    }

    private static SharedPreference newBooleanKey(String s, Boolean boolean1)
    {
        return new BooleanSharedPreference(s, boolean1);
    }

    private static SharedPreference newByteArrayKey(String s, byte abyte0[])
    {
        return new ByteArraySharedPreference(s, abyte0);
    }

    private static SharedPreference newIntKey(String s, Integer integer)
    {
        return new IntSharedPreference(s, integer);
    }

    private static SharedPreference newLongKey(String s, Long long1)
    {
        return new LongSharedPreference(s, long1);
    }

    private static SharedPreference newStringKey(String s, String s1)
    {
        return new StringSharedPreference(s, s1);
    }

    private static SharedPreference newStringSetKey(String s, Set set)
    {
        return new StringSetPreference(s, set);
    }

    public abstract Object get(SharedPreferences sharedpreferences);

    public final Object getDefaultValue()
    {
        return defaultValue;
    }

    public final String getKey()
    {
        return key;
    }

    public final boolean isPresent(SharedPreferences sharedpreferences)
    {
        return sharedpreferences.contains(getKey());
    }

    public final void put(SharedPreferences sharedpreferences, Object obj)
    {
        putIntoEditor(obj, sharedpreferences.edit()).apply();
    }

    public final boolean putAndCommit(SharedPreferences sharedpreferences, Object obj)
    {
        return putIntoEditor(obj, sharedpreferences.edit()).commit();
    }

    public abstract android.content.SharedPreferences.Editor putIntoEditor(Object obj, android.content.SharedPreferences.Editor editor);

    public final void remove(SharedPreferences sharedpreferences)
    {
        sharedpreferences.edit().remove(getKey()).apply();
    }

}
