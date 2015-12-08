// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.gson.StickerTranslation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            StickerBundle, InstallRequirement, n

public class PurchasableStickerBundle extends StickerBundle
    implements IGsonable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PurchasableStickerBundle a(Parcel parcel)
        {
            return new PurchasableStickerBundle(parcel);
        }

        public PurchasableStickerBundle[] a(int i1)
        {
            return new PurchasableStickerBundle[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private String a;
    private String c;
    private String d;
    private boolean e;
    private float f;
    private InstallRequirement g;
    private boolean h;
    private String i;
    private String j;
    private List k;
    private StickerTranslation l;
    private n m;
    private int n;
    private String o;

    protected PurchasableStickerBundle(Parcel parcel)
    {
        boolean flag1 = false;
        super();
        k = new ArrayList();
        a = parcel.readString();
        c = parcel.readString();
        boolean flag;
        if (parcel.readByte() == 1)
        {
            d = parcel.readString();
        } else
        {
            d = "";
        }
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = parcel.readFloat();
        g = (InstallRequirement)parcel.readParcelable(com/cardinalblue/android/piccollage/model/InstallRequirement.getClassLoader());
        flag = flag1;
        if (parcel.readByte() != 0)
        {
            flag = true;
        }
        h = flag;
        i = parcel.readString();
        j = parcel.readString();
        if (parcel.readByte() == 1)
        {
            k = new ArrayList();
            parcel.readList(k, java/lang/String.getClassLoader());
        } else
        {
            k = null;
        }
        l = (StickerTranslation)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/StickerTranslation.getClassLoader());
        m = (n)parcel.readValue(com/cardinalblue/android/piccollage/model/n.getClassLoader());
        n = parcel.readInt();
        o = parcel.readString();
    }

    public String a()
    {
        return c;
    }

    public String b()
    {
        String s;
        if (l == null || l.title == null)
        {
            s = c;
        } else
        {
            String s1 = (String)l.title.get(com.cardinalblue.android.b.k.i());
            s = s1;
            if (s1 == null)
            {
                return c;
            }
        }
        return s;
    }

    public String c()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return "";
        }
    }

    public float d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return j;
    }

    public String f()
    {
        return a;
    }

    public boolean g()
    {
        return false;
    }

    public n h()
    {
        return m;
    }

    public boolean i()
    {
        return e;
    }

    public List j()
    {
        b = new ArrayList();
        Sticker sticker;
        for (Iterator iterator = k.iterator(); iterator.hasNext(); b.add(sticker))
        {
            sticker = Sticker.newInstance((String)iterator.next());
        }

        return b;
    }

    public InstallRequirement k()
    {
        return g;
    }

    public String l()
    {
        return f().toLowerCase(Locale.US);
    }

    public String m()
    {
        return i;
    }

    public String n()
    {
        return o;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(c);
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        parcel.writeByte((byte)j1);
        if (d != null)
        {
            parcel.writeString(d);
        }
        if (e)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeByte((byte)j1);
        parcel.writeFloat(f);
        parcel.writeParcelable(g, i1);
        if (h)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeByte((byte)j1);
        parcel.writeString(i);
        parcel.writeString(j);
        if (k == null)
        {
            parcel.writeByte((byte)0);
        } else
        {
            parcel.writeByte((byte)1);
            parcel.writeList(k);
        }
        parcel.writeParcelable(l, i1);
        parcel.writeValue(m);
        parcel.writeInt(n);
        parcel.writeString(o);
    }

}
