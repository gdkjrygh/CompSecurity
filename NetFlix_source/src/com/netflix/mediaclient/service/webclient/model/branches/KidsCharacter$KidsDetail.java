// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;


// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            KidsCharacter

public static class 
{

    public int episodeCount;
    public boolean hasWatchedRecently;
    public int movieCount;
    public String storyImgUrl;
    public String synopsis;

    public String toString()
    {
        return (new StringBuilder()).append("KidsDetail [episodeCount=").append(episodeCount).append(", movieCount=").append(movieCount).append(", hasWatchedRecently=").append(hasWatchedRecently).append(", synopsis=").append(synopsis).append(", storyImgUrl=").append(storyImgUrl).append("]").toString();
    }

    public ()
    {
    }
}
