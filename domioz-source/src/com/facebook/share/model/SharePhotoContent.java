// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareContent, l, SharePhoto

public final class SharePhotoContent extends ShareContent
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    private final List a;

    SharePhotoContent(Parcel parcel)
    {
        super(parcel);
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, SharePhoto.CREATOR);
        a = Collections.unmodifiableList(arraylist);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        Object obj = a;
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((SharePhoto)((Iterator) (obj)).next())) { }
        parcel.writeTypedList(arraylist);
    }

}
