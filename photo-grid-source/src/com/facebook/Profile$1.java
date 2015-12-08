// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            Profile, FacebookException

final class ception
    implements com.facebook.internal.aphMeRequestWithCacheCallback
{

    public final void onFailure(FacebookException facebookexception)
    {
    }

    public final void onSuccess(JSONObject jsonobject)
    {
        String s = jsonobject.optString("id");
        if (s == null)
        {
            return;
        }
        String s5 = jsonobject.optString("link");
        String s1 = jsonobject.optString("first_name");
        String s2 = jsonobject.optString("middle_name");
        String s3 = jsonobject.optString("last_name");
        String s4 = jsonobject.optString("name");
        if (s5 != null)
        {
            jsonobject = Uri.parse(s5);
        } else
        {
            jsonobject = null;
        }
        Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, jsonobject));
    }

    ception()
    {
    }
}
