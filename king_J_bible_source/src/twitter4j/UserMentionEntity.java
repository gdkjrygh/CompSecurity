// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

public interface UserMentionEntity
    extends Serializable
{

    public abstract int getEnd();

    public abstract long getId();

    public abstract String getName();

    public abstract String getScreenName();

    public abstract int getStart();
}
