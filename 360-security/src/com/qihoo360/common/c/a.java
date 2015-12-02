// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.c;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.DataInputStream;

public class a
{

    private static int a = -1;

    public static int a(Context context)
    {
        Object obj;
        if (a >= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context = context.getAssets();
        obj = null;
        context = new DataInputStream(context.open("cid.dat"));
        a = Integer.parseInt(context.readLine().trim());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return a;
        context;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context;
_L2:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
        Exception exception1;
        exception1;
        obj = context;
        context = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
