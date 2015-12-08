// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ks, pg, pd

public final class pf extends ks
    implements Moment
{

    public static final pg CREATOR = new pg();
    private static final HashMap aom;
    String CE;
    final int CK;
    final Set aon;
    String apa;
    pd api;
    pd apj;
    String vc;

    public pf()
    {
        CK = 1;
        aon = new HashSet();
    }

    pf(Set set, int i, String s, pd pd1, String s1, pd pd2, String s2)
    {
        aon = set;
        CK = i;
        CE = s;
        api = pd1;
        apa = s1;
        apj = pd2;
        vc = s2;
    }

    public pf(Set set, String s, pd pd1, String s1, pd pd2, String s2)
    {
        aon = set;
        CK = 1;
        CE = s;
        api = pd1;
        apa = s1;
        apj = pd2;
        vc = s2;
    }

    protected boolean a(kr.a a1)
    {
        return aon.contains(Integer.valueOf(a1.hR()));
    }

    protected Object b(kr.a a1)
    {
        switch (a1.hR())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hR()).toString());

        case 2: // '\002'
            return CE;

        case 4: // '\004'
            return api;

        case 5: // '\005'
            return apa;

        case 6: // '\006'
            return apj;

        case 7: // '\007'
            return vc;
        }
    }

    public int describeContents()
    {
        pg pg1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof pf))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (pf)obj;
            kr.a a1;
label1:
            do
            {
                for (Iterator iterator = aom.values().iterator(); iterator.hasNext();)
                {
                    a1 = (kr.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((pf) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((pf) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((pf) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return oJ();
    }

    public String getId()
    {
        return CE;
    }

    public ItemScope getResult()
    {
        return api;
    }

    public String getStartDate()
    {
        return apa;
    }

    public ItemScope getTarget()
    {
        return apj;
    }

    public String getType()
    {
        return vc;
    }

    public HashMap hK()
    {
        return aom;
    }

    public boolean hasId()
    {
        return aon.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return aon.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return aon.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return aon.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return aon.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = aom.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kr.a a1 = (kr.a)iterator.next();
            if (a(a1))
            {
                int j = a1.hR();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public pf oJ()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pg pg1 = CREATOR;
        pg.a(this, parcel, i);
    }

    static 
    {
        aom = new HashMap();
        aom.put("id", kr.a.l("id", 2));
        aom.put("result", kr.a.a("result", 4, com/google/android/gms/internal/pd));
        aom.put("startDate", kr.a.l("startDate", 5));
        aom.put("target", kr.a.a("target", 6, com/google/android/gms/internal/pd));
        aom.put("type", kr.a.l("type", 7));
    }
}
