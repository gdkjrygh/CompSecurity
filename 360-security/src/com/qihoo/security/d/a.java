// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.d;

import android.content.Context;
import android.content.res.AssetManager;
import com.qihoo360.common.utils.IniProperties;
import java.io.IOException;
import java.io.InputStream;

public class a
{

    private String a;
    private final Context b;
    private final IniProperties c;

    public a(Context context)
    {
        Exception exception;
        a = null;
        c = new IniProperties();
        b = context;
        try
        {
            context = b.getAssets().open("config.ini");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        try
        {
            c.load(context);
        }
        catch (IOException ioexception)
        {
            try
            {
                context.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        finally { }
        context.close();
        return;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw exception;
        context;
    }

    public String a(String s, String s1)
    {
        return c.getProperty(s, s1);
    }
}
