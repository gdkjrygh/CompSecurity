// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class SubtitleConfiguration extends Enum
{

    private static final SubtitleConfiguration $VALUES[];
    public static SubtitleConfiguration DEFAULT;
    public static final SubtitleConfiguration ENHANCED_XML;
    public static final SubtitleConfiguration SIMPLE_EVENTS;
    public static final SubtitleConfiguration SIMPLE_XML;
    private static final String TAG = "nf_conf";
    private int mLabelId;
    private int mLookupType;
    private com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode mMode;
    private com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile mProfile;

    private SubtitleConfiguration(String s, int i, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile subtitleprofile, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode subtitleoutputmode, int j, int k)
    {
        super(s, i);
        mProfile = subtitleprofile;
        mMode = subtitleoutputmode;
        mLookupType = j;
        mLabelId = k;
    }

    public static SubtitleConfiguration clearQaLocalOverride(Context context)
    {
        PreferenceUtils.removePref(context, "nf_subtitle_configuraton_QA_local");
        return DEFAULT;
    }

    public static SubtitleConfiguration clearRecords(Context context)
    {
        PreferenceUtils.removePref(context, "nf_subtitle_configuraton");
        return ENHANCED_XML;
    }

    public static SubtitleConfiguration load(Context context)
    {
        int i = PreferenceUtils.getIntPref(context, "nf_subtitle_configuraton", -1);
        if (i < 1)
        {
            Log.d("nf_conf", "No overrides found. Use default");
            return DEFAULT;
        }
        if (Log.isLoggable("nf_conf", 3))
        {
            Log.d("nf_conf", (new StringBuilder()).append("Remote override found ").append(i).toString());
        }
        return lookup(i);
    }

    public static SubtitleConfiguration loadQaLocalOverride(Context context)
    {
        int i = PreferenceUtils.getIntPref(context, "nf_subtitle_configuraton_QA_local", -1);
        if (i < 1)
        {
            return DEFAULT;
        } else
        {
            return lookup(i);
        }
    }

    public static SubtitleConfiguration lookup(int i)
    {
        SubtitleConfiguration asubtitleconfiguration[] = values();
        int k = asubtitleconfiguration.length;
        for (int j = 0; j < k; j++)
        {
            SubtitleConfiguration subtitleconfiguration = asubtitleconfiguration[j];
            if (subtitleconfiguration.mLookupType == i)
            {
                return subtitleconfiguration;
            }
        }

        if (Log.isLoggable("nf_conf", 6))
        {
            Log.e("nf_conf", (new StringBuilder()).append("Subtitle configuration lookup value ").append(i).append(" is not supported. Use default Enhanced + XML").toString());
        }
        return ENHANCED_XML;
    }

    public static SubtitleConfiguration update(Context context, String s)
    {
        SubtitleConfiguration subtitleconfiguration = ENHANCED_XML;
        if (s == null)
        {
            Log.e("nf_conf", "Subtitle configuration is not available, use default enhanced + XML");
            s = subtitleconfiguration;
        } else
        {
            s = lookup(Integer.parseInt(s));
        }
        PreferenceUtils.putIntPref(context, "nf_subtitle_configuraton", s.getLookupType());
        return load(context);
    }

    public static SubtitleConfiguration updateQaLocalOverride(Context context, Integer integer)
    {
        SubtitleConfiguration subtitleconfiguration = DEFAULT;
        if (integer == null)
        {
            Log.e("nf_conf", "Subtitle configuration is not available, use default enhanced + XML");
            integer = subtitleconfiguration;
        } else
        {
            integer = lookup(integer.intValue());
        }
        PreferenceUtils.putIntPref(context, "nf_subtitle_configuraton_QA_local", integer.getLookupType());
        return integer;
    }

    public static SubtitleConfiguration valueOf(String s)
    {
        return (SubtitleConfiguration)Enum.valueOf(com/netflix/mediaclient/service/configuration/SubtitleConfiguration, s);
    }

    public static SubtitleConfiguration[] values()
    {
        return (SubtitleConfiguration[])$VALUES.clone();
    }

    public int getLookupType()
    {
        return mLookupType;
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode getMode()
    {
        return mMode;
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile getProfile()
    {
        return mProfile;
    }

    public String getString(Context context)
    {
        return context.getString(mLabelId);
    }

    static 
    {
        ENHANCED_XML = new SubtitleConfiguration("ENHANCED_XML", 0, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile.ENHANCED, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.DATA_XML, 1, 0x7f0c01ab);
        SIMPLE_XML = new SubtitleConfiguration("SIMPLE_XML", 1, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile.SIMPLE, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.DATA_XML, 2, 0x7f0c01ac);
        SIMPLE_EVENTS = new SubtitleConfiguration("SIMPLE_EVENTS", 2, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile.SIMPLE, com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.EVENTS, 3, 0x7f0c01ad);
        $VALUES = (new SubtitleConfiguration[] {
            ENHANCED_XML, SIMPLE_XML, SIMPLE_EVENTS
        });
        DEFAULT = ENHANCED_XML;
    }
}
