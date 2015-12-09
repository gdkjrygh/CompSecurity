// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;

final class dvx
{

    private String a;

    public dvx(Context context)
    {
        a = context.getPackageName();
    }

    public static boolean e()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private String f()
    {
        return (new StringBuilder("Android/data/")).append(a).toString();
    }

    public final String a()
    {
        return (new StringBuilder()).append(f()).append("/cache").toString();
    }

    public final String b()
    {
        return (new StringBuilder()).append(f()).append("/files").toString();
    }

    public final String c()
    {
        return (new StringBuilder("Android/data/")).append(a).append("/cache").toString();
    }

    public final String d()
    {
        return (new StringBuilder("Android/data/")).append(a).append("/files/spotifycache").toString();
    }
}
