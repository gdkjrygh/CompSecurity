// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.api2.cash.square.data.CardBrand;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.database.ClientProperty;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.SharedPreferenceGroup;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.squareup.otto.Bus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.inject.Provider;

public final class Bt
{

    public static final int DEFAULT_DELAY_RELEASE_TIME = 600;
    private static final String DELIMITER = "~";
    private static final String EMPTY_SERIALIZED_MAP = "{}";
    public static final int MAX_CHAT_SESSIONS_FOR_DISPLAYING_PRESSING_IN_APP_NOTIFICATION = 2;
    private static final Map SERVER_CLIENT_PREFERENCES_MAP;
    private static final String TAG = "UserPrefs";
    private static final Gson sGson = (new GsonBuilder()).create();
    private static final Bt sInstance = new Bt();
    private final Bg mSponsoredSlugUtils;
    protected final Provider mUserProvider;

    public Bt()
    {
        this(Br.UNSAFE_USER_PROVIDER, Bg.a());
    }

    private Bt(Provider provider, Bg bg1)
    {
        mUserProvider = provider;
        mSponsoredSlugUtils = bg1;
    }

    public static long A()
    {
        return SharedPreferenceKey.BIRTHDAY_THIS_YEAR_IN_MILLIS.getLong();
    }

    public static void A(boolean flag)
    {
        if (!bH() && flag)
        {
            a(OnboardingTooltip.TAP_TO_SKIP);
        }
        SharedPreferenceKey.TAPPED_TO_SKIP.putBoolean(flag);
    }

    public static void B(boolean flag)
    {
        if (!SharedPreferenceKey.SWIPED_DOWN_IN_VIEWER.getBoolean() && flag)
        {
            a(OnboardingTooltip.SWIPE_TO_DISMISS);
        }
        SharedPreferenceKey.SWIPED_DOWN_IN_VIEWER.putBoolean(flag);
    }

    public static boolean B()
    {
        return SharedPreferenceKey.IS_REGISTERING.getBoolean();
    }

    public static void C(boolean flag)
    {
        SharedPreferenceKey.SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED.putBoolean(flag);
    }

    public static boolean C()
    {
        return SharedPreferenceKey.IS_REGISTERING.getBoolean();
    }

    public static String D()
    {
        return SharedPreferenceKey.GCM_REGISTRATION_ID.getString();
    }

    public static void D(boolean flag)
    {
        SharedPreferenceKey.VIBRATION_ENABLED.putBoolean(flag);
    }

    public static void E()
    {
        SharedPreferenceKey.LOGGEDIN_IN_AFTER_CHAT_V1_5.putBoolean(true);
    }

    public static void E(boolean flag)
    {
        SharedPreferenceKey.SOUND_ENABLED.putBoolean(flag);
    }

    public static void F(boolean flag)
    {
        SharedPreferenceKey.LED_ENABLED.putBoolean(flag);
    }

    public static boolean F()
    {
        return SharedPreferenceKey.LOGGEDIN_IN_AFTER_CHAT_V1_5.getBoolean(false);
    }

    public static void G()
    {
        SharedPreferenceKey.HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT.putBoolean(true);
    }

    public static void G(boolean flag)
    {
        SharedPreferenceKey.WAKE_SCREEN_ENABLED.putBoolean(flag);
    }

    public static void H(boolean flag)
    {
        SharedPreferenceKey.NOTIFICATIONS_ENABLED.putBoolean(flag);
    }

    public static boolean H()
    {
        return SharedPreferenceKey.HAS_LONG_PRESSED_TO_SAVE_OR_UNSAVE_CHAT.getBoolean(false);
    }

    public static int I()
    {
        return SharedPreferenceKey.CHAT_SESSIONS_AFTER_CHAT1_5.getInt(0);
    }

    public static void I(boolean flag)
    {
        SharedPreferenceKey.LENSES_NATIVE_FLAG.putBoolean(flag);
    }

    public static String J()
    {
        return SharedPreferenceKey.DISPLAY_NAME.getString();
    }

    public static String K()
    {
        if (!TextUtils.isEmpty(SharedPreferenceKey.DISPLAY_NAME.getString()))
        {
            return SharedPreferenceKey.DISPLAY_NAME.getString();
        }
        if (!TextUtils.isEmpty(SharedPreferenceKey.ANDROID_DISPLAY_NAME.getString()))
        {
            return SharedPreferenceKey.ANDROID_DISPLAY_NAME.getString();
        } else
        {
            return SharedPreferenceKey.USERNAME.getString();
        }
    }

    public static long L()
    {
        return SharedPreferenceKey.LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP.getLong();
    }

    public static long M()
    {
        return SharedPreferenceKey.LAST_PROFILE_IMAGES_CACHED_TIMESTAMP.getLong();
    }

    public static boolean N()
    {
        return SharedPreferenceKey.PROFILE_IMAGES_UPLOADED.getBoolean(true);
    }

    public static boolean O()
    {
        return SharedPreferenceKey.HAS_PROFILE_IMAGES.getBoolean(true);
    }

    public static int P()
    {
        return SharedPreferenceKey.PROFILE_IMAGES_SHARING_COUNT.getInt();
    }

    public static boolean Q()
    {
        return SharedPreferenceKey.HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE.getBoolean();
    }

    public static String R()
    {
        return SharedPreferenceKey.AUTH_TOKEN.getString();
    }

    public static String S()
    {
        return SharedPreferenceKey.EMAIL.getString();
    }

    public static int T()
    {
        return SharedPreferenceKey.SCORE.getInt();
    }

    public static boolean U()
    {
        return !SharedPreferenceKey.HAS_SEEN_POST_STORY_DIALOG.getBoolean();
    }

    public static boolean V()
    {
        return SharedPreferenceKey.HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE.getBoolean();
    }

    public static boolean W()
    {
        return SharedPreferenceKey.HAS_SEEN_CAPTION_ONBOARDING_MESSAGE.getBoolean();
    }

    public static boolean X()
    {
        return SharedPreferenceKey.HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE.getBoolean();
    }

    public static boolean Y()
    {
        return SharedPreferenceKey.HAS_POSTED_STORY_FROM_SEND_TO.getBoolean();
    }

    public static void Z()
    {
        if (!SharedPreferenceKey.HAS_POSTED_STORY_FROM_SEND_TO.getBoolean())
        {
            (new mS(OnboardingTooltip.MY_STORY)).execute();
        }
        SharedPreferenceKey.HAS_POSTED_STORY_FROM_SEND_TO.putBoolean(true);
    }

    public static Bt a()
    {
        return sInstance;
    }

    public static void a(int i1)
    {
        SharedPreferenceKey.APP_VERSION_CODE.putInt(i1);
    }

