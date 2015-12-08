// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;


public class InviteRecommendedPromptDTO
{

    public static final InviteRecommendedPromptDTO NULL = new InviteRecommendedPromptDTO();
    Integer friendCount;
    String sendLabel;
    String subtitle;
    String title;

    public InviteRecommendedPromptDTO()
    {
    }

    public Integer getFriendCount()
    {
        return friendCount;
    }

    public String getSendLabel()
    {
        return sendLabel;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTitle()
    {
        return title;
    }

}
