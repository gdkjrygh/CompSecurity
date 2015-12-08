// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class jgw
{

    public final SurfaceTexture a;
    public final noz b;
    public final noz c;
    public Surface d;
    public boolean e;

    public jgw(Context context, SurfaceTexture surfacetexture, boolean flag)
    {
        p.a(surfacetexture);
        a = surfacetexture;
        e = flag;
        b = noz.a(context, 2, "SurfaceTextureWrapper", new String[0]);
        c = noz.a(context, 5, "SurfaceTextureWrapper", new String[0]);
    }

    public final void a()
    {
        if (b.a())
        {
            noy.a("SurfaceTextureWrapper", this);
        }
        if (e && b.a())
        {
            noy.a("SurfaceTextureWrapper", this);
            return;
        } else
        {
            e = true;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof jgw)
        {
            obj = (jgw)obj;
            return a.equals(((jgw) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.a(a, 17);
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(a);
        boolean flag = e;
        return (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length())).append(s).append("{surfaceTexture=").append(s1).append(", isReleased=").append(flag).append("}").toString();
    }
}
