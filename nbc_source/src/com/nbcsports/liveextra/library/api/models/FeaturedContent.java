// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;


// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            AssetList

public class FeaturedContent
{

    AssetList replay;
    AssetList showCase;
    AssetList spotlight;

    public FeaturedContent()
    {
        spotlight = new AssetList();
        replay = new AssetList();
        showCase = new AssetList();
    }

    public AssetList getReplay()
    {
        return replay;
    }

    public AssetList getShowCase()
    {
        return showCase;
    }

    public AssetList getSpotlight()
    {
        return spotlight;
    }
}
