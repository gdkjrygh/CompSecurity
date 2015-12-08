// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareVideo, ShareMedia

public static final class  extends 
{

    Uri b;

    private  a(ShareVideo sharevideo)
    {
        if (sharevideo == null)
        {
            return this;
        } else
        {
              = ()super.a(sharevideo);
            .b = sharevideo.b;
            return ;
        }
    }

    public final volatile b a(ShareMedia sharemedia)
    {
        return a((ShareVideo)sharemedia);
    }

    public final a a(Parcel parcel)
    {
        return a((ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader()));
    }

    public ()
    {
    }
}
