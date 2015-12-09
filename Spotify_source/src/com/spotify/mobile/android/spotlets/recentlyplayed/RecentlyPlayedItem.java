// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.recentlyplayed;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import cur;
import epq;
import gen;
import gpl;

public class RecentlyPlayedItem
    implements Parcelable, JacksonModel, epq
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new RecentlyPlayedItem(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new RecentlyPlayedItem[i];
        }

    };
    private static final ImmutableMap TYPES;
    public String artistName;
    public boolean available;
    public String collectionLink;
    public String imageUri;
    public boolean inCollection;
    public boolean isCollaborative;
    public boolean isFollowing;
    public boolean isLoading;
    public boolean isOwnedBySelf;
    public boolean isStarred;
    public boolean isTopTracks;
    public String itemLink;
    public String link;
    private String mOffline;
    private String mType;
    public String name;
    public String navigationLink;
    public int numTracks;
    public int offlineState;
    public String ownerName;
    public String publisher;
    public int syncProgress;
    public int tracksInCollectionCount;
    public int tracksOfflineCount;
    public Type type;

    private RecentlyPlayedItem(Parcel parcel)
    {
        itemLink = parcel.readString();
        link = parcel.readString();
        collectionLink = parcel.readString();
        name = parcel.readString();
        imageUri = parcel.readString();
        mType = parcel.readString();
        mOffline = parcel.readString();
        ownerName = parcel.readString();
        publisher = parcel.readString();
        artistName = parcel.readString();
        available = gen.a(parcel);
        isCollaborative = gen.a(parcel);
        isLoading = gen.a(parcel);
        isOwnedBySelf = gen.a(parcel);
        isFollowing = gen.a(parcel);
        inCollection = gen.a(parcel);
        numTracks = parcel.readInt();
        tracksOfflineCount = parcel.readInt();
        tracksInCollectionCount = parcel.readInt();
        syncProgress = parcel.readInt();
        populateDerived();
    }


    public RecentlyPlayedItem(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, int i, int j, int k, int l)
    {
        itemLink = s;
        link = s1;
        collectionLink = s2;
        name = s3;
        imageUri = s4;
        mType = s5;
        mOffline = s6;
        ownerName = s7;
        publisher = s8;
        artistName = s9;
        available = flag;
        isCollaborative = flag1;
        isLoading = flag2;
        isOwnedBySelf = flag3;
        isFollowing = flag4;
        inCollection = flag5;
        numTracks = i;
        tracksOfflineCount = j;
        tracksInCollectionCount = k;
        syncProgress = l;
        populateDerived();
    }

    private void populateDerived()
    {
        boolean flag1 = true;
        offlineState = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(mOffline);
        Object obj = TYPES.get(mType);
        Type type1 = Type.f;
        boolean flag;
        if (obj == null)
        {
            obj = type1;
        }
        type = (Type)obj;
        obj = (new SpotifyLink(link)).c;
        if (obj == com.spotify.mobile.android.util.SpotifyLink.LinkType.aO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isStarred = flag;
        if (obj == com.spotify.mobile.android.util.SpotifyLink.LinkType.aS)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isTopTracks = flag;
        if (tracksInCollectionCount > 0 || inCollection)
        {
            navigationLink = collectionLink;
            return;
        } else
        {
            navigationLink = link;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getImageUri()
    {
        return imageUri;
    }

    public String getSubtitle(Flags flags, Context context)
    {
        flags = context.getResources().getString(0x7f0803e1);
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Type.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Type.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Type.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 84
    //                   2 141
    //                   3 170
    //                   4 188
    //                   5 217;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        Assertion.a((new StringBuilder("Unknown type with link: ")).append(link).toString());
        flags = "";
_L8:
        return flags;
_L2:
        if (isLoading()) goto _L8; else goto _L7
_L7:
        if (!isOwnedBySelf && !TextUtils.isEmpty(ownerName))
        {
            return context.getResources().getString(0x7f080451, new Object[] {
                ownerName
            });
        } else
        {
            return context.getResources().getString(0x7f080450);
        }
_L3:
        if (isLoading()) goto _L8; else goto _L9
_L9:
        return context.getResources().getString(0x7f08044e, new Object[] {
            artistName
        });
_L4:
        if (isLoading()) goto _L8; else goto _L10
_L10:
        return context.getResources().getString(0x7f08044f);
_L5:
        if (isLoading()) goto _L8; else goto _L11
_L11:
        return context.getResources().getString(0x7f080452, new Object[] {
            publisher
        });
_L6:
        return gpl.a(context, new SpotifyLink(gpl.c(link)));
    }

    public String getTargetUri(Flags flags)
    {
        return navigationLink;
    }

    public String getTitle()
    {
        return name;
    }

    public boolean isLoading()
    {
        switch (_cls2.a[type.ordinal()])
        {
        default:
            Assertion.a((new StringBuilder("Unknown type with link: ")).append(link).toString());
            return false;

        case 1: // '\001'
            return TextUtils.isEmpty(link);

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return TextUtils.isEmpty(name);
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(itemLink);
        parcel.writeString(link);
        parcel.writeString(collectionLink);
        parcel.writeString(name);
        parcel.writeString(imageUri);
        parcel.writeString(mType);
        parcel.writeString(mOffline);
        parcel.writeString(ownerName);
        parcel.writeString(publisher);
        parcel.writeString(artistName);
        gen.a(parcel, available);
        gen.a(parcel, isCollaborative);
        gen.a(parcel, isLoading);
        gen.a(parcel, isOwnedBySelf);
        gen.a(parcel, isFollowing);
        gen.a(parcel, inCollection);
        parcel.writeInt(numTracks);
        parcel.writeInt(tracksOfflineCount);
        parcel.writeInt(tracksInCollectionCount);
        parcel.writeInt(syncProgress);
    }

    static 
    {
        TYPES = ImmutableMap.i().a("album", Type.a).a("artist", Type.b).a("playlist", Type.c).a("starred", Type.c).a("publishedstarred", Type.c).a("toplist", Type.c).a("show", Type.d).a("radio", Type.e).a("station", Type.e).a();
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        private static final Type g[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/recentlyplayed/RecentlyPlayedItem$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])g.clone();
        }

        static 
        {
            a = new Type("ALBUM", 0);
            b = new Type("ARTIST", 1);
            c = new Type("PLAYLIST", 2);
            d = new Type("SHOW", 3);
            e = new Type("RADIO", 4);
            f = new Type("UNKNOWN", 5);
            g = (new Type[] {
                a, b, c, d, e, f
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
