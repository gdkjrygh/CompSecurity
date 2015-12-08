// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            HashtagEntity, MediaEntity, SymbolEntity, URLEntity, 
//            UserMentionEntity

public interface EntitySupport
{

    public abstract HashtagEntity[] getHashtagEntities();

    public abstract MediaEntity[] getMediaEntities();

    public abstract SymbolEntity[] getSymbolEntities();

    public abstract URLEntity[] getURLEntities();

    public abstract UserMentionEntity[] getUserMentionEntities();
}
