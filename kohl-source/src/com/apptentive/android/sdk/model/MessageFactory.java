// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            TextMessage, FileMessage, AutomatedMessage, Message

public class MessageFactory
{

    public MessageFactory()
    {
    }

    public static Message fromJson(String s)
    {
        Object obj = Message.Type.valueOf((new JSONObject(s)).getString("type"));
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$model$Message$Type[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$model$Message$Type = new int[Message.Type.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[Message.Type.TextMessage.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[Message.Type.FileMessage.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[Message.Type.AutomatedMessage.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[Message.Type.unknown.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.model.Message.Type[((Message.Type) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 105
    //                   1 56
    //                   2 85
    //                   3 94
    //                   4 105;
           goto _L1 _L2 _L3 _L4 _L1
_L1:
        break MISSING_BLOCK_LABEL_105;
_L2:
        obj = new TextMessage(s);
        return ((Message) (obj));
        JSONException jsonexception;
        jsonexception;
        Log.v("Error parsing json as Message: %s", jsonexception, new Object[] {
            s
        });
        break MISSING_BLOCK_LABEL_105;
_L3:
        return new FileMessage(s);
_L4:
        jsonexception = new AutomatedMessage(s);
        return jsonexception;
_L6:
        return null;
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
