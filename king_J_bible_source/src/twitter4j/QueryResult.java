// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.List;

public interface QueryResult
    extends Serializable
{

    public abstract double getCompletedIn();

    public abstract long getMaxId();

    public abstract int getPage();

    public abstract String getQuery();

    public abstract String getRefreshUrl();

    public abstract int getResultsPerPage();

    public abstract long getSinceId();

    public abstract List getTweets();

    public abstract String getWarning();
}
