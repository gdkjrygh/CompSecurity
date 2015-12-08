// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.mg;

// Referenced classes of package com.google.android.gms.fitness.data:
//            i

public final class Device
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;
    private final int CK;
    private final int Gt;
    private final String TU;
    private final String Uw;
    private final String Ux;
    private final String Uy;
    private final int Uz;

    Device(int j, String s, String s1, String s2, String s3, int k, int l)
    {
        CK = j;
        Uw = (String)jx.i(s);
        Ux = (String)jx.i(s1);
        TU = "";
        Uy = (String)jx.i(s3);
        Gt = k;
        Uz = l;
    }

    public Device(String s, String s1, String s2, int j)
    {
        this(s, s1, "", s2, j, 0);
    }

    public Device(String s, String s1, String s2, String s3, int j)
    {
        this(s, s1, s3, j);
    }

    public Device(String s, String s1, String s2, String s3, int j, int k)
    {
        this(1, s, s1, "", s3, j, k);
    }

    private static String M(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private static int N(Context context)
    {
        int j;
        boolean flag;
        flag = false;
        j = ((flag) ? 1 : 0);
        P(context);
        JVM INSTR tableswitch 8 10: default 36
    //                   8 45
    //                   9 45
    //                   10 47;
           goto _L1 _L2 _L2 _L3
_L1:
        if (!R(context)) goto _L5; else goto _L4
_L4:
        j = 1;
_L2:
        return j;
_L3:
        j = ((flag) ? 1 : 0);
        if (!O(context)) goto _L2; else goto _L6
_L6:
        return 3;
_L5:
        return 2;
    }

    public static boolean O(Context context)
    {
        return (context.getResources().getConfiguration().uiMode & 0xf) == 6;
    }

    private static int P(Context context)
    {
        return (Q(context) % 1000) / 100 + 5;
    }

    private static int Q(Context context)
    {
        int j;
        try
        {
            j = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
        return j;
    }

    private static boolean R(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0;
    }

    private boolean a(Device device)
    {
        return jv.equal(Uw, device.Uw) && jv.equal(Ux, device.Ux) && jv.equal(TU, device.TU) && jv.equal(Uy, device.Uy) && Gt == device.Gt && Uz == device.Uz;
    }

    public static Device getLocalDevice(Context context)
    {
        int j = N(context);
        context = M(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, android.os.Build.VERSION.RELEASE, context, j, 2);
    }

    private boolean jD()
    {
        return jC() == 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Device) && a((Device)obj);
    }

    public String getManufacturer()
    {
        return Uw;
    }

    public String getModel()
    {
        return Ux;
    }

    String getStreamIdentifier()
    {
        return String.format("%s:%s:%s", new Object[] {
            Uw, Ux, Uy
        });
    }

    public int getType()
    {
        return Gt;
    }

    public String getUid()
    {
        return Uy;
    }

    public String getVersion()
    {
        return TU;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Uw, Ux, TU, Uy, Integer.valueOf(Gt)
        });
    }

    public int jC()
    {
        return Uz;
    }

    Device jE()
    {
        return new Device(mg.bw(Uw), mg.bw(Ux), mg.bw(TU), Uy, Gt);
    }

    public String jF()
    {
        if (mg.jN() || jD())
        {
            return Uy;
        } else
        {
            return mg.bw(Uy);
        }
    }

    public String toString()
    {
        return String.format("Device{%s:%s:%s:%s}", new Object[] {
            getStreamIdentifier(), TU, Integer.valueOf(Gt), Integer.valueOf(Uz)
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
