// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Logo
{

    String backgroundPhone;
    String backgroundTablet;
    String id;
    String image;
    String name;
    String picker;
    String topBar;
    String url;

    public Logo()
    {
    }

    public static List parse(InputStream inputstream)
    {
        CSVReader csvreader;
        csvreader = new CSVReader(new BufferedReader(new InputStreamReader(inputstream)));
        inputstream = new ArrayList();
        Object obj = csvreader.readAll();
        inputstream = ((InputStream) (obj));
        csvreader.close();
        inputstream = ((InputStream) (obj));
_L2:
        obj = new ArrayList();
        for (int i = 1; i < inputstream.size(); i++)
        {
            String as[] = (String[])inputstream.get(i);
            Logo logo = new Logo();
            logo.name = as[0];
            if (as.length > 1)
            {
                logo.id = as[1];
            }
            if (as.length > 5)
            {
                logo.backgroundTablet = as[5];
            }
            if (as.length > 6)
            {
                logo.backgroundPhone = as[6];
            }
            if (as.length > 11)
            {
                logo.picker = as[11];
            }
            if (as.length > 15)
            {
                logo.image = as[15];
            }
            if (as.length > 16)
            {
                logo.topBar = as[16];
            }
            if (as.length > 17)
            {
                logo.url = as[17];
            }
            ((List) (obj)).add(logo);
        }

        break; /* Loop/switch isn't completed */
        obj;
        ((IOException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        return ((List) (obj));
    }

    public String getBackgroundPhone()
    {
        return backgroundPhone;
    }

    public String getBackgroundTablet()
    {
        return backgroundTablet;
    }

    public String getId()
    {
        return id;
    }

    public String getImage()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }

    public String getPicker()
    {
        return picker;
    }

    public String getTopBar()
    {
        return topBar;
    }

    public String getUrl()
    {
        return url;
    }
}
