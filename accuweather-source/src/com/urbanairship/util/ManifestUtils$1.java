// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import com.urbanairship.CoreActivity;
import com.urbanairship.CoreReceiver;
import com.urbanairship.UrbanAirshipProvider;
import com.urbanairship.actions.ActionActivity;
import com.urbanairship.actions.ActionService;
import com.urbanairship.analytics.EventService;
import com.urbanairship.location.LocationService;
import com.urbanairship.push.GCMPushReceiver;
import com.urbanairship.push.PushService;
import com.urbanairship.richpush.RichPushUpdateService;
import java.util.HashMap;

// Referenced classes of package com.urbanairship.util:
//            ManifestUtils

static final class tActivityInfo extends HashMap
{

    y()
    {
        put(com/urbanairship/analytics/EventService, ManifestUtils.getServiceInfo(com/urbanairship/analytics/EventService));
        put(com/urbanairship/push/PushService, ManifestUtils.getServiceInfo(com/urbanairship/push/PushService));
        put(com/urbanairship/richpush/RichPushUpdateService, ManifestUtils.getServiceInfo(com/urbanairship/richpush/RichPushUpdateService));
        put(com/urbanairship/actions/ActionService, ManifestUtils.getServiceInfo(com/urbanairship/actions/ActionService));
        put(com/urbanairship/location/LocationService, ManifestUtils.getServiceInfo(com/urbanairship/location/LocationService));
        put(com/urbanairship/CoreReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/CoreReceiver));
        put(com/urbanairship/push/GCMPushReceiver, ManifestUtils.getReceiverInfo(com/urbanairship/push/GCMPushReceiver));
        put(com/urbanairship/UrbanAirshipProvider, ManifestUtils.getProviderInfo(UrbanAirshipProvider.getAuthorityString()));
        put(com/urbanairship/actions/ActionActivity, ManifestUtils.getActivityInfo(com/urbanairship/actions/ActionActivity));
        put(com/urbanairship/CoreActivity, ManifestUtils.getActivityInfo(com/urbanairship/CoreActivity));
    }
}
