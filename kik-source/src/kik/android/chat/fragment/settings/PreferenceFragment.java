// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import android.widget.TextView;
import com.kik.e.a;
import com.kik.m.p;
import com.kik.sdkutils.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kik.a.e.v;
import kik.android.chat.fragment.KikIqFragmentBase;
import kik.android.util.an;
import kik.android.util.ar;
import kik.android.util.cv;
import kik.android.widget.preferences.AutoplayVideoPreference;
import kik.android.widget.preferences.KikCheckBoxPreference;
import kik.android.widget.preferences.KikEditTextPreference;
import kik.android.widget.preferences.KikModalPreference;
import kik.android.widget.preferences.KikPreference;
import kik.android.widget.preferences.KikPreferenceScreen;
import kik.android.widget.preferences.KikVideoPrefetchPreference;
import kik.android.widget.preferences.LEDNotificationPreference;

// Referenced classes of package kik.android.chat.fragment.settings:
//            d, e, g, f

public class PreferenceFragment extends KikIqFragmentBase
    implements android.preference.Preference.OnPreferenceChangeListener, d
{
    public static class a extends an
    {

        static int a(a a1)
        {
            return a1.b("PreferenceFragment.PREFERENCE_LIST_XML_ID", 0);
        }

        public final a a()
        {
            a("PreferenceFragment.PREFERENCE_TOPBAR_ICON", 0);
            return this;
        }

        public final a a(int l)
        {
            a("PreferenceFragment.PREFERENCE_LIST_XML_ID", l);
            return this;
        }

        public final a a(String s)
        {
            a("PreferenceFragment.PREFERENCE_CALLOUT_SHOWN", s);
            return this;
        }

        public final int b()
        {
            return b("PreferenceFragment.PREFERENCE_BACK_BUTTON", 0);
        }

        public final a b(int l)
        {
            a("PreferenceFragment.PREFERENCE_BACK_BUTTON", l);
            return this;
        }

        public final String c()
        {
            String s = g("PreferenceFragment.PREFERENCE_CALLOUT_SHOWN");
            if (s != null)
            {
                return s;
            } else
            {
                return "";
            }
        }

        public final a d()
        {
            a("PreferenceFragment.PREFERENCE_SHOW_SHADOW", true);
            return this;
        }

        public final boolean e()
        {
            return f("PreferenceFragment.PREFERENCE_SHOW_SHADOW").booleanValue();
        }

        public a()
        {
        }
    }


    private PreferenceManager a;
    private TextView b;
    private ViewGroup c;
    private a d;
    private boolean e;
    private boolean f;
    private Handler g;
    private ListView h;
    protected v i;
    protected ar j;
    private int k;

    public PreferenceFragment()
    {
        d = new a();
        e = false;
        f = false;
        g = new e(this);
    }

    private void a()
    {
        if (g.hasMessages(0))
        {
            return;
        } else
        {
            g.obtainMessage(0).sendToTarget();
            return;
        }
    }

    static void a(PreferenceFragment preferencefragment)
    {
        preferencefragment.d();
    }

    static boolean b(PreferenceFragment preferencefragment)
    {
        return preferencefragment.f;
    }

    static ViewGroup c(PreferenceFragment preferencefragment)
    {
        return preferencefragment.c;
    }

    private void d()
    {
        PreferenceScreen preferencescreen = f();
        if (preferencescreen != null)
        {
            b.setText(preferencescreen.getTitle());
            a(preferencescreen);
            preferencescreen.bind(h);
            int i1 = preferencescreen.getPreferenceCount();
            int l = 0;
            while (l < i1) 
            {
                Preference preference = preferencescreen.getPreference(l);
                if (preference instanceof KikPreferenceScreen)
                {
                    KikPreferenceScreen kikpreferencescreen = (KikPreferenceScreen)preference;
                    V().a(kikpreferencescreen);
                    preference.setOnPreferenceClickListener(new g(this, kikpreferencescreen));
                    kikpreferencescreen.a(this);
                } else
                if (preference instanceof KikVideoPrefetchPreference)
                {
                    ((KikVideoPrefetchPreference)preference).a(V());
                } else
                if (preference instanceof AutoplayVideoPreference)
                {
                    ((AutoplayVideoPreference)preference).a(V());
                } else
                if (preference instanceof LEDNotificationPreference)
                {
                    ((LEDNotificationPreference)preference).a(V());
                } else
                if (preference instanceof KikEditTextPreference)
                {
                    KikEditTextPreference kikedittextpreference = (KikEditTextPreference)preference;
                    kikedittextpreference.a(V());
                    kikedittextpreference.a(this);
                } else
                if (preference instanceof KikCheckBoxPreference)
                {
                    KikCheckBoxPreference kikcheckboxpreference = (KikCheckBoxPreference)preference;
                    kikcheckboxpreference.a(V());
                    kikcheckboxpreference.a(this);
                } else
                if (preference instanceof KikModalPreference)
                {
                    KikModalPreference kikmodalpreference = (KikModalPreference)preference;
                    kikmodalpreference.a(V());
                    kikmodalpreference.a(this);
                } else
                if (preference instanceof KikPreference)
                {
                    KikPreference kikpreference = (KikPreference)preference;
                    kikpreference.a(V());
                    kikpreference.a(this);
                }
                if ((preference instanceof p) && preference.getTitle() != null && preference.getTitle().equals(d.c()))
                {
                    ((p)preference).a(true);
                }
                l++;
            }
        }
    }

    private PreferenceManager e()
    {
        Object obj;
        try
        {
            obj = android/preference/PreferenceManager.getDeclaredConstructor(new Class[] {
                android/app/Activity, Integer.TYPE
            });
            ((Constructor) (obj)).setAccessible(true);
            obj = (PreferenceManager)((Constructor) (obj)).newInstance(new Object[] {
                getActivity(), Integer.valueOf(100)
            });
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return ((PreferenceManager) (obj));
    }

    private PreferenceScreen f()
    {
        Object obj;
        try
        {
            obj = android/preference/PreferenceManager.getDeclaredMethod("getPreferenceScreen", new Class[0]);
            ((Method) (obj)).setAccessible(true);
            obj = (PreferenceScreen)((Method) (obj)).invoke(a, new Object[0]);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return ((PreferenceScreen) (obj));
    }

    protected int a(int l)
    {
        return l;
    }

    public final Preference a(CharSequence charsequence)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.findPreference(charsequence);
        }
    }

    protected void a(PreferenceScreen preferencescreen)
    {
    }

    public final void b()
    {
        e = true;
    }

    protected final ListView c()
    {
        return h;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        try
        {
            Method method = android/preference/PreferenceManager.getDeclaredMethod("dispatchActivityResult", new Class[] {
                Integer.TYPE, Integer.TYPE, android/content/Intent
            });
            method.setAccessible(true);
            method.invoke(a, new Object[] {
                Integer.valueOf(l), Integer.valueOf(i1), intent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a();
        viewgroup = getArguments();
        d.a(viewgroup);
        int i1 = kik.android.chat.fragment.settings.a.a(d);
        int l = d.b();
        i1 = a(i1);
        a = e();
        if (a != null)
        {
            a.setSharedPreferencesName(j.d());
        }
        viewgroup = layoutinflater.inflate(0x7f030048, null);
        bundle = viewgroup.findViewById(0x7f0e004f);
        c = (ViewGroup)viewgroup.findViewById(0x7f0e000e);
        if (l != 0)
        {
            if (c != null)
            {
                c.removeAllViews();
                layoutinflater.inflate(l, c);
            }
            bundle.setVisibility(0);
        } else
        if (d.e())
        {
            bundle.setVisibility(0);
        } else
        {
            if (c != null)
            {
                c.setBackgroundColor(getResources().getColor(0x7f0c008b));
                c.getBackground().mutate().setAlpha(0);
            }
            f = true;
            bundle.setAlpha(0.0F);
        }
        h = (ListView)viewgroup.findViewById(0x102000a);
        if (!y.b(9))
        {
            h.setOverscrollFooter(null);
        }
        h.setScrollBarStyle(0);
        h.setOnScrollListener(new f(this, bundle));
        b = (TextView)viewgroup.findViewById(0x7f0e0078);
        layoutinflater = android/preference/PreferenceManager.getDeclaredMethod("inflateFromResource", new Class[] {
            android/content/Context, Integer.TYPE, android/preference/PreferenceScreen
        });
        layoutinflater.setAccessible(true);
        layoutinflater = (PreferenceScreen)layoutinflater.invoke(a, new Object[] {
            getActivity(), Integer.valueOf(i1), f()
        });
        bundle = android/preference/PreferenceManager.getDeclaredMethod("setPreferences", new Class[] {
            android/preference/PreferenceScreen
        });
        bundle.setAccessible(true);
        if (((Boolean)bundle.invoke(a, new Object[] {
    layoutinflater
})).booleanValue() && layoutinflater != null)
        {
            try
            {
                a();
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                try
                {
                    layoutinflater.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (LayoutInflater layoutinflater)
                {
                    layoutinflater.printStackTrace();
                }
            }
        }
        k = i1;
        d();
        f();
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        h = null;
        try
        {
            Method method = android/preference/PreferenceManager.getDeclaredMethod("dispatchActivityDestroy", new Class[0]);
            method.setAccessible(true);
            method.invoke(a, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        android.view.ViewParent viewparent = h.getParent();
        if (viewparent != null)
        {
            ((ViewGroup)viewparent).removeView(h);
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        return false;
    }

    public void onResume()
    {
        super.onResume();
        if (e)
        {
            e = false;
            ListView listview = h;
            PreferenceScreen preferencescreen = f();
            for (int l = 0; l < preferencescreen.getPreferenceCount(); l++)
            {
                Preference preference = preferencescreen.getPreference(l);
                if (preference instanceof p)
                {
                    ((p)preference).a(false);
                }
            }

            for (int i1 = 0; i1 < listview.getChildCount(); i1++)
            {
                cv.e(new View[] {
                    listview.getChildAt(i1).findViewById(0x7f0e01be), listview.getChildAt(i1).findViewById(0x7f0e01bf)
                });
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        try
        {
            Method method = android/preference/PreferenceManager.getDeclaredMethod("dispatchActivityStop", new Class[0]);
            method.setAccessible(true);
            method.invoke(a, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