    public static void a(BT bt1)
    {
        SharedPreferenceKey.LENSES_NATIVE_FLAG_LAST_SELECTED_LENS.putString((new StringBuilder()).append(bt1.b()).append(":").append(bt1.a()).toString());
    }

    private static void a(QP qp)
    {
        if (qp == null)
        {
            return;
        } else
        {
            (new tr()).a(SharedPreferenceKey.FILTERS_ENABLED, IJ.a(qp.a())).a(SharedPreferenceKey.FRONT_FACING_FLASH_SETTING, IJ.a(qp.b())).a(SharedPreferenceKey.TRAVEL_MODE_ENABLED, IJ.a(qp.c())).a(SharedPreferenceKey.PAY_REPLAY_SNAPS_ENABLED, IJ.a(qp.d())).a(SharedPreferenceKey.LENSES_STORE_AVAILABLE, IJ.a(qp.e())).a();
            AS.a().a(IJ.a(qp.c()));
            return;
        }
    }

    public static void a(Ti ti)
    {
        (new tr()).a(SharedPreferenceKey.AUTH_TOKEN, ti.s()).a(SharedPreferenceKey.EMAIL, ti.u()).a(SharedPreferenceKey.USER_ID, ti.q()).a(SharedPreferenceKey.IS_LOGGED_IN, IJ.a(ti.o())).a();
        if (ti.R() != null)
        {
            a(ti.R());
        }
    }

    public static void a(als als1)
    {
        SharedPreferenceKey.LAST_SCHEDULED_LENSES_CHECK_TIME.putLong(((alV) (als1)).a);
    }

