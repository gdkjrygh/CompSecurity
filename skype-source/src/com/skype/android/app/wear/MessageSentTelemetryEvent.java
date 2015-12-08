// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import com.skype.Conversation;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.MessageTelemetryEvent;

public class MessageSentTelemetryEvent extends MessageTelemetryEvent
{

    public MessageSentTelemetryEvent(Conversation conversation, KpiAttributeValue kpiattributevalue, KpiAttributeValue kpiattributevalue1, KpiAttributeValue kpiattributevalue2)
    {
        super(KpiEvent.b, conversation, kpiattributevalue);
        put(KpiAttributeName.h, kpiattributevalue1);
        put(KpiAttributeName.j, kpiattributevalue2);
    }
}
