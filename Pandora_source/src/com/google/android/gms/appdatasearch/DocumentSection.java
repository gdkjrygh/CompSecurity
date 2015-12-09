// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzd, zzh, RegisterSectionInfo

public class DocumentSection
    implements SafeParcelable
{

    public static final zzd CREATOR = new zzd();
    public static final int zzJg = Integer.parseInt("-1");
    private static final RegisterSectionInfo zzJh = (new RegisterSectionInfo.zza("SsbContext")).zzJ(true).zzbd("blob").zzjG();
    public final String zzJi;
    final RegisterSectionInfo zzJj;
    public final int zzJk;
    public final byte zzJl[];
    final int zzzH;

    DocumentSection(int i, String s, RegisterSectionInfo registersectioninfo, int j, byte abyte0[])
    {
        boolean flag;
        if (j == zzJg || zzh.zzZ(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        zzzH = i;
        zzJi = s;
        zzJj = registersectioninfo;
        zzJk = j;
        zzJl = abyte0;
        s = zzjE();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public DocumentSection(String s, RegisterSectionInfo registersectioninfo)
    {
        this(1, s, registersectioninfo, zzJg, null);
    }

    public DocumentSection(String s, RegisterSectionInfo registersectioninfo, String s1)
    {
        this(1, s, registersectioninfo, zzh.zzbc(s1), null);
    }

    public DocumentSection(byte abyte0[], RegisterSectionInfo registersectioninfo)
    {
        this(1, null, registersectioninfo, zzJg, abyte0);
    }

    public static DocumentSection zzf(byte abyte0[])
    {
        return new DocumentSection(abyte0, zzJh);
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public String zzjE()
    {
        if (zzJk != zzJg && zzh.zzZ(zzJk) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(zzJk).toString();
        }
        if (zzJi != null && zzJl != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

}
