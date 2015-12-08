// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.transform;

import aif;
import ajo;
import ajr;
import ajw;

// Referenced classes of package androidx.media.filterpacks.transform:
//            ResizeFilter

public class ScaleFilter extends ResizeFilter
{

    private float mScale;

    public ScaleFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScale = 1.0F;
    }

    protected final int a(int i, int j)
    {
        return (int)((float)i * mScale);
    }

    protected final int b(int i, int j)
    {
        return (int)((float)j * mScale);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("scale", 1, aif.a(Float.TYPE)).a("useMipmaps", 1, aif.a(Boolean.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("scale"))
        {
            ajo1.a("mScale");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("useMipmaps"))
        {
            ajo1.a("mUseMipmaps");
            ajo1.g = true;
            return;
        }
    }
}
