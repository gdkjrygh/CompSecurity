// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.porcelain.PorcelainPage;
import com.spotify.mobile.android.porcelain.json.PorcelainJsonPage;

public abstract class doq extends dop
{

    public doq()
    {
        super(com/spotify/mobile/android/porcelain/json/PorcelainJsonPage);
    }

    protected final volatile Parcelable a(PorcelainPage porcelainpage)
    {
        return (PorcelainJsonPage)porcelainpage;
    }

    protected final volatile PorcelainPage a(Parcelable parcelable)
    {
        return (PorcelainJsonPage)parcelable;
    }

    protected final volatile void a(Parcelable parcelable, View view)
    {
        super.a((PorcelainJsonPage)parcelable, (dsz)view);
    }

    public View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.c(layoutinflater, viewgroup, bundle);
    }
}
