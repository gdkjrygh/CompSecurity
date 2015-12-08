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
//            ld, lb

public final class lc extends Handler
{

    private final lb a;

    public lc(Context context)
    {
        this(((lb) (new ld(context))));
    }

    private lc(lb lb1)
    {
        a = lb1;
    }

    public final void handleMessage(Message message)
    {
        lb lb1;
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
                    lb1 = a;
                    message.getString("request_id");
                    lb1.a(message.getString("base_url"), message.getString("html"));
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
