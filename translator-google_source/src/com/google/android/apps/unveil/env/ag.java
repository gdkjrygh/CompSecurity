// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Rect;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.unveil.env:
//            Viewport, Size

final class ag
    implements android.os.Parcelable.Creator
{

    ag()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Viewport viewport = new Viewport(parcel.readInt());
        Rect rect = (Rect)parcel.readParcelable(android/graphics/Rect.getClassLoader());
        if (rect == null)
        {
            rect = null;
        } else
        {
            rect = new Rect(rect);
        }
        viewport.d = rect;
        viewport.c = parcel.readInt();
        viewport.b = (Size)parcel.readSerializable();
        return viewport;
    }

    public final Object[] newArray(int i)
    {
        return new Viewport[i];
    }
}
