// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.Conversation;
import com.skype.android.util.ConversationUtil;

// Referenced classes of package com.skype.android.analytics:
//            SkypeTelemetryEvent, KpiAttributeName, EcsControllableEvent, KpiAttributeValue

public class MessageTelemetryEvent extends SkypeTelemetryEvent
{

    public MessageTelemetryEvent(EcsControllableEvent ecscontrollableevent, Conversation conversation, KpiAttributeValue kpiattributevalue)
    {
        super(ecscontrollableevent);
        addDefaultAttributesForMessageEvent(conversation, kpiattributevalue);
    }

    private void addDefaultAttributesForMessageEvent(Conversation conversation, KpiAttributeValue kpiattributevalue)
    {
        boolean flag = true;
        put(KpiAttributeName.l, kpiattributevalue);
        KpiAttributeName kpiattributename;
        if (ConversationUtil.b(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS) <= 1)
        {
            flag = false;
        }
        kpiattributename = KpiAttributeName.k;
        if (flag)
        {
            kpiattributevalue = "Y";
        } else
        {
            kpiattributevalue = "N";
        }
        put(kpiattributename, kpiattributevalue);
        kpiattributevalue = KpiAttributeName.i;
        if (flag)
        {
            conversation = conversation.getIdentityProp();
        } else
        {
            conversation = "N/A";
        }
        put(kpiattributevalue, conversation);
    }
}
