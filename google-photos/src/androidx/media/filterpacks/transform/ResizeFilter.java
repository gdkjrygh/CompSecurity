// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.transform;

import aif;
import ajr;
import ajw;

// Referenced classes of package androidx.media.filterpacks.transform:
//            CropFilter

public class ResizeFilter extends CropFilter
{

    public ResizeFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("outputWidth", 1, aif.a(Integer.TYPE)).a("outputHeight", 1, aif.a(Integer.TYPE)).a("useMipmaps", 1, aif.a(Boolean.TYPE)).b("image", 2, aif2).a();
    }
}
