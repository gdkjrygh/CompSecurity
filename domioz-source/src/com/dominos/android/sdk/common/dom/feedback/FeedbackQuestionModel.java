// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;


public class FeedbackQuestionModel
{

    private String code;
    private boolean isBeforeArrived;
    private String question;
    private float rating;
    private String response;
    private String tag;
    private String teamMemberId;
    private String teamMemberName;
    private String teamMemberPosition;
    private String type;

    public FeedbackQuestionModel()
    {
        question = "";
        tag = "";
        rating = 0.0F;
        type = "";
        code = "";
        teamMemberId = "";
        teamMemberName = "";
        teamMemberPosition = "";
    }

    public String getCode()
    {
        return code;
    }

    public String getQuestion()
    {
        return question;
    }

    public float getRating()
    {
        return rating;
    }

    public String getResponse()
    {
        return response;
    }

    public String getTag()
    {
        return tag;
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

    public String getType()
    {
        return type;
    }

    public boolean isBeforeArrived()
    {
        return isBeforeArrived;
    }

    public void setBeforeArrived(boolean flag)
    {
        isBeforeArrived = flag;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setQuestion(String s)
    {
        question = s;
    }

    public void setRating(float f)
    {
        rating = f;
    }

    public void setResponse(String s)
    {
        response = s;
    }

    public void setTag(String s)
    {
        tag = s;
    }

    public void setTeamMemberId(String s)
    {
        teamMemberId = s;
    }

    public void setTeamMemberName(String s)
    {
        teamMemberName = s;
    }

    public void setTeamMemberPosition(String s)
    {
        teamMemberPosition = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
