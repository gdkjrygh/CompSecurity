// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

public final class afu extends Handler
{

    private final aft a;

    private afu(aft aft1)
    {
        a = aft1;
    }

    public afu(Context context)
    {
        this(((aft) (new afv(context))));
    }

    private void a(JSONObject jsonobject)
    {
        try
        {
            aft aft1 = a;
            jsonobject.getString("request_id");
            aft1.a(jsonobject.getString("base_url"), jsonobject.getString("html"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
    }

    public final void handleMessage(Message message)
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
                a(message);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        return;
    }
}
