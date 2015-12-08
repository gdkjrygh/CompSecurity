// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Conversation

public static interface 
{

    public abstract void onCallQualityFeedbackRequested(Conversation conversation, String s, String s1, String s2);

    public abstract void onCapabilitiesChanged(Conversation conversation, boolean aflag[]);

    public abstract void onEventMessage(Conversation conversation,  , String s);

    public abstract void onLiveSessionEvent(Conversation conversation,  );

    public abstract void onLiveSessionMoved(Conversation conversation, int i);

    public abstract void onMessage(Conversation conversation, int i);

    public abstract void onParticipantListChange(Conversation conversation);

    public abstract void onPendingMediaDocumentsListChanged(Conversation conversation);

    public abstract void onPremiumVideoSubscriptionCheckResult(Conversation conversation, int i,  );

    public abstract void onSpawnConference(Conversation conversation, int i);
}
