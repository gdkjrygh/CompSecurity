// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            LocationProfileProf, PackageType, OfflineDataProfileException, aj, 
//            e, ac

public final class TranslateLocationProfileProf extends LocationProfileProf
{

    String g;
    int h;

    private TranslateLocationProfileProf()
    {
        super(PackageType.TRANSLATE);
    }

    public static TranslateLocationProfileProf a(String s)
    {
        TranslateLocationProfileProf translatelocationprofileprof;
        try
        {
            translatelocationprofileprof = a(new JSONObject(s));
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
        return translatelocationprofileprof;
    }

    public static TranslateLocationProfileProf a(JSONObject jsonobject)
    {
        TranslateLocationProfileProf translatelocationprofileprof;
        translatelocationprofileprof = new TranslateLocationProfileProf();
        LocationProfileProf.a(jsonobject, translatelocationprofileprof);
        if (!jsonobject.has(Key.RRV.name()) || !jsonobject.has(Key.RRURL.name()))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        int i = jsonobject.getInt(Key.RRV.name());
        translatelocationprofileprof.g = jsonobject.getString(Key.RRURL.name());
        translatelocationprofileprof.h = i;
        return translatelocationprofileprof;
        try
        {
            translatelocationprofileprof.g = "";
            translatelocationprofileprof.h = -1;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new OfflineDataProfileException("Invalid format found when reading profile.", jsonobject);
        }
        return translatelocationprofileprof;
    }

    public final ac a(Context context, e e)
    {
        switch (this.e)
        {
        default:
            return null;

        case 2: // '\002'
            return new aj(context, this, e);
        }
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = super.a();
        jsonobject.put(Key.RRURL.name(), g);
        jsonobject.put(Key.RRV.name(), h);
        return jsonobject;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (TranslateLocationProfileProf)obj;
            if (g == null)
            {
                if (((TranslateLocationProfileProf) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((TranslateLocationProfileProf) (obj)).g))
            {
                return false;
            }
            if (h != ((TranslateLocationProfileProf) (obj)).h)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = c;
        int l = e;
        int i;
        int i1;
        int j1;
        if (g == null)
        {
            i = 0;
        } else
        {
            i = g.hashCode();
        }
        i1 = h;
        j1 = d;
        if (a != null)
        {
            j = a.hashCode();
        }
        return (((i + ((k + 31) * 31 + l) * 31) * 31 + i1) * 31 + j1) * 31 + j;
    }

    public final String toString()
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
            String s2 = g;
            int k = h;
            int l = f;
            String s3 = String.valueOf(jsonexception.getMessage());
            return (new StringBuilder(String.valueOf(s1).length() + 129 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("pkg=").append(s1).append(" revision=").append(i).append(" sz=").append(j).append(" rapidResponseUrl=").append(s2).append(" rapidResponseVersion=").append(k).append(" minimumVersionCode=").append(l).append(" error=").append(s3).toString();
        }
        return s;
    }

    private class Key extends Enum
    {

        public static final Key RRURL;
        public static final Key RRV;
        private static final Key a[];

        public static Key valueOf(String s)
        {
            return (Key)Enum.valueOf(com/google/android/libraries/translate/offline/TranslateLocationProfileProf$Key, s);
        }

        public static Key[] values()
        {
            return (Key[])a.clone();
        }

        static 
        {
            RRURL = new Key("RRURL", 0);
            RRV = new Key("RRV", 1);
            a = (new Key[] {
                RRURL, RRV
            });
        }

        private Key(String s, int i)
        {
            super(s, i);
        }
    }

}
