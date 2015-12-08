// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import com.accuweather.android.models.location.LocationModel;

// Referenced classes of package com.accuweather.android.fragments:
//            LocationFragment

public static interface 
    extends com.accuweather.android.views.ner
{

    public abstract void onLocationAdded(String s, String s1, String s2, String s3, String s4);

    public abstract void onLocationLongPressed(LocationModel locationmodel);

    public abstract void onLocationSearch(String s);

    public abstract void onLocationSelected(LocationModel locationmodel, int i);

    public abstract void onMyLocationLongPressed();

    public abstract void onMyLocationSelected();
}
