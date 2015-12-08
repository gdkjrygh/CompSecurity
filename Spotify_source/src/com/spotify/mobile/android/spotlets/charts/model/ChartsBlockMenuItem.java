// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.item.PorcelainCellItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import dpa;
import dph;
import dpn;
import dru;
import drz;
import dsi;
import dsn;
import ghl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartsBlockItem

public class ChartsBlockMenuItem extends ChartsBlockItem
    implements JacksonModel, PorcelainCellItem
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            ArrayList arraylist = new ArrayList();
            parcel.readStringList(arraylist);
            return new ChartsBlockMenuItem(s, s1, s2, arraylist);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartsBlockMenuItem[i];
        }

    };

    public ChartsBlockMenuItem(String s, String s1, String s2, List list)
    {
        super(s, s1, s2, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public dru getAccessoryLeft()
    {
        PorcelainIcon porcelainicon;
        if (TextUtils.equals(name, "regional"))
        {
            porcelainicon = PorcelainIcon.d;
        } else
        {
            porcelainicon = PorcelainIcon.p;
        }
        return dpa.a(dpa.a(porcelainicon)).a();
    }

    public dru getAccessoryRight()
    {
        return null;
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsn getInfo()
    {
        return (dsn)b.a(this);
    }

    public PorcelainNavigationLink getLongClickLink()
    {
        return null;
    }

    public drz getPlayable()
    {
        return null;
    }

    public Iterable getPlayables()
    {
        return Collections.emptySet();
    }

    public com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize getSize()
    {
        return com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.a;
    }

    public PorcelainText getText()
    {
        dpn dpn1 = new dpn();
        String s = title;
        if (s == null)
        {
            s = "";
        }
        return dpn1.a(dpa.b((String)s)).a();
    }

    public int getType()
    {
        return getSize().type;
    }

    public boolean isEnabled()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(uri);
        parcel.writeString(title);
        parcel.writeString(name);
        parcel.writeStringList(imageUrls);
    }

}
