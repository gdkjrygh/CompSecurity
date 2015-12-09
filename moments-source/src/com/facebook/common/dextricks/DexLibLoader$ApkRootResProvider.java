// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class <init> extends <init>
{

    private static Method a;
    private final Context b;

    public final InputStream a(String s)
    {
        try
        {
            s = (InputStream)a.invoke(b.getAssets(), new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Throwable throwable = s.getCause();
            if (throwable instanceof RuntimeException)
            {
                throw (RuntimeException)throwable;
            }
            if (throwable instanceof IOException)
            {
                throw (IOException)throwable;
            } else
            {
                throw new RuntimeException(s);
            }
        }
        return s;
    }

    private (Context context)
    {
        super((byte)0);
        if (a == null)
        {
            a = android/content/res/AssetManager.getMethod("openNonAsset", new Class[] {
                java/lang/String
            });
        }
        b = context;
    }

    b(Context context, byte byte0)
    {
        this(context);
    }
}
