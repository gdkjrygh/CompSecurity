// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.android.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.android.accessibilityservice:
//            AccessibilityServiceInfoCompatIcs

public class AccessibilityServiceInfoCompat
{
    static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoStubImpl
    {

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityserviceinfo);
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

    static class AccessibilityServiceInfoStubImpl
        implements AccessibilityServiceInfoVersionImpl
    {

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
            return false;
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

        public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);
    }


    public static final int FEEDBACK_ALL_MASK = -1;
    private static final AccessibilityServiceInfoVersionImpl IMPL;

    private AccessibilityServiceInfoCompat()
    {
    }

    public static String feedbackTypeToString(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 4: // '\004'
            return "FEEDBACK_AUDIBLE";

        case 2: // '\002'
            return "FEEDBACK_HAPTIC";

        case 16: // '\020'
            return "FEEDBACK_GENERIC";

        case 1: // '\001'
            return "FEEDBACK_SPOKEN";

        case 8: // '\b'
            return "FEEDBACK_VISUAL";

        case -1: 
            return "FEEDBACK_ALL";
        }
    }

    public static String flagToString(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "DEFAULT";
        }
    }

    public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
    {
        return IMPL.getCanRetrieveWindowContent(accessibilityserviceinfo);
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
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityServiceInfoIcsImpl();
        } else
        {
            IMPL = new AccessibilityServiceInfoStubImpl();
        }
    }
}
