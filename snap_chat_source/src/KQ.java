// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.crypto.SlightlySecurePreferencesKeyType;

public final class KQ
{

    public static final KP CHAT_MEDIA_KEYS_AND_IVS;
    public static final KP CREDIT_CARD_TOKEN;
    public static final KP DEVICE_TOKEN_1_KEY_AND_IV;
    public static final KP DISCOVER_CONTENT_KEYS_AND_IVS;
    public static final KP FRIEND_STORY_KEYS_AND_IVS;
    public static final KP MESSAGING_GATEWAY_INFO;
    public static final KP MY_STORY_KEYS_AND_IVS;
    public static final KP PER_CONVERSATION_AUTH;
    public static final KP SNAPS_ON_EXTERNAL_STORAGE_KEYS_AND_IVS;
    public static final KP SQ_AUTH_TOKEN;

    static 
    {
        MESSAGING_GATEWAY_INFO = new KP("messagingGatewayInfo", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        PER_CONVERSATION_AUTH = new KP("perConversationAuth/", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        MY_STORY_KEYS_AND_IVS = new KP("myStorySnapKeysAndIvs", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        SNAPS_ON_EXTERNAL_STORAGE_KEYS_AND_IVS = new KP("snapsOnExternalStorageKeysAndIvs", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN);
        FRIEND_STORY_KEYS_AND_IVS = new KP("friendStorySnapKeysAndIvs", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        CHAT_MEDIA_KEYS_AND_IVS = new KP("chatMediaKeysAndIvs", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        CREDIT_CARD_TOKEN = new KP("creditCardToken", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_DIFFERENT_USER_LOGIN);
        SQ_AUTH_TOKEN = new KP("sqAuthToken", SlightlySecurePreferencesKeyType.SHOULD_PURGE_ON_LOGOUT);
        DEVICE_TOKEN_1_KEY_AND_IV = new KP("deviceToken1KeyAndIv", SlightlySecurePreferencesKeyType.SHOULD_ALWAYS_PERSIST);
        DISCOVER_CONTENT_KEYS_AND_IVS = new KP("discoverContentKeysAndIvs", SlightlySecurePreferencesKeyType.SHOULD_ALWAYS_PERSIST);
    }
}
