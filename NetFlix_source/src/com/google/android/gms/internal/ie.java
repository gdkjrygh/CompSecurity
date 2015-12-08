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
//            ga, if, ic

public final class ie extends ga
    implements SafeParcelable, Moment
{

    public static final if CREATOR = new if();
    private static final HashMap UI;
    private String Rd;
    private final Set UJ;
    private ic VE;
    private ic VF;
    private String Vw;
    private String wp;
    private final int xH;

    public ie()
    {
        xH = 1;
        UJ = new HashSet();
    }

    ie(Set set, int i, String s, ic ic1, String s1, ic ic2, String s2)
    {
        UJ = set;
        xH = i;
        wp = s;
        VE = ic1;
        Vw = s1;
        VF = ic2;
        Rd = s2;
    }

    public ie(Set set, String s, ic ic1, String s1, ic ic2, String s2)
    {
        UJ = set;
        xH = 1;
        wp = s;
        VE = ic1;
        Vw = s1;
        VF = ic2;
        Rd = s2;
    }

    protected boolean a(ga.a a1)
    {
        return UJ.contains(Integer.valueOf(a1.ff()));
    }

    protected Object aq(String s)
    {
        return null;
    }

    protected boolean ar(String s)
    {
        return false;
    }

    protected Object b(ga.a a1)
    {
        switch (a1.ff())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.ff()).toString());

        case 2: // '\002'
            return wp;

        case 4: // '\004'
            return VE;

        case 5: // '\005'
            return Vw;

        case 6: // '\006'
            return VF;

        case 7: // '\007'
            return Rd;
        }
    }

    public int describeContents()
    {
        if if1 = CREATOR;
        return 0;
    }

    public HashMap eY()
    {
        return UI;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof ie))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ie)obj;
            ga.a a1;
label1:
            do
            {
                for (Iterator iterator = UI.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ga.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((ie) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ie) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ie) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return jt();
    }

    public String getId()
    {
        return wp;
    }

    public ItemScope getResult()
    {
        return VE;
    }

    public String getStartDate()
    {
        return Vw;
    }

    public ItemScope getTarget()
    {
        return VF;
    }

    public String getType()
    {
        return Rd;
    }

    int getVersionCode()
    {
        return xH;
    }

    public boolean hasId()
    {
        return UJ.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return UJ.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return UJ.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return UJ.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return UJ.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = UI.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ga.a a1 = (ga.a)iterator.next();
            if (a(a1))
            {
                int j = a1.ff();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    Set ja()
    {
        return UJ;
    }

    ic jr()
    {
        return VE;
    }

    ic js()
    {
        return VF;
    }

    public ie jt()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if if1 = CREATOR;
        com.google.android.gms.internal.if.a(this, parcel, i);
    }

    static 
    {
        UI = new HashMap();
        UI.put("id", ga.a.j("id", 2));
        UI.put("result", ga.a.a("result", 4, com/google/android/gms/internal/ic));
        UI.put("startDate", ga.a.j("startDate", 5));
        UI.put("target", ga.a.a("target", 6, com/google/android/gms/internal/ic));
        UI.put("type", ga.a.j("type", 7));
    }
}
