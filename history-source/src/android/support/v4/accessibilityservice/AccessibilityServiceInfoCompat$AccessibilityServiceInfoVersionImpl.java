// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//            AccessibilityServiceInfoCompat

static interface 
{

    public abstract boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo);

    public abstract int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo);

    public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

    public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

    public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

    public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);
}
