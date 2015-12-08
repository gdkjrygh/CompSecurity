// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            e, Survey

final class ag
    implements android.os.Parcelable.Creator
{

    ag()
    {
    }

    private static Survey a(Parcel parcel)
    {
        parcel = parcel.readString();
        try
        {
            parcel = new Survey(new JSONObject(parcel));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("Corrupted JSON object written to survey parcel.", parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("Unexpected or incomplete object written to survey parcel.", parcel);
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Survey[i];
    }
}
