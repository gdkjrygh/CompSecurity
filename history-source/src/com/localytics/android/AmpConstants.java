// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            Constants

class AmpConstants extends Constants
{

    public static final String ACTION_CLICK = "click";
    public static final String ACTION_DISMISS = "X";
    public static final String ADID_STRING = "adid";
    public static final String AMPACTION_STRING = "ampAction";
    public static final String AMP_AB_KEY = "ampAB";
    public static final String AMP_ACTION_KEY = "ampAction";
    public static final String AMP_CAMPAIGN_ID_KEY = "ampCampaignId";
    public static final String AMP_CAMPAIGN_KEY = "ampCampaign";
    public static final String AMP_DURATION_KEY = "ampDuration";
    public static final String AMP_EVENT_NAME_KEY = "ampView";
    public static final String AMP_FIRST_RUN_TRIGGER = "AMP First Run";
    public static final String AMP_KEY = "amp";
    public static final String AMP_START_TRIGGER = "AMP Loaded";
    public static final String AMP_UPGRADE_TRIGGER = "AMP upgrade";
    public static final String CONDITIONS_KEY = "conditions";
    public static final String DEFAULT_HTML_PAGE = "index.html";
    public static final String DEFAULT_ZIP_PAGE = "amp_rule_%d.zip";
    public static final String DEVICE_BOTH = "both";
    public static final String DEVICE_PHONE = "phone";
    public static final String DEVICE_TABLET = "tablet";
    public static final float DISMISS_BUTTON_SIDE = 40F;
    public static final String DISPLAY_EVENTS_KEY = "display_events";
    public static final String HEIGHT_KEY = "height";
    public static final String KEY_BASE_PATH = "base_path";
    public static final String KEY_DISPLAY_HEIGHT = "display_height";
    public static final String KEY_DISPLAY_WIDTH = "display_width";
    public static final String KEY_HTML_URL = "html_url";
    public static final String LOCALYTICS_DIR = ".localytics";
    public static final String OPEN_EXTERNAL = "ampExternalOpen";
    public static final String PHONE_SIZE_KEY = "phone_size";
    public static final String PROTOCOL_FILE = "file";
    public static final String PROTOCOL_HTTP = "http";
    public static final String PROTOCOL_HTTPS = "https";
    public static final String TABLET_SIZE_KEY = "tablet_size";
    public static final String TEST_MODE_UPDATE_DATA = "Test Mode Update Data";
    public static final boolean USE_EXTERNAL_DIRECTORY = false;
    public static final String WIDTH_KEY = "width";
    private static final AtomicBoolean sTestModeEnabled = new AtomicBoolean(false);

    private AmpConstants()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    public static boolean isTestModeEnabled()
    {
        return sTestModeEnabled.get();
    }

    public static void setTestModeEnabled(boolean flag)
    {
        sTestModeEnabled.set(flag);
    }

}
