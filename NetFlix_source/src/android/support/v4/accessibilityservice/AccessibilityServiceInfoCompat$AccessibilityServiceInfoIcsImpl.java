// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//            AccessibilityServiceInfoCompat, AccessibilityServiceInfoCompatIcs

static class  extends 
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

    ()
    {
    }
}
