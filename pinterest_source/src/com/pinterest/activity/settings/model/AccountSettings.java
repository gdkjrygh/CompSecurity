// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.model;

import com.pinterest.api.model.Model;
import java.util.Date;

public class AccountSettings extends Model
{

    Boolean checked;
    int id;
    String name;
    int type;
    String value;

    public AccountSettings(String s, int i, String s1, int j)
    {
        checked = Boolean.valueOf(false);
        name = s;
        type = i;
        value = s1;
        id = j;
    }

    public AccountSettings(String s, int i, String s1, Boolean boolean1, int j)
    {
        checked = Boolean.valueOf(false);
        name = s;
        type = i;
        value = s1;
        checked = boolean1;
        id = j;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public Boolean getChecked()
    {
        return checked;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getType()
    {
        return type;
    }

    public String getUid()
    {
        return null;
    }

    public String getValue()
    {
        return value;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setChecked(Boolean boolean1)
    {
        checked = boolean1;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setType(int i)
    {
        type = i;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
