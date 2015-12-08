// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package twitter4j:
//            TwitterResponse, Query

public interface QueryResult
    extends Serializable, TwitterResponse
{

    public abstract double getCompletedIn();

    public abstract int getCount();

    public abstract long getMaxId();

    public abstract String getQuery();

    public abstract String getRefreshURL();

    public abstract long getSinceId();

    public abstract List getTweets();

    public abstract boolean hasNext();

    public abstract Query nextQuery();
}
