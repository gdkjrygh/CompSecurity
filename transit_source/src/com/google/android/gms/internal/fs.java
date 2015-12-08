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
//            dw, ft, fq

public final class fs extends dw
    implements SafeParcelable, Moment
{

    public static final ft CREATOR = new ft();
    private static final HashMap rH;
    private final int iM;
    private final Set rI;
    private String sD;
    private fq sG;
    private fq sH;
    private String sm;
    private String sx;

    public fs()
    {
        iM = 1;
        rI = new HashSet();
    }

    fs(Set set, int i, String s, fq fq1, String s1, fq fq2, String s2)
    {
        rI = set;
        iM = i;
        sm = s;
        sG = fq1;
        sx = s1;
        sH = fq2;
        sD = s2;
    }

    public fs(Set set, String s, fq fq1, String s1, fq fq2, String s2)
    {
        rI = set;
        iM = 1;
        sm = s;
        sG = fq1;
        sx = s1;
        sH = fq2;
        sD = s2;
    }

    protected Object D(String s)
    {
        return null;
    }

    protected boolean E(String s)
    {
        return false;
    }

    protected boolean a(dw.a a1)
    {
        return rI.contains(Integer.valueOf(a1.bw()));
    }

    protected Object b(dw.a a1)
    {
        switch (a1.bw())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.bw()).toString());

        case 2: // '\002'
            return sm;

        case 4: // '\004'
            return sG;

        case 5: // '\005'
            return sx;

        case 6: // '\006'
            return sH;

        case 7: // '\007'
            return sD;
        }
    }

    public HashMap bp()
    {
        return rH;
    }

    fq dA()
    {
        return sH;
    }

    public fs dB()
    {
        return this;
    }

    public int describeContents()
    {
        ft ft1 = CREATOR;
        return 0;
    }

    Set di()
    {
        return rI;
    }

    fq dz()
    {
        return sG;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof fs))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (fs)obj;
            dw.a a1;
label1:
            do
            {
                for (Iterator iterator = rH.values().iterator(); iterator.hasNext();)
                {
                    a1 = (dw.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((fs) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((fs) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((fs) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return dB();
    }

    public String getId()
    {
        return sm;
    }

    public ItemScope getResult()
    {
        return sG;
    }

    public String getStartDate()
    {
        return sx;
    }

    public ItemScope getTarget()
    {
        return sH;
    }

    public String getType()
    {
        return sD;
    }

    int getVersionCode()
    {
        return iM;
    }

    public boolean hasId()
    {
        return rI.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return rI.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return rI.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return rI.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return rI.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = rH.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dw.a a1 = (dw.a)iterator.next();
            if (a(a1))
            {
                int j = a1.bw();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ft ft1 = CREATOR;
        ft.a(this, parcel, i);
    }

    static 
    {
        rH = new HashMap();
        rH.put("id", dw.a.g("id", 2));
        rH.put("result", dw.a.a("result", 4, com/google/android/gms/internal/fq));
        rH.put("startDate", dw.a.g("startDate", 5));
        rH.put("target", dw.a.a("target", 6, com/google/android/gms/internal/fq));
        rH.put("type", dw.a.g("type", 7));
    }
}
