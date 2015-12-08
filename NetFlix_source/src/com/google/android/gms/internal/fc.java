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
//            fp

public final class fc
{
    public static final class a
        implements SafeParcelable
    {

        public static final fp CREATOR = new fp();
        private final int AU;
        private final String AW;
        private final List CU;
        private final String wG;
        private final int xH;

        public int describeContents()
        {
            return 0;
        }

        public String eC()
        {
            if (wG != null)
            {
                return wG;
            } else
            {
                return "<<default account>>";
            }
        }

        public int eD()
        {
            return AU;
        }

        public List eE()
        {
            return new ArrayList(CU);
        }

        public String eG()
        {
            return AW;
        }

        public String getAccountName()
        {
            return wG;
        }

        public int getVersionCode()
        {
            return xH;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            fp.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            CU = new ArrayList();
            xH = i;
            wG = s;
            CU.addAll(list);
            AU = j;
            AW = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View AV;
    private final a CT;

    public fc(String s, Collection collection, int i, View view, String s1)
    {
        CT = new a(s, collection, i, s1);
        AV = view;
    }

    public String eC()
    {
        return CT.eC();
    }

    public int eD()
    {
        return CT.eD();
    }

    public List eE()
    {
        return CT.eE();
    }

    public String[] eF()
    {
        return (String[])CT.eE().toArray(new String[0]);
    }

    public String eG()
    {
        return CT.eG();
    }

    public View eH()
    {
        return AV;
    }

    public String getAccountName()
    {
        return CT.getAccountName();
    }
}
