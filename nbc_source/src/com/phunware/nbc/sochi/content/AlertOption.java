// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.content;

import java.util.ArrayList;
import java.util.List;

public class AlertOption
{
    public static class Collection extends ArrayList
    {

        public Collection()
        {
        }
    }


    private static final String FIELD_DISPLAY = "display";
    private static final String FIELD_RSN = "rsn";
    private static final String FIELD_SUBSECTIONS = "subsections";
    private static final String FIELD_TAG = "tag";
    String mDisplay;
    String mRsn;
    private boolean mSelected;
    List mSubsections;
    String mTag;

    public AlertOption()
    {
    }

    public String getDisplay()
    {
        return mDisplay;
    }

    public String getRsn()
    {
        return mRsn;
    }

    public List getSubsections()
    {
        return mSubsections;
    }

    public String getTag()
    {
        return mTag;
    }

    public boolean isSelected()
    {
        return mSelected;
    }

    public void setDisplay(String s)
    {
        mDisplay = s;
    }

    public void setRsn(String s)
    {
        mRsn = s;
    }

    public void setSelected(boolean flag)
    {
        mSelected = flag;
    }

    public void setSubsections(List list)
    {
        mSubsections = list;
    }

    public void setTag(String s)
    {
        mTag = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("selected = ").append(mSelected).append(", display = ").append(mDisplay).append(", subsections = ").append(mSubsections).append(", tag = ").append(mTag).append(", rsn = ").append(mRsn).toString();
    }

    public void toggleSelected()
    {
        boolean flag;
        if (!mSelected)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mSelected = flag;
    }
}
