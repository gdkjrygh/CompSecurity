// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.ah;
import com.google.android.gms.drive.internal.v;
import com.google.android.gms.internal.pm;
import com.google.android.gms.internal.pn;

// Referenced classes of package com.google.android.gms.drive:
//            c

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int BR;
    final String Ni;
    final long Nj;
    final long Nk;
    private volatile String Nl;

    DriveId(int i, String s, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            Nl = null;
            BR = i;
            Ni = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.K(flag);
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
        o.K(flag);
        Nj = l;
        Nk = l1;
    }

    public DriveId(String s, long l, long l1)
    {
        this(1, s, l, l1);
    }

    public static DriveId bg(String s)
    {
        o.i(s);
        return new DriveId(s, -1L, -1L);
    }

    public static DriveId decodeFromString(String s)
    {
        o.b(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return f(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    static DriveId f(byte abyte0[])
    {
        ah ah1;
        try
        {
            ah1 = ah.g(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(ah1.Pl))
        {
            abyte0 = null;
        } else
        {
            abyte0 = ah1.Pl;
        }
        return new DriveId(ah1.versionCode, abyte0, ah1.Pm, ah1.Pn);
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (Nl == null)
        {
            String s = Base64.encodeToString(hN(), 10);
            Nl = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return Nl;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).Nk != Nk)
            {
                v.p("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).Nj == -1L && Nj == -1L)
            {
                return ((DriveId) (obj)).Ni.equals(Ni);
            }
            if (((DriveId) (obj)).Nj == Nj)
            {
                return true;
            }
        }
        return false;
    }

    public String getResourceId()
    {
        return Ni;
    }

    final byte[] hN()
    {
        ah ah1 = new ah();
        ah1.versionCode = BR;
        String s;
        if (Ni == null)
        {
            s = "";
        } else
        {
            s = Ni;
        }
        ah1.Pl = s;
        ah1.Pm = Nj;
        ah1.Pn = Nk;
        return pn.f(ah1);
    }

    public int hashCode()
    {
        if (Nj == -1L)
        {
            return Ni.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(Nk)).append(String.valueOf(Nj)).toString().hashCode();
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
