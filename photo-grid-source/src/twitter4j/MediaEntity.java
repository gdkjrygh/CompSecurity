// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Map;

// Referenced classes of package twitter4j:
//            URLEntity

public interface MediaEntity
    extends URLEntity
{

    public abstract long getId();

    public abstract String getMediaURL();

    public abstract String getMediaURLHttps();

    public abstract Map getSizes();

    public abstract String getType();
}
