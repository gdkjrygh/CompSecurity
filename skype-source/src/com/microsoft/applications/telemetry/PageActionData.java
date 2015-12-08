// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


// Referenced classes of package com.microsoft.applications.telemetry:
//            ActionType, RawActionType, InputDeviceType

public class PageActionData
{

    public ActionType actionType;
    public String destinationUri;
    public InputDeviceType inputDeviceType;
    public final String pageViewId;
    public RawActionType rawActionType;
    public String targetItemCategory;
    public String targetItemCollection;
    public String targetItemId;
    public String targetItemLayoutContainer;
    public String targetItemName;
    public int targetItemRank;

    public PageActionData(String s)
    {
        destinationUri = "";
        targetItemId = "";
        targetItemName = "";
        targetItemCategory = "";
        targetItemCollection = "";
        targetItemLayoutContainer = "";
        targetItemRank = 0;
        pageViewId = s;
        actionType = ActionType.UNSPECIFIED;
        rawActionType = RawActionType.UNSPECIFIED;
        inputDeviceType = InputDeviceType.UNSPECIFIED;
        targetItemRank = 0;
    }

    public String toString()
    {
        return String.format("{pageViewId: %s|actionType: %s|rawActionType: %s|inputDeviceType: %s|destinationUri: %s|targetItemId: %s|targetItemName: %s|targetItemCategory: %s|targetItemCollection: %s|targetItemLayoutContainer: %s|targetItemRank: %d}", new Object[] {
            pageViewId, Integer.valueOf(actionType.getValue()), Integer.valueOf(rawActionType.getValue()), Integer.valueOf(inputDeviceType.getValue()), destinationUri, targetItemId, targetItemName, targetItemCategory, targetItemCollection, targetItemLayoutContainer, 
            Integer.valueOf(targetItemRank)
        });
    }
}
