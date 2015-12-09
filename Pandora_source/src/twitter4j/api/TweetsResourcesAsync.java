// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.OEmbedRequest;
import twitter4j.StatusUpdate;

public interface TweetsResourcesAsync
{

    public abstract void destroyStatus(long l);

    public abstract void getOEmbed(OEmbedRequest oembedrequest);

    public abstract void getRetweets(long l);

    public abstract void lookup(long al[]);

    public abstract void retweetStatus(long l);

    public abstract void showStatus(long l);

    public abstract void updateStatus(String s);

    public abstract void updateStatus(StatusUpdate statusupdate);
}
