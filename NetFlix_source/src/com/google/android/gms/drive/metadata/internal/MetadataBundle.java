// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            f, c

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final Bundle FQ;
    final int xH;

    MetadataBundle(int i, Bundle bundle)
    {
        xH = i;
        FQ = (Bundle)fq.f(bundle);
        FQ.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = FQ.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (c.ax(s1) == null)
            {
                bundle.add(s1);
                Log.w("MetadataBundle", (new StringBuilder()).append("Ignored unknown metadata field in bundle: ").append(s1).toString());
            }
        } while (true);
        String s;
        for (bundle = bundle.iterator(); bundle.hasNext(); FQ.remove(s))
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
        MetadataBundle metadatabundle = fT();
        metadatabundle.b(metadatafield, obj);
        return metadatabundle;
    }

    public static MetadataBundle a(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.FQ));
    }

    public static MetadataBundle fT()
    {
        return new MetadataBundle(new Bundle());
    }

    public Object a(MetadataField metadatafield)
    {
        return metadatafield.d(FQ);
    }

    public void b(MetadataField metadatafield, Object obj)
    {
        if (c.ax(metadatafield.getName()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unregistered field: ").append(metadatafield.getName()).toString());
        } else
        {
            metadatafield.a(obj, FQ);
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
        Object obj1 = FQ.keySet();
        if (!obj1.equals(((MetadataBundle) (obj)).FQ.keySet()))
        {
            return false;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            String s = (String)((Iterator) (obj1)).next();
            if (!fo.equal(FQ.get(s), ((MetadataBundle) (obj)).FQ.get(s)))
            {
                return false;
            }
        }

        return true;
    }

    public Set fU()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = FQ.keySet().iterator(); iterator.hasNext(); hashset.add(c.ax((String)iterator.next()))) { }
        return hashset;
    }

    public int hashCode()
    {
        Iterator iterator = FQ.keySet().iterator();
        String s;
        int i;
        for (i = 1; iterator.hasNext(); i = FQ.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MetadataBundle [values=").append(FQ).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