    public static void a(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        SharedPreferenceGroup asharedpreferencegroup[] = SharedPreferenceGroup.values();
        int j1 = asharedpreferencegroup.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            asharedpreferencegroup[i1].getSharedPreferences().registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        }

    }

    public static void a(OnboardingTooltip onboardingtooltip)
    {
        (new mS(onboardingtooltip)).execute();
    }

    public static void a(SharedPreferenceKey sharedpreferencekey)
    {
        sharedpreferencekey.remove();
    }

    public static void a(Long long1)
    {
        if (long1 != null && long1.longValue() > SharedPreferenceKey.IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP.getLong())
        {
            SharedPreferenceKey.IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP.putLong(long1.longValue());
        }
    }

    public static void a(String s1)
    {
        SharedPreferenceKey.PHONE_NUMBER.putString(s1);
    }

    private static void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            OnboardingTooltip onboardingtooltip = OnboardingTooltip.fromValue((String)list.next());
            if (onboardingtooltip != OnboardingTooltip.UNKNOWN)
            {
                onboardingtooltip.getSharedPreferenceKey().putBoolean(true);
            }
        } while (true);
    }

    private static void a(Map map)
    {
        mS ms = null;
        Timber.c("UserPrefs", (new StringBuilder("syncClientProperties - clientProperties ")).append(map).toString(), new Object[0]);
        Iterator iterator = SERVER_CLIENT_PREFERENCES_MAP.entrySet().iterator();
label0:
        do
        {
            mS ms1;
            String s1;
            SharedPreferenceKey sharedpreferencekey;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s1 = (String)((java.util.Map.Entry)iterator.next()).getKey();
                sharedpreferencekey = (SharedPreferenceKey)SERVER_CLIENT_PREFERENCES_MAP.get(s1);
                ms1 = ms;
                if (!sharedpreferencekey.exists())
                {
                    break label1;
                }
                String s2 = String.valueOf(sharedpreferencekey.getBoolean());
                if (map.containsKey(s1.toLowerCase()))
                {
                    ms1 = ms;
                    if (TextUtils.equals((CharSequence)map.get(s1.toLowerCase()), s2))
                    {
                        break label1;
                    }
                }
                if (ms == null)
                {
                    ms = new mS();
                }
                Timber.c("UserPrefs", (new StringBuilder("upload ClientProperty: ")).append(ClientProperty.valueOf(s1)).append(", value: ").append(s2).toString(), new Object[0]);
                ms.a(ClientProperty.valueOf(s1), s2);
                map.put(s1.toLowerCase(), s2);
                ms1 = ms;
            }
            ms = ms1;
            if (map.containsKey(s1.toLowerCase()))
            {
                sharedpreferencekey.putBoolean(TextUtils.equals((CharSequence)map.get(s1.toLowerCase()), "true"));
                ms = ms1;
            }
        } while (true);
        if (ms != null)
        {
            ms.execute();
        }
    }

    public static void a(Set set)
    {
        SharedPreferenceKey.LENSES_IAPS_LIST.putStringSet(set);
    }

    public static void a(UUID uuid)
    {
        SharedPreferenceKey.UNIQUE_DEVICE_ID.putString(uuid.toString());
    }

    public static void a(nh nh1)
    {
        tr tr1 = (new tr()).a(SharedPreferenceKey.CASH_CARD_LINKED, nh1.a());
        SharedPreferenceKey sharedpreferencekey = SharedPreferenceKey.CASH_CARD_BRAND;
        String s1;
        if (nh1.d() != null)
        {
            s1 = nh1.d().name();
        } else
        {
            s1 = null;
        }
        tr1.a(sharedpreferencekey, s1).a(SharedPreferenceKey.CASH_CARD_SUFFIX, nh1.e()).a(SharedPreferenceKey.SECURITY_CODE_SETTING, nh1.b()).a(SharedPreferenceKey.CASH_HAS_TRANSACTIONS, nh1.c()).a(SharedPreferenceKey.CASH_OUTDATED_PROFILE, false).a();
        Mf.a().a(new Mv());
    }

    public static void a(boolean flag)
    {
        SharedPreferenceKey.FIND_FRIENDS_ENABLED_FOR_CAPTCHA.putBoolean(flag);
    }

    public static void a(boolean flag, int i1)
    {
        if (flag)
        {
            SharedPreferenceKey.KEYBOARD_HEIGHT_LANDSCAPE.putInt(i1);
            return;
        } else
        {
            SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.putInt(i1);
            return;
        }
    }

    public static void a(boolean flag, String s1, String s2, String s3)
    {
        (new tr()).a(SharedPreferenceKey.CASH_SERVICE_ACTIVE, flag).a(SharedPreferenceKey.CASH_PROVIDER_NAME, s1).a(SharedPreferenceKey.CASH_CUSTOMER_ID, s2).a(SharedPreferenceKey.CASH_CUSTOMER_ALLOWED, s3).a();
    }

    public static void a(boolean flag, String s1, String s2, String s3, long l1)
    {
        (new tr()).a(SharedPreferenceKey.SHOULD_SHOW_SUGGESTION_PROMPT, flag).a(SharedPreferenceKey.SUGGESTION_PROMPT_LINK, s1).a(SharedPreferenceKey.SUGGESTION_PROMPT_TEXT, s2).a(SharedPreferenceKey.SUGGESTION_PROMPT_BUTTON_TEXT, s3).a(SharedPreferenceKey.SUGGESTION_PROMPT_DURATION_IN_MILLIS, l1).a();
    }

    public static boolean a(long l1)
    {
        if (l1 > SharedPreferenceKey.LAST_SEEN_ADDED_ME_TIMESTAMP.getLong())
        {
            SharedPreferenceKey.LAST_SEEN_ADDED_ME_TIMESTAMP.putLong(l1);
            return true;
        } else
        {
            return false;
        }
    }

    public static void aA()
    {
        SharedPreferenceKey.CASH_SWIPE_SEND_CONFIRMATION.putBoolean(false);
    }

    public static boolean aB()
    {
        return SharedPreferenceKey.CASH_SERVICE_ACTIVE.getBoolean(true);
    }

    public static String aC()
    {
        return SharedPreferenceKey.CASH_PROVIDER_NAME.getString();
    }

    public static TD.a aD()
    {
        String s1 = SharedPreferenceKey.CASH_CUSTOMER_ALLOWED.getString();
        if (s1 == null)
        {
            return TD.a.OK;
        } else
        {
            return TD.a.valueOf(s1);
        }
    }

    public static boolean aE()
    {
        return SharedPreferenceKey.CASH_CARD_LINKED.getBoolean();
    }

    public static String aF()
    {
        return SharedPreferenceKey.CASH_CARD_BRAND.getString();
    }

    public static String aG()
    {
        return SharedPreferenceKey.CASH_CARD_SUFFIX.getString();
    }

    public static boolean aH()
    {
        return SharedPreferenceKey.CASH_OUTDATED_PROFILE.getBoolean(true);
    }

    public static boolean aI()
    {
        return SharedPreferenceKey.CASH_HAS_TRANSACTIONS.getBoolean();
    }

    public static boolean aJ()
    {
        return SharedPreferenceKey.SECURITY_CODE_SETTING.getBoolean();
    }

    public static boolean aK()
    {
        return SharedPreferenceKey.CASH_SEND_CONFIRMATION.getBoolean(true);
    }

    public static boolean aL()
    {
        return SharedPreferenceKey.CASH_SWIPE_SEND_CONFIRMATION.getBoolean(true);
    }

    public static String aM()
    {
        return SharedPreferenceKey.RESPONSE_CHECKSUM_STORIES.getString("");
    }

    public static void aN()
    {
        SharedPreferenceKey.RESPONSE_CHECKSUM_STORIES.putString("");
    }

    public static String aO()
    {
        Object obj = dA.b(ci());
        String s1 = dA.b(ck());
        String s2 = dA.b(cj());
        String s3 = dA.b(aM());
        String s4 = dA.b(SharedPreferenceKey.RESPONSE_CHECKSUM_STUDY_SETTINGS.getString(""));
        obj = (new Qq()).d(((String) (obj))).c(s1).a(s3).b(s2).e(s4);
        return sGson.toJson(obj);
    }

    public static void aP()
    {
        aN();
        SharedPreferenceKey.RESPONSE_CHECKSUM_CONVERSATIONS.putString("");
        SharedPreferenceKey.RESPONSE_CHECKSUM_FRIENDS.putString("");
        SharedPreferenceKey.RESPONSE_CHECKSUM_UPDATES.putString("");
        SharedPreferenceKey.RESPONSE_CHECKSUM_STUDY_SETTINGS.putString("");
    }

    public static String aQ()
    {
        Object obj = dA.b(ci());
        String s1 = dA.b(ck());
        String s2 = dA.b(cj());
        obj = (new Qq()).d(((String) (obj))).c(s1).b(s2);
        return sGson.toJson(obj);
    }

    public static String aR()
    {
        return SharedPreferenceKey.STUDY_SETTINGS.getString("{}");
    }

    public static boolean aS()
    {
        return SharedPreferenceKey.IS_ACCOUNT_LOCKED.getBoolean();
    }

    public static boolean aT()
    {
        return SharedPreferenceKey.DEMOGRAPHICS_TRACKING_SENT_FLAG.getBoolean();
    }

    public static boolean aU()
    {
        return !SharedPreferenceKey.DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION.getBoolean();
    }

    public static boolean aV()
    {
        return SharedPreferenceKey.SAVE_STORY_TO_GALLERY_ENABLED.getBoolean();
    }

    public static long aW()
    {
        return SharedPreferenceKey.DISCOVER_TIME_LAST_SEEN.getLong(-1L);
    }

    public static long aX()
    {
        return SharedPreferenceKey.CHANNEL_LIST_TIMESTAMP.getLong(-1L);
    }

    public static String aY()
    {
        return SharedPreferenceKey.DISCOVER_RESOURCE_PARAM_NAME.getString();
    }

    public static String aZ()
    {
        return SharedPreferenceKey.DISCOVER_RESOURCE_PARAM_VALUE.getString();
    }

    public static boolean aa()
    {
        return SharedPreferenceKey.HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA.getBoolean();
    }

    public static void ab()
    {
        if (!SharedPreferenceKey.HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA.getBoolean())
        {
            (new mS(OnboardingTooltip.FIRST_LOCATION)).execute();
        }
        SharedPreferenceKey.HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA.putBoolean(true);
    }

    public static boolean ac()
    {
        return SharedPreferenceKey.HAS_ACCEPTED_SQUARE_TOS.getBoolean();
    }

    public static void ad()
    {
        (new mS()).a(ClientProperty.SQUARE_TOS_ACCEPTED, "true").execute();
        SharedPreferenceKey.HAS_ACCEPTED_SQUARE_TOS.putBoolean(true);
    }

    public static boolean ae()
    {
        return SharedPreferenceKey.HAS_ACCEPTED_TOU_9_14.getBoolean();
    }

    public static void af()
    {
        (new mS()).a(ClientProperty.TOU_9_14_ACCEPTED, "true").execute();
        SharedPreferenceKey.HAS_ACCEPTED_TOU_9_14.putBoolean(true);
    }

    public static boolean ag()
    {
        return SharedPreferenceKey.HAS_ACCEPTED_SNAPCASH_TOS.getBoolean();
    }

    public static void ah()
    {
        (new mS()).a(ClientProperty.SNAPCASH_NEW_TOS_ACCEPTED, "true").execute();
        SharedPreferenceKey.HAS_ACCEPTED_SNAPCASH_TOS.putBoolean(true);
    }

    public static boolean ai()
    {
        return SharedPreferenceKey.SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG.getBoolean();
    }

    public static void aj()
    {
        SharedPreferenceKey.SHOULD_SHOW_CLEAR_CONVERSATION_DIALOG.putBoolean(false);
    }

    public static String ak()
    {
        return SharedPreferenceKey.CLIENT_PROMPT_UUID.getString();
    }

    public static boolean al()
    {
        return SharedPreferenceKey.FILTERS_ENABLED.getBoolean();
    }

    public static boolean am()
    {
        return SharedPreferenceKey.FRONT_FACING_FLASH_SETTING.getBoolean();
    }

    public static boolean an()
    {
        return SharedPreferenceKey.TRAVEL_MODE_ENABLED.getBoolean();
    }

    public static boolean ao()
    {
        return SharedPreferenceKey.PAY_REPLAY_SNAPS_ENABLED.getBoolean();
    }

    public static long ap()
    {
        return SharedPreferenceKey.LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP.getLong();
    }

    public static Map aq()
    {
        return Jh.a(SharedPreferenceKey.USER_TARGETING.getString("{}"));
    }

    public static List ar()
    {
        return Jh.a(SharedPreferenceKey.AD_INDUSTRIES.getString(), "~");
    }

    public static boolean as()
    {
        return SharedPreferenceKey.SYNC_ON_FEED_OPEN.getBoolean();
    }

    public static boolean at()
    {
        return SharedPreferenceKey.IS_SEARCHABLE_BY_PHONE_NUMBER.getBoolean();
    }

    public static long au()
    {
        return SharedPreferenceKey.LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP.getLong();
    }

    public static void av()
    {
        (new tr()).a(SharedPreferenceKey.CASH_CARD_LINKED, false).a(SharedPreferenceKey.CASH_CARD_BRAND, null).a(SharedPreferenceKey.CASH_CARD_SUFFIX, null).a(SharedPreferenceKey.SECURITY_CODE_SETTING, false).a(SharedPreferenceKey.CASH_HAS_TRANSACTIONS, false).a(SharedPreferenceKey.CASH_OUTDATED_PROFILE, true).a();
        Mf.a().a(new Mv());
    }

    public static void aw()
    {
        (new tr()).a(SharedPreferenceKey.CASH_CARD_LINKED, false).a(SharedPreferenceKey.CASH_CARD_BRAND, null).a(SharedPreferenceKey.CASH_CARD_SUFFIX, null).a();
        Mf.a().a(new Mv());
    }

    public static void ax()
    {
        SharedPreferenceKey.CASH_OUTDATED_PROFILE.putBoolean(true);
    }

    public static void ay()
    {
        SharedPreferenceKey.CASH_HAS_TRANSACTIONS.putBoolean(true);
    }

    public static void az()
    {
        SharedPreferenceKey.CASH_SEND_CONFIRMATION.putBoolean(false);
    }

    public static int b()
    {
        return SharedPreferenceKey.NUM_SNAPS_RECEIVED.getInt();
    }

    public static void b(int i1)
    {
        SharedPreferenceKey.CHAT_SESSIONS_AFTER_CHAT1_5.putInt(i1);
    }

    public static void b(long l1)
    {
        if (SharedPreferenceKey.LAST_PROFILE_IMAGES_CACHED_TIMESTAMP.getLong() < l1)
        {
            SharedPreferenceKey.LAST_PROFILE_IMAGES_CACHED_TIMESTAMP.putLong(l1);
        }
    }

    public static void b(Ti ti)
    {
        Object obj;
        Object obj1;
        boolean flag;
        int i1;
        long l1;
        if (TextUtils.isEmpty(ti.F()))
        {
            i1 = com.snapchat.android.fragments.settings.SettingsFragment.PrivacyOptions.valueOf("FRIENDS").ordinal();
        } else
        {
            i1 = com.snapchat.android.fragments.settings.SettingsFragment.PrivacyOptions.valueOf(ti.F()).ordinal();
        }
        obj1 = ti.al();
        obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList();
        }
        (new tr()).a(SharedPreferenceKey.USERNAME, ti.p()).a(SharedPreferenceKey.USER_ID, ti.q()).a(SharedPreferenceKey.AUTH_TOKEN, ti.s()).a(SharedPreferenceKey.EMAIL, ti.u()).a(SharedPreferenceKey.IS_LOGGED_IN, IJ.a(ti.o())).a(SharedPreferenceKey.GCM_REGISTRATION_ID, ti.t()).a(SharedPreferenceKey.NUM_SNAPS_RECEIVED, IJ.a(ti.H())).a(SharedPreferenceKey.NUM_SNAPS_SENT, IJ.a(ti.G())).a(SharedPreferenceKey.SCORE, IJ.a(ti.I())).a(SharedPreferenceKey.MOBILE_VERIFICATION_KEY, ti.w()).a(SharedPreferenceKey.MOBILE_VERIFICATION_SEND_TO_NUMBER, ti.O()).a(SharedPreferenceKey.SNAP_PRIVACY_SETTING, IJ.a(ti.E())).a(SharedPreferenceKey.STORY_PRIVACY_SETTING, i1).a(SharedPreferenceKey.IS_SEARCHABLE_BY_PHONE_NUMBER, IJ.a(ti.P())).a(SharedPreferenceKey.LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP, IJ.a(ti.aa())).a(SharedPreferenceKey.USER_TARGETING, Jh.a(ti.ak())).a(SharedPreferenceKey.AD_INDUSTRIES, Jh.a(((java.util.Collection) (obj)), "~")).a(SharedPreferenceKey.RAW_THUMBNAIL_UPLOAD_ENABLED, IJ.a(ti.am())).a();
        a(ti.S());
        obj = ti.v();
        SharedPreferenceKey.PHONE_NUMBER.putString(((String) (obj)));
        obj = qZ.e();
        flag = IJ.a(ti.A());
        SharedPreferenceKey.IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND.putBoolean(flag);
        ((qZ) (obj)).h();
        obj = TranscodingPreferencesWrapper.a();
        flag = IJ.a(ti.x());
        obj1 = TranscodingPreferencesWrapper.e();
        if (!flag || obj1 != com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.UNKNOWN && obj1 != com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.BLOCKED) goto _L2; else goto _L1
