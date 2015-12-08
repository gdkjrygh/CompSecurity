// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package com.skype.android:
//            SkypeFragment

public class SkypePreferenceFragment extends SkypeFragment
    implements android.os.Handler.Callback
{
    private static final class a
    {

        private PreferenceManager a;
        private Class b;

        private void a(String s)
        {
            try
            {
                s = b.getDeclaredMethod(s, new Class[0]);
                s.setAccessible(true);
                s.invoke(a, new Object[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
        }

        public final Preference a(CharSequence charsequence)
        {
            try
            {
                Method method = b.getDeclaredMethod("findPreference", new Class[] {
                    java/lang/CharSequence
                });
                method.setAccessible(true);
                charsequence = (Preference)method.invoke(a, new Object[] {
                    charsequence
                });
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                throw new RuntimeException(charsequence);
            }
            return charsequence;
        }

        public final PreferenceScreen a()
        {
            Object obj;
            try
            {
                obj = b.getDeclaredMethod("getPreferenceScreen", new Class[0]);
                ((Method) (obj)).setAccessible(true);
                obj = (PreferenceScreen)((Method) (obj)).invoke(a, new Object[0]);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception);
            }
            return ((PreferenceScreen) (obj));
        }

        public final PreferenceScreen a(Context context, int i, PreferenceScreen preferencescreen)
        {
            try
            {
                Method method = b.getDeclaredMethod("inflateFromResource", new Class[] {
                    android/content/Context, Integer.TYPE, android/preference/PreferenceScreen
                });
                method.setAccessible(true);
                context = (PreferenceScreen)method.invoke(a, new Object[] {
                    context, Integer.valueOf(i), preferencescreen
                });
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new RuntimeException(context);
            }
            return context;
        }

        public final void a(int i, int j, Intent intent)
        {
            try
            {
                Method method = b.getDeclaredMethod("dispatchActivityResult", new Class[] {
                    Integer.TYPE, Integer.TYPE, android/content/Intent
                });
                method.setAccessible(true);
                method.invoke(a, new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j), intent
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw new RuntimeException(intent);
            }
        }

        public final boolean a(PreferenceScreen preferencescreen)
        {
            boolean flag;
            try
            {
                Method method = b.getDeclaredMethod("setPreferences", new Class[] {
                    android/preference/PreferenceScreen
                });
                method.setAccessible(true);
                flag = ((Boolean)method.invoke(a, new Object[] {
                    preferencescreen
                })).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (PreferenceScreen preferencescreen)
            {
                throw new RuntimeException(preferencescreen);
            }
            return flag;
        }

        public final void b()
        {
            a("dispatchActivityStop");
        }

        public final void c()
        {
            a("dispatchActivityDestroy");
        }

        public final PreferenceManager d()
        {
            return a;
        }

        public a(Activity activity)
        {
            try
            {
                Constructor constructor = android/preference/PreferenceManager.getDeclaredConstructor(new Class[] {
                    android/app/Activity, Integer.TYPE
                });
                constructor.setAccessible(true);
                a = (PreferenceManager)constructor.newInstance(new Object[] {
                    activity, Integer.valueOf(100)
                });
                b = a.getClass();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new RuntimeException(activity);
            }
        }
    }


    private static final int WHAT_BIND_PREFERENCES = 1;
    private boolean activityCreated;
    private Handler handler;
    private boolean havePrefs;
    private ListView listView;
    private a preferenceManagerDelegate;

    public SkypePreferenceFragment()
    {
    }

    private void bindPreferences()
    {
        PreferenceScreen preferencescreen = getPreferenceScreen();
        if (preferencescreen != null && listView != null)
        {
            preferencescreen.bind(listView);
        }
    }

    private void postBindPreferences()
    {
        if (!handler.hasMessages(1))
        {
            handler.sendEmptyMessage(1);
        }
    }

    public void addPreferencesFromResource(int i)
    {
        setPreferenceScreen(preferenceManagerDelegate.a(getActivity(), i, getPreferenceScreen()));
    }

    public Preference findPreference(CharSequence charsequence)
    {
        return preferenceManagerDelegate.a(charsequence);
    }

    public Object findPreference(int i)
    {
        return findPreference(((CharSequence) (getString(i))));
    }

    public PreferenceManager getPreferenceManager()
    {
        return preferenceManagerDelegate.d();
    }

    public PreferenceScreen getPreferenceScreen()
    {
        return preferenceManagerDelegate.a();
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            bindPreferences();
            break;
        }
        return true;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (havePrefs)
        {
            bindPreferences();
        }
        activityCreated = true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        preferenceManagerDelegate.a(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        handler = new Handler(this);
        preferenceManagerDelegate = new a(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300df, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        preferenceManagerDelegate.c();
    }

    public void onDestroyView()
    {
        handler.removeMessages(1);
        super.onDestroyView();
    }

    public void onStop()
    {
        super.onStop();
        preferenceManagerDelegate.b();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listView = (ListView)view.findViewById(0x7f10025c);
    }

    public void setPreferenceScreen(PreferenceScreen preferencescreen)
    {
        if (preferenceManagerDelegate.a(preferencescreen) && preferencescreen != null)
        {
            havePrefs = true;
            if (activityCreated)
            {
                postBindPreferences();
            }
        }
    }
}
