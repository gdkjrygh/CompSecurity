// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.w;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ln;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            h, e

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    final int CK;
    final Bundle Ri;

    MetadataBundle(int i, Bundle bundle)
    {
        CK = i;
        Ri = (Bundle)jx.i(bundle);
        Ri.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = Ri.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (e.bm(s1) == null)
            {
                bundle.add(s1);
                w.o("MetadataBundle", (new StringBuilder()).append("Ignored unknown metadata field in bundle: ").append(s1).toString());
            }
        } while (true);
        String s;
        for (bundle = bundle.iterator(); bundle.hasNext(); Ri.remove(s))
        {
            s = (String)bundle.next();
        }

    }

    private MetadataBundle(Bundle bundle)
    {
        this(1, bundle);
    }

    public static MetadataBundle a(MetadataField metadatafield, Object obj)
    {
        MetadataBundle metadatabundle = iZ();
        metadatabundle.b(metadatafield, obj);
        return metadatabundle;
    }

    public static MetadataBundle a(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.Ri));
    }

    public static MetadataBundle iZ()
    {
        return new MetadataBundle(new Bundle());
    }

    public Object a(MetadataField metadatafield)
    {
        return metadatafield.h(Ri);
    }

    public void b(MetadataField metadatafield, Object obj)
    {
        if (e.bm(metadatafield.getName()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unregistered field: ").append(metadatafield.getName()).toString());
        } else
        {
            metadatafield.a(obj, Ri);
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MetadataBundle))
        {
            return false;
        }
        obj = (MetadataBundle)obj;
        Object obj1 = Ri.keySet();
        if (!((Set) (obj1)).equals(((MetadataBundle) (obj)).Ri.keySet()))
        {
            return false;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            String s = (String)((Iterator) (obj1)).next();
            if (!jv.equal(Ri.get(s), ((MetadataBundle) (obj)).Ri.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public int hashCode()
    {
        Iterator iterator = Ri.keySet().iterator();
        String s;
        int i;
        for (i = 1; iterator.hasNext(); i = Ri.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public Set ja()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = Ri.keySet().iterator(); iterator.hasNext(); hashset.add(e.bm((String)iterator.next()))) { }
        return hashset;
    }

    public void setContext(Context context)
    {
        a a1 = (a)a(ln.RI);
        if (a1 != null)
        {
            a1.a(context.getCacheDir());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetadataBundle [values=").append(Ri).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.h.a(this, parcel, i);
    }

}
