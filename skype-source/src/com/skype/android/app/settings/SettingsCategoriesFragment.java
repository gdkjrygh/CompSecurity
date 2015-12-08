// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.config.ecs.EcsConfiguration;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            DebugSettingsFragment, SettingsFragment, NotificationSettingsFragment, AboutFragment

public class SettingsCategoriesFragment extends SkypeFragment
    implements android.widget.AdapterView.OnItemClickListener
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ABOUT;
        public static final a CALLS;
        public static final a CHAT;
        public static final a CONNECTION;
        public static final a CONTACTS;
        public static final a DEBUG;
        public static final a EMOTICONS;
        public static final a MESSAGES;
        public static final a NOTIFICATIONS;
        public static final a SUPPORT;
        private Class fragmentClass;
        private int keyId;
        private int titleId;

        public static List getValues(boolean flag, boolean flag1)
        {
            ArrayList arraylist = new ArrayList();
            a aa[] = values();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                a a1 = aa[i];
                if ((a1 != DEBUG && a1 != EMOTICONS || flag) && (a1 != SUPPORT || flag1))
                {
                    arraylist.add(a1);
                }
            }

            return arraylist;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/settings/SettingsCategoriesFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        public final Fragment create()
        {
            Fragment fragment;
            try
            {
                fragment = (Fragment)fragmentClass.newInstance();
                Bundle bundle = new Bundle();
                if (keyId > 0)
                {
                    bundle.putInt("category_key", keyId);
                }
                fragment.setArguments(bundle);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception);
            }
            return fragment;
        }

        static 
        {
            DEBUG = new a("DEBUG", 0, 0x7f080243, 0x7f060007, com/skype/android/app/settings/DebugSettingsFragment);
            EMOTICONS = new a("EMOTICONS", 1, 0x7f08024c, 0x7f060009, com/skype/android/app/settings/SettingsFragment);
            NOTIFICATIONS = new a("NOTIFICATIONS", 2, 0x7f0802f0, 0, com/skype/android/app/settings/NotificationSettingsFragment);
            CONTACTS = new a("CONTACTS", 3, 0x7f080240, 0x7f060006, com/skype/android/app/settings/SettingsFragment);
            MESSAGES = new a("MESSAGES", 4, 0x7f080267, 0x7f06000d, com/skype/android/app/settings/SettingsFragment);
            CALLS = new a("CALLS", 5, 0x7f080286, 0x7f060013, com/skype/android/app/settings/SettingsFragment);
            CONNECTION = new a("CONNECTION", 6, 0x7f08023b, 0x7f060004, com/skype/android/app/settings/SettingsFragment);
            SUPPORT = new a("SUPPORT", 7, 0x7f08027e, 0x7f060010, com/skype/android/app/settings/SettingsFragment);
            ABOUT = new a("ABOUT", 8, 0x7f080224, 0, com/skype/android/app/settings/AboutFragment);
            CHAT = new a("CHAT", 9, 0x7f080238, 0x7f060003, com/skype/android/app/settings/SettingsFragment);
            $VALUES = (new a[] {
                DEBUG, EMOTICONS, NOTIFICATIONS, CONTACTS, MESSAGES, CALLS, CONNECTION, SUPPORT, ABOUT, CHAT
            });
        }


        private a(String s, int i, int j, int k, Class class1)
        {
            super(s, i);
            titleId = j;
            keyId = k;
            fragmentClass = class1;
        }
    }

    private static final class b extends ArrayAdapter
    {

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = LayoutInflater.from(getContext()).inflate(0x1090016, null);
            }
            view = (a)getItem(i);
            viewgroup.setTag(view);
            ((TextView)viewgroup).setText(getContext().getString(((a) (view)).titleId));
            return viewgroup;
        }

        public b(Context context, EcsConfiguration ecsconfiguration)
        {
            super(context, 0, a.getValues(false, ecsconfiguration.isFeedbackUiEnabled()));
        }
    }


    public static final String FRAGMENT_KEY = "fragment_key";
    EcsConfiguration configuration;

    public SettingsCategoriesFragment()
    {
    }

    private a getDefaultCategory()
    {
        return a.NOTIFICATIONS;
    }

    private void showCategory(a a1)
    {
        setFragment(a1.create());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setRetainInstance(true);
        if (bundle == null)
        {
            showCategory(getDefaultCategory());
            return;
        } else
        {
            setFragment(getFragmentManager().a("fragment_key"));
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300df, viewgroup);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        showCategory((a)view.getTag());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (ListView)view.findViewById(0x7f10025c);
        view.setChoiceMode(1);
        view.setAdapter(new b(getActivity(), configuration));
        view.setOnItemClickListener(this);
        view.setItemChecked(0, true);
    }

    public void setFragment(Fragment fragment)
    {
        o o1 = getFragmentManager().a();
        o1.b(0x7f100006, fragment, "fragment_key");
        o1.a();
    }
}
