// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            RateLimitStatus

public interface TwitterResponse
    extends Serializable
{

    public static final int NONE = 0;
    public static final int READ = 1;
    public static final int READ_WRITE = 2;
    public static final int READ_WRITE_DIRECTMESSAGES = 3;

    public abstract int getAccessLevel();

    public abstract RateLimitStatus getRateLimitStatus();
}
