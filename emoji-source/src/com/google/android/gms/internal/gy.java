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
//            hl

public final class gy
{
    public static final class a
        implements SafeParcelable
    {

        public static final hl CREATOR = new hl();
        private final int DI;
        private final String DK;
        private final List Ef;
        private final int xM;
        private final String yQ;

        public int describeContents()
        {
            return 0;
        }

        public String fj()
        {
            if (yQ != null)
            {
                return yQ;
            } else
            {
                return "<<default account>>";
            }
        }

        public int fk()
        {
            return DI;
        }

        public List fl()
        {
            return new ArrayList(Ef);
        }

        public String fn()
        {
            return DK;
        }

        public String getAccountName()
        {
            return yQ;
        }

        public int getVersionCode()
        {
            return xM;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hl.a(this, parcel, i);
        }


        a(int i, String s, List list, int j, String s1)
        {
            Ef = new ArrayList();
            xM = i;
            yQ = s;
            Ef.addAll(list);
            DI = j;
            DK = s1;
        }

        public a(String s, Collection collection, int i, String s1)
        {
            this(3, s, ((List) (new ArrayList(collection))), i, s1);
        }
    }


    private final View DJ;
    private final a FU;

    public gy(String s, Collection collection, int i, View view, String s1)
    {
        FU = new a(s, collection, i, s1);
        DJ = view;
    }

    public String fj()
    {
        return FU.fj();
    }

    public int fk()
    {
        return FU.fk();
    }

    public List fl()
    {
        return FU.fl();
    }

    public String[] fm()
    {
        return (String[])FU.fl().toArray(new String[0]);
    }

    public String fn()
    {
        return FU.fn();
    }

    public View fo()
    {
        return DJ;
    }

    public String getAccountName()
    {
        return FU.getAccountName();
    }
}
