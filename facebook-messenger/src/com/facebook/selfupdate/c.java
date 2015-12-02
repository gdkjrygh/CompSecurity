// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import org.json.JSONObject;

// Referenced classes of package com.facebook.selfupdate:
//            d, e

public class c
{

    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final long k;

    public c(JSONObject jsonobject, JSONObject jsonobject1)
    {
        b = jsonobject.optLong("update_check_minutes", 0L);
        c = jsonobject1.optInt("release_number", 0);
        e = jsonobject1.optString("download_url", null);
        d = jsonobject1.optInt("client_action", d.DEFAULT.value);
        f = jsonobject1.optString("release_notes", "");
        g = jsonobject1.optString("application_name", "");
        h = jsonobject1.optString("application_version", "");
        i = jsonobject1.optInt("allowed_networks", e.DEFAULT.value);
        jsonobject = jsonobject1.optString("megaphone", "no_megaphone");
        if (jsonobject != null && !jsonobject.equals("null"))
        {
            a = jsonobject;
        } else
        {
            a = "no_megaphone";
        }
        j = jsonobject1.optString("file_mime_type", "application/vnd.android.package-archive");
        k = jsonobject1.optLong("file_size");
    }

    public boolean a()
    {
        return e != null;
    }

    public boolean b()
    {
        return d == d.FORCE_UPDATE_NOTIFY_USER.value;
    }

    public long c()
    {
        if (b > 0L)
        {
            return b * 60L * 1000L;
        } else
        {
            return 0xa4cb80L;
        }
    }
}
