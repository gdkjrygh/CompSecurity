// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.HashSet;
import java.util.Set;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.persistence.rating.IRatingStateStorage;

// Referenced classes of package me.lyft.android.application.ride:
//            IRatingSession

public class RatingSession
    implements IRatingSession
{

    private String feedback;
    private Set improvementAreas;
    private int rating;
    private String rideId;
    private final IRatingStateStorage stateStorage;

    public RatingSession(IRatingStateStorage iratingstatestorage)
    {
        stateStorage = iratingstatestorage;
        rideId = (String)Objects.firstNonNull(iratingstatestorage.getRideId(), "");
        feedback = (String)Objects.firstNonNull(iratingstatestorage.getFeedback(), "");
        rating = iratingstatestorage.getRating();
        improvementAreas = iratingstatestorage.getImprovementAreas();
    }

    public String getFeedback()
    {
        return feedback;
    }

    public Set getImprovementAreas()
    {
        return improvementAreas;
    }

    public int getRating()
    {
        return rating;
    }

    public String getRideId()
    {
        return rideId;
    }

    public void reset()
    {
        rideId = "";
        feedback = "";
        rating = 0;
        improvementAreas = new HashSet();
        stateStorage.reset();
    }

    public void setFeedback(String s)
    {
        s = Strings.nullToEmpty(s);
        feedback = s;
        stateStorage.setFeedback(s);
    }

    public void setImprovementAreas(Set set)
    {
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
        }
        improvementAreas = ((Set) (obj));
        stateStorage.setImprovementAreas(((Set) (obj)));
    }

    public void setRating(int i)
    {
        rating = i;
        stateStorage.setRating(i);
    }

    public void setRideId(String s)
    {
        s = Strings.nullToEmpty(s);
        rideId = s;
        stateStorage.setRideId(s);
    }
}
