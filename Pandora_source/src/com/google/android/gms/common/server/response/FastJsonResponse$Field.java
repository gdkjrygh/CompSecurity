// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, zza, SafeParcelResponse, FieldMappingDictionary

public static class zzUH
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    protected final int zzUA;
    protected final boolean zzUB;
    protected final String zzUC;
    protected final int zzUD;
    protected final Class zzUE;
    protected final String zzUF;
    private FieldMappingDictionary zzUG;
    private zzUA zzUH;
    protected final int zzUy;
    protected final boolean zzUz;
    private final int zzzH;

    public static zzUH zza(String s, int i, zzUH zzuh, boolean flag)
    {
        return new <init>(zzuh.mw(), flag, zzuh.mx(), false, s, i, null, zzuh);
    }

    public static mx zza(String s, int i, Class class1)
    {
        return new <init>(11, false, 11, false, s, i, class1, null);
    }

    public static <init> zzb(String s, int i, Class class1)
    {
        return new <init>(11, true, 11, true, s, i, class1, null);
    }

    static <init> zzc(<init> <init>1)
    {
        return <init>1.zzUH;
    }

    public static zzUH zzh(String s, int i)
    {
        return new <init>(0, false, 0, false, s, i, null, null);
    }

    public static <init> zzi(String s, int i)
    {
        return new <init>(4, false, 4, false, s, i, null, null);
    }

    public static <init> zzj(String s, int i)
    {
        return new <init>(6, false, 6, false, s, i, null, null);
    }

    public static <init> zzk(String s, int i)
    {
        return new <init>(7, false, 7, false, s, i, null, null);
    }

    public static <init> zzl(String s, int i)
    {
        return new <init>(7, true, 7, true, s, i, null, null);
    }

    public Object convertBack(Object obj)
    {
        return zzUH.nvertBack(obj);
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(zzzH).append('\n');
        stringbuilder.append("                 typeIn=").append(zzUy).append('\n');
        stringbuilder.append("            typeInArray=").append(zzUz).append('\n');
        stringbuilder.append("                typeOut=").append(zzUA).append('\n');
        stringbuilder.append("           typeOutArray=").append(zzUB).append('\n');
        stringbuilder.append("        outputFieldName=").append(zzUC).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(zzUD).append('\n');
        stringbuilder.append("       concreteTypeName=").append(zzmH()).append('\n');
        if (zzmG() != null)
        {
            stringbuilder.append("     concreteType.class=").append(zzmG().getCanonicalName()).append('\n');
        }
        StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
        String s;
        if (zzUH == null)
        {
            s = "null";
        } else
        {
            s = zzUH.getClass().getCanonicalName();
        }
        stringbuilder1.append(s).append('\n');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        com.google.android.gms.common.server.response.zza.zza(this, parcel, i);
    }

    public void zza(FieldMappingDictionary fieldmappingdictionary)
    {
        zzUG = fieldmappingdictionary;
    }

    public zzUG zzmB()
    {
        return new <init>(zzzH, zzUy, zzUz, zzUA, zzUB, zzUC, zzUD, zzUF, zzmJ());
    }

    public boolean zzmC()
    {
        return zzUz;
    }

    public boolean zzmD()
    {
        return zzUB;
    }

    public String zzmE()
    {
        return zzUC;
    }

    public int zzmF()
    {
        return zzUD;
    }

    public Class zzmG()
    {
        return zzUE;
    }

    String zzmH()
    {
        if (zzUF == null)
        {
            return null;
        } else
        {
            return zzUF;
        }
    }

    public boolean zzmI()
    {
        return zzUH != null;
    }

    ConverterWrapper zzmJ()
    {
        if (zzUH == null)
        {
            return null;
        } else
        {
            return ConverterWrapper.zza(zzUH);
        }
    }

    public Map zzmK()
    {
        zzv.zzr(zzUF);
        zzv.zzr(zzUG);
        return zzUG.zzbX(zzUF);
    }

    public int zzmw()
    {
        return zzUy;
    }

    public int zzmx()
    {
        return zzUA;
    }


    (int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
            String s1, ConverterWrapper converterwrapper)
    {
        zzzH = i;
        zzUy = j;
        zzUz = flag;
        zzUA = k;
        zzUB = flag1;
        zzUC = s;
        zzUD = l;
        if (s1 == null)
        {
            zzUE = null;
            zzUF = null;
        } else
        {
            zzUE = com/google/android/gms/common/server/response/SafeParcelResponse;
            zzUF = s1;
        }
        if (converterwrapper == null)
        {
            zzUH = null;
            return;
        } else
        {
            zzUH = converterwrapper.zzmu();
            return;
        }
    }

    protected zzUH(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
            zzUH zzuh)
    {
        zzzH = 1;
        zzUy = i;
        zzUz = flag;
        zzUA = j;
        zzUB = flag1;
        zzUC = s;
        zzUD = k;
        zzUE = class1;
        if (class1 == null)
        {
            zzUF = null;
        } else
        {
            zzUF = class1.getCanonicalName();
        }
        zzUH = zzuh;
    }
}
