// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.node;

import java.io.Serializable;

public class BaseItemInfo
    implements Serializable
{

    public int checkStatus;
    public int childLevel;
    public int isExpand;
    public int level;
    public int lineType;
    public int shadeType;

    public BaseItemInfo()
    {
        level = 0;
        childLevel = 0;
        checkStatus = 1;
        isExpand = 0;
        lineType = 0;
        shadeType = 0;
    }
}
