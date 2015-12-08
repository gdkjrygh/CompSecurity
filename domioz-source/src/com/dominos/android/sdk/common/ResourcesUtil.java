// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResourcesUtil
{

    public ResourcesUtil()
    {
    }

    public static String getStringFromRawResource(Context context, int i)
    {
        StringBuilder stringbuilder;
        context = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
        stringbuilder = new StringBuilder();
_L1:
        String s;
        try
        {
            s = context.readLine();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        stringbuilder.append(s);
        stringbuilder.append('\n');
          goto _L1
        return stringbuilder.toString();
    }
}
