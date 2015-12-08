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
//            hm

public final class gz
{
    public static final class a
        implements SafeParcelable
    {

        public static final hm CREATOR = new hm();
        private final int DF;
        private final String DH;
        private final List Ec;
        private final int xJ;
        private final String yN;

        public int describeContents()
        {
            return 0;
        }

        public String fe()
        {
            if (yN != null)
            {
                return yN;
            } else
            {
                return "<<default account>>";
            }
        }

        public int ff()
        {
            return DF;
        }

        public List fg()
        {
            return new ArrayList(Ec);
        }

        public String fi()
        {
            return DH;
        }

        public String getAccountName()
        {
            return yN;
        }

        public int getVersionCode()
        {
            return xJ;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hm.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            Ec = new ArrayList();
            xJ = i;
            yN = s;
            Ec.addAll(list);
            DF = j;
            DH = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View DG;
    private final a FR;

    public gz(String s, Collection collection, int i, View view, String s1)
    {
        FR = new a(s, collection, i, s1);
        DG = view;
    }

    public String fe()
    {
        return FR.fe();
    }

    public int ff()
    {
        return FR.ff();
    }

    public List fg()
    {
        return FR.fg();
    }

    public String[] fh()
    {
        return (String[])FR.fg().toArray(new String[0]);
    }

    public String fi()
    {
        return FR.fi();
    }

    public View fj()
    {
        return DG;
    }

    public String getAccountName()
    {
        return FR.getAccountName();
    }
}
