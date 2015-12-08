// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAnnotation, AppContentAnnotationEntity

public final class AppContentAnnotationRef extends MultiDataBufferRef
    implements AppContentAnnotation
{

    AppContentAnnotationRef(ArrayList arraylist, int i)
    {
        super(arraylist, 2, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentAnnotationEntity.a(this, obj);
    }

    public Object freeze()
    {
        return kM();
    }

    public String getDescription()
    {
        return getString("annotation_description");
    }

    public String getTitle()
    {
        return getString("annotation_title");
    }

    public String getType()
    {
        return getString("annotation_type");
    }

    public int hashCode()
    {
        return AppContentAnnotationEntity.a(this);
    }

    public Uri kL()
    {
        return aR("annotation_image_uri");
    }

    public AppContentAnnotation kM()
    {
        return new AppContentAnnotationEntity(this);
    }

    public String toString()
    {
        return AppContentAnnotationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentAnnotationEntity)kM()).writeToParcel(parcel, i);
    }
}
