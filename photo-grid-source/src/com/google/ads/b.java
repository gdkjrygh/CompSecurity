// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b
{

    private Field a;
    private Field b;
    private Field c;
    private Field d;

    public b()
    {
        Object obj;
        Iterator iterator;
        c = a(com/google/android/gms/ads/AdRequest);
        d = a(com/google/android/gms/ads/doubleclick/PublisherAdRequest);
        obj = c.get((new com.google.android.gms.ads.AdRequest.Builder()).addTestDevice("1").addTestDevice("2").addTestDevice("3").setGender(1234).build());
        b = null;
        iterator = a(obj, java/util/Set).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Field field = (Field)iterator.next();
            if (((Set)field.get(obj)).size() < 3)
            {
                continue;
            }
            b = field;
            break;
        } while (true);
        a = null;
        iterator = a(obj, Integer.TYPE).iterator();
_L2:
        Field field1;
        int i;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_199;
            }
            field1 = (Field)iterator.next();
            i = field1.getInt(obj);
        } while (i == 1234 || i != -1);
        a = field1;
        if (true) goto _L2; else goto _L1
_L1:
        IllegalAccessException illegalaccessexception;
        illegalaccessexception;
        Log.e("Ads", "Could not initialize ad request utilities.", illegalaccessexception);
    }

    private Field a(Class class1)
    {
        class1 = class1.getDeclaredFields();
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Field field = class1[i];
            Class class2 = field.getType();
            if (!java/lang/String.isAssignableFrom(class2) && !Integer.TYPE.isAssignableFrom(class2))
            {
                if (!field.isAccessible())
                {
                    field.setAccessible(true);
                }
                return field;
            }
        }

        return null;
    }

    private List a(Object obj, Class class1)
    {
        ArrayList arraylist = new ArrayList();
        obj = obj.getClass().getDeclaredFields();
        int j = obj.length;
        for (int i = 0; i < j; i++)
        {
            Field field = obj[i];
            if ((field.getModifiers() & 8) > 0)
            {
                continue;
            }
            if (!field.isAccessible())
            {
                field.setAccessible(true);
            }
            if (class1.equals(field.getType()))
            {
                arraylist.add(field);
            }
        }

        return arraylist;
    }

    public com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder a(AdRequest adrequest)
    {
        Object obj;
        com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder builder;
        try
        {
            obj = c.get(adrequest);
            builder = new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder();
            for (Iterator iterator = adrequest.getKeywords().iterator(); iterator.hasNext(); builder.addKeyword((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (AdRequest adrequest)
        {
            Log.e("Ads", "Could not translate from AdRequest to PublisherAdRequest.", adrequest);
            return null;
        }
        Object obj1 = adrequest.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, ((android.os.Bundle) (obj1)));
        if (b != null)
        {
            for (obj1 = ((Set)b.get(obj)).iterator(); ((Iterator) (obj1)).hasNext(); builder.addTestDevice((String)((Iterator) (obj1)).next())) { }
        }
        if (adrequest.getBirthday() != null)
        {
            builder.setBirthday(adrequest.getBirthday());
        }
        obj1 = adrequest.getContentUrl();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        builder.setContentUrl(((String) (obj1)));
        builder.setGender(adrequest.getGender());
        adrequest = adrequest.getLocation();
        if (adrequest == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        builder.setLocation(adrequest);
        int i;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        i = a.getInt(obj);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        builder.tagForChildDirectedTreatment(false);
        break MISSING_BLOCK_LABEL_244;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        builder.tagForChildDirectedTreatment(true);
        return builder;
    }

    public com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder a(PublisherAdRequest publisheradrequest)
    {
        com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder builder;
        Object obj;
        try
        {
            obj = d.get(publisheradrequest);
            builder = new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder();
            for (Iterator iterator = publisheradrequest.getKeywords().iterator(); iterator.hasNext(); builder.addKeyword((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (PublisherAdRequest publisheradrequest)
        {
            Log.e("Ads", "Could not make copy of PublisherAdRequest.", publisheradrequest);
            return null;
        }
        Object obj1 = publisheradrequest.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, ((android.os.Bundle) (obj1)));
        if (b != null)
        {
            for (obj1 = ((Set)b.get(obj)).iterator(); ((Iterator) (obj1)).hasNext(); builder.addTestDevice((String)((Iterator) (obj1)).next())) { }
        }
        if (publisheradrequest.getBirthday() != null)
        {
            builder.setBirthday(publisheradrequest.getBirthday());
        }
        obj1 = publisheradrequest.getContentUrl();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        builder.setContentUrl(((String) (obj1)));
        builder.setGender(publisheradrequest.getGender());
        obj1 = publisheradrequest.getLocation();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        builder.setLocation(((android.location.Location) (obj1)));
        if (a == null) goto _L2; else goto _L1
_L1:
        int i = a.getInt(obj);
        if (i != 0) goto _L4; else goto _L3
_L3:
        builder.tagForChildDirectedTreatment(false);
_L2:
        publisheradrequest = publisheradrequest.getPublisherProvidedId();
        if (publisheradrequest == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        builder.setPublisherProvidedId(publisheradrequest);
        break MISSING_BLOCK_LABEL_265;
_L4:
        if (i != 1) goto _L2; else goto _L5
_L5:
        builder.tagForChildDirectedTreatment(true);
          goto _L2
        return builder;
    }
}
