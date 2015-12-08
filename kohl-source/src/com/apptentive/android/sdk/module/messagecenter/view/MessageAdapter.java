// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.AutomatedMessage;
import com.apptentive.android.sdk.model.FileMessage;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.TextMessage;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            TextMessageView, FileMessageView, AutomatedMessageView

public class MessageAdapter extends ArrayAdapter
{

    public MessageAdapter(Context context)
    {
        super(context, 0);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (Message)getItem(i);
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$model$Message$Type[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$model$Message$Type = new int[com.apptentive.android.sdk.model.Message.Type.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.TextMessage.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.FileMessage.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Message$Type[com.apptentive.android.sdk.model.Message.Type.AutomatedMessage.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (view.getBaseType() == com.apptentive.android.sdk.model.Payload.BaseType.message)
        {
            switch (_cls1..SwitchMap.com.apptentive.android.sdk.model.Message.Type[view.getType().ordinal()])
            {
            default:
                Log.a("Unrecognized message type: %s", new Object[] {
                    view.getType()
                });
                return null;

            case 1: // '\001'
                return new TextMessageView(viewgroup.getContext(), (TextMessage)view);

            case 2: // '\002'
                return new FileMessageView(viewgroup.getContext(), (FileMessage)view);

            case 3: // '\003'
                return new AutomatedMessageView(viewgroup.getContext(), (AutomatedMessage)view);
            }
        } else
        {
            Log.d("Can't render non-Message Payload as Message: %s", new Object[] {
                view.getType()
            });
            return null;
        }
    }
}
