// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import cyb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            BadDecideObjectException

public class Survey
    implements Parcelable
{

    public final int a;
    public final int b;
    public final List c;
    private final JSONObject d;

    Survey(JSONObject jsonobject)
    {
        int i;
        i = 0;
        super();
        try
        {
            d = jsonobject;
            a = jsonobject.getInt("id");
            b = jsonobject.getJSONArray("collections").getJSONObject(0).getInt("id");
            jsonobject = jsonobject.getJSONArray("questions");
            if (jsonobject.length() == 0)
            {
                throw new BadDecideObjectException("Survey has no questions.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadDecideObjectException("Survey JSON was unexpected or bad", jsonobject);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
_L1:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        arraylist.add(new cyb(jsonobject.getJSONObject(i), (byte)0));
        i++;
          goto _L1
        c = Collections.unmodifiableList(arraylist);
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(d.toString());
    }

    static 
    {
        new android.os.Parcelable.Creator() {

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

        };
    }
}
