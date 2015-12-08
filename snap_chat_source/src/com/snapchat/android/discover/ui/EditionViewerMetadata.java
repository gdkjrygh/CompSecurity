// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import TU;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.MediaState;

public class EditionViewerMetadata
    implements Parcelable
{
    public static final class a
    {

        public String a;
        public ChannelPage b;
        public String c;
        public MediaOpenOrigin d;
        public boolean e;
        public String f;
        public boolean g;
        public int h;
        public boolean i;
        public Uri j;
        public TU k;
        public int l;
        public int m;
        public int n;

        public final EditionViewerMetadata a()
        {
            return new EditionViewerMetadata(this, (byte)0);
        }

        public a()
        {
            d = MediaOpenOrigin.DISCOVER;
            h = -1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new EditionViewerMetadata(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i1)
        {
            return new EditionViewerMetadata[i1];
        }

    };
    public final MediaOpenOrigin a;
    public ChannelPage b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public int g;
    public boolean h;
    public TU i;
    public Uri j;
    public int k;
    public int l;
    public int m;
    private final String n;
    private int o;

    private EditionViewerMetadata(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        k = 0;
        l = 0;
        m = 0;
        n = parcel.readString();
        b = (ChannelPage)parcel.readParcelable(com/snapchat/android/discover/model/ChannelPage.getClassLoader());
        c = parcel.readString();
        a = MediaOpenOrigin.values()[parcel.readInt()];
        j = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        int i1 = parcel.readInt();
        boolean flag;
        if (i1 == -1)
        {
            i = null;
        } else
        {
            i = TU.values()[i1];
        }
        g = parcel.readInt();
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readString();
        o = parcel.readInt();
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        k = parcel.readInt();
        l = parcel.readInt();
        m = parcel.readInt();
    }

    EditionViewerMetadata(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private EditionViewerMetadata(a a1)
    {
        k = 0;
        l = 0;
        m = 0;
        n = a1.a;
        b = a1.b;
        c = a1.c;
        a = a1.d;
        j = a1.j;
        i = a1.k;
        g = a1.h;
        d = a1.e;
        e = a1.f;
        o = 0;
        f = a1.g;
        h = a1.i;
        k = a1.l;
        l = a1.m;
        m = a1.n;
    }

    EditionViewerMetadata(a a1, byte byte0)
    {
        this(a1);
    }

    public final int a(Resources resources)
    {
        if (b == null || b.j() == null && b.m() != MediaState.SUCCESS)
        {
            return resources.getColor(0x7f0c0050);
        } else
        {
            return b.g;
        }
    }

    public final String a()
    {
        if (n != null)
        {
            return n;
        } else
        {
            return null;
        }
    }

    public final String b()
    {
        if (b != null)
        {
            return b.j();
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("EditionMetadata [channel: %s, edition: %s, deeplink: %s]", new Object[] {
            b, c, j
        });
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(n);
        parcel.writeParcelable(b, 0);
        parcel.writeString(c);
        parcel.writeInt(a.ordinal());
        parcel.writeParcelable(j, 0);
        if (i == null)
        {
            i1 = -1;
        } else
        {
            i1 = i.ordinal();
        }
        parcel.writeInt(i1);
        parcel.writeInt(g);
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeString(e);
        parcel.writeInt(o);
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (h)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(k);
        parcel.writeInt(l);
        parcel.writeInt(m);
    }

}
