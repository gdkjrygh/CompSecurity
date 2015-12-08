// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.g;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.g:
//            b

public final class a
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final a a = new a(0, null);
    final int b;
    public final int c;
    public final PendingIntent d;

    a(int i, int j, PendingIntent pendingintent)
    {
        b = i;
        c = j;
        d = pendingintent;
    }

    public a(int i, PendingIntent pendingintent)
    {
        this(1, i, pendingintent);
    }

    public final void a(Activity activity, int i)
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(d.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public final boolean a()
    {
        return c != 0 && d != null;
    }

    public final boolean b()
    {
        return c == 0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (c != ((a) (obj)).c || !v.a(d, ((a) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(c), d
        });
    }

    public final String toString()
    {
        com.google.android.m4b.maps.j.v.a a1;
        int i;
        a1 = v.a(this);
        i = c;
        i;
        JVM INSTR tableswitch 0 18: default 100
    //                   0 147
    //                   1 153
    //                   2 159
    //                   3 165
    //                   4 171
    //                   5 177
    //                   6 183
    //                   7 189
    //                   8 195
    //                   9 201
    //                   10 207
    //                   11 213
    //                   12 100
    //                   13 219
    //                   14 225
    //                   15 231
    //                   16 237
    //                   17 243
    //                   18 249;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        String s = (new StringBuilder(31)).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
_L21:
        return a1.a("statusCode", s).a("resolution", d).toString();
_L2:
        s = "SUCCESS";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "SERVICE_MISSING";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "SERVICE_VERSION_UPDATE_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "SERVICE_DISABLED";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "SIGN_IN_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "INVALID_ACCOUNT";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "RESOLUTION_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "INTERNAL_ERROR";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "SERVICE_INVALID";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "DEVELOPER_ERROR";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "LICENSE_CHECK_FAILED";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "CANCELED";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "INTERRUPTED";
        continue; /* Loop/switch isn't completed */
_L17:
        s = "API_UNAVAILABLE";
        continue; /* Loop/switch isn't completed */
_L18:
        s = "SIGN_IN_FAILED";
        continue; /* Loop/switch isn't completed */
_L19:
        s = "SERVICE_UPDATING";
        if (true) goto _L21; else goto _L20
_L20:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.g.b.a(this, parcel, i);
    }

}
