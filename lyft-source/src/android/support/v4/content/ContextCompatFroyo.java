// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import java.io.File;

class ContextCompatFroyo
{

    public static File a(Context context)
    {
        return context.getExternalCacheDir();
    }

    public static File a(Context context, String s)
    {
        return context.getExternalFilesDir(s);
    }
}
