// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Date;

// Referenced classes of package twitter4j:
//            EntitySupport, Annotations, GeoLocation, Place

public interface Tweet
    extends Comparable, EntitySupport, Serializable
{

    public abstract Annotations getAnnotations();

    public abstract Date getCreatedAt();

    public abstract String getFromUser();

    public abstract long getFromUserId();

    public abstract GeoLocation getGeoLocation();

    public abstract long getId();

    public abstract String getIsoLanguageCode();

    public abstract String getLocation();

    public abstract Place getPlace();

    public abstract String getProfileImageUrl();

    public abstract String getSource();

    public abstract String getText();

    public abstract String getToUser();

    public abstract long getToUserId();
}
