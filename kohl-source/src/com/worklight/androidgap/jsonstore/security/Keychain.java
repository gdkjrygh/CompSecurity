// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.security;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;

// Referenced classes of package com.worklight.androidgap.jsonstore.security:
//            DPKBean

public class Keychain
{

    private static final String PREFS_NAME_DPK = "dpkPrefs";
    private static final String PREF_NAME_DPK = "dpk";
    private SharedPreferences prefs;

    protected Keychain(Context context)
    {
        prefs = context.getSharedPreferences("dpkPrefs", 0);
    }

    private String buildTag(String s)
    {
        if (s.equals("jsonstore"))
        {
            return "dpk";
        } else
        {
            return (new StringBuilder()).append("dpk-").append(s).toString();
        }
    }

    public void destroy()
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
    }

    public DPKBean getDPKBean(String s)
        throws JSONException
    {
        s = prefs.getString(buildTag(s), null);
        if (s == null)
        {
            return null;
        } else
        {
            return new DPKBean(s);
        }
    }

    public boolean isDPKAvailable(String s)
    {
        return prefs.getString(buildTag(s), null) != null;
    }

    public void setDPKBean(String s, DPKBean dpkbean)
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putString(buildTag(s), dpkbean.toString());
        editor.commit();
    }
}
