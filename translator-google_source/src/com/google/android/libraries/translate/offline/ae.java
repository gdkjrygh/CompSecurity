// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            aa, OfflineTranslationException, ProfileManagerV2Profile, ad, 
//            LocationProfileProf, o, x, i, 
//            ProfileManagerV2PkgProfile, PackageType

final class ae extends aa
{

    final l a;
    final o b;
    final ad c;

    ae(ad ad1, String s, boolean flag, PackageType packagetype, l l1, o o1)
    {
        c = ad1;
        a = l1;
        b = o1;
        super(s, flag, packagetype);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (ProfileManagerV2Profile)obj;
        if (obj == null || ((ProfileManagerV2Profile) (obj)).a.size() == 0)
        {
            a.a(Boolean.valueOf(false));
            return;
        }
        c.e = ((ProfileManagerV2Profile) (obj));
        obj = b;
        Object obj1 = c.i;
        if (((Integer)d.d().second).intValue() >= ((LocationProfileProf) (obj1)).f)
        {
            obj = ((o) (obj)).c;
            Object obj2 = new ArrayList();
            ((List) (obj2)).addAll(o.a(((SharedPreferences) (obj))));
            Iterator iterator = ((List) (obj2)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                LocationProfileProf locationprofileprof = (LocationProfileProf)iterator.next();
                if (!locationprofileprof.b().equals(((LocationProfileProf) (obj1)).b()))
                {
                    continue;
                }
                ((List) (obj2)).remove(locationprofileprof);
                break;
            } while (true);
            ((List) (obj2)).add(obj1);
            Collections.sort(((List) (obj2)), new i());
            obj1 = ((SharedPreferences) (obj)).getString("\t", "");
            obj2 = TextUtils.join("\t", ((Iterable) (obj2)));
            if (!TextUtils.equals(((CharSequence) (obj1)), ((CharSequence) (obj2))))
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("key_offline_locprof", ((String) (obj2)));
                ((android.content.SharedPreferences.Editor) (obj)).commit();
            }
        }
        obj = c.e.a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ProfileManagerV2PkgProfile profilemanagerv2pkgprofile = (ProfileManagerV2PkgProfile)((Iterator) (obj)).next();
            if (!c.a(profilemanagerv2pkgprofile))
            {
                c.f.add(profilemanagerv2pkgprofile);
            }
        } while (true);
        try
        {
            c.e();
            c.h = true;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.h = false;
        }
        a.a(Boolean.valueOf(c.h));
    }
}
