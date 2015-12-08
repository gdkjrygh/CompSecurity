// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import com.snapchat.android.database.SharedPreferenceKey;
import java.util.Observable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LA extends Observable
{

    private static final Pattern COUNTRY_PROPERTY_PATTERN = Pattern.compile("(?<=country=)[^&]+");
    private static final String COUNTRY_PROPERTY_REGEX = "(?<=country=)[^&]+";
    private static final LA INSTANCE = new LA();
    private static final Pattern REGION_PROPERTY_PATTERN = Pattern.compile("(?<=region=)[^&]+");
    private static final String REGION_PROPERTY_REGEX = "(?<=region=)[^&]+";
    public SharedPreferences mSharedPreferences;

    public LA()
    {
    }

    public static LA a()
    {
        return INSTANCE;
    }

    public static String a(String s)
    {
        s = REGION_PROPERTY_PATTERN.matcher(s);
        if (s.find())
        {
            return s.group();
        } else
        {
            return null;
        }
    }

    public static String b(String s)
    {
        s = COUNTRY_PROPERTY_PATTERN.matcher(s);
        if (s.find())
        {
            return s.group();
        } else
        {
            return null;
        }
    }

    public static boolean i()
    {
        return II.a(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE.getKey(), false);
    }

    public static void j()
    {
        II.b(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE.getKey(), false);
    }

    public static boolean k()
    {
        return II.a(SharedPreferenceKey.DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE.getKey(), true);
    }

    public static boolean l()
    {
        return II.a(SharedPreferenceKey.DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED.getKey(), true);
    }

    public static boolean m()
    {
        return II.a(SharedPreferenceKey.DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED.getKey(), false);
    }

    public static boolean n()
    {
        return II.a(SharedPreferenceKey.DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED.getKey(), false);
    }

    public static int o()
    {
        return II.b(SharedPreferenceKey.DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT.getKey());
    }

    public final void a(int i1)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putInt(SharedPreferenceKey.DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL.getKey(), i1);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final String b()
    {
        if (mSharedPreferences == null)
        {
            return null;
        } else
        {
            return mSharedPreferences.getString(SharedPreferenceKey.DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT.getKey(), null);
        }
    }

    public final void b(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final void c(String s)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putString(SharedPreferenceKey.DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT.getKey(), s);
            editor.apply();
            setChanged();
            notifyObservers(SharedPreferenceKey.DEVELOPER_OPTIONS_DISCOVER_CUSTOM_ENDPOINT.getKey());
            return;
        }
    }

    public final void c(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final boolean c()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_SHOW_DEVICE_TOKEN_TOASTS.getKey(), false);
        }
    }

    public final void d(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final boolean d()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_DISABLE_PINNING.getKey(), false);
        }
    }

    public final void e(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final boolean e()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_FAKE_CELLULAR_CONNECTION.getKey(), false);
        }
    }

    public final int f()
    {
        if (mSharedPreferences == null)
        {
            return -1;
        } else
        {
            return mSharedPreferences.getInt(SharedPreferenceKey.DEVELOPER_OPTIONS_NUM_STORIES_PER_THUMBNAIL.getKey(), -1);
        }
    }

    public final void f(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final void g(boolean flag)
    {
        if (mSharedPreferences == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY.getKey(), flag);
            editor.apply();
            setChanged();
            notifyObservers();
            return;
        }
    }

    public final boolean g()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_DIAGNOSTIC_OVERLAY.getKey(), false);
        }
    }

    public final boolean h()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_HTTP_METRICS_ENABLED.getKey(), false);
        }
    }

    public final boolean p()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_IGNORE_LOOKSERY_WHITELIST.getKey(), false);
        }
    }

    public final boolean q()
    {
        if (mSharedPreferences == null)
        {
            return false;
        } else
        {
            return mSharedPreferences.getBoolean(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOULD_SHOW_FPS_OVERLAY.getKey(), false);
        }
    }

}
