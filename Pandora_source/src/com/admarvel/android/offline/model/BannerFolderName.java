// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline.model;

import java.io.Serializable;
import java.util.ArrayList;

public class BannerFolderName
    implements Serializable
{

    private static final long serialVersionUID = 0x2b5637625bbb98L;
    private ArrayList bannerFolderName;

    public BannerFolderName()
    {
    }

    public ArrayList getBannerFolderName()
    {
        return bannerFolderName;
    }

    public void setBannerFolderName(ArrayList arraylist)
    {
        bannerFolderName = arraylist;
    }
}
