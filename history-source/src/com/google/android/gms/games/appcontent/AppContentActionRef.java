// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentAction, AppContentActionEntity, AppContentUtils

public final class AppContentActionRef extends MultiDataBufferRef
    implements AppContentAction
{

    AppContentActionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 1, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentActionEntity.a(this, obj);
    }

    public Object freeze()
    {
        return kK();
    }

    public Bundle getExtras()
    {
        return AppContentUtils.d(JG, XX, "action_data", KZ);
    }

    public String getLabel()
    {
        return getString("action_label");
    }

    public String getType()
    {
        return getString("action_type");
    }

    public int hashCode()
    {
        return AppContentActionEntity.a(this);
    }

    public List kH()
    {
        return AppContentUtils.c(JG, XX, "action_conditions", KZ);
    }

    public String kI()
    {
        return getString("action_content_description");
    }

    public String kJ()
    {
        return getString("action_label_style");
    }

    public AppContentAction kK()
    {
        return new AppContentActionEntity(this);
    }

    public String toString()
    {
        return AppContentActionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentActionEntity)kK()).writeToParcel(parcel, i);
    }
}
