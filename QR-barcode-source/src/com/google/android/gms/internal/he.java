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
//            hf, hp, hi

public class he
    implements SafeParcelable
{
    public static class a
    {

        private List BV;
        private String BW;
        private boolean BX;
        private Account BY;

        public a D(boolean flag)
        {
            BX = flag;
            return this;
        }

        public a a(hi hi1)
        {
            if (BV == null)
            {
                BV = new ArrayList();
            }
            BV.add(hi1);
            return this;
        }

        public a ar(String s)
        {
            BW = s;
            return this;
        }

        public he fj()
        {
            String s = BW;
            boolean flag = BX;
            Account account1 = BY;
            hi ahi[];
            if (BV != null)
            {
                ahi = (hi[])BV.toArray(new hi[BV.size()]);
            } else
            {
                ahi = null;
            }
            return new he(s, flag, account1, ahi);
        }

        public a()
        {
        }
    }


    public static final hf CREATOR = new hf();
    final int BR;
    final hi BS[];
    public final String BT;
    public final boolean BU;
    public final Account account;

    he(int i, hi ahi[], String s, boolean flag, Account account1)
    {
        BR = i;
        BS = ahi;
        BT = s;
        BU = flag;
        account = account1;
    }

    transient he(String s, boolean flag, Account account1, hi ahi[])
    {
        this(1, ahi, s, flag, account1);
        s = new BitSet(hp.fl());
        for (int i = 0; i < ahi.length; i++)
        {
            int j = ahi[i].Cg;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate global search section type ").append(hp.O(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        hf hf1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hf hf1 = CREATOR;
        hf.a(this, parcel, i);
    }

}
