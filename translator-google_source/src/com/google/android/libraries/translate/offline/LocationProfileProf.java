// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            OfflineDataProfileException, x, PackageType, e, 
//            ac

public abstract class LocationProfileProf
{

    public String a;
    PackageType b;
    public int c;
    public int d;
    public int e;
    public int f;

    protected LocationProfileProf(PackageType packagetype)
    {
        b = packagetype;
    }

    public static void a(JSONObject jsonobject, LocationProfileProf locationprofileprof)
    {
        if (!jsonobject.has(Key.PV.name())) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = jsonobject.getInt(Key.PV.name());
        if (!jsonobject.has(Key.MINVC.name()))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        i = jsonobject.getInt(Key.MINVC.name());
_L3:
        locationprofileprof.c = jsonobject.getInt(Key.V.name());
        locationprofileprof.d = jsonobject.getInt(Key.R.name());
        locationprofileprof.e = j;
        locationprofileprof.a = jsonobject.getString(Key.URL.name());
        locationprofileprof.f = i;
        return;
_L2:
        try
        {
            throw new OfflineDataProfileException("Invalid format found when reading profile.");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new OfflineDataProfileException("Invalid format found when reading profile.", jsonobject);
        }
        i = 0;
          goto _L3
    }

    public abstract ac a(Context context, e e1);

    public JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put(Key.V.name(), c);
        jsonobject.put(Key.R.name(), d);
        jsonobject.put(Key.PV.name(), e);
        jsonobject.put(Key.URL.name(), a);
        jsonobject.put(Key.MINVC.name(), f);
        jsonobject.put(Key.TYPE.name(), b);
        return jsonobject;
    }

    public final x b()
    {
        return new x(c, d, e, b);
    }

    public final String c()
    {
        return a.substring(0, a.lastIndexOf("/"));
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LocationProfileProf)obj;
        if (c != ((LocationProfileProf) (obj)).c)
        {
            return false;
        }
        if (e != ((LocationProfileProf) (obj)).e)
        {
            return false;
        }
        if (d != ((LocationProfileProf) (obj)).d)
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationProfileProf) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((LocationProfileProf) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = c;
        int k = e;
        int l = d;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + (((j + 31) * 31 + k) * 31 + l) * 31;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(2);
        }
        catch (JSONException jsonexception)
        {
            String s1 = a;
            int i = d;
            int j = c;
            int k = f;
            String s2 = String.valueOf(jsonexception.getMessage());
            return (new StringBuilder(String.valueOf(s1).length() + 78 + String.valueOf(s2).length())).append("pkg=").append(s1).append(" revision=").append(i).append(" sz=").append(j).append(" minimumVersionCode=").append(k).append(" error=").append(s2).toString();
        }
        return s;
    }

    private class Key extends Enum
    {

        public static final Key MINVC;
        public static final Key PV;
        public static final Key R;
        public static final Key TYPE;
        public static final Key URL;
        public static final Key V;
        private static final Key a[];

        public static Key valueOf(String s)
        {
            return (Key)Enum.valueOf(com/google/android/libraries/translate/offline/LocationProfileProf$Key, s);
        }

        public static Key[] values()
        {
            return (Key[])a.clone();
        }

        static 
        {
            V = new Key("V", 0);
            R = new Key("R", 1);
            PV = new Key("PV", 2);
            URL = new Key("URL", 3);
            MINVC = new Key("MINVC", 4);
            TYPE = new Key("TYPE", 5);
            a = (new Key[] {
                V, R, PV, URL, MINVC, TYPE
            });
        }

        private Key(String s, int i)
        {
            super(s, i);
        }
    }

}
