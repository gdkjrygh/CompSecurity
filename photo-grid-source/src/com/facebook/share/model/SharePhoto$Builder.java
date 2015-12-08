// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, SharePhoto, ShareModel

public final class 
    implements ShareModelBuilder
{

    private Bitmap bitmap;
    private Uri imageUrl;
    private boolean userGenerated;

    public static List readListFrom(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, SharePhoto.CREATOR);
        return arraylist;
    }

    public static void writeListTo(Parcel parcel, List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add((SharePhoto)list.next())) { }
        parcel.writeTypedList(arraylist);
    }

    public final SharePhoto build()
    {
        return new SharePhoto(this, null);
    }

    public final volatile Object build()
    {
        return build();
    }

    final Bitmap getBitmap()
    {
        return bitmap;
    }

    final Uri getImageUrl()
    {
        return imageUrl;
    }

    public final volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((SharePhoto)sharemodel);
    }

    public final readFrom readFrom(Parcel parcel)
    {
        return readFrom((SharePhoto)parcel.readParcelable(com/facebook/share/model/SharePhoto.getClassLoader()));
    }

    public final readFrom readFrom(SharePhoto sharephoto)
    {
        if (sharephoto == null)
        {
            return this;
        } else
        {
            return setBitmap(sharephoto.getBitmap()).setImageUrl(sharephoto.getImageUrl()).setUserGenerated(sharephoto.getUserGenerated());
        }
    }

    public final enerated setBitmap(Bitmap bitmap1)
    {
        bitmap = bitmap1;
        return this;
    }

    public final bitmap setImageUrl(Uri uri)
    {
        imageUrl = uri;
        return this;
    }

    public final imageUrl setUserGenerated(boolean flag)
    {
        userGenerated = flag;
        return this;
    }




    public ()
    {
    }
}
