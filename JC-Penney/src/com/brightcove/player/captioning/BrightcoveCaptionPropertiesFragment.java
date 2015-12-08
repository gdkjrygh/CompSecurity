// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.captioning.preferences.ColorPreference;
import com.brightcove.player.captioning.preferences.EdgeTypePreference;
import com.brightcove.player.captioning.preferences.ListDialogPreference;
import com.brightcove.player.captioning.preferences.ListPreferenceWithSummary;
import com.brightcove.player.captioning.preferences.PresetPreference;
import com.brightcove.player.management.BrightcoveClosedCaptioningManager;

// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveClosedCaptioningTextView, BrightcoveCaptionStyle

public class BrightcoveCaptionPropertiesFragment extends PreferenceFragment
    implements android.preference.Preference.OnPreferenceChangeListener, com.brightcove.player.captioning.preferences.ListDialogPreference.OnValueChangedListener
{

    public static final String TAG = com/brightcove/player/captioning/BrightcoveCaptionPropertiesFragment.getSimpleName();
    private BrightcoveClosedCaptioningTextView a;
    private SwitchPreference b;
    private ListPreferenceWithSummary c;
    private PresetPreference d;
    private ListPreferenceWithSummary e;
    private ColorPreference f;
    private ColorPreference g;
    private EdgeTypePreference h;
    private ColorPreference i;
    private ColorPreference j;
    private ColorPreference k;
    private ColorPreference l;
    private ColorPreference m;
    private PreferenceCategory n;
    private PreferenceCategory o;
    private boolean p;

    public BrightcoveCaptionPropertiesFragment()
    {
    }

    private void a()
    {
        b = (SwitchPreference)findPreference("captions_master_switch");
        c = (ListPreferenceWithSummary)findPreference("captioning_font_size");
        int ai[] = getResources().getIntArray(com.brightcove.player.R.array.captioning_preset_selector_values);
        String as[] = getResources().getStringArray(com.brightcove.player.R.array.captioning_preset_selector_titles);
        d = (PresetPreference)findPreference("captioning_preset");
        d.setValues(ai);
        d.setTitles(as);
        n = (PreferenceCategory)findPreference("standard");
        o = (PreferenceCategory)findPreference("custom");
        p = true;
        ai = getResources().getIntArray(com.brightcove.player.R.array.captioning_color_selector_values);
        as = getResources().getStringArray(com.brightcove.player.R.array.captioning_color_selector_titles);
        f = (ColorPreference)o.findPreference("captioning_foreground_color");
        f.setTitles(as);
        f.setValues(ai);
        int ai1[] = getResources().getIntArray(com.brightcove.player.R.array.captioning_opacity_selector_values);
        String as1[] = getResources().getStringArray(com.brightcove.player.R.array.captioning_opacity_selector_titles);
        g = (ColorPreference)o.findPreference("captioning_foreground_opacity");
        g.setTitles(as1);
        g.setValues(ai1);
        i = (ColorPreference)o.findPreference("captioning_edge_color");
        i.setTitles(as);
        i.setValues(ai);
        int ai2[] = new int[ai.length + 1];
        String as2[] = new String[as.length + 1];
        System.arraycopy(ai, 0, ai2, 1, ai.length);
        System.arraycopy(as, 0, as2, 1, as.length);
        ai2[0] = 0;
        as2[0] = getString(com.brightcove.player.R.string.color_none);
        j = (ColorPreference)o.findPreference("captioning_background_color");
        j.setTitles(as2);
        j.setValues(ai2);
        k = (ColorPreference)o.findPreference("captioning_background_opacity");
        k.setTitles(as1);
        k.setValues(ai1);
        l = (ColorPreference)o.findPreference("captioning_window_color");
        l.setTitles(as2);
        l.setValues(ai2);
        m = (ColorPreference)o.findPreference("captioning_window_opacity");
        m.setTitles(as1);
        m.setValues(ai1);
        h = (EdgeTypePreference)o.findPreference("captioning_edge_type");
        e = (ListPreferenceWithSummary)o.findPreference("captioning_typeface");
    }

    private void a(boolean flag)
    {
        o.setEnabled(flag);
        n.setEnabled(flag);
        b.setEnabled(true);
        if (a.getParent() != null)
        {
            ViewGroup viewgroup = (ViewGroup)a.getParent();
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            viewgroup.setVisibility(i1);
        }
    }

    private void b()
    {
        d.setOnValueChangedListener(this);
        f.setOnValueChangedListener(this);
        g.setOnValueChangedListener(this);
        i.setOnValueChangedListener(this);
        j.setOnValueChangedListener(this);
        k.setOnValueChangedListener(this);
        l.setOnValueChangedListener(this);
        m.setOnValueChangedListener(this);
        h.setOnValueChangedListener(this);
        e.setOnPreferenceChangeListener(this);
        c.setOnPreferenceChangeListener(this);
        b.setOnPreferenceChangeListener(this);
    }

    private void c()
    {
        boolean flag;
        if ((float)d.getValue() == -1F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && p)
        {
            getPreferenceScreen().removePreference(o);
            p = false;
        } else
        if (flag && !p)
        {
            getPreferenceScreen().addPreference(o);
            p = true;
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(com.brightcove.player.R.xml.brightcove_captioning_settings);
        a();
        c();
        b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(com.brightcove.player.R.layout.captioning_preview, viewgroup, false);
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((ViewGroup)view.findViewById(com.brightcove.player.R.id.properties_fragment)).addView(layoutinflater, -1, -1);
        a = (BrightcoveClosedCaptioningTextView)view.findViewById(com.brightcove.player.R.id.preview_text);
        a.setStyle(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle());
        a(PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("captions_master_switch", false));
        return view;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (preference.getKey().equals("captions_master_switch"))
        {
            a(((Boolean)obj).booleanValue());
        } else
        {
            preference = BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle(), preference.getKey(), obj);
            a.setStyle(preference);
            BrightcoveClosedCaptioningManager.getInstance(getActivity()).setStyle(preference);
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onValueChanged(ListDialogPreference listdialogpreference, int i1)
    {
        if (listdialogpreference.getKey().equals("captioning_preset"))
        {
            listdialogpreference = ((PresetPreference)listdialogpreference).getStyleForPreset(i1);
            c();
        } else
        {
            listdialogpreference = BrightcoveCaptionStyle.updateStyleByPreferenceKey(BrightcoveClosedCaptioningManager.getInstance(getActivity()).getStyle(), listdialogpreference.getKey(), Integer.valueOf(i1));
        }
        a.setStyle(listdialogpreference);
        BrightcoveClosedCaptioningManager.getInstance(getActivity()).setStyle(listdialogpreference);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
    }

}
