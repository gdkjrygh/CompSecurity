// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.a.a;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import dbr;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.sony.snei.np.android.a.a:
//            a

class d extends a
{

    public d(Context context)
    {
        super(context, 7, 2);
    }

    protected byte[] b()
    {
        Object obj;
        byte abyte1[];
        abyte1 = "X".getBytes();
        obj = (TelephonyManager)a.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i = ((TelephonyManager) (obj)).getPhoneType();
        if (i != 1 && i != 2) goto _L2; else goto _L3
_L3:
        obj = ((TelephonyManager) (obj)).getDeviceId();
        if (TextUtils.isEmpty(((CharSequence) (obj))) || (i != 1 || ((String) (obj)).length() != 15) && (i != 2 || ((String) (obj)).length() != 14)) goto _L2; else goto _L4
_L4:
        byte abyte0[] = dbr.a(((String) (obj)), 15, abyte1);
_L6:
        Object obj1 = abyte0;
        if (abyte0 == null)
        {
            Object obj2 = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
            obj1 = abyte0;
            if (!TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                int k;
                if (((String) (obj2)).length() % 2 != 0)
                {
                    obj1 = (new StringBuilder()).append(((String) (obj2))).append('0').toString();
                } else
                {
                    obj1 = obj2;
                }
                k = ((String) (obj1)).length();
                abyte0 = new byte[k / 2];
                for (int j = 0; j < k; j += 2)
                {
                    abyte0[j / 2] = (byte)((Character.digit(((String) (obj1)).charAt(j), 16) << 4) + Character.digit(((String) (obj1)).charAt(j + 1), 16));
                }

                if (abyte0.length < 15)
                {
                    obj1 = abyte0;
                } else
                {
                    Log.w("Nsadg", String.format("ID is truncated. len=%d", new Object[] {
                        Integer.valueOf(((String) (obj2)).length())
                    }));
                    obj1 = Arrays.copyOfRange(abyte0, abyte0.length - 15, abyte0.length);
                }
            }
        }
        abyte0 = ((byte []) (obj1));
        if (obj1 == null)
        {
            Log.e("Nsadg", "failed to complete determination - use fallback");
            abyte0 = dbr.a("", 15, abyte1);
        }
        obj2 = Build.MANUFACTURER;
        obj1 = obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj1 = "Unknown";
        }
        abyte1 = dbr.a(((String) (obj1)));
        obj2 = Build.DEVICE;
        obj1 = obj2;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj1 = "Unknown";
        }
        obj1 = dbr.a(((String) (obj1)));
        obj2 = ByteBuffer.allocate(37);
        ((ByteBuffer) (obj2)).put(abyte0);
        ((ByteBuffer) (obj2)).put((byte)58);
        ((ByteBuffer) (obj2)).put(abyte1);
        ((ByteBuffer) (obj2)).put((byte)58);
        ((ByteBuffer) (obj2)).put(((byte []) (obj1)));
        return ((ByteBuffer) (obj2)).array();
_L2:
        abyte0 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
