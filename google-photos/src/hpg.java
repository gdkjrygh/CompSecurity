// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class hpg
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new hph();
    public final List a;

    hpg(Parcel parcel)
    {
        a = new ArrayList();
        parcel.readTypedList(a, hpk.CREATOR);
    }

    public hpg(hpk hpk1)
    {
        this(Collections.singletonList(hpk1));
    }

    public hpg(List list)
    {
        a = list;
    }

    public final hpk a(String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hpk hpk1 = (hpk)iterator.next();
            if (s.equals(hpk1.d))
            {
                return hpk1;
            }
        }

        return null;
    }

    public final String a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            String s = ((hpk)iterator.next()).e;
            if (!TextUtils.isEmpty(s))
            {
                return s;
            }
        }

        return null;
    }

    public final hpk b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hpk hpk1 = (hpk)iterator.next();
            if (hpk1.a())
            {
                return hpk1;
            }
        }

        if (a.isEmpty())
        {
            return null;
        } else
        {
            return (hpk)a.get(0);
        }
    }

    public final hpk c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hpk hpk1 = (hpk)iterator.next();
            if (hpk1.e())
            {
                return hpk1;
            }
        }

        return null;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 22)).append("ResolvedMediaFeature{").append(s).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(a);
    }

}
