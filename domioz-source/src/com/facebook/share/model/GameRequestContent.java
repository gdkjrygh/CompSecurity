// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, b, c

public final class GameRequestContent
    implements ShareModel
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final b e;
    private final String f;
    private final c g;
    private final ArrayList h;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e.toString());
        parcel.writeString(f);
        parcel.writeString(g.toString());
        parcel.writeStringList(h);
    }
}
