// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.daydream;

import android.content.Context;
import android.content.SharedPreferences;
import android.service.dreams.DreamService;
import android.text.TextUtils;
import ekq;
import ezw;
import ezx;
import ezy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mmv;
import mmx;
import olm;

// Referenced classes of package com.google.android.apps.photos.daydream:
//            DreamViewFlipper

public class PhotosDreamService extends DreamService
{

    private boolean a;
    private DreamViewFlipper b;
    private ezw c;

    public PhotosDreamService()
    {
        a = false;
    }

    public static int a(Context context)
    {
        String s = context.getSharedPreferences("DreamSettings", 0).getString("selected_account_gaia_id", null);
        context = (mmv)olm.a(context, mmv);
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split(":", 2);
            s = as[0];
            String s1 = as[1];
            int i = context.b(s1);
            if (i == -1)
            {
                return context.b(s, s1);
            } else
            {
                return i;
            }
        } else
        {
            return -1;
        }
    }

    public static DreamViewFlipper a(PhotosDreamService photosdreamservice, DreamViewFlipper dreamviewflipper)
    {
        photosdreamservice.b = dreamviewflipper;
        return dreamviewflipper;
    }

    public static Set a(int i, Context context)
    {
        Object obj = olm.c(context, ezy);
        context = new HashSet();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); context.addAll(((ezy)((Iterator) (obj)).next()).a(i))) { }
        return context;
    }

    public static void a(int i, Context context, Set set)
    {
        ezy ezy1;
        HashSet hashset;
label0:
        for (context = olm.c(context, ezy).iterator(); context.hasNext(); ezy1.a(i, hashset))
        {
            ezy1 = (ezy)context.next();
            hashset = new HashSet();
            Iterator iterator = set.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                ekq ekq1 = (ekq)iterator.next();
                if (((String)ezy1.a()).equals(ekq1.a()))
                {
                    hashset.add(ekq1);
                }
            } while (true);
        }

    }

    public static void a(Context context, int i)
    {
        Object obj = ((mmv)olm.a(context, mmv)).a(i);
        String s = ((mmx) (obj)).b("account_name");
        obj = ((mmx) (obj)).b("gaia_id");
        context.getSharedPreferences("DreamSettings", 0).edit().putString("selected_account_gaia_id", (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append(":").append(((String) (obj))).toString()).commit();
    }

    public static boolean a(PhotosDreamService photosdreamservice)
    {
        return photosdreamservice.a;
    }

    public static DreamViewFlipper b(PhotosDreamService photosdreamservice)
    {
        return photosdreamservice.b;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setInteractive(false);
        setFullscreen(true);
        int i = a(this);
        if (c != null)
        {
            c.cancel(true);
        }
        c = new ezw(getApplicationContext(), new ezx(this));
        c.execute(new Integer[] {
            Integer.valueOf(i)
        });
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.cancel(true);
    }

    public void onDreamingStarted()
    {
        super.onDreamingStarted();
        a = true;
        if (b != null)
        {
            b.a(this);
        }
    }

    public void onDreamingStopped()
    {
        super.onDreamingStopped();
        a = false;
        if (b != null)
        {
            b.a();
        }
    }
}
