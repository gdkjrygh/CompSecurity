// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            SharePhoto

public final class k
{

    private Bitmap a;
    private Uri b;
    private boolean c;

    public k()
    {
    }

    static Bitmap a(k k1)
    {
        return k1.a;
    }

    static Uri b(k k1)
    {
        return k1.b;
    }

    static boolean c(k k1)
    {
        return k1.c;
    }

    final Uri a()
    {
        return b;
    }

    public final k a(Parcel parcel)
    {
        parcel = (SharePhoto)parcel.readParcelable(com/facebook/share/model/SharePhoto.getClassLoader());
        if (parcel == null)
        {
            return this;
        } else
        {
            a = parcel.a();
            b = parcel.b();
            c = parcel.c();
            return this;
        }
    }

    final Bitmap b()
    {
        return a;
    }
}
