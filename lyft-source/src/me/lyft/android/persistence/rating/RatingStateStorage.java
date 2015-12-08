// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.rating;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.persistence.rating:
//            IRatingStateStorage

public class RatingStateStorage
    implements IRatingStateStorage
{

    private static final String FEEDBACK = "feedback";
    private static final String IMPROVEMENT_AREAS = "improvement_areas";
    private static final String RATING = "rating";
    private static final String RIDE_ID = "ride_id";
    private final SharedPreferences preferences;

    public RatingStateStorage(LyftApplication lyftapplication)
    {
        preferences = lyftapplication.getSharedPreferences("rating_state", 0);
    }

    private String getString(String s)
    {
        return preferences.getString(s, "");
    }

    private void putString(String s, String s1)
    {
        preferences.edit().putString(s, s1).apply();
    }

    public String getFeedback()
    {
        return getString("feedback");
    }

    public Set getImprovementAreas()
    {
        return preferences.getStringSet("improvement_areas", new HashSet());
    }

    public int getRating()
    {
        return preferences.getInt("rating", 0);
    }

    public String getRideId()
    {
        return getString("ride_id");
    }

    public void reset()
    {
        preferences.edit().remove("ride_id").remove("feedback").remove("rating").remove("improvement_areas").apply();
    }

    public void setFeedback(String s)
    {
        putString("feedback", s);
    }

    public void setImprovementAreas(Set set)
    {
        preferences.edit().putStringSet("improvement_areas", set).apply();
    }

    public void setRating(int i)
    {
        preferences.edit().putInt("rating", i).apply();
    }

    public void setRideId(String s)
    {
        putString("ride_id", s);
    }
}
