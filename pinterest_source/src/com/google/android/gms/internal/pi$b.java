// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pl, ko

public final class apI extends ks
    implements com.google.android.gms.plus.model.people.n.Cover
{

    public static final pl CREATOR = new pl();
    private static final HashMap aom;
    final int CK;
    final Set aon;
    a apG;
    b apH;
    int apI;

    protected final boolean a(ple.n.Cover cover)
    {
        return aon.contains(Integer.valueOf(cover.hR()));
    }

    protected final Object b(hR hr)
    {
        switch (hr.hR())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(hr.hR()).toString());

        case 2: // '\002'
            return apG;

        case 3: // '\003'
            return apH;

        case 4: // '\004'
            return Integer.valueOf(apI);
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof apI))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (apI)obj;
            apI api;
label1:
            do
            {
                for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                {
                    api = (aom)iterator.next();
                    if (!a(api))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(api))
                    {
                        if (!b(api).equals(((b) (obj)).b(api)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(api));
            return false;
        }
        return true;
    }

    public final Object freeze()
    {
        return oN();
    }

    public final com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return apG;
    }

    public final com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return apH;
    }

    public final int getLayout()
    {
        return apI;
    }

    public final HashMap hK()
    {
        return aom;
    }

    public final boolean hasCoverInfo()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public final boolean hasCoverPhoto()
    {
        return aon.contains(Integer.valueOf(3));
    }

    public final boolean hasLayout()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public final int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            aon aon1 = (aom)iterator.next();
            if (a(aon1))
            {
                int j = aon1.hR();
                i = b(aon1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final b oN()
    {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        pl.a(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        aom = hashmap;
        hashmap.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/pi$b$a));
        aom.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/pi$b$b));
        aom.put("layout", a("layout", 4, (new ko()).h("banner", 0), false));
    }

    public b()
    {
        CK = 1;
        aon = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        aon = set;
        CK = i;
        apG = a1;
        apH = b1;
        apI = j;
    }
}
