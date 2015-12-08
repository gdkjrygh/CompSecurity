// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            VideoAd

private static class videoAdRef
    implements FilenameFilter
{

    private WeakReference videoAdRef;

    public boolean accept(File file, String s)
    {
label0:
        {
            file = (VideoAd)videoAdRef.get();
            if (file != null)
            {
                file = file.getId();
                if (file != null)
                {
                    break label0;
                }
            }
            return false;
        }
        return s.startsWith(file);
    }

    public (VideoAd videoad)
    {
        videoAdRef = new WeakReference(videoad);
    }
}
