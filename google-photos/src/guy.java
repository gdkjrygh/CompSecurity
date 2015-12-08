// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.WallpaperManager;
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class guy extends mtf
{

    private final File a;

    public guy(File file)
    {
        super("SetWallpaperTask");
        a = file;
    }

    private mue g(Context context)
    {
        Object obj2;
        Object obj4;
        Object obj = null;
        obj4 = null;
        obj2 = WallpaperManager.getInstance(context);
        if (obj2 == null)
        {
            return new mue(0, new IllegalStateException("Could not obtain WallpaperManager"), null);
        }
        context = obj;
        Object obj1 = new FileInputStream(a);
        ((WallpaperManager) (obj2)).setStream(((java.io.InputStream) (obj1)));
        context = new mue(true);
        p.a(((java.io.Closeable) (obj1)));
        return context;
        Object obj3;
        obj3;
        obj1 = obj4;
_L4:
        context = ((Context) (obj1));
        obj3 = new mue(0, ((Exception) (obj3)), null);
        p.a(((java.io.Closeable) (obj1)));
        return ((mue) (obj3));
        obj3;
        obj1 = context;
        context = ((Context) (obj3));
_L2:
        p.a(((java.io.Closeable) (obj1)));
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void h(Context context)
    {
        if (!a.delete() && noz.a(context, "SetWallpaperTask", new String[0]).a())
        {
            noy.a("temporaryFile", a);
        }
    }

    protected final mue a(Context context)
    {
        mue mue1 = g(context);
        h(context);
        return mue1;
        Exception exception;
        exception;
        h(context);
        throw exception;
    }

    public final String b(Context context)
    {
        return context.getString(b.um);
    }
}
