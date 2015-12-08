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
//            zzez, zzex

public class zzey extends Handler
{

    private final zzex zzuM;

    public zzey(Context context)
    {
        this(((zzex) (new zzez(context))));
    }

    public zzey(zzex zzex1)
    {
        zzuM = zzex1;
    }

    private void zzb(JSONObject jsonobject)
    {
        try
        {
            zzuM.zza(jsonobject.getString("request_id"), jsonobject.getString("base_url"), jsonobject.getString("html"));
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
                zzb(message);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        return;
    }
}
