// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

// Referenced classes of package com.addlive.service.listener:
//            SpeechActivityEvent

public class <init>
{

    private Integer activity;
    final SpeechActivityEvent this$0;
    private Long userId;

    public Integer getActivity()
    {
        return activity;
    }

    public Long getUserId()
    {
        return userId;
    }

    public String toString()
    {
        return (new StringBuilder("{userId=")).append(userId).append(", activity=").append(activity).append('}').toString();
    }

    private (JSONObject jsonobject)
    {
        this$0 = SpeechActivityEvent.this;
        super();
        userId = Long.valueOf(jsonobject.getLong("userId"));
        activity = Integer.valueOf(jsonobject.getInt("activity"));
    }

    activity(JSONObject jsonobject, activity activity1)
    {
        this(jsonobject);
    }
}
