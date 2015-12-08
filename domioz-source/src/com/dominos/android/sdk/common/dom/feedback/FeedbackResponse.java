// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;

import com.dominos.android.sdk.common.core.Util;

public class FeedbackResponse
{

    private final String feedbackResponse;
    private final String orderId;
    private final String orderKey;
    private final String questionId;
    private final String questionType;
    private final String storeId;
    private final String teamMemberId;
    private final String teamMemberName;
    private final String teamMemberPosition;

    private FeedbackResponse(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8)
    {
        storeId = Util.notEmpty(s);
        orderId = Util.notEmpty(s1);
        orderKey = Util.notEmpty(s2);
        questionId = Util.notEmpty(s3);
        questionType = Util.notEmpty(s4);
        teamMemberId = (String)Util.notNull(s5);
        teamMemberName = (String)Util.notNull(s6);
        teamMemberPosition = (String)Util.notNull(s7);
        feedbackResponse = Util.notEmpty(s8);
    }

    FeedbackResponse(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, _cls1 _pcls1)
    {
        this(s, s1, s2, s3, s4, s5, s6, s7, s8);
    }

    public String getFeedbackResponse()
    {
        return feedbackResponse;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getOrderKey()
    {
        return orderKey;
    }

    public String getQuestionId()
    {
        return questionId;
    }

    public String getQuestionType()
    {
        return questionType;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public String getTeamMemberId()
    {
        return teamMemberId;
    }

    public String getTeamMemberName()
    {
        return teamMemberName;
    }

    public String getTeamMemberPosition()
    {
        return teamMemberPosition;
    }
}
