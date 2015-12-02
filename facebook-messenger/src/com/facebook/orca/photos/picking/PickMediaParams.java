// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.MediaResource;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.photos.picking:
//            b, j

public class PickMediaParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private static final EnumSet a;
    private String b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private EnumSet h;
    private List i;

    private PickMediaParams(Parcel parcel)
    {
        int k = 0;
        super();
        b = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readInt();
        g = parcel.readInt();
        h = EnumSet.noneOf(com/facebook/orca/photos/picking/b);
        for (int l = parcel.readInt(); k < l; k++)
        {
            h.add(com.facebook.orca.photos.picking.b.valueOf(parcel.readString()));
        }

        i = parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader());
    }

    PickMediaParams(Parcel parcel, j j1)
    {
        this(parcel);
    }

    public PickMediaParams(boolean flag)
    {
        b = "";
        EnumSet enumset;
        if (flag)
        {
            enumset = EnumSet.copyOf(a);
        } else
        {
            enumset = EnumSet.noneOf(com/facebook/orca/photos/picking/b);
        }
        h = enumset;
    }

    public PickMediaParams a(int k)
    {
        d = k;
        return this;
    }

    public PickMediaParams a(b b1)
    {
        h.add(b1);
        return this;
    }

    public PickMediaParams a(String s)
    {
        b = s;
        return this;
    }

    public PickMediaParams a(List list)
    {
        i = list;
        return this;
    }

    public PickMediaParams a(boolean flag)
    {
        c = flag;
        return this;
    }

    public String a()
    {
        return b;
    }

    public PickMediaParams b(int k)
    {
        e = k;
        return this;
    }

    public boolean b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public PickMediaParams c(int k)
    {
        f = k;
        return this;
    }

    public int d()
    {
        return e;
    }

    public PickMediaParams d(int k)
    {
        g = k;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return f;
    }

    public int f()
    {
        return g;
    }

    public EnumSet g()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(b);
        if (c)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        parcel.writeInt(k);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
        parcel.writeInt(h.size());
        for (Iterator iterator = h.iterator(); iterator.hasNext(); parcel.writeString(((b)iterator.next()).name())) { }
        parcel.writeList(i);
    }

    static 
    {
        a = EnumSet.of(b.CAMERA, b.GALLERY, b.IMAGE_SEARCH);
    }
}
