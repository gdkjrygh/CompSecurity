// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp, zzdn

public class zzdo extends Handler
{

    private final zzdn zzxg;

    public zzdo(Context context)
    {
        this(((zzdn) (new zzdp(context))));
    }

    public zzdo(zzdn zzdn1)
    {
        zzxg = zzdn1;
    }

    private void zzc(JSONObject jsonobject)
    {
        try
        {
            zzxg.zza(jsonobject.getString("request_id"), jsonobject.getString("base_url"), jsonobject.getString("html"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
    }

    public void handleMessage(Message message)
    {
        message = message.getData();
        if (message == null)
        {
            return;
        }
        try
        {
            message = new JSONObject(message.getString("data"));
            if ("fetch_html".equals(message.getString("message_name")))
            {
                zzc(message);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        return;
    }
}
