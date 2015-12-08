// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            he, ho, hh

public class hd
    implements SafeParcelable
{
    public static class a
    {

        private List CO;
        private String CP;
        private boolean CQ;
        private Account CR;

        public a F(boolean flag)
        {
            CQ = flag;
            return this;
        }

        public a a(hh hh1)
        {
            if (CO == null)
            {
                CO = new ArrayList();
            }
            CO.add(hh1);
            return this;
        }

        public a ar(String s)
        {
            CP = s;
            return this;
        }

        public hd fD()
        {
            String s = CP;
            boolean flag = CQ;
            Account account1 = CR;
            hh ahh[];
            if (CO != null)
            {
                ahh = (hh[])CO.toArray(new hh[CO.size()]);
            } else
            {
                ahh = null;
            }
            return new hd(s, flag, account1, ahh);
        }

        public a()
        {
        }
    }


    public static final he CREATOR = new he();
    final int CK;
    final hh CL[];
    public final String CM;
    public final boolean CN;
    public final Account account;

    hd(int i, hh ahh[], String s, boolean flag, Account account1)
    {
        CK = i;
        CL = ahh;
        CM = s;
        CN = flag;
        account = account1;
    }

    transient hd(String s, boolean flag, Account account1, hh ahh[])
    {
        this(1, ahh, s, flag, account1);
        s = new BitSet(ho.fF());
        for (int i = 0; i < ahh.length; i++)
        {
            int j = ahh[i].CZ;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate global search section type ").append(ho.P(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        he he1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        he he1 = CREATOR;
        he.a(this, parcel, i);
    }

}
