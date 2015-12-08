// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;
import java.util.Random;

public class DummyShowDetails
    implements ShowDetails
{

    private float userRating;

    public DummyShowDetails()
    {
        userRating = 0.0F;
    }

    public String getActors()
    {
        return null;
    }

    public String getBifUrl()
    {
        return null;
    }

    public String getBoxshotURL()
    {
        return "http://dummyimage.com/150x214/bb0000/884444.png&text=Sample";
    }

    public String getCatalogIdUrl()
    {
        return null;
    }

    public String getCertification()
    {
        return null;
    }

    public String getCreators()
    {
        return "Creators";
    }

    public String getCurrentEpisodeId()
    {
        return null;
    }

    public int getCurrentEpisodeNumber()
    {
        return -1;
    }

    public String getCurrentEpisodeTitle()
    {
        return null;
    }

    public int getCurrentSeasonNumber()
    {
        return (new Random()).nextInt(getNumOfSeasons());
    }

    public int getEndtime()
    {
        return 0;
    }

    public int getEpisodeNumber()
    {
        return 0;
    }

    public VideoType getErrorType()
    {
        return null;
    }

    public List getFacebookFriends()
    {
        return null;
    }

    public boolean getFbDntShare()
    {
        return false;
    }

    public String getGenres()
    {
        return null;
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        return null;
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        return null;
    }

    public String getHorzDispUrl()
    {
        return null;
    }

    public String getId()
    {
        return "70177057";
    }

    public int getNumOfEpisodes()
    {
        return -1;
    }

    public int getNumOfSeasons()
    {
        return 100;
    }

    public String getParentId()
    {
        return null;
    }

    public String getParentTitle()
    {
        return null;
    }

    public int getPlayableBookmarkPosition()
    {
        return 0;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        return 0L;
    }

    public String getPlayableId()
    {
        return null;
    }

    public String getPlayableTitle()
    {
        return null;
    }

    public float getPredictedRating()
    {
        return 0.0F;
    }

    public String getQuality()
    {
        return null;
    }

    public int getRuntime()
    {
        return 0;
    }

    public int getSeasonNumber()
    {
        return 0;
    }

    public String getSquareUrl()
    {
        return null;
    }

    public String getStoryUrl()
    {
        return null;
    }

    public String getSynopsis()
    {
        return "Max (Max Records) is a young boy who feels misunderstood and wants to have fun all the time. He makes an igloo out of snow, but his sister's friends gang up on him and smash it. After making a scene in front of his mother's boyfriend, Max bites his mother and runs away. He keeps running until he stumbles upon a small boat; he climbs aboard and sets sail. After a few days at sea, he reaches the dangerous, rocky shore of a strange island at night. He leaves the boat on shore and walks toward voices he hears in the woods. Max eavesdrops on a few creatures arguing. One of them, Carol (voice: James Gandolfini), is destroying the huts and screaming. The other wild things are yelling at him, telling him to stop. Max runs out of the trees and joins Carol in destroying the huts. The wild things are angry about this and want to eat him. But Max tells them that he was the king where he came from, and he has \"special powers,\" so the wild things can't eat him. Carol crowns him king of the wild things and the island. Max's first order of business is to \"let the wild rumpus start!\" The wild things and Max dance and run around the forest destroying things. The wild things introduce themselves: Ira (voice: Forest Whitaker), Carol, Douglas (voice: Chris Cooper), the bull, Judith (voice: Catherine O'Hara), and Alexander (voice: Paul Dano). K.W. (voice: Lauren Ambrose) is missing; she's gone to hang out with other friends, apparently after a disagreement. Carol shows Max his \"Kingdom\" and shows him his secret hideaway, where has built a miniature of the island. Carol says \"There should be a place where only the things you want to happen, happen.\" Max thinks that with effort from all the wild things, they can build a place like that. Over the next few days, Max and the wild things build a large fortress of rocks and sticks. Tension grows between Max and the wild things when Judith starts to think Max isn't a good king. They have a dirtball fight and many of the wild things get hurt. K.W. and Carol argue and K.W. takes Max to see her friends Terry and Bob, who turn out to be owls. They go back to the fortress and the wild things (minus Carol) greet them with open arms. Carol throws a fit and is angry that they are letting two outsiders into the group. K.W. runs away with Terry and Bob. Max and the wild things are sad, sitting in the rain. Judith demands to see Max's \"special powers\" and wants K.W. to come back. The wild things discover Max isn't a king and that he has no powers. Carol is angry with Max, telling him he didn't keep everyone safe, and that he is an awful king. Max runs away with Carol pursuing him. K.W. hides Max in her stomach until Carol leaves. Max then decides it's time to go home. Things seem to be better when he and the wild things all go to the beach, where Max's boat is. Carol is in his secret hideaway crying when he realizes he is being stupid and sees a heart with his initial that Max made for him. (Carol made a similar one for Max on the fort earlier.) Carol runs toward the beach. Max gets into his boat and says goodbye to all the wild things. Carol finally arrives and is unable to speak, so he howls. The other wild things join in and Max howls back. After a brief boat trip he runs back home and his mother greets him with open arms, and feeds him.";
    }

    public String getTitle()
    {
        return "GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB";
    }

    public String getTvCardUrl()
    {
        return null;
    }

    public VideoType getType()
    {
        return VideoType.SHOW;
    }

    public float getUserRating()
    {
        return userRating;
    }

    public int getYear()
    {
        return 1909;
    }

    public boolean isAutoPlayEnabled()
    {
        return false;
    }

    public boolean isInQueue()
    {
        return false;
    }

    public boolean isNextPlayableEpisode()
    {
        return false;
    }

    public boolean isPinProtected()
    {
        return false;
    }

    public boolean isPlayableEpisode()
    {
        return false;
    }

    public boolean isShared()
    {
        return false;
    }

    public boolean isUserConnectedToFacebook()
    {
        return false;
    }

    public boolean isVideoHd()
    {
        return true;
    }

    public void setUserRating(float f)
    {
        userRating = f;
    }
}
