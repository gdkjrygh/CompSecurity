// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.model;

import com.pinterest.api.model.Model;
import com.pinterest.kit.application.Resources;
import java.util.Date;

public class DirectoryItem extends Model
{

    private int _count;
    private String _name;
    private String _path;

    public DirectoryItem(String s, String s1, int i)
    {
        _path = s;
        _name = s1;
        _count = i;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public String getName()
    {
        return _name;
    }

    public String getPath()
    {
        return _path;
    }

    public String getPhotoCountDesc()
    {
        if (_count != 1)
        {
            return Resources.string(0x7f0703eb, new Object[] {
                Integer.valueOf(_count)
            });
        } else
        {
            return Resources.string(0x7f0703ec);
        }
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
    }
}
