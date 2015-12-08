// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.y;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.kt;

// Referenced classes of package com.google.android.gms.drive:
//            d

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final String EH;
    final long EI;
    final long EJ;
    private volatile String EK;
    final int xH;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            EK = null;
            xH = i;
            EH = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.z(flag);
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
        fq.z(flag);
        EI = l;
        EJ = l1;
    }

    public DriveId(String s, long l, long l1)
    {
        this(1, s, l, l1);
    }

    public static DriveId aw(String s)
    {
        fq.f(s);
        return new DriveId(s, -1L, -1L);
    }

    public static DriveId decodeFromString(String s)
    {
        fq.b(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return f(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    static DriveId f(byte abyte0[])
    {
        y y1;
        try
        {
            y1 = y.g(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(y1.FC))
        {
            abyte0 = null;
        } else
        {
            abyte0 = y1.FC;
        }
        return new DriveId(y1.versionCode, abyte0, y1.FD, y1.FE);
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (EK == null)
        {
            String s = Base64.encodeToString(fC(), 10);
            EK = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return EK;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).EJ != EJ)
            {
                Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).EI == -1L && EI == -1L)
            {
                return ((DriveId) (obj)).EH.equals(EH);
            }
            if (((DriveId) (obj)).EI == EI)
            {
                return true;
            }
        }
        return false;
    }

    final byte[] fC()
    {
        y y1 = new y();
        y1.versionCode = xH;
        String s;
        if (EH == null)
        {
            s = "";
        } else
        {
            s = EH;
        }
        y1.FC = s;
        y1.FD = EI;
        y1.FE = EJ;
        return kt.d(y1);
    }

    public String getResourceId()
    {
        return EH;
    }

    public int hashCode()
    {
        if (EI == -1L)
        {
            return EH.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(EJ)).append(String.valueOf(EI)).toString().hashCode();
        }
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
