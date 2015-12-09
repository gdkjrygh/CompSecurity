// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


// Referenced classes of package com.yume.android.sdk:
//            YuMeImageRegion

public class YuMeImageInfo
{

    public Boolean bDisplayTwice;
    public Boolean bIsClickable;
    public Boolean bIsVisibleAtStart;
    public YuMeImageRegion eRegion;
    public int height;
    public int heightPercent;
    public int imageID;
    public String imageURL;
    public String mimeType;
    public int positionInRegion;
    public int width;
    public int widthPercent;
    public int xPercent;
    public int yPercent;
    public int zIndex;

    public YuMeImageInfo()
    {
        bDisplayTwice = Boolean.valueOf(false);
    }
}
