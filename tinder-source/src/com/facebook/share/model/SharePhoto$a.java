// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            SharePhoto, ShareMedia

public static final class  extends 
{

    Bitmap b;
    Uri c;
    boolean d;
    String e;

    private  a(SharePhoto sharephoto)
    {
        if (sharephoto == null)
        {
            return this;
        } else
        {
              = ()super.a(sharephoto);
            .b = sharephoto.b;
            .c = sharephoto.c;
            .d = sharephoto.d;
            .e = sharephoto.e;
            return ;
        }
    }

    public final volatile e a(ShareMedia sharemedia)
    {
        return a((SharePhoto)sharemedia);
    }

    public final a a(Parcel parcel)
    {
        return a((SharePhoto)parcel.readParcelable(com/facebook/share/model/SharePhoto.getClassLoader()));
    }

    public ()
    {
    }
}
