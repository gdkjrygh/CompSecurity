// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//            AccessibilityServiceInfoCompatIcs, AccessibilityServiceInfoCompatJellyBeanMr2

public class AccessibilityServiceInfoCompat
{
    static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoStubImpl
    {

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityserviceinfo);
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return !getCanRetrieveWindowContent(accessibilityserviceinfo) ? 0 : 1;
        }

        public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getDescription(accessibilityserviceinfo);
        }

        public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getId(accessibilityserviceinfo);
        }

        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getResolveInfo(accessibilityserviceinfo);
        }

        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(accessibilityserviceinfo);
        }

        AccessibilityServiceInfoIcsImpl()
        {
        }
    }

    static class AccessibilityServiceInfoJellyBeanMr2 extends AccessibilityServiceInfoIcsImpl
    {

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatJellyBeanMr2.getCapabilities(accessibilityserviceinfo);
        }

        AccessibilityServiceInfoJellyBeanMr2()
        {
        }
    }

    static class AccessibilityServiceInfoStubImpl
        implements AccessibilityServiceInfoVersionImpl
    {

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return false;
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return 0;
        }

        public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return null;
        }

        public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return null;
        }

        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return null;
        }

        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return null;
        }

        AccessibilityServiceInfoStubImpl()
        {
        }
    }

    static interface AccessibilityServiceInfoVersionImpl
    {

        public abstract boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);
    }


    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int DEFAULT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
    private static final AccessibilityServiceInfoVersionImpl IMPL;

    private AccessibilityServiceInfoCompat()
    {
    }

    public static String capabilityToString(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return "UNKNOWN";

        case 1: // '\001'
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";

        case 2: // '\002'
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";

        case 4: // '\004'
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";

        case 8: // '\b'
            return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
    }

    public static String feedbackTypeToString(int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        do
        {
            if (i > 0)
            {
                int j = 1 << Integer.numberOfTrailingZeros(i);
                i &= ~j;
                if (stringbuilder.length() > 1)
                {
                    stringbuilder.append(", ");
                }
                switch (j)
                {
                case 1: // '\001'
                    stringbuilder.append("FEEDBACK_SPOKEN");
                    break;

                case 4: // '\004'
                    stringbuilder.append("FEEDBACK_AUDIBLE");
                    break;

                case 2: // '\002'
                    stringbuilder.append("FEEDBACK_HAPTIC");
                    break;

                case 16: // '\020'
                    stringbuilder.append("FEEDBACK_GENERIC");
                    break;

                case 8: // '\b'
                    stringbuilder.append("FEEDBACK_VISUAL");
                    break;
                }
            } else
            {
                stringbuilder.append("]");
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static String flagToString(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "DEFAULT";

        case 2: // '\002'
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";

        case 4: // '\004'
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";

        case 8: // '\b'
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";

        case 16: // '\020'
            return "FLAG_REPORT_VIEW_IDS";

        case 32: // ' '
            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
        }
    }

    public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getCanRetrieveWindowContent(accessibilityserviceinfo);
    }

    public static int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getCapabilities(accessibilityserviceinfo);
    }

    public static String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getDescription(accessibilityserviceinfo);
    }

    public static String getId(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getId(accessibilityserviceinfo);
    }

    public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getResolveInfo(accessibilityserviceinfo);
    }

    public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getSettingsActivityName(accessibilityserviceinfo);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            IMPL = new AccessibilityServiceInfoJellyBeanMr2();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityServiceInfoIcsImpl();
        } else
        {
            IMPL = new AccessibilityServiceInfoStubImpl();
        }
    }
}
