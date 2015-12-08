// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jn, hk

public final class jm
    implements SafeParcelable
{

    public static final jn CREATOR = new jn();
    final List Wc;
    private final String Wd;
    private final boolean We;
    final List Wf;
    private final String Wg;
    final List Wh;
    private final Set Wi;
    private final Set Wj;
    private final Set Wk;
    final int xM;

    jm(int i, List list, String s, boolean flag, List list1, String s1, List list2)
    {
        xM = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        Wc = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        Wd = list;
        We = flag;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        Wf = list;
        list = s1;
        if (s1 == null)
        {
            list = "";
        }
        Wg = list;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        Wh = list;
        Wi = c(Wc);
        Wj = c(Wf);
        Wk = c(Wh);
    }

    private static Set c(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public int describeContents()
    {
        jn jn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jm))
            {
                return false;
            }
            obj = (jm)obj;
            if (!Wi.equals(((jm) (obj)).Wi) || We != ((jm) (obj)).We || !Wg.equals(((jm) (obj)).Wg) || !Wj.equals(((jm) (obj)).Wj) || !Wk.equals(((jm) (obj)).Wk))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Wi, Boolean.valueOf(We), Wj, Wg, Wk
        });
    }

    public String jg()
    {
        return Wd;
    }

    public boolean jh()
    {
        return We;
    }

    public String ji()
    {
        return Wg;
    }

    public String toString()
    {
        return hk.e(this).a("types", Wi).a("placeIds", Wk).a("requireOpenNow", Boolean.valueOf(We)).a("userAccountName", Wg).a("requestedUserDataTypes", Wj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jn jn1 = CREATOR;
        jn.a(this, parcel, i);
    }

}
