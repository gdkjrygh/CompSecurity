// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package bolts:
//            MeasurementEvent

public final class AppLinks
{

    static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
    static final String KEY_NAME_EXTRAS = "extras";
    static final String KEY_NAME_TARGET = "target_url";

    public AppLinks()
    {
    }

    public static Bundle getAppLinkData(Intent intent)
    {
        return intent.getBundleExtra("al_applink_data");
    }

    public static Bundle getAppLinkExtras(Intent intent)
    {
        intent = getAppLinkData(intent);
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getBundle("extras");
        }
    }

    public static Uri getTargetUrl(Intent intent)
    {
        Object obj = getAppLinkData(intent);
        if (obj != null)
        {
            obj = ((Bundle) (obj)).getString("target_url");
            if (obj != null)
            {
                return Uri.parse(((String) (obj)));
            }
        }
        return intent.getData();
    }

    public static Uri getTargetUrlFromInboundIntent(Context context, Intent intent)
    {
        Object obj = null;
        Object obj1 = getAppLinkData(intent);
        Uri uri = obj;
        if (obj1 != null)
        {
            obj1 = ((Bundle) (obj1)).getString("target_url");
            uri = obj;
            if (obj1 != null)
            {
                MeasurementEvent.sendBroadcastEvent(context, "al_nav_in", intent, null);
                uri = Uri.parse(((String) (obj1)));
            }
        }
        return uri;
    }
}
