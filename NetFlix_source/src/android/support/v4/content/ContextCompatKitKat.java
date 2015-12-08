// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import java.io.File;

class ContextCompatKitKat
{

    ContextCompatKitKat()
    {
    }

    public static File[] getExternalCacheDirs(Context context)
    {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String s)
    {
        return context.getExternalFilesDirs(s);
    }

    public static File[] getObbDirs(Context context)
    {
        return context.getObbDirs();
    }
}
