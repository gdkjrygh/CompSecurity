// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.widget.ImageView;
import java.lang.ref.SoftReference;

// Referenced classes of package com.aviary.android.feather.sdk.async_tasks:
//            AsyncImageManager

static abstract class e
    implements Runnable
{

    public SoftReference e;

    public (ImageView imageview)
    {
        e = new SoftReference(imageview);
    }
}
