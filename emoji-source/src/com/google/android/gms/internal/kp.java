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
//            hy, kq, kn

public final class kp extends hy
    implements SafeParcelable, Moment
{

    public static final kq CREATOR = new kq();
    private static final HashMap acr;
    private final Set acs;
    private String adf;
    private kn adn;
    private kn ado;
    private String qX;
    private String xG;
    private final int xM;

    public kp()
    {
        xM = 1;
        acs = new HashSet();
    }

    kp(Set set, int i, String s, kn kn1, String s1, kn kn2, String s2)
    {
        acs = set;
        xM = i;
        xG = s;
        adn = kn1;
        adf = s1;
        ado = kn2;
        qX = s2;
    }

    public kp(Set set, String s, kn kn1, String s1, kn kn2, String s2)
    {
        acs = set;
        xM = 1;
        xG = s;
        adn = kn1;
        adf = s1;
        ado = kn2;
        qX = s2;
    }

    protected boolean a(hy.a a1)
    {
        return acs.contains(Integer.valueOf(a1.fN()));
    }

    protected Object aF(String s)
    {
        return null;
    }

    protected boolean aG(String s)
    {
        return false;
    }

    protected Object b(hy.a a1)
    {
        switch (a1.fN())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.fN()).toString());

        case 2: // '\002'
            return xG;

        case 4: // '\004'
            return adn;

        case 5: // '\005'
            return adf;

        case 6: // '\006'
            return ado;

        case 7: // '\007'
            return qX;
        }
    }

    public int describeContents()
    {
        kq kq1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kp))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kp)obj;
            hy.a a1;
label1:
            do
            {
                for (Iterator iterator = acr.values().iterator(); iterator.hasNext();)
                {
                    a1 = (hy.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kp) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kp) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kp) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public HashMap fG()
    {
        return acr;
    }

    public Object freeze()
    {
        return kD();
    }

    public String getId()
    {
        return xG;
    }

    public ItemScope getResult()
    {
        return adn;
    }

    public String getStartDate()
    {
        return adf;
    }

    public ItemScope getTarget()
    {
        return ado;
    }

    public String getType()
    {
        return qX;
    }

    int getVersionCode()
    {
        return xM;
    }

    public boolean hasId()
    {
        return acs.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return acs.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return acs.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return acs.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return acs.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = acr.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hy.a a1 = (hy.a)iterator.next();
            if (a(a1))
            {
                int j = a1.fN();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    kn kB()
    {
        return adn;
    }

    kn kC()
    {
        return ado;
    }

    public kp kD()
    {
        return this;
    }

    Set kk()
    {
        return acs;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kq kq1 = CREATOR;
        kq.a(this, parcel, i);
    }

    static 
    {
        acr = new HashMap();
        acr.put("id", hy.a.j("id", 2));
        acr.put("result", hy.a.a("result", 4, com/google/android/gms/internal/kn));
        acr.put("startDate", hy.a.j("startDate", 5));
        acr.put("target", hy.a.a("target", 6, com/google/android/gms/internal/kn));
        acr.put("type", hy.a.j("type", 7));
    }
}
