// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.rating;

import java.util.Set;

public interface IRatingStateStorage
{

    public abstract String getFeedback();

    public abstract Set getImprovementAreas();

    public abstract int getRating();

    public abstract String getRideId();

    public abstract void reset();

    public abstract void setFeedback(String s);

    public abstract void setImprovementAreas(Set set);

    public abstract void setRating(int i);

    public abstract void setRideId(String s);
}
