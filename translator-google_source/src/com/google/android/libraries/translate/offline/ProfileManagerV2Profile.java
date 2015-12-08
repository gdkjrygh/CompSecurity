// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ag, ProfileManagerV2PkgProfile, OfflineDataProfileException

public final class ProfileManagerV2Profile
{

    Set a;
    int b;

    public ProfileManagerV2Profile()
    {
        a = new HashSet();
    }

    public static ProfileManagerV2Profile a(JSONObject jsonobject)
    {
        ag ag1 = new ag();
        int i;
        if (!jsonobject.has(Key.V.name()))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        i = jsonobject.getInt(Key.V.name());
        ag1.a.b = i;
        jsonobject = jsonobject.getJSONObject(Key.PKG.name());
        if (jsonobject != null)
        {
            try
            {
                Object obj;
                for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); ag1.a.a.add(obj))
                {
                    obj = (String)iterator.next();
                    obj = ProfileManagerV2PkgProfile.a(((String) (obj)), i, jsonobject.getJSONObject(((String) (obj))));
                }

            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new OfflineDataProfileException("Failed to parse profile.", jsonobject);
            }
        }
        break MISSING_BLOCK_LABEL_132;
        throw new OfflineDataProfileException("Failed to parse profile: no V field.");
        return ag1.a;
    }

    public static boolean b(String s)
    {
        return TextUtils.equals(s, "c") || TextUtils.equals(s, "en");
    }

    public final ProfileManagerV2PkgProfile a(String s)
    {
label0:
        {
            if (b(s))
            {
                s = a.iterator();
                ProfileManagerV2PkgProfile profilemanagerv2pkgprofile;
                do
                {
                    if (!s.hasNext())
                    {
                        break label0;
                    }
                    profilemanagerv2pkgprofile = (ProfileManagerV2PkgProfile)s.next();
                } while (!b(profilemanagerv2pkgprofile.a()));
                return profilemanagerv2pkgprofile;
            }
            Iterator iterator = a.iterator();
            ProfileManagerV2PkgProfile profilemanagerv2pkgprofile1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                profilemanagerv2pkgprofile1 = (ProfileManagerV2PkgProfile)iterator.next();
            } while (!TextUtils.equals(s, profilemanagerv2pkgprofile1.a()));
            return profilemanagerv2pkgprofile1;
        }
        return null;
    }

    private class Key extends Enum
    {

        public static final Key PKG;
        public static final Key V;
        private static final Key a[];

        public static Key valueOf(String s)
        {
            return (Key)Enum.valueOf(com/google/android/libraries/translate/offline/ProfileManagerV2Profile$Key, s);
        }

        public static Key[] values()
        {
            return (Key[])a.clone();
        }

        static 
        {
            PKG = new Key("PKG", 0);
            V = new Key("V", 1);
            a = (new Key[] {
                PKG, V
            });
        }

        private Key(String s, int i)
        {
            super(s, i);
        }
    }

}
