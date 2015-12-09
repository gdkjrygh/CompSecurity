// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IBackground

public class DownloadedBackground
    implements IBackground
{

    private final String mOriginalPath;
    private final String mThumbnailPath;

    public DownloadedBackground(String s, String s1)
    {
        mThumbnailPath = s;
        mOriginalPath = s1;
    }

    public String getPath()
    {
        return mOriginalPath;
    }

    public String getThumbnailPath()
    {
        return mThumbnailPath;
    }
}