_L1:
        ((TranscodingPreferencesWrapper) (obj)).a(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.ENABLED_FOR_LOW_QUALITY);
_L4:
        TranscodingPreferencesWrapper.a().a = IJ.a(ti.B());
        TranscodingPreferencesWrapper.a();
        TranscodingPreferencesWrapper.a(IJ.a(ti.y()));
        TranscodingPreferencesWrapper.a();
        TranscodingPreferencesWrapper.b(IJ.a(ti.z()));
        c(ti.D());
        flag = IJ.a(ti.C());
        SharedPreferenceKey.SAVE_STORY_TO_GALLERY_ENABLED.putBoolean(flag);
        flag = IJ.a(ti.ai());
        SharedPreferenceKey.VIDEO_FILTERS.putBoolean(flag);
        l1 = IJ.a(ti.L());
        if (l1 > SharedPreferenceKey.LAST_SEEN_ADDED_ME_TIMESTAMP.getLong())
        {
            a(l1);
        }
        obj = ti.T();
        if (obj != null)
        {
            obj = Bm.a().a(((Map) (obj)));
            SharedPreferenceKey.STUDY_SETTINGS.putString(((String) (obj)));
        }
        if (ti.Q() != null)
        {
            a(ti.Q());
        }
        if (ti.R() != null)
        {
            a(ti.R());
        }
        return;
