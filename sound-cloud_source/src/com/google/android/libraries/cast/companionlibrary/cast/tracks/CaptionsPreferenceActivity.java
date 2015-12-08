// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.tracks:
//            TracksPreferenceManager

public class CaptionsPreferenceActivity extends PreferenceActivity
{

    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/tracks/CaptionsPreferenceActivity);

    public CaptionsPreferenceActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = VideoCastManager.getInstance();
        if (!bundle.isFeatureEnabled(16))
        {
            LogUtils.LOGE(TAG, "Did you forget to enable FEATURE_CAPTIONS_PREFERENCE when you initialized the VideoCastManage?");
            finish();
            return;
        }
        if (Utils.IS_KITKAT_OR_ABOVE)
        {
            startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            finish();
            return;
        } else
        {
            addPreferencesFromResource(com.google.android.libraries.cast.companionlibrary.R.xml.caption_preference);
            bundle.getTracksPreferenceManager().setUpPreferences(getPreferenceScreen());
            return;
        }
    }

}
