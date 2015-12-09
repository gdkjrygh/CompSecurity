// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterResponse

public interface AccountTotals
    extends Serializable, TwitterResponse
{

    public abstract int getFavorites();

    public abstract int getFollowers();

    public abstract int getFriends();

    public abstract int getUpdates();
}
