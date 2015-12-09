// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.item.PorcelainCardItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import dpa;
import dpi;
import dpn;
import drz;
import dsi;
import dsn;
import ghl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartsBlockItem

public class ChartsBlockCardItem extends ChartsBlockItem
    implements JacksonModel, PorcelainCardItem
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            ArrayList arraylist = new ArrayList();
            parcel.readStringList(arraylist);
            return new ChartsBlockCardItem(s, s1, s2, arraylist);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartsBlockCardItem[i];
        }

    };

    public ChartsBlockCardItem(String s, String s1, String s2, List list)
    {
        super(s, s1, s2, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public PorcelainImage getImage()
    {
        dpi dpi1 = dpa.a(PorcelainIcon.j);
        String s;
        if (imageUrls.size() > 0)
        {
            s = (String)imageUrls.get(0);
        } else
        {
            s = null;
        }
        dpi1.a = s;
        return dpi1.a();
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsn getInfo()
    {
        return (dsn)c.a(this);
    }

    public PorcelainNavigationLink getLongClickLink()
    {
        return null;
    }

    public int getMaxRows()
    {
        return -1;
    }

    public drz getPlayable()
    {
        return null;
    }

    public Iterable getPlayables()
    {
        return Collections.emptySet();
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

    public volatile Object getText()
    {
        return getText();
    }

    public com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle getTextStyle()
    {
        return com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.a;
    }

    public int getType()
    {
        return 0x7f1100ed;
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
