// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.c;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.k;
import com.facebook.ads.internal.adapters.n;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{

    public static String a(int i, NativeAd nativead)
    {
        String s;
        s = null;
        if (nativead == null)
        {
            return "";
        }
        if (TextUtils.isEmpty(nativead.getAdIcon().getUrl())) goto _L2; else goto _L1
_L1:
        Object obj = nativead.getAdIcon().getUrl();
_L15:
        Object obj1 = obj;
_L3:
        if (TextUtils.isEmpty(nativead.getAdCoverImage().getUrl()))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj = nativead.getAdCoverImage().getUrl();
_L13:
        Object obj2 = obj;
_L4:
        if (TextUtils.isEmpty(nativead.getAdTitle()))
        {
            break MISSING_BLOCK_LABEL_320;
        }
        obj = nativead.getAdTitle();
_L12:
        Object obj3 = obj;
_L5:
        if (TextUtils.isEmpty(nativead.getAdBody()))
        {
            break MISSING_BLOCK_LABEL_315;
        }
        obj = nativead.getAdBody();
_L11:
        Object obj4 = obj;
_L6:
        if (TextUtils.isEmpty(nativead.getAdSocialContext()))
        {
            break MISSING_BLOCK_LABEL_310;
        }
        obj = nativead.getAdSocialContext();
_L10:
        Object obj5 = obj;
_L7:
        String s1;
        boolean flag;
        try
        {
            if (TextUtils.isEmpty(nativead.getAdCallToAction()))
            {
                break MISSING_BLOCK_LABEL_305;
            }
            obj = nativead.getAdCallToAction();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
_L9:
        s1 = a(nativead);
        flag = TextUtils.isEmpty(s1);
        if (!flag)
        {
            s = s1;
        }
_L8:
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("operation", i);
            jsonobject.put("ad_id", nativead.getId());
            jsonobject.put("icon_url", obj1);
            jsonobject.put("cover_url", obj2);
            jsonobject.put("title", obj3);
            jsonobject.put("body", obj4);
            jsonobject.put("social_context", obj5);
            jsonobject.put("call2action", obj);
            jsonobject.put("fbad", s);
        }
        // Misplaced declaration of an exception variable
        catch (NativeAd nativead)
        {
            nativead.printStackTrace();
        }
        return jsonobject.toString();
        obj;
        obj1 = null;
          goto _L3
        obj;
        obj2 = null;
          goto _L4
        obj;
        obj3 = null;
          goto _L5
        obj;
        obj4 = null;
          goto _L6
        obj;
        obj5 = null;
          goto _L7
        Exception exception;
        exception;
          goto _L8
        obj = null;
          goto _L9
        obj = null;
          goto _L10
        obj = null;
          goto _L11
        obj = null;
          goto _L12
        obj = null;
          goto _L13
_L2:
        obj = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private static String a(NativeAd nativead)
    {
        Field field = nativead.getClass().getDeclaredField("j");
        field.setAccessible(true);
        nativead = ((NativeAd) (field.get(nativead)));
        if (!(nativead instanceof k))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        nativead = (k)nativead;
        field = nativead.getClass().getDeclaredField("c");
        field.setAccessible(true);
        nativead = ((NativeAd) (field.get(nativead)));
        if (!(nativead instanceof n))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        nativead = (n)nativead;
        field = nativead.getClass().getDeclaredField("b");
        field.setAccessible(true);
        nativead = ((NativeAd) (field.get(nativead)));
        if (!(nativead instanceof Uri))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        nativead = ((Uri)nativead).toString();
        return nativead;
        nativead;
        return "";
    }
}
