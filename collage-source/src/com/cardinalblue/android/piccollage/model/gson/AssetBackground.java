// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IBackground

public class AssetBackground
    implements IBackground
{

    public static final String PREFIX_ASSET_BACKGROUND = "assets://backgrounds/";
    private String mFilename;
    private boolean mIsTile;
    protected String mThumbnailUrl;

    public AssetBackground()
    {
    }

    public String getPath()
    {
        return (new StringBuilder()).append("assets://backgrounds/").append(mFilename).toString();
    }

    public String getThumbnailPath()
    {
        return (new StringBuilder()).append("assets://backgrounds/").append(mThumbnailUrl).toString();
    }
}
