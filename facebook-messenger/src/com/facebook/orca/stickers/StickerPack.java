// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.stickers:
//            j, Sticker

public class StickerPack
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final String a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final es j;

    private StickerPack(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = Uri.parse(parcel.readString());
        e = Uri.parse(parcel.readString());
        f = Uri.parse(parcel.readString());
        g = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
        j = es.a(parcel.readArrayList(com/facebook/orca/stickers/Sticker.getClassLoader()));
    }

    StickerPack(Parcel parcel, j j1)
    {
        this(parcel);
    }

    public StickerPack(String s, String s1, String s2, Uri uri, Uri uri1, Uri uri2, int k, 
            boolean flag, boolean flag1, List list)
    {
        a = s;
        b = s1;
        c = s2;
        d = uri;
        e = uri1;
        f = uri2;
        g = k;
        h = flag;
        i = flag1;
        j = es.a(list);
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public Uri d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof StickerPack)) 
        {
            return false;
        }
        obj = (StickerPack)obj;
        return a().equals(((StickerPack) (obj)).a());
    }

    public Uri f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean i()
    {
        return i;
    }

    public es j()
    {
        return j;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d.toString());
        parcel.writeString(e.toString());
        parcel.writeString(f.toString());
        parcel.writeInt(g);
        if (h)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        if (i)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        parcel.writeList(j);
    }

}
