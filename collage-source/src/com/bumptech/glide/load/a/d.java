// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.a:
//            a

public class d extends a
{

    public d(AssetManager assetmanager, String s)
    {
        super(assetmanager, s);
    }

    protected Object a(AssetManager assetmanager, String s)
        throws IOException
    {
        return b(assetmanager, s);
    }

    protected void a(ParcelFileDescriptor parcelfiledescriptor)
        throws IOException
    {
        parcelfiledescriptor.close();
    }

    protected volatile void a(Object obj)
        throws IOException
    {
        a((ParcelFileDescriptor)obj);
    }

    protected ParcelFileDescriptor b(AssetManager assetmanager, String s)
        throws IOException
    {
        return assetmanager.openFd(s).getParcelFileDescriptor();
    }
}
