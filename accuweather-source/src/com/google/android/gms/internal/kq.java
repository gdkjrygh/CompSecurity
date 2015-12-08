// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hz, kr, ko

public final class kq extends hz
    implements SafeParcelable, Moment
{

    public static final kr CREATOR = new kr();
    private static final HashMap aco;
    private final Set acp;
    private String adc;
    private ko adk;
    private ko adl;
    private String qU;
    private String xD;
    private final int xJ;

    public kq()
    {
        xJ = 1;
        acp = new HashSet();
    }

    kq(Set set, int i, String s, ko ko1, String s1, ko ko2, String s2)
    {
        acp = set;
        xJ = i;
        xD = s;
        adk = ko1;
        adc = s1;
        adl = ko2;
        qU = s2;
    }

    public kq(Set set, String s, ko ko1, String s1, ko ko2, String s2)
    {
        acp = set;
        xJ = 1;
        xD = s;
        adk = ko1;
        adc = s1;
        adl = ko2;
        qU = s2;
    }

    protected boolean a(hz.a a1)
    {
        return acp.contains(Integer.valueOf(a1.fI()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(hz.a a1)
    {
        switch (a1.fI())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fI()).toString());

        case 2: // '\002'
            return xD;

        case 4: // '\004'
            return adk;

        case 5: // '\005'
            return adc;

        case 6: // '\006'
            return adl;

        case 7: // '\007'
            return qU;
        }
    }

    public int describeContents()
    {
        kr kr1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kq))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kq)obj;
            hz.a a1;
label1:
            do
            {
                for (Iterator iterator = aco.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hz.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kq) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kq) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kq) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public HashMap fB()
    {
        return aco;
    }

    public Object freeze()
    {
        return ky();
    }

    public String getId()
    {
        return xD;
    }

    public ItemScope getResult()
    {
        return adk;
    }

    public String getStartDate()
    {
        return adc;
    }

    public ItemScope getTarget()
    {
        return adl;
    }

    public String getType()
    {
        return qU;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public boolean hasId()
    {
        return acp.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return acp.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return acp.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return acp.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return acp.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = aco.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hz.a a1 = (hz.a)iterator.next();
            if (a(a1))
            {
                int j = a1.fI();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    Set kf()
    {
        return acp;
    }

    ko kw()
    {
        return adk;
    }

    ko kx()
    {
        return adl;
    }

    public kq ky()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kr kr1 = CREATOR;
        kr.a(this, parcel, i);
    }

    static 
    {
        aco = new HashMap();
        aco.put("id", hz.a.j("id", 2));
        aco.put("result", hz.a.a("result", 4, com/google/android/gms/internal/ko));
        aco.put("startDate", hz.a.j("startDate", 5));
        aco.put("target", hz.a.a("target", 6, com/google/android/gms/internal/ko));
        aco.put("type", hz.a.j("type", 7));
    }
}
