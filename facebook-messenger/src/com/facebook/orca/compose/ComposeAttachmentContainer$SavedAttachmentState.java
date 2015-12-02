// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.MediaResource;
import java.util.ArrayList;

// Referenced classes of package com.facebook.orca.compose:
//            n

class b extends android.view.achmentState
{

    public static final android.os.ttachmentState.b CREATOR = new n();
    ArrayList a;
    String b;
    boolean c;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.achmentState(parcel, i);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeArray(a.toArray());
        parcel.writeString(b);
    }


    public (Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
        a = parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader());
        b = parcel.readString();
    }

    public b(Parcelable parcelable)
    {
        super(parcelable);
    }
}
