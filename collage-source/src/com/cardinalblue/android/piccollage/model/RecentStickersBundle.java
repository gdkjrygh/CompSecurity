// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.Context;
import android.os.Parcel;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            StickerBundle, n, InstallRequirement

public class RecentStickersBundle extends StickerBundle
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RecentStickersBundle a(Parcel parcel)
        {
            return new RecentStickersBundle(parcel);
        }

        public RecentStickersBundle[] a(int l)
        {
            return new RecentStickersBundle[l];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int l)
        {
            return a(l);
        }

    };

    public RecentStickersBundle()
    {
    }

    public RecentStickersBundle(Parcel parcel)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        parcel.readTypedList(b, Sticker.CREATOR);
    }

    public String a()
    {
        return com.cardinalblue.android.b.k.a().getString(0x7f07028d);
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        Sticker sticker;
        for (list = list.iterator(); list.hasNext(); arraylist.add(sticker))
        {
            sticker = ((Sticker)list.next()).clone();
            sticker.setTag(2);
        }

        break MISSING_BLOCK_LABEL_60;
        list;
        throw list;
        b = arraylist;
        this;
        JVM INSTR monitorexit ;
    }

    public String b()
    {
        return com.cardinalblue.android.b.k.a().getString(0x7f07028d);
    }

    public String c()
    {
        return "";
    }

    public float d()
    {
        return 0.0F;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return com.cardinalblue.android.piccollage.lib.e.a.f.b(String.valueOf(0x7f0202c7));
    }

    public String f()
    {
        return "com.cardinalblue.piccollage.recent";
    }

    public boolean g()
    {
        return true;
    }

    public n h()
    {
        return null;
    }

    public boolean i()
    {
        return true;
    }

    public List j()
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        return b;
    }

    public InstallRequirement k()
    {
        return null;
    }

    public int m()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeTypedList(b);
    }

}
