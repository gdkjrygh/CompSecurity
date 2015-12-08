// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import com.bumptech.glide.load.b.b.i;
import com.roidapp.baselib.d.a;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.common:
//            PhotoGridGlideModule

final class ao
    implements i
{

    final PhotoGridGlideModule a;

    ao(PhotoGridGlideModule photogridglidemodule)
    {
        a = photogridglidemodule;
        super();
    }

    public final File a()
    {
        return new File(com.roidapp.baselib.d.a.c(), "images");
    }
}
