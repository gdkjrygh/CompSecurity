// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzb, zzh, DocumentSection

public class DocumentContents
    implements SafeParcelable
{
    public static class zza
    {

        private List zzIZ;
        private String zzJa;
        private boolean zzJb;
        private Account zzJc;

        public zza zzI(boolean flag)
        {
            zzJb = flag;
            return this;
        }

        public zza zza(Account account1)
        {
            zzJc = account1;
            return this;
        }

        public zza zza(DocumentSection documentsection)
        {
            if (zzIZ == null)
            {
                zzIZ = new ArrayList();
            }
            zzIZ.add(documentsection);
            return this;
        }

        public zza zzbb(String s)
        {
            zzJa = s;
            return this;
        }

        public DocumentContents zzjD()
        {
            String s = zzJa;
            boolean flag = zzJb;
            Account account1 = zzJc;
            DocumentSection adocumentsection[];
            if (zzIZ != null)
            {
                adocumentsection = (DocumentSection[])zzIZ.toArray(new DocumentSection[zzIZ.size()]);
            } else
            {
                adocumentsection = null;
            }
            return new DocumentContents(s, flag, account1, adocumentsection);
        }

        public zza()
        {
        }
    }


    public static final zzb CREATOR = new zzb();
    public final Account account;
    final DocumentSection zzIW[];
    public final String zzIX;
    public final boolean zzIY;
    final int zzzH;

    DocumentContents(int i, DocumentSection adocumentsection[], String s, boolean flag, Account account1)
    {
        zzzH = i;
        zzIW = adocumentsection;
        zzIX = s;
        zzIY = flag;
        account = account1;
    }

    transient DocumentContents(String s, boolean flag, Account account1, DocumentSection adocumentsection[])
    {
        this(1, adocumentsection, s, flag, account1);
        s = new BitSet(zzh.zzjF());
        for (int i = 0; i < adocumentsection.length; i++)
        {
            int j = adocumentsection[i].zzJk;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate global search section type ").append(zzh.zzZ(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

}
