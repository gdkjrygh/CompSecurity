// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;

public final class dee
{

    private static final String a = dee.getSimpleName();

    private dee()
    {
    }

    public static void a(SurfaceTexture surfacetexture)
    {
        if (surfacetexture == null)
        {
            return;
        }
        try
        {
            surfacetexture.release();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a(surfacetexture, ((Exception) (runtimeexception)));
        }
    }

    public static void a(Surface surface)
    {
        if (surface == null)
        {
            return;
        }
        try
        {
            surface.release();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a(surface, ((Exception) (runtimeexception)));
        }
    }

    public static void a(ded ded1)
    {
        if (ded1 == null)
        {
            return;
        }
        try
        {
            ded1.a();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a(ded1, ((Exception) (runtimeexception)));
        }
    }

    private static void a(Object obj, Exception exception)
    {
        String s = a;
        obj = String.valueOf(obj);
        Log.e(s, (new StringBuilder(String.valueOf(obj).length() + 19)).append("failed to release: ").append(((String) (obj))).toString(), exception);
    }

}
