// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TweetEntity

public interface HashtagEntity
    extends Serializable, TweetEntity
{

    public abstract int getEnd();

    public abstract int getStart();

    public abstract String getText();
}
