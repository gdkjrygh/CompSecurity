// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import com.qihoo.security.node.BaseItemInfo;
import java.util.List;

public class TrashItemInfo extends BaseItemInfo
{

    public int TrashType;
    public String bigFileFrom;
    public int checkStatus;
    public List data;
    public String desc;
    public int downShadowType;
    public int iconId;
    public int isExpand;
    public int keepCount;
    public int level;
    public int lineType;
    public String name;
    public List oraginalData;
    public String path;
    public String pkgName;
    public String rootTitle;
    public long size;
    public int subCount;
    public long systemDialogSize;
    public String systemDialogTitle;
    public int upShadowType;

    public TrashItemInfo()
    {
        iconId = -2;
        TrashType = -1;
        isExpand = -1;
        keepCount = 0;
        lineType = -1;
        upShadowType = -1;
        downShadowType = -1;
    }

    public TrashItemInfo clone()
    {
        TrashItemInfo trashiteminfo = new TrashItemInfo();
        trashiteminfo.name = name;
        trashiteminfo.rootTitle = rootTitle;
        trashiteminfo.desc = desc;
        trashiteminfo.pkgName = pkgName;
        trashiteminfo.iconId = iconId;
        trashiteminfo.path = path;
        trashiteminfo.size = size;
        trashiteminfo.level = level;
        trashiteminfo.checkStatus = checkStatus;
        trashiteminfo.TrashType = TrashType;
        trashiteminfo.isExpand = isExpand;
        trashiteminfo.subCount = subCount;
        trashiteminfo.keepCount = keepCount;
        trashiteminfo.lineType = lineType;
        trashiteminfo.upShadowType = upShadowType;
        trashiteminfo.downShadowType = downShadowType;
        trashiteminfo.bigFileFrom = bigFileFrom;
        trashiteminfo.systemDialogTitle = systemDialogTitle;
        trashiteminfo.systemDialogSize = systemDialogSize;
        trashiteminfo.data = data;
        return trashiteminfo;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String toString()
    {
        return super.toString();
    }
}
