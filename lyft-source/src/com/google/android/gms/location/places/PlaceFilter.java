// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zza, zzf

public final class PlaceFilter extends zza
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    final int a;
    final List b;
    final boolean c;
    final List d;
    final List e;
    private final Set f;
    private final Set g;
    private final Set h;

    public PlaceFilter()
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        a = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        b = list;
        c = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        d = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        e = list;
        f = a(b);
        g = a(d);
        h = a(e);
    }

    public PlaceFilter(Collection collection, boolean flag, Collection collection1, Collection collection2)
    {
        this(0, a(collection), flag, a(collection1), a(collection2));
    }

    public PlaceFilter(boolean flag, Collection collection)
    {
        this(null, flag, collection, null);
    }

    public static PlaceFilter d()
    {
        return (new zza()).a();
    }

    public Set a()
    {
        return h;
    }

    public Set b()
    {
        return f;
    }

    public Set c()
    {
        return g;
    }

    public int describeContents()
    {
        zzf zzf1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceFilter))
            {
                return false;
            }
            obj = (PlaceFilter)obj;
            if (!f.equals(((PlaceFilter) (obj)).f) || c != ((PlaceFilter) (obj)).c || !g.equals(((PlaceFilter) (obj)).g) || !h.equals(((PlaceFilter) (obj)).h))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            f, Boolean.valueOf(c), g, h
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.a(this);
        if (!f.isEmpty())
        {
            zza1.a("types", f);
        }
        zza1.a("requireOpenNow", Boolean.valueOf(c));
        if (!h.isEmpty())
        {
            zza1.a("placeIds", h);
        }
        if (!g.isEmpty())
        {
            zza1.a("requestedUserDataTypes", g);
        }
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf zzf1 = CREATOR;
        zzf.a(this, parcel, i);
    }


    private class zza
    {

        private Collection a;
        private boolean b;
        private Collection c;
        private String d[];

        public PlaceFilter a()
        {
            List list = null;
            ArrayList arraylist;
            ArrayList arraylist1;
            if (a != null)
            {
                arraylist = new ArrayList(a);
            } else
            {
                arraylist = null;
            }
            if (c != null)
            {
                arraylist1 = new ArrayList(c);
            } else
            {
                arraylist1 = null;
            }
            if (d != null)
            {
                list = Arrays.asList(d);
            }
            return new PlaceFilter(arraylist, b, list, arraylist1);
        }

        private zza()
        {
            a = null;
            b = false;
            c = null;
            d = null;
        }

    }

}
