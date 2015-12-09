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

    static final String BUILD_VERSION = "build_version";
    static final String DISPLAY_VERSION = "display_version";
    static final String IDENTIFIER = "identifier";
    static final String INSTANCE_IDENTIFIER = "instance_identifier";
    static final String URL = "url";
    static final String VERSION_STRING = "version_string";

    CheckForUpdatesResponseTransform()
    {
    }

    public CheckForUpdatesResponse fromJson(JSONObject jsonobject)
        throws IOException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            String s = jsonobject.optString("url", null);
            String s1 = jsonobject.optString("version_string", null);
            String s2 = jsonobject.optString("build_version", null);
            return new CheckForUpdatesResponse(s, s1, jsonobject.optString("display_version", null), s2, jsonobject.optString("identifier", null), jsonobject.optString("instance_identifier", null));
        }
    }
}
