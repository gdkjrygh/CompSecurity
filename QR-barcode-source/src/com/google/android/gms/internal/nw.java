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
//            jj, nx, nu

public final class nw extends jj
    implements Moment
{

    public static final nx CREATOR = new nx();
    private static final HashMap amb;
    String BL;
    final int BR;
    String amP;
    nu amX;
    nu amY;
    final Set amc;
    String uO;

    public nw()
    {
        BR = 1;
        amc = new HashSet();
    }

    nw(Set set, int i, String s, nu nu1, String s1, nu nu2, String s2)
    {
        amc = set;
        BR = i;
        BL = s;
        amX = nu1;
        amP = s1;
        amY = nu2;
        uO = s2;
    }

    public nw(Set set, String s, nu nu1, String s1, nu nu2, String s2)
    {
        amc = set;
        BR = 1;
        BL = s;
        amX = nu1;
        amP = s1;
        amY = nu2;
        uO = s2;
    }

    protected boolean a(ji.a a1)
    {
        return amc.contains(Integer.valueOf(a1.hm()));
    }

    protected Object b(ji.a a1)
    {
        switch (a1.hm())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

        case 2: // '\002'
            return BL;

        case 4: // '\004'
            return amX;

        case 5: // '\005'
            return amP;

        case 6: // '\006'
            return amY;

        case 7: // '\007'
            return uO;
        }
    }

    public int describeContents()
    {
        nx nx1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof nw))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (nw)obj;
            ji.a a1;
label1:
            do
            {
                for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ji.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((nw) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((nw) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((nw) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return ns();
    }

    public String getId()
    {
        return BL;
    }

    public ItemScope getResult()
    {
        return amX;
    }

    public String getStartDate()
    {
        return amP;
    }

    public ItemScope getTarget()
    {
        return amY;
    }

    public String getType()
    {
        return uO;
    }

    public boolean hasId()
    {
        return amc.contains(Integer.valueOf(2));
    }

    public boolean hasResult()
    {
        return amc.contains(Integer.valueOf(4));
    }

    public boolean hasStartDate()
    {
        return amc.contains(Integer.valueOf(5));
    }

    public boolean hasTarget()
    {
        return amc.contains(Integer.valueOf(6));
    }

    public boolean hasType()
    {
        return amc.contains(Integer.valueOf(7));
    }

    public int hashCode()
    {
        Iterator iterator = amb.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ji.a a1 = (ji.a)iterator.next();
            if (a(a1))
            {
                int j = a1.hm();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public HashMap hf()
    {
        return amb;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public nw ns()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nx nx1 = CREATOR;
        nx.a(this, parcel, i);
    }

    static 
    {
        amb = new HashMap();
        amb.put("id", ji.a.l("id", 2));
        amb.put("result", ji.a.a("result", 4, com/google/android/gms/internal/nu));
        amb.put("startDate", ji.a.l("startDate", 5));
        amb.put("target", ji.a.a("target", 6, com/google/android/gms/internal/nu));
        amb.put("type", ji.a.l("type", 7));
    }
}
