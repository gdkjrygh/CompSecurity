// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadResourceFile
{

    public ReadResourceFile()
    {
    }

    public String readText(Context context, int i)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = new StringBuilder();
        context = context.getResources().openRawResource(i);
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(context, "UTF8"));
_L3:
        obj = bufferedreader.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj1)).append((new StringBuilder()).append(((String) (obj))).append("\n").toString());
          goto _L3
        obj1;
        obj = context;
        context = ((Context) (obj1));
_L5:
        try
        {
            bufferedreader.close();
            ((InputStream) (obj)).close();
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return "";
_L2:
        ((StringBuilder) (obj1)).deleteCharAt(((StringBuilder) (obj1)).length() - 1);
        obj = ((StringBuilder) (obj1)).toString();
        bufferedreader.close();
        context.close();
        return ((String) (obj));
        context;
        bufferedreader = null;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        bufferedreader = null;
        obj = context;
        context = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
