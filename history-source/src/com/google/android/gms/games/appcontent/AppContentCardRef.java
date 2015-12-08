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
//            MultiDataBufferRef, AppContentCard, AppContentCardEntity, AppContentUtils

public final class AppContentCardRef extends MultiDataBufferRef
    implements AppContentCard
{

    AppContentCardRef(ArrayList arraylist, int i)
    {
        super(arraylist, 0, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentCardEntity.a(this, obj);
    }

    public Object freeze()
    {
        return kS();
    }

    public List getActions()
    {
        return AppContentUtils.a(JG, XX, "card_actions", KZ);
    }

    public String getDescription()
    {
        return getString("card_description");
    }

    public Uri getIconImageUri()
    {
        return aR("card_icon_image_uri");
    }

    public String getTitle()
    {
        return getString("card_title");
    }

    public String getType()
    {
        return getString("card_type");
    }

    public int hashCode()
    {
        return AppContentCardEntity.a(this);
    }

    public List kH()
    {
        return AppContentUtils.c(JG, XX, "card_conditions", KZ);
    }

    public String kI()
    {
        return getString("card_content_description");
    }

    public Uri kL()
    {
        return aR("card_image_uri");
    }

    public List kN()
    {
        return AppContentUtils.b(JG, XX, "card_annotations", KZ);
    }

    public int kO()
    {
        return getInteger("card_current_steps");
    }

    public Bundle kP()
    {
        return AppContentUtils.d(JG, XX, "card_data", KZ);
    }

    public String kQ()
    {
        return getString("card_subtitle");
    }

    public int kR()
    {
        return getInteger("card_total_steps");
    }

    public AppContentCard kS()
    {
        return new AppContentCardEntity(this);
    }

    public String toString()
    {
        return AppContentCardEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentCardEntity)kS()).writeToParcel(parcel, i);
    }
}
