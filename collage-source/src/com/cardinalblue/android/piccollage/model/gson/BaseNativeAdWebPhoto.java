// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import bolts.j;
import com.cardinalblue.android.b.f;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPhoto

public abstract class BaseNativeAdWebPhoto extends WebPhoto
{

    protected final j task = load();

    public BaseNativeAdWebPhoto(WebPhoto.Category category)
    {
        setCategory(category);
    }

    public j getLoadingResult()
    {
        return task;
    }

    protected abstract j load();

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(mCategory).b(parcel);
    }
}
