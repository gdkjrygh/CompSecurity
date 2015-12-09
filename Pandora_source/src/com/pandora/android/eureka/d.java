// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.RemoteMediaPlayer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

public class d extends RemoteMediaPlayer
{

    private p.by.f.a a;

    public d()
    {
    }

    public void a(p.by.f.a a1)
    {
        a = a1;
    }

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        super.onMessageReceived(castdevice, s, s1);
        try
        {
            castdevice = new JSONObject(s1);
            if (castdevice.has("status"))
            {
                castdevice = castdevice.getJSONArray("status").getJSONObject(0).getJSONObject("media").getJSONObject("customData");
                if (a != null)
                {
                    a.a(castdevice);
                }
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CastDevice castdevice)
        {
            p.df.a.c("EurekaRemoteMediaPlayer", "Unable to retrieve status from message.");
        }
    }
}
