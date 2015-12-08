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
//            jo, hl

public final class jn
    implements SafeParcelable
{

    public static final jo CREATOR = new jo();
    final List VZ;
    private final String Wa;
    private final boolean Wb;
    final List Wc;
    private final String Wd;
    final List We;
    private final Set Wf;
    private final Set Wg;
    private final Set Wh;
    final int xJ;

    jn(int i, List list, String s, boolean flag, List list1, String s1, List list2)
    {
        xJ = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        VZ = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        Wa = list;
        Wb = flag;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        Wc = list;
        list = s1;
        if (s1 == null)
        {
            list = "";
        }
        Wd = list;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        We = list;
        Wf = c(VZ);
        Wg = c(Wc);
        Wh = c(We);
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
        jo jo1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jn))
            {
                return false;
            }
            obj = (jn)obj;
            if (!Wf.equals(((jn) (obj)).Wf) || Wb != ((jn) (obj)).Wb || !Wd.equals(((jn) (obj)).Wd) || !Wg.equals(((jn) (obj)).Wg) || !Wh.equals(((jn) (obj)).Wh))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Wf, Boolean.valueOf(Wb), Wg, Wd, Wh
        });
    }

    public String jb()
    {
        return Wa;
    }

    public boolean jc()
    {
        return Wb;
    }

    public String jd()
    {
        return Wd;
    }

    public String toString()
    {
        return hl.e(this).a("types", Wf).a("placeIds", Wh).a("requireOpenNow", Boolean.valueOf(Wb)).a("userAccountName", Wd).a("requestedUserDataTypes", Wg).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jo jo1 = CREATOR;
        jo.a(this, parcel, i);
    }

}
