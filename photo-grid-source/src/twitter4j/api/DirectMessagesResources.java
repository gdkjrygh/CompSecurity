// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.ResponseList;

public interface DirectMessagesResources
{

    public abstract DirectMessage destroyDirectMessage(long l);

    public abstract ResponseList getDirectMessages();

    public abstract ResponseList getDirectMessages(Paging paging);

    public abstract ResponseList getSentDirectMessages();

    public abstract ResponseList getSentDirectMessages(Paging paging);

    public abstract DirectMessage sendDirectMessage(long l, String s);

    public abstract DirectMessage sendDirectMessage(String s, String s1);

    public abstract DirectMessage showDirectMessage(long l);
}
