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
//            el, ej

public final class ek extends Handler
{

    private final ej a;

    public ek(Context context)
    {
        this(((ej) (new el(context))));
    }

    private ek(ej ej1)
    {
        a = ej1;
    }

    public final void handleMessage(Message message)
    {
        ej ej1;
        boolean flag;
        try
        {
            message = message.getData();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
        if (message == null)
        {
            return;
        }
        message = new JSONObject(message.getString("data"));
        flag = "fetch_html".equals(message.getString("message_name"));
label0:
        {
            if (flag)
            {
                try
                {
                    ej1 = a;
                    message.getString("request_id");
                    ej1.a(message.getString("base_url"), message.getString("html"));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    return;
                }
            }
            break label0;
        }
    }
}
