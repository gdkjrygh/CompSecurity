// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import Fc;
import Gc;
import II;
import Je;
import LA;
import Ll;
import Lz;
import PG;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.snapchat.android.HttpMetricsActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.dev.DbBrowserActivity;
import com.snapchat.android.discover.util.network.DiscoverEndpointManager;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.debug.FeatureFlagManager;
import en;
import net.hockeyapp.android.NativeCrashDetector;
import nk;
import rZ;
import sc;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class DeveloperSettingsFragment extends LeftSwipeSettingFragment
{
    final class a extends ArithmeticException
    {

        public a(String s)
        {
            super(s);
        }
    }

    final class b
        implements Runnable
    {

        private final TextView a;
        private int b;
        private DeveloperSettingsFragment c;

        public final void run()
        {
            if (!c.isResumed())
            {
                Timber.c("DeveloperSettingsFragment", "Stop flipping because it has been backgrounded.", new Object[0]);
                return;
            }
            StringBuilder stringbuilder = new StringBuilder(a.getText());
            b = b % stringbuilder.length();
            char c1 = stringbuilder.charAt(b);
            if (Character.isUpperCase(c1))
            {
                stringbuilder.setCharAt(b, Character.toLowerCase(c1));
            } else
            {
                stringbuilder.setCharAt(b, Character.toUpperCase(c1));
            }
            a.setText(stringbuilder.toString());
            b = b + 1;
            a.postDelayed(this, 200L);
        }

        public b(TextView textview)
        {
            c = DeveloperSettingsFragment.this;
            super();
            b = 0;
            a = textview;
        }
    }

    final class c extends IllegalArgumentException
    {

        public c(String s, a a1)
        {
            super(s, a1);
        }
    }

    final class d extends RuntimeException
    {

        public d(String s, Exception exception)
        {
            super(s, exception);
        }
    }


    private static final String i[] = {
        "https://app.snapchat.com", "https://devsnapchat.appspot.com", "https://accounts-dot-devsnapchat.appspot.com"
    };
    public rZ a;
    public sc b;
    private final LA c;
    private final DiscoverEndpointManager d;
    private final Bt e;
    private final FeatureFlagManager f;
    private final TranscodingPreferencesWrapper g;
    private b h;

    public DeveloperSettingsFragment()
    {
        this(LA.a(), DiscoverEndpointManager.a(), Bt.a(), FeatureFlagManager.a());
    }

    private DeveloperSettingsFragment(LA la, DiscoverEndpointManager discoverendpointmanager, Bt bt, FeatureFlagManager featureflagmanager)
    {
        g = TranscodingPreferencesWrapper.a();
        SnapchatApplication.getDIComponent().a(this);
        c = la;
        d = discoverendpointmanager;
        e = bt;
        f = featureflagmanager;
    }

    static Bt a(DeveloperSettingsFragment developersettingsfragment)
    {
        return developersettingsfragment.e;
    }

    private void a(int j, int k, String s)
    {
        CheckBox checkbox = (CheckBox)d(j);
        checkbox.setChecked(II.a(s, false));
        checkbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(s) {

            private String a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                II.b(a, flag);
            }

            
            {
                a = s;
                super();
            }
        });
        d(k).setOnClickListener(new android.view.View.OnClickListener(checkbox) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
    }

    private void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        h = new b((TextView)d(0x7f0d020f));
        LinearLayout linearlayout = (LinearLayout)d(0x7f0d0210);
        int l = com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.values().length;
        int j = 0;
        while (j <= l - 1) 
        {
            com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag featureflag = com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.values()[j];
            View view = layoutinflater.inflate(0x7f04005a, viewgroup, false);
            TextView textview = (TextView)view.findViewById(0x7f0d0247);
            CheckBox checkbox = (CheckBox)view.findViewById(0x7f0d0248);
            textview.setText(FeatureFlagManager.a(featureflag));
            checkbox.setChecked(FeatureFlagManager.b(featureflag));
            checkbox.setOnClickListener(new android.view.View.OnClickListener(featureflag, checkbox) {

                private com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag a;
                private CheckBox b;
                private DeveloperSettingsFragment c;

                public final void onClick(View view1)
                {
                    DeveloperSettingsFragment.e(c);
                    FeatureFlagManager.a(a, b.isChecked());
                }

            
            {
                c = DeveloperSettingsFragment.this;
                a = featureflag;
                b = checkbox;
                super();
            }
            });
            textview.setOnClickListener(new android.view.View.OnClickListener(checkbox, featureflag) {

                private CheckBox a;
                private com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag b;
                private DeveloperSettingsFragment c;

                public final void onClick(View view1)
                {
                    boolean flag;
                    if (!a.isChecked())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a.setChecked(flag);
                    DeveloperSettingsFragment.e(c);
                    FeatureFlagManager.a(b, flag);
                }

            
            {
                c = DeveloperSettingsFragment.this;
                a = checkbox;
                b = featureflag;
                super();
            }
            });
            int k;
            if (j % 2 == 0)
            {
                k = 0x7f0c0034;
            } else
            {
                k = 0x7f0c0035;
            }
            view.setBackgroundResource(k);
            linearlayout.addView(view);
            j++;
        }
    }

    static void a(DeveloperSettingsFragment developersettingsfragment, TextView textview, String s)
    {
        boolean flag;
        if (s.endsWith("-dot-devsnapchat.appspot.com") || s.equals("devsnapchat.appspot.com") || s.equals("https://devsnapchat.appspot.com") || s.endsWith("-dot-feelinsonice-hrd.appspot.com") || s.equals("app.snapchat.com") || s.equals("https://app.snapchat.com"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            developersettingsfragment = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get());
            if (TextUtils.equals(s, "https://app.snapchat.com"))
            {
                Lz.a(developersettingsfragment, null);
            } else
            {
                Lz.a(developersettingsfragment, s);
            }
            textview.setText(s);
            return;
        } else
        {
            developersettingsfragment = new Gc(developersettingsfragment.getActivity());
            developersettingsfragment.h = "Invalid URL! Please enter a valid endpoint!";
            developersettingsfragment.a(0x7f0801bc, null).b();
            return;
        }
    }

    static LA b(DeveloperSettingsFragment developersettingsfragment)
    {
        return developersettingsfragment.c;
    }

    static String c(DeveloperSettingsFragment developersettingsfragment)
    {
        return developersettingsfragment.m();
    }

    static TranscodingPreferencesWrapper d(DeveloperSettingsFragment developersettingsfragment)
    {
        return developersettingsfragment.g;
    }

    static FeatureFlagManager e(DeveloperSettingsFragment developersettingsfragment)
    {
        return developersettingsfragment.f;
    }

    static String[] h()
    {
        return i;
    }

    private String m()
    {
        String s = d.b();
        String s1 = c.b();
        if (s1 == null)
        {
            if (s != null)
            {
                return s;
            } else
            {
                return "";
            }
        } else
        {
            return s1;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040058, viewgroup, false);
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        Object obj1 = (TextView)d(0x7f0d020c);
        Object obj = Lz.a(sharedpreferences);
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = "https://app.snapchat.com";
        }
        ((TextView) (obj1)).setText(bundle);
        ((TextView) (obj1)).setOnClickListener(new android.view.View.OnClickListener(((TextView) (obj1))) {

            final TextView a;
            final DeveloperSettingsFragment b;

            public final void onClick(View view)
            {
                view = new Gc(b.getActivity());
                view.g = "Change Endpoint";
                view = view.a(a.getText().toString());
                view.i = Integer.valueOf(3);
                view = view.a(0x7f080222, new Gc.a(this) {

                    private _cls12 a;

                    public final void a(Gc gc)
                    {
                        DeveloperSettingsFragment.a(a.b, a.a, gc.a());
                    }

            
            {
                a = _pcls12;
                super();
            }
                });
                String as[] = DeveloperSettingsFragment.h();
                ((Gc) (view)).c.setVisibility(0);
                ((Gc) (view)).c.setAdapter(new ArrayAdapter(((Gc) (view)).a, 0x1090003, as));
                ((Gc) (view)).c.setOnItemClickListener(new Gc._cls1(view, as));
                view.b(0x7f08007f, null).b();
            }

            
            {
                b = DeveloperSettingsFragment.this;
                a = textview;
                super();
            }
        });
        bundle = (Spinner)d(0x7f0d0216);
        obj = ArrayAdapter.createFromResource(getActivity(), 0x7f090007, 0x7f0400e3);
        bundle.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        String s = LA.a(m());
        if (s != null)
        {
            bundle.setSelection(((ArrayAdapter) (obj)).getPosition(s));
        }
        bundle.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener(((ArrayAdapter) (obj))) {

            private ArrayAdapter a;
            private DeveloperSettingsFragment b;

            public final void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                adapterview = DeveloperSettingsFragment.c(b);
                Object obj2 = (CharSequence)a.getItem(k);
                if (!obj2.equals(""))
                {
                    view = DeveloperSettingsFragment.b(b);
                    obj2 = (String)obj2;
                    if (adapterview != null && !adapterview.equals(""))
                    {
                        view.c(adapterview.replaceFirst("(?<=region=)[^&]+", ((String) (obj2))));
                        return;
                    }
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                b = DeveloperSettingsFragment.this;
                a = arrayadapter;
                super();
            }
        });
        d(0x7f0d0217).setOnClickListener(new android.view.View.OnClickListener() {

            final DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                view = DeveloperSettingsFragment.c(a);
                DeveloperSettingsFragment.b(a);
                String s1 = LA.b(view);
                (new Fc(this, a.getActivity(), "Change Country", s1, view) {

                    private String a;
                    private _cls20 b;

                    protected final void a(String s)
                    {
                        if (s.length() == 2)
                        {
                            s = s.toUpperCase();
                            LA la = DeveloperSettingsFragment.b(b.a);
                            String s1 = a;
                            if (s1 != null && !s1.equals(""))
                            {
                                la.c(s1.replaceFirst("(?<=country=)[^&]+", s));
                                return;
                            }
                        }
                    }

            
            {
                b = _pcls20;
                a = s2;
                super(context, s, s1, 1);
            }
                }).show();
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        bundle = (TextView)d(0x7f0d0219);
        obj = (ViewGroup)d(0x7f0d0218);
        int j;
        if (c.f() != -1)
        {
            j = c.f();
        } else
        {
            j = 3;
        }
        bundle.setText(Integer.toString(j));
        ((ViewGroup) (obj)).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            final TextView a;
            final DeveloperSettingsFragment b;

            public final void onClick(View view)
            {
                view = a.getText().toString();
                (new Fc(this, b.getActivity(), "Thumbnail Story Count", view, view) {

                    private String a;
                    private _cls21 b;

                    protected final void a(String s)
                    {
                        try
                        {
                            int j = Integer.parseInt(s);
                            DeveloperSettingsFragment.b(b.b).a(j);
                            b.a.setText(Integer.toString(j));
                            if (!TextUtils.equals(a, s))
                            {
                                Je.a().b();
                            }
                            return;
                        }
                        catch (NumberFormatException numberformatexception)
                        {
                            Timber.d("DeveloperSettingsFragment", (new StringBuilder("Invalid number: ")).append(s).toString(), new Object[0]);
                        }
                    }

            
            {
                b = _pcls21;
                a = s2;
                super(context, s, s1, 2);
            }
                }).show();
            }

            
            {
                b = DeveloperSettingsFragment.this;
                a = textview;
                super();
            }
        });
        d(0x7f0d021a).setOnClickListener(new android.view.View.OnClickListener() {

            private DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                DeveloperSettingsFragment.a(a);
                Bt.B(false);
                DeveloperSettingsFragment.a(a);
                Bt.A(false);
                DeveloperSettingsFragment.a(a);
                Bt.bJ();
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        bundle = (CheckBox)d(0x7f0d0245);
        bundle.setChecked(c.g());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).d(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d020d).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        bundle = (CheckBox)d(0x7f0d020e);
        bundle.setChecked(Lz.d());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(sharedpreferences, ((TextView) (obj1))) {

            final SharedPreferences a;
            final TextView b;
            final DeveloperSettingsFragment c;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (compoundbutton.getTag() != null)
                {
                    compoundbutton.setTag(null);
                    return;
                }
                if (flag)
                {
                    AlertDialogUtils.a(c.getActivity(), null, "This will also change the Snapchat endpoint to https://cash-dot-feelinsonice-hrd.appspot.com. Proceed?", new com.snapchat.android.util.AlertDialogUtils.a(this, compoundbutton) {

                        private CompoundButton a;
                        private _cls31 b;

                        public final void a(com.snapchat.android.util.AlertDialogUtils.YesNoOption yesnooption)
                        {
                            if (yesnooption == com.snapchat.android.util.AlertDialogUtils.YesNoOption.YES)
                            {
                                Lz.a(true);
                                Lz.a(b.a, "https://cash-dot-feelinsonice-hrd.appspot.com");
                                b.b.setText("https://cash-dot-feelinsonice-hrd.appspot.com");
                                Bt.av();
                                b.c.a.a(null);
                                b.c.b.b();
                                return;
                            } else
                            {
                                a.setTag(Boolean.valueOf(true));
                                a.setChecked(false);
                                return;
                            }
                        }

            
            {
                b = _pcls31;
                a = compoundbutton;
                super();
            }
                    });
                    return;
                } else
                {
                    Lz.a(false);
                    Lz.a(a, null);
                    b.setText("https://app.snapchat.com");
                    Bt.av();
                    c.a.a(null);
                    c.b.b();
                    AlertDialogUtils.a(c.getActivity(), "The Snapchat endpoint has also been reset to default.");
                    return;
                }
            }

            
            {
                c = DeveloperSettingsFragment.this;
                a = sharedpreferences;
                b = textview;
                super();
            }
        });
        d(0x7f0d020d).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        a(0x7f0d021c, 0x7f0d021b, SharedPreferenceKey.DEVELOPER_OPTIONS_UPGRADE_PROMPT_ENABLED.getKey());
        a(0x7f0d021e, 0x7f0d021d, SharedPreferenceKey.DEVELOPER_OPTIONS_FAKE_FRIENDMOJI_ENABLED.getKey());
        a(0x7f0d0220, 0x7f0d021f, SharedPreferenceKey.DEVELOPER_OPTIONS_ADD_FRIENDS_FROM_SCREENSHOT_ENABLED.getKey());
        a(0x7f0d0222, 0x7f0d0221, SharedPreferenceKey.DEVELOPER_OPTIONS_ENABLE_TERMS_OF_USE.getKey());
        a(0x7f0d0224, 0x7f0d0223, SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE.getKey());
        a(0x7f0d0226, 0x7f0d0225, SharedPreferenceKey.DEVELOPER_OPTIONS_MINI_PROFILE_ENABLED.getKey());
        a(0x7f0d0228, 0x7f0d0227, SharedPreferenceKey.DEVELOPER_OPTIONS_ADD_CONTACTS_FOOTER_ENABLED.getKey());
        a(0x7f0d022a, 0x7f0d0229, SharedPreferenceKey.DEVELOPER_OPTIONS_FAKE_DISPLAY_NAME_ON_SEARCH_FRIEND_ENABLED.getKey());
        obj1 = en.a(new String[] {
            "Server", "Required", "Not Required"
        });
        bundle = SharedPreferenceKey.DEVELOPER_OPTIONS_PHONE_VERIFICATION_EXPERIMENT.getKey();
        obj = (Spinner)d(0x7f0d022c);
        obj1 = new ArrayAdapter(getActivity(), 0x7f0400e3, ((java.util.List) (obj1)));
        ((ArrayAdapter) (obj1)).setDropDownViewResource(0x7f0400e3);
        ((Spinner) (obj)).setAdapter(((android.widget.SpinnerAdapter) (obj1)));
        ((Spinner) (obj)).setSelection(II.b(bundle));
        ((Spinner) (obj)).setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener(bundle) {

            final String a;

            public final void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                PG.b(new Runnable(this, k) {

                    private int a;
                    private _cls27 b;

                    public final void run()
                    {
                        II.a(b.a, a);
                    }

            
            {
                b = _pcls27;
                a = j;
                super();
            }
                });
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = s;
                super();
            }
        });
        bundle = (TextView)d(0x7f0d022f);
        obj = (SeekBar)d(0x7f0d0230);
        ((SeekBar) (obj)).setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener(bundle, sharedpreferences) {

            private TextView a;
            private SharedPreferences b;

            public final void onProgressChanged(SeekBar seekbar, int k, boolean flag)
            {
                k *= 100;
                a.setText((new StringBuilder()).append(k).append("ms").toString());
                seekbar = b.edit();
                seekbar.putInt(SharedPreferenceKey.DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER.getKey(), k);
                seekbar.apply();
            }

            public final void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public final void onStopTrackingTouch(SeekBar seekbar)
            {
            }

            
            {
                a = textview;
                b = sharedpreferences;
                super();
            }
        });
        ((SeekBar) (obj)).setProgress(sharedpreferences.getInt(SharedPreferenceKey.DEVELOPER_OPTIONS_RELEASE_DELAY_TIMER.getKey(), 600) / 100);
        bundle = (CheckBox)d(0x7f0d0232);
        bundle.setChecked(c.e());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).c(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d023b).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                throw new RuntimeException("You asked for this.");
            }

        });
        d(0x7f0d0233).setOnClickListener(new android.view.View.OnClickListener() {

            private DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                Bt.av();
                a.a.a(null);
                a.b.b();
                (new nk()).execute();
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d023c).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                try
                {
                    throw new a("bulba");
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
                try
                {
                    throw new c("ivy ivy", view);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw new d("venusaur...", view);
                }
            }

        });
        d(0x7f0d023d).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                (new Runnable() {

                    public final void run()
                    {
                        do
                        {
                        } while (true);
                    }

                }).run();
            }

        });
        d(0x7f0d023e).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                NativeCrashDetector.a();
            }

        });
        d(0x7f0d023f).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                do
                {
                    Timber.d("DeveloperSettingsFragment", "I eat CPU cycles for breakfast.", new Object[0]);
                } while (true);
            }

        });
        bundle = (CheckBox)d(0x7f0d0241);
        bundle.setChecked(c.h());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).e(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0240).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        d(0x7f0d0242).setOnClickListener(new android.view.View.OnClickListener() {

            private DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                view = new Intent(a.getActivity(), com/snapchat/android/HttpMetricsActivity);
                view.addFlags(0x4000000);
                a.startActivity(view);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0243).setOnClickListener(new android.view.View.OnClickListener() {

            private DeveloperSettingsFragment a;

            public final void onClick(View view)
            {
                view = new Intent(a.getActivity(), com/snapchat/android/dev/DbBrowserActivity);
                view.addFlags(0x4000000);
                a.startActivity(view);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        bundle = (CheckBox)d(0x7f0d0212);
        bundle.setChecked(c.c());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).a(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0211).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        bundle = (CheckBox)d(0x7f0d0214);
        bundle.setChecked(c.d());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).b(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0213).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        obj = en.a(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.OverwrittenTranscodingState.values());
        j = TranscodingPreferencesWrapper.g().getIndex();
        bundle = (Spinner)d(0x7f0d0235);
        obj = new ArrayAdapter(getActivity(), 0x7f0400e3, ((java.util.List) (obj)));
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x7f0400e3);
        bundle.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        bundle.setSelection(j);
        bundle.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            private DeveloperSettingsFragment a;

            public final void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                if (k < com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.OverwrittenTranscodingState.values().length)
                {
                    DeveloperSettingsFragment.d(a);
                    TranscodingPreferencesWrapper.a(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.OverwrittenTranscodingState.values()[k]);
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        ((TextView)d(0x7f0d0236)).setText((new StringBuilder("Default transcoding state: ")).append(TranscodingPreferencesWrapper.f().toString()).toString());
        bundle = (CheckBox)d(0x7f0d0238);
        bundle.setChecked(c.p());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).f(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0237).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        bundle = (CheckBox)d(0x7f0d023a);
        bundle.setChecked(c.q());
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DeveloperSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                DeveloperSettingsFragment.b(a).g(flag);
            }

            
            {
                a = DeveloperSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0239).setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        a(layoutinflater, viewgroup);
        return mFragmentLayout;
    }

    public void onResume()
    {
        super.onResume();
        PG.a(h);
    }

}
