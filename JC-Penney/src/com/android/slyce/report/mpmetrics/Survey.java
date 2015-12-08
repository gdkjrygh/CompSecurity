// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            be, j, bf

public class Survey
    implements Parcelable
{

    public static android.os.Parcelable.Creator a = new be();
    private final JSONObject b;
    private final int c;
    private final int d;
    private final List e;

    Survey(JSONObject jsonobject)
    {
        int i;
        i = 0;
        super();
        try
        {
            b = jsonobject;
            c = jsonobject.getInt("id");
            d = jsonobject.getJSONArray("collections").getJSONObject(0).getInt("id");
            jsonobject = jsonobject.getJSONArray("questions");
            if (jsonobject.length() == 0)
            {
                throw new j("Survey has no questions.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new j("Survey JSON was unexpected or bad", jsonobject);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
_L1:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        arraylist.add(new bf(this, jsonobject.getJSONObject(i), null));
        i++;
          goto _L1
        e = Collections.unmodifiableList(arraylist);
        return;
    }

    String a()
    {
        return b.toString();
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public List d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a());
    }

}
