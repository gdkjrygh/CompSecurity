// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private static final class I extends LruCache
{

    protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        super.entryRemoved(flag, (I)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected final volatile int sizeOf$2838e5a0(Object obj)
    {
        obj = (Bitmap)obj;
        return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
    }

    public I(Context context)
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        int i;
        if ((context.getApplicationInfo().flags & 0x100000) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && PlatformVersion.checkVersion(11))
        {
            i = activitymanager.getLargeMemoryClass();
        } else
        {
            i = activitymanager.getMemoryClass();
        }
        super((int)((float)(i * 0x100000) * 0.33F));
    }
}
