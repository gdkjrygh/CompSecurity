// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jw

public final class jg
{
    public static final class a
        implements SafeParcelable
    {

        public static final jw CREATOR = new jw();
        private final int CK;
        private final String DZ;
        private final int JI;
        private final String JK;
        private final List Kh;

        public int describeContents()
        {
            return 0;
        }

        public String getAccountName()
        {
            return DZ;
        }

        public int getVersionCode()
        {
            return CK;
        }

        public String hm()
        {
            if (DZ != null)
            {
                return DZ;
            } else
            {
                return "<<default account>>";
            }
        }

        public int hn()
        {
            return JI;
        }

        public List ho()
        {
            return new ArrayList(Kh);
        }

        public String hq()
        {
            return JK;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            jw.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            Kh = new ArrayList();
            CK = i;
            DZ = s;
            Kh.addAll(list);
            JI = j;
            JK = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View JJ;
    private final a Mw;

    public jg(String s, Collection collection, int i, View view, String s1)
    {
        Mw = new a(s, collection, i, s1);
        JJ = view;
    }

    public String getAccountName()
    {
        return Mw.getAccountName();
    }

    public String hm()
    {
        return Mw.hm();
    }

    public int hn()
    {
        return Mw.hn();
    }

    public List ho()
    {
        return Mw.ho();
    }

    public String[] hp()
    {
        return (String[])Mw.ho().toArray(new String[0]);
    }

    public String hq()
    {
        return Mw.hq();
    }

    public View hr()
    {
        return JJ;
    }
}
