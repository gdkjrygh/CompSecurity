// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public abstract class ShareContent
    implements ShareModel
{

    public final Uri h;
    public final List i;
    public final String j;
    public final String k;

    public ShareContent(Parcel parcel)
    {
        h = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        Object obj = new ArrayList();
        parcel.readStringList(((List) (obj)));
        if (((List) (obj)).size() == 0)
        {
            obj = null;
        } else
        {
            obj = Collections.unmodifiableList(((List) (obj)));
        }
        i = ((List) (obj));
        j = parcel.readString();
        k = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeParcelable(h, 0);
        parcel.writeStringList(i);
        parcel.writeString(j);
        parcel.writeString(k);
    }
}
