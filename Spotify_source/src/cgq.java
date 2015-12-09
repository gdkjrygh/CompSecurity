// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

public final class cgq extends Handler
{

    private final cgp a;

    public cgq(Context context)
    {
        this(((cgp) (new cgr(context))));
    }

    private cgq(cgp cgp1)
    {
        a = cgp1;
    }

    public final void handleMessage(Message message)
    {
        cgp cgp1;
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
                    cgp1 = a;
                    message.getString("request_id");
                    cgp1.a(message.getString("base_url"), message.getString("html"));
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
