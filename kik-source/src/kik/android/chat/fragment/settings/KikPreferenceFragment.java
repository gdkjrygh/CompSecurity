// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import java.util.List;
import kik.a.e.w;
import kik.android.util.DeviceUtils;
import kik.android.widget.preferences.EnterKeySendPreference;
import kik.android.widget.preferences.ShareEmailPreference;

// Referenced classes of package kik.android.chat.fragment.settings:
//            PreferenceFragment, a

public class KikPreferenceFragment extends PreferenceFragment
{
    public static final class a extends PreferenceFragment.a
    {

        public a()
        {
        }
    }


    private f a;
    private i b;
    kik.android.chat.a.a f;
    protected w g;
    protected com.kik.android.a h;

    public KikPreferenceFragment()
    {
        b = new kik.android.chat.fragment.settings.a(this);
    }

    static void a(KikPreferenceFragment kikpreferencefragment)
    {
        kikpreferencefragment.a();
    }

    protected void a()
    {
    }

    protected final void a(PreferenceScreen preferencescreen)
    {
        boolean flag = false;
        super.a(preferencescreen);
        if (preferencescreen != null)
        {
            android.preference.Preference preference = preferencescreen.findPreference("kik.tell.sms");
            Object obj = (ShareEmailPreference)preferencescreen.findPreference("kik.tell.email");
            if (obj != null)
            {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("plain/text");
                if (!((ShareEmailPreference) (obj)).getContext().getPackageManager().queryIntentActivities(intent, 0).isEmpty())
                {
                    flag = true;
                }
                if (!flag)
                {
                    preferencescreen.removePreference(((android.preference.Preference) (obj)));
                }
            }
            obj = (EnterKeySendPreference)preferencescreen.findPreference("kik.enterbutton.sends");
            if (obj != null)
            {
                ((EnterKeySendPreference) (obj)).a(f);
            }
            if (android.os.Build.VERSION.SDK_INT >= 19 && preference != null)
            {
                preferencescreen.removePreference(preference);
            }
            if (!DeviceUtils.c())
            {
                android.preference.Preference preference1 = preferencescreen.findPreference("kik.abtests");
                if (preference1 != null)
                {
                    preferencescreen.removePreference(preference1);
                    return;
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        a = new f();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a.a(g.a(), b);
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        viewgroup.setDivider(null);
        viewgroup.setFooterDividersEnabled(false);
        viewgroup.setHeaderDividersEnabled(false);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        a.a();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }
}
