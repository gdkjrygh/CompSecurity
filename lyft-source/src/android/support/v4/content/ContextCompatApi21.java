// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

class ContextCompatApi21
{

    public static Drawable a(Context context, int i)
    {
        return context.getDrawable(i);
    }

    public static File a(Context context)
    {
        return context.getNoBackupFilesDir();
    }

    public static File b(Context context)
    {
        return context.getCodeCacheDir();
    }
}
