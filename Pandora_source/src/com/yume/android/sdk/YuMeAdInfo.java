// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.List;

// Referenced classes of package com.yume.android.sdk:
//            YuMeMetaData, YuMeControlBarInfo, YuMeAssetType

public class YuMeAdInfo
{

    public Boolean bCloseOnFinish;
    public Boolean bIsBaseAssetClickable;
    public Boolean bIsBaseAssetSwipable;
    public Boolean bLeaveUpLastFrame;
    public Boolean bLeaveUpLastRolled;
    public int baseAssetDuration;
    public int baseAssetID;
    public YuMeMetaData baseAssetMetaData;
    public String baseAssetUrl;
    public YuMeControlBarInfo controlBarInfo;
    public YuMeAssetType eBaseAssetType;
    public List imagesList;
    public List playerEventsList;
    public int timelineEventInterval;
    public List timelineEventsList;
    public List timersList;

    public YuMeAdInfo()
    {
        bIsBaseAssetClickable = Boolean.valueOf(false);
        bIsBaseAssetSwipable = Boolean.valueOf(false);
        bCloseOnFinish = Boolean.valueOf(true);
        bLeaveUpLastFrame = Boolean.valueOf(false);
        bLeaveUpLastRolled = Boolean.valueOf(false);
        timelineEventInterval = -1;
    }
}
