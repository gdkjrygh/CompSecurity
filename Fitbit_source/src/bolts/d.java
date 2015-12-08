// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package bolts:
//            k

public final class d
{

    static final String a = "al_applink_data";
    static final String b = "extras";
    static final String c = "target_url";

    public d()
    {
    }

    public static Uri a(Context context, Intent intent)
    {
        Object obj = null;
        Object obj1 = a(intent);
        Uri uri = obj;
        if (obj1 != null)
        {
            obj1 = ((Bundle) (obj1)).getString("target_url");
            uri = obj;
            if (obj1 != null)
            {
                k.a(context, "al_nav_in", intent, null);
                uri = Uri.parse(((String) (obj1)));
            }
        }
        return uri;
    }

    public static Bundle a(Intent intent)
    {
        return intent.getBundleExtra("al_applink_data");
    }

    public static Bundle b(Intent intent)
    {
        intent = a(intent);
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getBundle("extras");
        }
    }

    public static Uri c(Intent intent)
    {
        Object obj = a(intent);
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
}
