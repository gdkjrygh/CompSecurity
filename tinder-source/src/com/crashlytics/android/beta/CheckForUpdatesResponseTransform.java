// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.beta:
//            CheckForUpdatesResponse

class CheckForUpdatesResponseTransform
{

    CheckForUpdatesResponseTransform()
    {
    }

    public static CheckForUpdatesResponse a(JSONObject jsonobject)
        throws IOException
    {
        String s = jsonobject.optString("url", null);
        String s1 = jsonobject.optString("version_string", null);
        String s2 = jsonobject.optString("build_version", null);
        return new CheckForUpdatesResponse(s, s1, jsonobject.optString("display_version", null), s2, jsonobject.optString("identifier", null), jsonobject.optString("instance_identifier", null));
    }
}
