// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common:
//            ConnectionResultCreator

public final class ConnectionResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ConnectionResultCreator();
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult();
    public final PendingIntent mPendingIntent;
    public final int mStatusCode;
    final String mStatusMessage;
    final int mVersionCode;

    private ConnectionResult()
    {
        this(0, null, (byte)0);
    }

    ConnectionResult(int i, int j, PendingIntent pendingintent, String s)
    {
        mVersionCode = i;
        mStatusCode = j;
        mPendingIntent = pendingintent;
        mStatusMessage = s;
    }

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        this(i, pendingintent, (byte)0);
    }

    private ConnectionResult(int i, PendingIntent pendingintent, byte byte0)
    {
        this(1, i, pendingintent, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (mStatusCode != ((ConnectionResult) (obj)).mStatusCode || !Objects.equal(mPendingIntent, ((ConnectionResult) (obj)).mPendingIntent) || !Objects.equal(mStatusMessage, ((ConnectionResult) (obj)).mStatusMessage))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean hasResolution()
    {
        return mStatusCode != 0 && mPendingIntent != null;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mStatusCode), mPendingIntent, mStatusMessage
        });
    }

    public final boolean isSuccess()
    {
        return mStatusCode == 0;
    }

    public final void startResolutionForResult(Activity activity, int i)
        throws android.content.IntentSender.SendIntentException
    {
        if (!hasResolution())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper;
        int i;
        tostringhelper = Objects.toStringHelper(this);
        i = mStatusCode;
        i;
        JVM INSTR tableswitch 0 19: default 104
    //                   0 155
    //                   1 161
    //                   2 167
    //                   3 173
    //                   4 179
    //                   5 185
    //                   6 191
    //                   7 197
    //                   8 203
    //                   9 209
    //                   10 215
    //                   11 221
    //                   12 104
    //                   13 227
    //                   14 233
    //                   15 239
    //                   16 245
    //                   17 251
    //                   18 257
    //                   19 263;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        String s = (new StringBuilder("UNKNOWN_ERROR_CODE(")).append(i).append(")").toString();
_L22:
        return tostringhelper.add("statusCode", s).add("resolution", mPendingIntent).add("message", mStatusMessage).toString();
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
        continue; /* Loop/switch isn't completed */
_L20:
        s = "SERVICE_MISSING_PERMISSION";
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ConnectionResultCreator.writeToParcel(this, parcel, i);
    }

}
