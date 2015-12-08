// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            af, OfflineDataProfileException, ProfileManagerV2Profile

public final class ProfileManagerV2PkgProfile
{

    String a;
    long b;
    int c;
    int d;
    String e;

    ProfileManagerV2PkgProfile()
    {
    }

    public static ProfileManagerV2PkgProfile a(String s, int i, JSONObject jsonobject)
    {
        try
        {
            String s1 = jsonobject.getString(Key.HS.name());
            af af1 = new af();
            af1.a.a = s;
            long l = jsonobject.getLong(Key.SZ.name());
            af1.a.b = l;
            af1.a.c = i;
            i = jsonobject.getInt(Key.RV.name());
            af1.a.d = i;
            af1.a.e = s1;
            s = af1.a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new OfflineDataProfileException("Invalid format found when reading profile.", s);
        }
        return s;
    }

    public final String a()
    {
        if (ProfileManagerV2Profile.b(a))
        {
            return "en";
        } else
        {
            return a;
        }
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
            obj = (ProfileManagerV2PkgProfile)obj;
            if (c != ((ProfileManagerV2PkgProfile) (obj)).c)
            {
                return false;
            }
            if (a == null)
            {
                if (((ProfileManagerV2PkgProfile) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((ProfileManagerV2PkgProfile) (obj)).a))
            {
                return false;
            }
            if (d != ((ProfileManagerV2PkgProfile) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = c;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return (i + (j + 31) * 31) * 31 + d;
    }

    public final String toString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put(Key.SZ.name(), b);
            ((JSONObject) (obj)).put(Key.RV.name(), d);
            ((JSONObject) (obj)).put(Key.HS.name(), e);
            obj = ((JSONObject) (obj)).toString(2);
        }
        catch (JSONException jsonexception)
        {
            String s = a;
            int i = c;
            int j = d;
            long l = b;
            String s1 = e;
            String s2 = String.valueOf(jsonexception.getMessage());
            return (new StringBuilder(String.valueOf(s).length() + 90 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("pkg=").append(s).append(" majorVersion=").append(i).append(" revision=").append(j).append(" sz=").append(l).append(" hashsum=").append(s1).append(" error=").append(s2).toString();
        }
        return ((String) (obj));
    }

    private class Key extends Enum
    {

        public static final Key HS;
        public static final Key RV;
        public static final Key SZ;
        private static final Key a[];

        public static Key valueOf(String s)
        {
            return (Key)Enum.valueOf(com/google/android/libraries/translate/offline/ProfileManagerV2PkgProfile$Key, s);
        }

        public static Key[] values()
        {
            return (Key[])a.clone();
        }

        static 
        {
            SZ = new Key("SZ", 0);
            RV = new Key("RV", 1);
            HS = new Key("HS", 2);
            a = (new Key[] {
                SZ, RV, HS
            });
        }

        private Key(String s, int i)
        {
            super(s, i);
        }
    }

}
