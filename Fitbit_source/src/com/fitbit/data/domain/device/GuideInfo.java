// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import java.io.Serializable;

public class GuideInfo
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private int login;
    private int password;
    private String url;

    public GuideInfo(String s, int i, int j)
    {
        url = s;
        login = i;
        password = j;
    }

    public String a()
    {
        return url;
    }

    public String b()
    {
        if (login > 0)
        {
            return FitBitApplication.a().getResources().getString(login);
        } else
        {
            return "";
        }
    }

    public String c()
    {
        if (password > 0)
        {
            return FitBitApplication.a().getResources().getString(password);
        } else
        {
            return "";
        }
    }
}
