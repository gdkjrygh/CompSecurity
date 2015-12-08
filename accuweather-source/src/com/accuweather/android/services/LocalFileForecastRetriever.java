// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import android.content.res.Resources;
import com.accuweather.android.models.alert.AlertResults;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class LocalFileForecastRetriever
{

    public LocalFileForecastRetriever()
    {
    }

    private static String jsonToStringFromLocalFolder(Context context)
        throws IOException
    {
        Object obj;
        char ac[];
        context = context.getResources().openRawResource(com.accuweather.android.R.raw.multiple_alerts);
        obj = new StringWriter();
        ac = new char[1024];
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(context, "UTF-8"));
_L1:
        int i = bufferedreader.read(ac);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ((Writer) (obj)).write(ac, 0, i);
          goto _L1
        obj;
        context.close();
        throw obj;
        context.close();
        return obj.toString();
    }

    public AlertResults retrieveAlert(String s, String s1, Context context)
        throws Exception
    {
        return (AlertResults)(new Gson()).fromJson(jsonToStringFromLocalFolder(context), com/accuweather/android/models/alert/AlertResults);
    }
}
