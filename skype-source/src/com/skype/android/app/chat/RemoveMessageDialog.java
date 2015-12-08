// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.Message;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;

public class RemoveMessageDialog extends SkypeDialogFragment
{

    Analytics analytics;
    private Message message;

    public RemoveMessageDialog()
    {
    }

    private int getMessageId(com.skype.Message.TYPE type)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
        {
        default:
            return 0x7f0803a4;

        case 1: // '\001'
            return 0x7f0803a6;
        }
    }

    private int getNegativeButtonId(com.skype.Message.TYPE type)
    {
        switch (_cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
        {
        default:
            return 0x7f0802e5;

        case 1: // '\001'
            return 0x7f080120;
        }
    }

    private int getPositiveButtonId(com.skype.Message.TYPE type)
    {
        switch (_cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
        {
        default:
            return 0x7f08034b;

        case 1: // '\001'
            return 0x7f08016a;
        }
    }

    private int getTitleId(com.skype.Message.TYPE type)
    {
        switch (_cls2..SwitchMap.com.skype.Message.TYPE[type.ordinal()])
        {
        default:
            return 0x7f08016e;

        case 1: // '\001'
            return 0x7f08016f;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        message = (Message)getObjectInterface(com/skype/Message);
        getComponent().inject(this);
        bundle = getMaterialDialogBuilder(getActivity());
        com.skype.Message.TYPE type = message.getTypeProp();
        bundle.a(getTitleId(type));
        bundle.b(getMessageId(type));
        bundle.a(getPositiveButtonId(type), new android.content.DialogInterface.OnClickListener() {

            final RemoveMessageDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                message.edit("", false, false, "");
                reportEvents(AnalyticsEvent.cY);
            }

            
            {
                this$0 = RemoveMessageDialog.this;
                super();
            }
        });
        bundle.b(getNegativeButtonId(type), null);
        return bundle.c();
    }

    public void reportEvents(AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.U, "remove");
        analyticsparametercontainer.a(AnalyticsParameter.s, Analytics.b(message.getEditTimestampProp() - message.getTimestampProp()));
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

}