_L2:
        if (!flag && obj1 != com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.TRANSCODING_NOT_SUPPORTED)
        {
            ((TranscodingPreferencesWrapper) (obj)).a(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.BLOCKED);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b(als als1)
    {
        SharedPreferenceKey.LAST_PROMO_LENSES_CHECK_TIME.putLong(((alV) (als1)).a);
    }

    public static void b(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        SharedPreferenceGroup asharedpreferencegroup[] = SharedPreferenceGroup.values();
        int j1 = asharedpreferencegroup.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            asharedpreferencegroup[i1].getSharedPreferences().unregisterOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        }

    }

    public static void b(String s1)
    {
        SharedPreferenceKey.USERNAME.putString(s1);
    }

    public static void b(boolean flag)
    {
        SharedPreferenceKey.IS_VERIFIED_USER.putBoolean(flag);
    }

    public static boolean bA()
    {
        return SharedPreferenceKey.IDENTITY_IS_HIGH_LOCATION_REQUIRED.getBoolean();
    }

    public static boolean bB()
    {
        Aa aa1 = new Aa();
        boolean flag;
        if (aa1.a() || aa1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return false;
        }
        if (SharedPreferenceKey.IDENTITY_IS_HIGH_LOCATION_REQUIRED.getBoolean())
        {
            return cl();
        } else
        {
            return true;
        }
    }

    public static int bC()
    {
        return SharedPreferenceKey.DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER.getInt(600);
    }

    public static long bD()
    {
        return SharedPreferenceKey.IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP.getLong();
    }

    public static String bE()
    {
        return SharedPreferenceKey.IDENTITY_FRIENDS_SYNC_TOKEN.getString();
    }

    public static boolean bF()
    {
        return SharedPreferenceKey.HAS_SEEN_TROPHY_CASE_TOOLTIP.getBoolean();
    }

    public static UUID bG()
    {
        String s1 = SharedPreferenceKey.UNIQUE_DEVICE_ID.getString();
        if (s1 == null)
        {
            return null;
        } else
        {
            return UUID.fromString(s1);
        }
    }

    public static boolean bH()
    {
        return SharedPreferenceKey.TAPPED_TO_SKIP.getBoolean() || SharedPreferenceKey.TAP_TO_SKIP_COUNT.getInt() > 0;
    }

    public static boolean bI()
    {
        return SharedPreferenceKey.SEEN_SWIPE_DOWN_TUTORIAL.getBoolean();
    }

    public static void bJ()
    {
        SharedPreferenceKey.SEEN_SWIPE_DOWN_TUTORIAL.putBoolean(false);
    }

    public static boolean bK()
    {
        return SharedPreferenceKey.SWIPED_DOWN_IN_VIEWER.getBoolean();
    }

    public static boolean bL()
    {
        return SharedPreferenceKey.SHOULD_BOUNCE_TEAM_SNAPCHAT_CELL_IN_FEED.getBoolean();
    }

    public static boolean bM()
    {
        boolean flag = SharedPreferenceKey.LEGACY_SOUND_VIBRATION_ENABLED.getBoolean();
        return SharedPreferenceKey.VIBRATION_ENABLED.getBoolean(flag);
    }

    public static boolean bN()
    {
        boolean flag = SharedPreferenceKey.LEGACY_SOUND_VIBRATION_ENABLED.getBoolean();
        return SharedPreferenceKey.SOUND_ENABLED.getBoolean(flag);
    }

    public static boolean bO()
    {
        return SharedPreferenceKey.LED_ENABLED.getBoolean(true);
    }

    public static boolean bP()
    {
        return SharedPreferenceKey.WAKE_SCREEN_ENABLED.getBoolean(true);
    }

    public static boolean bQ()
    {
        return SharedPreferenceKey.NOTIFICATIONS_ENABLED.getBoolean(true);
    }

    public static als bT()
    {
        return new als(SharedPreferenceKey.LAST_SCHEDULED_LENSES_CHECK_TIME.getLong());
    }

    public static int bU()
    {
        return SharedPreferenceKey.LAST_SCHEDULED_LENSES_COUNT.getInt();
    }

    public static als bV()
    {
        return new als(SharedPreferenceKey.LAST_PROMO_LENSES_CHECK_TIME.getLong());
    }

    public static als bW()
    {
        return new als(SharedPreferenceKey.LAST_OWNED_LENSES_CHECK_TIME.getLong());
    }

    public static int bX()
    {
        return SharedPreferenceKey.PROMO_LENSES_DISPLAY_COUNT.getInt(0);
    }

    public static Boolean bY()
    {
        if (!SharedPreferenceKey.IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND.getSharedPreferences().contains(SharedPreferenceKey.IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND.getKey()))
        {
            return null;
        } else
        {
            return Boolean.valueOf(SharedPreferenceKey.IS_DEVICE_WHITELISTED_FOR_LENSES_ON_BACKEND.getBoolean());
        }
    }

    public static String bZ()
    {
        return SharedPreferenceKey.LENSES_NATIVE_FLAG_LENSES_GL_RENDERER.getString();
    }

    public static boolean ba()
    {
        return SharedPreferenceKey.HAS_SHARED_DISCOVER_SNAP.getBoolean();
    }

    public static boolean bb()
    {
        return SharedPreferenceKey.DISCOVER_SEEN_ONBOARDING.getBoolean();
    }

    public static boolean bc()
    {
        return SharedPreferenceKey.HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE.getBoolean();
    }

    public static boolean bd()
    {
        return SharedPreferenceKey.HAS_ACCEPTED_ADD_NEARBY_PROMPT.getBoolean();
    }

    public static void be()
    {
        if (!SharedPreferenceKey.HAS_ACCEPTED_ADD_NEARBY_PROMPT.getBoolean())
        {
            (new mS(OnboardingTooltip.ADD_NEARBY_PROMPT)).execute();
        }
        SharedPreferenceKey.HAS_ACCEPTED_ADD_NEARBY_PROMPT.putBoolean(true);
    }

    public static boolean bf()
    {
        return SharedPreferenceKey.HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE.getBoolean();
    }

    public static boolean bg()
    {
        return SharedPreferenceKey.SHOULD_SHOW_SUGGESTION_PROMPT.getBoolean();
    }

    public static String bh()
    {
        return SharedPreferenceKey.SUGGESTION_PROMPT_LINK.getString();
    }

    public static String bi()
    {
        return SharedPreferenceKey.SUGGESTION_PROMPT_TEXT.getString();
    }

    public static String bj()
    {
        return SharedPreferenceKey.SUGGESTION_PROMPT_BUTTON_TEXT.getString();
    }

    public static long bk()
    {
        return SharedPreferenceKey.SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP.getLong();
    }

    public static long bl()
    {
        return SharedPreferenceKey.SUGGESTION_PROMPT_DURATION_IN_MILLIS.getLong(0x240c8400L);
    }

    public static String bm()
    {
        return SharedPreferenceKey.SNAP_TAG_IMAGE_ID.getString();
    }

    public static String bn()
    {
        return SharedPreferenceKey.TRANSCODING_STATE.getString(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.UNKNOWN.name());
    }

    public static boolean bo()
    {
        return SharedPreferenceKey.TRANSCODING_IN_PROGRESS_FLAG.getBoolean();
    }

    public static String bp()
    {
        return SharedPreferenceKey.TRANSCODING_HISTORY.getString("");
    }

    public static String bq()
    {
        return SharedPreferenceKey.TRANSCODING_OVERWRITE_STATE.getString("");
    }

    public static boolean br()
    {
        return SharedPreferenceKey.TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS.getBoolean();
    }

    public static String bs()
    {
        return SharedPreferenceKey.DEVICE_HARDWARE_INFO_V1.getString("{}");
    }

    public static String bt()
    {
        return SharedPreferenceKey.URL_ROUTING_MAP.getString("{}");
    }

    public static boolean bu()
    {
        return SharedPreferenceKey.IDENTITY_RED_GEAR_IS_ON.getBoolean();
    }

    public static boolean bv()
    {
        return SharedPreferenceKey.IDENTITY_IS_EMAIL_VERIFIED.getBoolean();
    }

    public static String bw()
    {
        return SharedPreferenceKey.IDENTITY_PENDING_EMAIL.getString();
    }

    public static String bx()
    {
        return SharedPreferenceKey.PHONE_VERIFICATION_SMS_FORMAT.getString();
    }

    public static long by()
    {
        return SharedPreferenceKey.LAST_IDENTITY_ACTION_TIMESTAMP.getLong();
    }

    public static boolean bz()
    {
        return SharedPreferenceKey.IDENTITY_IS_TWO_FA_ENABLED.getBoolean();
    }

    public static int c()
    {
        return SharedPreferenceKey.NUM_SNAPS_SENT.getInt();
    }

    public static void c(int i1)
    {
        SharedPreferenceKey.PROFILE_IMAGES_SHARING_COUNT.putInt(i1);
    }

    public static void c(long l1)
    {
        SharedPreferenceKey.LAST_ADDRESS_BOOK_UPDATED_TIMESTAMP.putLong(l1);
    }

    public static void c(als als1)
    {
        SharedPreferenceKey.LAST_OWNED_LENSES_CHECK_TIME.putLong(((alV) (als1)).a);
    }

    public static void c(String s1)
    {
        Object obj;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = new SimpleDateFormat("yyyy-MM-dd");
        long l1 = ((SimpleDateFormat) (obj)).parse(s1).getTime();
        s1 = Calendar.getInstance();
        s1.setTimeInMillis(l1);
        obj = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.set(((Calendar) (obj)).get(1), s1.get(2), s1.get(5), 0, 0, 0);
        SharedPreferenceKey.BIRTHDAY_THIS_YEAR_IN_MILLIS.putLong(calendar.getTimeInMillis());
        return;
        s1;
        Timber.a("UserPrefs", s1);
        return;
    }

    public static void c(boolean flag)
    {
        SharedPreferenceKey.NEEDS_PHONE_VERIFICATION.putBoolean(flag);
    }

    public static String ca()
    {
        return SharedPreferenceKey.LENSES_NATIVE_FLAG_LAST_SELECTED_LENS.getString();
    }

    public static boolean cb()
    {
        return SharedPreferenceKey.LENSES_NATIVE_FLAG.getBoolean();
    }

    public static boolean cc()
    {
label0:
        {
            if (!SharedPreferenceKey.LENSES_STORE_AVAILABLE.getBoolean())
            {
                FeatureFlagManager.a();
                if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.SHOULD_IGNORE_BACKEND_STORE_AVAILABLE))
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public static Set cd()
    {
        return SharedPreferenceKey.LENSES_IAPS_LIST.getStringSet(new HashSet(0));
    }

    public static boolean ce()
    {
        return SharedPreferenceKey.APP_INSTALL_LOGGED.getBoolean();
    }

    public static void cf()
    {
        SharedPreferenceKey.APP_INSTALL_LOGGED.putBoolean(true);
    }

    public static boolean cg()
    {
        return SharedPreferenceKey.VIDEO_FILTERS.getBoolean(true);
    }

    public static int ch()
    {
        return SharedPreferenceKey.NUM_ADDED_FRIENDS_IN_REGISTRATION.getInt();
    }

    private static String ci()
    {
        return SharedPreferenceKey.RESPONSE_CHECKSUM_CONVERSATIONS.getString("");
    }

    private static String cj()
    {
        return SharedPreferenceKey.RESPONSE_CHECKSUM_UPDATES.getString("");
    }

    private static String ck()
    {
        return SharedPreferenceKey.RESPONSE_CHECKSUM_FRIENDS.getString("");
    }

    private static boolean cl()
    {
        int i1;
        try
        {
            i1 = Integer.valueOf(android.provider.Settings.Secure.getInt(SnapchatApplication.get().getContentResolver(), "location_mode")).intValue();
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return (new Aa()).b();
        }
        return i1 == 3;
    }

    public static String d()
    {
        return SharedPreferenceKey.PHONE_NUMBER.getString("");
    }

    public static void d(int i1)
    {
        SharedPreferenceKey.SNAP_PRIVACY_SETTING.putInt(i1);
    }

    public static void d(long l1)
    {
        SharedPreferenceKey.LAST_EXTERNAL_IMAGE_TAKEN_TIMESTAMP.putLong(l1);
    }

    public static void d(String s1)
    {
        SharedPreferenceKey.GCM_REGISTRATION_ID.getString(s1);
    }

    public static void d(boolean flag)
    {
        SharedPreferenceKey.NEEDS_CAPTCHA_VERIFICATION.putBoolean(flag);
    }

    public static void e(int i1)
    {
        SharedPreferenceKey.STORY_PRIVACY_SETTING.putInt(i1);
    }

    public static void e(long l1)
    {
        SharedPreferenceKey.DISCOVER_TIME_LAST_SEEN.putLong(l1);
    }

    public static void e(String s1)
    {
        SharedPreferenceKey.DISPLAY_NAME.putString(s1);
    }

    public static void e(boolean flag)
    {
        SharedPreferenceKey.IS_REGISTERING.putBoolean(flag);
    }

    public static boolean e()
    {
        return !TextUtils.isEmpty(d());
    }

    public static void f(int i1)
    {
        SharedPreferenceKey.LAST_SCHEDULED_LENSES_COUNT.putInt(i1);
    }

    public static void f(long l1)
    {
        SharedPreferenceKey.CHANNEL_LIST_TIMESTAMP.putLong(l1);
    }

    public static void f(String s1)
    {
        SharedPreferenceKey.ANDROID_DISPLAY_NAME.putString(s1);
    }

    public static void f(boolean flag)
    {
        SharedPreferenceKey.PROFILE_IMAGES_UPLOADED.putBoolean(flag);
    }

    public static boolean f()
    {
        return e();
    }

    public static void g(int i1)
    {
        SharedPreferenceKey.PROMO_LENSES_DISPLAY_COUNT.putInt(i1);
    }

    public static void g(long l1)
    {
        SharedPreferenceKey.LAST_IDENTITY_ACTION_TIMESTAMP.putLong(l1);
    }

    public static void g(String s1)
    {
        SharedPreferenceKey.EMAIL.putString(s1);
    }

    public static void g(boolean flag)
    {
        SharedPreferenceKey.HAS_PROFILE_IMAGES.putBoolean(flag);
    }

    public static boolean g()
    {
        return SharedPreferenceKey.HAS_VERIFIED_CAPTCHA.getBoolean();
    }

    public static void h()
    {
        SharedPreferenceKey.HAS_VERIFIED_CAPTCHA.putBoolean(true);
    }

    public static void h(int i1)
    {
        SharedPreferenceKey.NUM_ADDED_FRIENDS_IN_REGISTRATION.putInt(i1);
    }

    public static void h(String s1)
    {
        SharedPreferenceKey.CLIENT_PROMPT_UUID.putString(s1);
    }

    public static void h(boolean flag)
    {
        SharedPreferenceKey.SYNC_ON_FEED_OPEN.putBoolean(flag);
    }

    public static void i(String s1)
    {
        SharedPreferenceKey.CASH_CUSTOMER_ALLOWED.putString(s1);
    }

    public static void i(boolean flag)
    {
        if (!SharedPreferenceKey.HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE.getBoolean() && flag)
        {
            (new mS(OnboardingTooltip.SWIPE_FILTERS)).execute();
        }
        SharedPreferenceKey.HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE.putBoolean(flag);
    }

    public static boolean i()
    {
        return SharedPreferenceKey.FIND_FRIENDS_ENABLED_FOR_CAPTCHA.getBoolean();
    }

    public static int j()
    {
        return SharedPreferenceKey.SNAP_PRIVACY_SETTING.getInt();
    }

    public static void j(String s1)
    {
        SharedPreferenceKey.RESPONSE_CHECKSUM_STORIES.putString(s1);
    }

    public static void j(boolean flag)
    {
        SharedPreferenceKey.FILTERS_ENABLED.putBoolean(flag);
    }

    public static int k()
    {
        return SharedPreferenceKey.STORY_PRIVACY_SETTING.getInt();
    }

    public static void k(String s1)
    {
        s1 = (Qq)sGson.fromJson(s1, Qq);
        String s2 = dA.a(s1.a());
        SharedPreferenceKey.RESPONSE_CHECKSUM_STORIES.putString(s2);
        s2 = dA.a(s1.b());
        SharedPreferenceKey.RESPONSE_CHECKSUM_UPDATES.putString(s2);
        s2 = dA.a(s1.d());
        SharedPreferenceKey.RESPONSE_CHECKSUM_CONVERSATIONS.putString(s2);
        s2 = dA.a(s1.c());
        SharedPreferenceKey.RESPONSE_CHECKSUM_FRIENDS.putString(s2);
        s1 = dA.a(s1.e());
        SharedPreferenceKey.RESPONSE_CHECKSUM_STUDY_SETTINGS.putString(s1);
    }

    public static void k(boolean flag)
    {
        SharedPreferenceKey.FRONT_FACING_FLASH_SETTING.putBoolean(flag);
    }

    public static int l()
    {
        return SharedPreferenceKey.APP_VERSION_CODE.getInt(0x80000000);
    }

    public static void l(String s1)
    {
        s1 = (Qq)sGson.fromJson(s1, Qq);
        String s2 = dA.a(s1.b());
        SharedPreferenceKey.RESPONSE_CHECKSUM_UPDATES.putString(s2);
        s2 = dA.a(s1.d());
        SharedPreferenceKey.RESPONSE_CHECKSUM_CONVERSATIONS.putString(s2);
        s1 = dA.a(s1.c());
        SharedPreferenceKey.RESPONSE_CHECKSUM_FRIENDS.putString(s1);
    }

    public static void l(boolean flag)
    {
        SharedPreferenceKey.TRAVEL_MODE_ENABLED.putBoolean(flag);
        AS.a().a(flag);
    }

    public static long m()
    {
        return SharedPreferenceKey.LAST_SEEN_ADDED_ME_TIMESTAMP.getLong();
    }

    public static void m(String s1)
    {
        SharedPreferenceKey.STUDY_SETTINGS.putString(s1);
    }

    public static void m(boolean flag)
    {
        SharedPreferenceKey.IS_SEARCHABLE_BY_PHONE_NUMBER.putBoolean(flag);
    }

    public static long n()
    {
        return SharedPreferenceKey.LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP.getLong();
    }

    public static void n(String s1)
    {
        SharedPreferenceKey.SERVER_CONFIGS.putString(s1);
    }

    public static void n(boolean flag)
    {
        (new tr()).a(SharedPreferenceKey.CASH_OUTDATED_PROFILE, true).a(SharedPreferenceKey.SECURITY_CODE_SETTING, flag).a();
    }

    public static int o(boolean flag)
    {
        if (flag)
        {
            return SharedPreferenceKey.KEYBOARD_HEIGHT_LANDSCAPE.getInt(-1);
        } else
        {
            return SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.getInt(-1);
        }
    }

    public static void o()
    {
        SharedPreferenceKey.LAST_SEEN_NEW_FRIENDS_TOOLTIP_TIMESTAMP.putLong(System.currentTimeMillis());
    }

    public static void o(String s1)
    {
        SharedPreferenceKey.DISCOVER_RESOURCE_PARAM_NAME.putString(s1);
    }

    public static long p()
    {
        return SharedPreferenceKey.LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP.getLong();
    }

    public static void p(String s1)
    {
        SharedPreferenceKey.DISCOVER_RESOURCE_PARAM_VALUE.putString(s1);
    }

    public static void p(boolean flag)
    {
        SharedPreferenceKey.IS_ACCOUNT_LOCKED.putBoolean(flag);
    }

    public static String q()
    {
        return SharedPreferenceKey.USERNAME.getString();
    }

    public static void q(String s1)
    {
        SharedPreferenceKey.SNAP_TAG_IMAGE_ID.putString(s1);
    }

    public static void q(boolean flag)
    {
        SharedPreferenceKey.DEMOGRAPHICS_TRACKING_SENT_FLAG.putBoolean(flag);
    }

    public static String r()
    {
        return SharedPreferenceKey.USER_ID.getString();
    }

    public static void r(String s1)
    {
        SharedPreferenceKey.TRANSCODING_STATE.putString(s1);
    }

    public static void r(boolean flag)
    {
        SharedPreferenceKey.TRANSCODING_IN_PROGRESS_FLAG.putBoolean(flag);
    }

    public static void s(String s1)
    {
        SharedPreferenceKey.TRANSCODING_HISTORY.putString(s1);
    }

    public static void s(boolean flag)
    {
        SharedPreferenceKey.TRANSCODING_PROFILE_LEVEL_CONFIGURATION_STATUS.putBoolean(flag);
    }

    public static boolean s()
    {
        return SharedPreferenceKey.IS_VERIFIED_USER.getBoolean();
    }

    public static void t(String s1)
    {
        SharedPreferenceKey.TRANSCODING_OVERWRITE_STATE.putString(s1);
    }

    public static void t(boolean flag)
    {
        SharedPreferenceKey.TRANSCODING_IS_IMAGE_TRANSCODING_ENABLED.putBoolean(flag);
    }

    public static boolean t()
    {
        return SharedPreferenceKey.IS_LOGGED_IN.getBoolean() && SharedPreferenceKey.USERNAME.getString() != null;
    }

    public static void u(String s1)
    {
        SharedPreferenceKey.DEVICE_HARDWARE_INFO_V1.putString(s1);
    }

    public static void u(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_RED_GEAR_IS_ON.putBoolean(flag);
    }

    public static boolean u()
    {
        return t();
    }

    public static void v()
    {
        (new tr()).a(SharedPreferenceKey.IS_LOGGED_IN, false).a(SharedPreferenceKey.USERNAME, null).a();
    }

    public static void v(String s1)
    {
        SharedPreferenceKey.URL_ROUTING_MAP.putString(s1);
    }

    public static void v(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_IS_EMAIL_VERIFIED.putBoolean(flag);
    }

    public static void w(String s1)
    {
        SharedPreferenceKey.IDENTITY_PENDING_EMAIL.putString(s1);
    }

    public static void w(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_IS_PHONE_PASSWORD_CONFIRMED.putBoolean(flag);
    }

    public static boolean w()
    {
        return SharedPreferenceKey.IS_LOGGED_IN.getBoolean() && SharedPreferenceKey.USERNAME.getString() == null;
    }

    public static void x(String s1)
    {
        SharedPreferenceKey.PHONE_VERIFICATION_SMS_FORMAT.putString(s1);
    }

    public static void x(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_IS_TWO_FA_ENABLED.putBoolean(flag);
    }

    public static boolean x()
    {
        return SharedPreferenceKey.NEEDS_PHONE_VERIFICATION.getBoolean();
    }

    public static void y(String s1)
    {
        SharedPreferenceKey.IDENTITY_FRIENDS_SYNC_TOKEN.putString(s1);
    }

    public static void y(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_IS_ADD_NEARBY_ENABLED.putBoolean(flag);
    }

    public static boolean y()
    {
        return SharedPreferenceKey.NEEDS_CAPTCHA_VERIFICATION.getBoolean();
    }

    public static void z(String s1)
    {
        SharedPreferenceKey.LENSES_NATIVE_FLAG_LENSES_GL_RENDERER.putString(s1);
    }

    public static void z(boolean flag)
    {
        SharedPreferenceKey.IDENTITY_IS_HIGH_LOCATION_REQUIRED.putBoolean(flag);
    }

    public static boolean z()
    {
        return SharedPreferenceKey.RAW_THUMBNAIL_UPLOAD_ENABLED.getBoolean(true);
    }

    public final void a(SF sf)
    {
        SharedPreferenceKey sharedpreferencekey = SharedPreferenceKey.SPONSORED_SLUG_DEFAULT_STYLE;
        Bg bg1 = mSponsoredSlugUtils;
        if (sf != null)
        {
            sf = bg1.mGson.toJson(sf);
        } else
        {
            sf = "{}";
        }
        sharedpreferencekey.putString(sf);
    }

    public final SF bR()
    {
        String s1 = SharedPreferenceKey.SPONSORED_SLUG_DEFAULT_STYLE.getString("{}");
        Bg bg1 = mSponsoredSlugUtils;
        if (s1 == "{}")
        {
            return null;
        } else
        {
            java.lang.reflect.Type type = (new Bg._cls1(bg1)).getType();
            return (SF)bg1.mGson.fromJson(s1, type);
        }
    }

    public final String bS()
    {
        SF sf;
        for (sf = bR(); sf == null || !sf.d() || !sf.c().o();)
        {
            return null;
        }

        return sf.c().n();
    }

    static 
    {
        SERVER_CLIENT_PREFERENCES_MAP = eb.a(ClientProperty.SQUARE_TOS_ACCEPTED.name(), SharedPreferenceKey.HAS_ACCEPTED_SQUARE_TOS, ClientProperty.SNAPCASH_NEW_TOS_ACCEPTED.name(), SharedPreferenceKey.HAS_ACCEPTED_SNAPCASH_TOS, ClientProperty.TOU_9_14_ACCEPTED.name(), SharedPreferenceKey.HAS_ACCEPTED_TOU_9_14);
    }
}
