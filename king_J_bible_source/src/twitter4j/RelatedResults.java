// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterResponse, ResponseList

public interface RelatedResults
    extends TwitterResponse, Serializable
{

    public abstract ResponseList getTweetsFromUser();

    public abstract ResponseList getTweetsWithConversation();

    public abstract ResponseList getTweetsWithReply();
}
