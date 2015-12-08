// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;


// Referenced classes of package com.dominos.android.sdk.common.dom.feedback:
//            FeedbackResponse

public class 
{

    private String feedbackResponse;
    private String orderId;
    private String orderKey;
    private String questionId;
    private String questionType;
    private String storeId;
    private String teamMemberId;
    private String teamMemberName;
    private String teamMemberPosition;

    public FeedbackResponse build()
    {
        return new FeedbackResponse(storeId, orderId, orderKey, questionId, questionType, teamMemberId, teamMemberName, teamMemberPosition, feedbackResponse, null);
    }

    public feedbackResponse setFeedbackResponse(String s)
    {
        feedbackResponse = s;
        return this;
    }

    public feedbackResponse setOrderId(String s)
    {
        orderId = s;
        return this;
    }

    public orderId setOrderKey(String s)
    {
        orderKey = s;
        return this;
    }

    public orderKey setQuestionId(String s)
    {
        questionId = s;
        return this;
    }

    public questionId setQuestionType(String s)
    {
        questionType = s;
        return this;
    }

    public questionType setStoreId(String s)
    {
        storeId = s;
        return this;
    }

    public storeId setTeamMemberId(String s)
    {
        teamMemberId = s;
        return this;
    }

    public teamMemberId setTeamMemberName(String s)
    {
        teamMemberName = s;
        return this;
    }

    public teamMemberName setTeamMemberPosition(String s)
    {
        teamMemberPosition = s;
        return this;
    }

    public ()
    {
    }
}
