// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public final class ery extends ArrayAdapter
{

    public ery(Context context)
    {
        super(context, 0);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location location = (com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Locations.Location)getItem(i);
        dhu dhu1 = dhu.b(view);
        view = dhu1;
        if (dhu1 == null)
        {
            view = dhv.a(getContext(), viewgroup);
            view.e(true);
        }
        ((dhw)view.u()).a(location.getLocationName());
        view.v().setTag(location);
        return view.v();
    }
}
