// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

// Referenced classes of package com.facebook.fbservice.service:
//            ae, t, af

public class OperationResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    private static final OperationResult a = new OperationResult();
    private final boolean b;
    private final String c;
    private final Bundle d;
    private final t e;
    private final String f;

    OperationResult()
    {
        b = true;
        c = null;
        d = null;
        e = t.NO_ERROR;
        f = null;
    }

    private OperationResult(Parcel parcel)
    {
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = parcel.readString();
        d = (Bundle)parcel.readParcelable(null);
        e = t.valueOf(parcel.readString());
        f = parcel.readString();
    }

    OperationResult(Parcel parcel, ae ae1)
    {
        this(parcel);
    }

    private OperationResult(t t1, String s, Bundle bundle)
    {
        b = false;
        c = null;
        d = bundle;
        e = t1;
        f = s;
    }

    private OperationResult(String s, Bundle bundle)
    {
        b = true;
        c = s;
        d = bundle;
        e = t.NO_ERROR;
        f = null;
    }

    public static OperationResult a(Parcelable parcelable)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("result", parcelable);
        return new OperationResult(((String) (null)), bundle);
    }

    public static transient OperationResult a(Parcelable parcelable, Pair apair[])
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("result", parcelable);
        int l = apair.length;
        for (int k = 0; k < l; k++)
        {
            parcelable = apair[k];
            bundle.putParcelable((String)((Pair) (parcelable)).first, (Parcelable)((Pair) (parcelable)).second);
        }

        return new OperationResult(((String) (null)), bundle);
    }

    public static OperationResult a(t t1)
    {
        return new OperationResult(t1, t1.toString(), null);
    }

    public static OperationResult a(t t1, Bundle bundle)
    {
        return new OperationResult(t1, t1.toString(), bundle);
    }

    public static OperationResult a(t t1, String s)
    {
        return new OperationResult(t1, s, null);
    }

    public static OperationResult a(String s)
    {
        return new OperationResult(s, ((Bundle) (null)));
    }

    public static OperationResult b()
    {
        return a;
    }

    public Parcelable b(String s)
    {
        if (d != null)
        {
            d.setClassLoader(getClass().getClassLoader());
        }
        if (d != null)
        {
            return d.getParcelable(s);
        } else
        {
            return null;
        }
    }

    public boolean c()
    {
        return b;
    }

    public t d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return c;
    }

    public Bundle g()
    {
        if (d != null)
        {
            d.setClassLoader(getClass().getClassLoader());
        }
        return d;
    }

    public Parcelable h()
    {
        Parcelable parcelable = i();
        if (parcelable == null)
        {
            throw new af();
        } else
        {
            return parcelable;
        }
    }

    public Parcelable i()
    {
        if (d != null)
        {
            d.setClassLoader(getClass().getClassLoader());
        }
        if (d != null)
        {
            return d.getParcelable("result");
        } else
        {
            return null;
        }
    }

    public Bundle j()
    {
        return d;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        int l;
        if (b)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeString(c);
        parcel.writeParcelable(d, k);
        parcel.writeString(e.toString());
        parcel.writeString(f);
    }

}
