// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            LocationProfileProf, PackageType, OfflineDataProfileException, am, 
//            e, ac

public final class al extends LocationProfileProf
{

    protected al()
    {
        super(PackageType.WORD_LENS);
    }

    public static al a(String s)
    {
        al al1;
        try
        {
            al1 = a(new JSONObject(s));
        }
        catch (JSONException jsonexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Invalid format found when reading profile. jsonStr=".concat(s);
            } else
            {
                s = new String("Invalid format found when reading profile. jsonStr=");
            }
            throw new OfflineDataProfileException(s, jsonexception);
        }
        return al1;
    }

    public static al a(JSONObject jsonobject)
    {
        al al1 = new al();
        a(jsonobject, ((LocationProfileProf) (al1)));
        return al1;
    }

    public final ac a(Context context, e e)
    {
        switch (this.e)
        {
        default:
            return null;

        case 2: // '\002'
            return new am(context, this, e);
        }
    }
}
