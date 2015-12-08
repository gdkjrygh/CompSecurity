// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.Bitmap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Media
{

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private String createDate;
    private String id;
    private transient boolean isSelected;
    private transient Bitmap thumbnail;
    private String title;
    private String updateDate;

    public Media()
    {
    }

    public Date getCreateDate()
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())).parse(createDate);
        }
        catch (ParseException parseexception)
        {
            return null;
        }
        return date;
    }

    public String getId()
    {
        return id;
    }

    public Bitmap getThumbnail()
    {
        return thumbnail;
    }

    public String getTitle()
    {
        return title;
    }

    public Date getUpdateDate()
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())).parse(updateDate);
        }
        catch (ParseException parseexception)
        {
            return null;
        }
        return date;
    }

    public boolean isSelected()
    {
        return isSelected;
    }

    public void setSelected(boolean flag)
    {
        isSelected = flag;
    }

    public void setThumbnail(Bitmap bitmap)
    {
        thumbnail = bitmap;
    }
}
