// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.util.Pair;
import com.google.android.libraries.translate.e.d;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            g, TranslateLocationProfileProf, al, OfflineDataProfileException, 
//            o, OfflinePackage, LocationProfileProf, x

public final class LocationProfile
{

    Set a;
    int b;

    public LocationProfile()
    {
        a = new HashSet();
        b = 2020;
    }

    public static LocationProfile a(JSONObject jsonobject)
    {
        boolean flag = false;
        g g1 = new g();
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray(Key.PROF.name());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new OfflineDataProfileException("Failed to parse profile.", jsonobject);
        }
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        g1.a(TranslateLocationProfileProf.a(jsonarray.getJSONObject(i)));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!jsonobject.has(Key.PROFWL.name())) goto _L5; else goto _L4
_L4:
        jsonarray = jsonobject.getJSONArray(Key.PROFWL.name());
        if (jsonarray == null) goto _L5; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
_L7:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        g1.a(al.a(jsonarray.getJSONObject(i)));
        i++;
        if (true) goto _L7; else goto _L5
_L5:
        if (jsonobject.has(Key.LV.name()))
        {
            i = jsonobject.getInt(Key.LV.name());
            g1.a.b = i;
        }
        return g1.a;
    }

    public final boolean a(OfflinePackage offlinepackage)
    {
        Set set = o.e();
        x x1 = null;
        int i = ((Integer)d.d().second).intValue();
        x x3 = offlinepackage.a();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LocationProfileProf locationprofileprof = (LocationProfileProf)iterator.next();
            x x2 = locationprofileprof.b();
            if (set.contains(Integer.valueOf(x2.c)) && locationprofileprof.f <= i && (x2.a(x3) && x2.a(x1)))
            {
                x1 = x2;
            }
        } while (true);
        if (x1 != null)
        {
            offlinepackage.k = x1.a;
            offlinepackage.l = x1.b;
            return true;
        } else
        {
            return false;
        }
    }

    private class Key extends Enum
    {

        public static final Key LV;
        public static final Key PROF;
        public static final Key PROFWL;
        private static final Key a[];

        public static Key valueOf(String s)
        {
            return (Key)Enum.valueOf(com/google/android/libraries/translate/offline/LocationProfile$Key, s);
        }

        public static Key[] values()
        {
            return (Key[])a.clone();
        }

        static 
        {
            PROF = new Key("PROF", 0);
            PROFWL = new Key("PROFWL", 1);
            LV = new Key("LV", 2);
            a = (new Key[] {
                PROF, PROFWL, LV
            });
        }

        private Key(String s, int i)
        {
            super(s, i);
        }
    }

}
