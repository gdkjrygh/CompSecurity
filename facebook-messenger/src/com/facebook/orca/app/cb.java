// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.app.DownloadManager;
import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.photos.c.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cb extends d
{

    final h a;

    private cb(h h)
    {
        a = h;
        super();
    }

    cb(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        if (com.facebook.orca.photos.c.a.a())
        {
            return new a((Context)a(android/content/Context), (DownloadManager)a(android/app/DownloadManager));
        } else
        {
            return null;
        }
    }

    public Object b()
    {
        return a();
    }
}
