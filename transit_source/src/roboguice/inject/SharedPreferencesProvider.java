// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.inject.Provider;
import java.io.File;

public class SharedPreferencesProvider
    implements Provider
{
    public static class PreferencesNameHolder
    {

        protected String value;

        public PreferencesNameHolder()
        {
        }
    }


    protected static final String ROBOGUICE_1_DEFAULT_FILENAME = "default.xml";
    protected Application application;
    protected String preferencesName;

    public SharedPreferencesProvider()
    {
    }

    public SharedPreferencesProvider(String s)
    {
        preferencesName = s;
    }

    public SharedPreferencesProvider(PreferencesNameHolder preferencesnameholder)
    {
        preferencesName = preferencesnameholder.value;
    }

    public SharedPreferences get()
    {
        if (preferencesName != null)
        {
            return application.getSharedPreferences(preferencesName, 0);
        }
        if ((new File("shared_prefs/default.xml")).canRead())
        {
            return application.getSharedPreferences("default.xml", 0);
        } else
        {
            return PreferenceManager.getDefaultSharedPreferences(application);
        }
    }

    public volatile Object get()
    {
        return get();
    }
}
