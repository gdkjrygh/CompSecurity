// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.model;

import android.net.Uri;
import com.pinterest.api.model.Model;
import java.io.File;
import java.util.Date;

public class PhotoItem extends Model
{

    private String _path;

    public PhotoItem()
    {
        _path = "";
    }

    public PhotoItem(String s)
    {
        _path = s;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public String getPath()
    {
        return _path;
    }

    public String getUid()
    {
        return null;
    }

    public Uri getUri()
    {
        return Uri.fromFile(new File(_path));
    }

    public void setCacheExpirationDate(Date date)
    {
    }
}
