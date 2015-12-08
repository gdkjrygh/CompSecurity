// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import cur;
import dru;
import gen;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.subitem:
//            PorcelainJsonImage, PorcelainJsonNavigationLink

public class PorcelainJsonAccessory
    implements Parcelable, JacksonModel, dru
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            PorcelainJsonImage porcelainjsonimage = (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonImage.getClassLoader());
            PorcelainJsonNavigationLink porcelainjsonnavigationlink = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
            parcel = gen.e(parcel).fields();
            cur cur1 = ImmutableMap.i();
            for (; parcel.hasNext(); cur1.a((java.util.Map.Entry)parcel.next())) { }
            return new PorcelainJsonAccessory(porcelainjsonimage, porcelainjsonnavigationlink, cur1.a());
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonAccessory[i];
        }

    };
    private static final String EXTENSIONS = "extensions";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_LINK = "link";
    private final Map mExtensions;
    private final PorcelainJsonImage mImage;
    private final PorcelainJsonNavigationLink mLink;

    public PorcelainJsonAccessory(PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, Map map)
    {
        mImage = (PorcelainJsonImage)ctz.a(porcelainjsonimage);
        if (map != null)
        {
            porcelainjsonimage = ImmutableMap.a(map);
        } else
        {
            porcelainjsonimage = ImmutableMap.h();
        }
        mExtensions = porcelainjsonimage;
        mLink = porcelainjsonnavigationlink;
    }

    public int describeContents()
    {
        return 0;
    }

    public Map getExtensions()
    {
        return mExtensions;
    }

    public final PorcelainJsonImage getImage()
    {
        return mImage;
    }

    public volatile PorcelainImage getImage()
    {
        return getImage();
    }

    public final PorcelainJsonNavigationLink getLink()
    {
        return mLink;
    }

    public volatile PorcelainNavigationLink getLink()
    {
        return getLink();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mImage, i);
        parcel.writeParcelable(mLink, i);
        gen.a(parcel, JsonNodeFactory.instance.objectNode().setAll(mExtensions));
    }

}
