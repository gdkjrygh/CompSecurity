// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentSection, AppContentSectionEntity, AppContentUtils, 
//            AppContentCardRef

public final class AppContentSectionRef extends MultiDataBufferRef
    implements AppContentSection
{

    private final int Ya;

    AppContentSectionRef(ArrayList arraylist, int i, int j)
    {
        super(arraylist, 0, i);
        Ya = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentSectionEntity.a(this, obj);
    }

    public Object freeze()
    {
        return la();
    }

    public List getActions()
    {
        return lb();
    }

    public String getTitle()
    {
        return getString("section_title");
    }

    public String getType()
    {
        return getString("section_type");
    }

    public int hashCode()
    {
        return AppContentSectionEntity.a(this);
    }

    public String kI()
    {
        return getString("section_content_description");
    }

    public Bundle kP()
    {
        return AppContentUtils.d(JG, XX, "section_data", KZ);
    }

    public String kQ()
    {
        return getString("section_subtitle");
    }

    public Uri kY()
    {
        return aR("section_background_image_uri");
    }

    public List kZ()
    {
        return lc();
    }

    public AppContentSection la()
    {
        return new AppContentSectionEntity(this);
    }

    public ArrayList lb()
    {
        return AppContentUtils.a(JG, XX, "section_actions", KZ);
    }

    public ArrayList lc()
    {
        ArrayList arraylist = new ArrayList(Ya);
        for (int i = 0; i < Ya; i++)
        {
            arraylist.add(new AppContentCardRef(XX, KZ + i));
        }

        return arraylist;
    }

    public String toString()
    {
        return AppContentSectionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentSectionEntity)la()).writeToParcel(parcel, i);
    }
}
