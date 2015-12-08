// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            InviteRecommendedPromptDTO

public class SocialSharing
{

    public static final SocialSharing NULL = new SocialSharing();
    String endRideFacebookShareText;
    String endRideTwitterShareText;
    String inviteFacebookShareText;
    InviteRecommendedPromptDTO inviteRecommendedPromptDTO;
    String inviteTwitterShareText;
    List rateSocialPrompts;

    public SocialSharing()
    {
    }

    public String getEndRideFacebookShareText()
    {
        return endRideFacebookShareText;
    }

    public String getEndRideTwitterShareText()
    {
        return endRideTwitterShareText;
    }

    public String getInviteFacebookShareText()
    {
        return inviteFacebookShareText;
    }

    public InviteRecommendedPromptDTO getInviteRecommendedPromptDTO()
    {
        return inviteRecommendedPromptDTO;
    }

    public String getInviteTwitterShareText()
    {
        return inviteTwitterShareText;
    }

    public List getRateSocialPrompts()
    {
        return rateSocialPrompts;
    }

}
