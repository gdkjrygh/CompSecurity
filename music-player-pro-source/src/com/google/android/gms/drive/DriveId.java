// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.ak;
import com.google.android.gms.drive.internal.w;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;

// Referenced classes of package com.google.android.gms.drive:
//            c

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int CK;
    final String Ot;
    final long Ou;
    final long Ov;
    private volatile String Ow;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            Ow = null;
            CK = i;
            Ot = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.L(flag);
            if (s == null)
            {
                flag = flag1;
                if (l == -1L)
                {
                    break label0;
                }
            }
            flag = true;
        }
        jx.L(flag);
        Ou = l;
        Ov = l1;
    }

    public DriveId(String s, long l, long l1)
    {
        this(1, s, l, l1);
    }

    public static DriveId bi(String s)
    {
        jx.i(s);
        return new DriveId(s, -1L, -1L);
    }

    public static DriveId decodeFromString(String s)
    {
        jx.b(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return f(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    static DriveId f(byte abyte0[])
    {
        ak ak1;
        try
        {
            ak1 = ak.g(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(ak1.QG))
        {
            abyte0 = null;
        } else
        {
            abyte0 = ak1.QG;
        }
        return new DriveId(ak1.versionCode, abyte0, ak1.QH, ak1.QI);
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (Ow == null)
        {
            String s = Base64.encodeToString(iu(), 10);
            Ow = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return Ow;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).Ov != Ov)
            {
                w.o("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).Ou == -1L && Ou == -1L)
            {
                return ((DriveId) (obj)).Ot.equals(Ot);
            }
            if (((DriveId) (obj)).Ou == Ou)
            {
                return true;
            }
        }
        return false;
    }

    public String getResourceId()
    {
        return Ot;
    }

    public int hashCode()
    {
        if (Ou == -1L)
        {
            return Ot.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(Ov)).append(String.valueOf(Ou)).toString().hashCode();
        }
    }

    final byte[] iu()
    {
        ak ak1 = new ak();
        ak1.versionCode = CK;
        String s;
        if (Ot == null)
        {
            s = "";
        } else
        {
            s = Ot;
        }
        ak1.QG = s;
        ak1.QH = Ou;
        ak1.QI = Ov;
        return qw.f(ak1);
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
