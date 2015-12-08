// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.af;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.me;
import com.google.android.gms.internal.mf;

// Referenced classes of package com.google.android.gms.drive:
//            c

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final String HK;
    final long HL;
    final long HM;
    private volatile String HN;
    final int xJ;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            HN = null;
            xJ = i;
            HK = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.C(flag);
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
        hn.C(flag);
        HL = l;
        HM = l1;
    }

    public DriveId(String s, long l, long l1)
    {
        this(1, s, l, l1);
    }

    public static DriveId aL(String s)
    {
        hn.f(s);
        return new DriveId(s, -1L, -1L);
    }

    public static DriveId decodeFromString(String s)
    {
        hn.b(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return f(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    static DriveId f(byte abyte0[])
    {
        af af1;
        try
        {
            af1 = af.g(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(af1.Jq))
        {
            abyte0 = null;
        } else
        {
            abyte0 = af1.Jq;
        }
        return new DriveId(af1.versionCode, abyte0, af1.Jr, af1.Js);
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (HN == null)
        {
            String s = Base64.encodeToString(gf(), 10);
            HN = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return HN;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).HM != HM)
            {
                Log.w("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).HL == -1L && HL == -1L)
            {
                return ((DriveId) (obj)).HK.equals(HK);
            }
            if (((DriveId) (obj)).HL == HL)
            {
                return true;
            }
        }
        return false;
    }

    public String getResourceId()
    {
        return HK;
    }

    final byte[] gf()
    {
        af af1 = new af();
        af1.versionCode = xJ;
        String s;
        if (HK == null)
        {
            s = "";
        } else
        {
            s = HK;
        }
        af1.Jq = s;
        af1.Jr = HL;
        af1.Js = HM;
        return mf.d(af1);
    }

    public int hashCode()
    {
        if (HL == -1L)
        {
            return HK.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(HM)).append(String.valueOf(HL)).toString().hashCode();
        }
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
