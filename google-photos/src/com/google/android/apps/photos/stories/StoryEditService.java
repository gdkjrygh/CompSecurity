// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import gad;
import imw;
import imy;
import ing;
import iqb;
import iqc;
import iqd;
import ite;
import iuj;
import iun;
import iuo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import mve;
import nxx;
import oce;
import olm;
import pbc;
import pbm;
import pdx;
import pdz;
import pew;
import pgq;
import qlv;
import qlw;

public class StoryEditService extends IntentService
{

    public StoryEditService()
    {
        this(null);
    }

    public StoryEditService(String s)
    {
        super(s);
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        imw imw1;
        imw1 = (imw)olm.a(getApplicationContext(), imw);
        obj = intent.getStringExtra("edit_type");
        if (!((String) (obj)).equals("edit_type_story")) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj3;
        iuj iuj2;
        ArrayList arraylist;
        int i;
        boolean flag;
        boolean flag2;
        i = intent.getIntExtra("account_id", -1);
        iuj2 = (iuj)intent.getParcelableExtra("story_ref");
        flag = intent.getBooleanExtra("includes_visible_moments", false);
        flag2 = intent.getBooleanExtra("includes_hidden_moments", false);
        obj3 = null;
        obj = null;
        Bundle bundle;
        Iterator iterator;
        String s1;
        try
        {
            obj1 = (pgq)qlw.a(new pgq(), intent.getByteArrayExtra("story_version"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("StoryEditService", "Unable to parse StoryVersion proto", ((Throwable) (obj1)));
            continue; /* Loop/switch isn't completed */
        }
        obj3 = obj1;
_L6:
        bundle = intent.getBundleExtra("story_edits");
        arraylist = new ArrayList();
        iterator = bundle.keySet().iterator();
        obj1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s1 = (String)iterator.next();
            pew pew1 = (pew)mve.a(new pew(), bundle.getByteArray(s1));
            if (pew1 != null)
            {
                arraylist.add(pew1);
                switch (pew1.a)
                {
                default:
                    if (false)
                    {
                    }
                    break;

                case 5: // '\005'
                    obj1 = new iqd(getApplicationContext(), i, iuj2.a, pew1.b);
                    break;

                case 14: // '\016'
                    obj = new iqc(getApplicationContext(), i, iuj2.a, pew1.e[0]);
                    break;
                }
            }
        } while (true);
        pew apew[] = new pew[arraylist.size()];
        arraylist.toArray(apew);
        intent = intent.getParcelableArrayExtra("story_render_sizes_dp");
        android.graphics.Point apoint[] = (android.graphics.Point[])Arrays.copyOf(intent, intent.length, [Landroid/graphics/Point;);
        obj3 = new imy(getApplicationContext(), i, iuj2, flag, flag2, ((pgq) (obj3)), apew, apoint);
        ((imy) (obj3)).d();
        pbc pbc1 = ((imy) (obj3)).a;
        intent = new Bundle();
        intent.putInt("task_result_error_code", ((nxx) (obj3)).l);
        intent.putSerializable("task_result_exception", ((nxx) (obj3)).n);
        if (((imy) (obj3)).l() || pbc1 == null || pbc1.a == null || pbc1.a.a == null)
        {
            intent.putBoolean("edit_succeeded", false);
            imw1.send(0, intent);
        } else
        {
            if (obj1 != null)
            {
                ((iqb) (obj1)).a();
            }
            if (obj != null)
            {
                ((iqb) (obj)).a();
            }
            obj = pbc1.a.a;
            ite.a(((pev) (obj)), iuj2.a);
            if (ite.a(this, i, ((pev) (obj)), apew))
            {
                intent.putBoolean("edit_succeeded", true);
                imw1.send(0, intent);
            } else
            {
                obj = new ing(getApplicationContext(), i, iuj2, null, null, true, false, apoint, true, false);
                ((ing) (obj)).d();
                if (!((ing) (obj)).l())
                {
                    obj = ((pbm)((ing) (obj)).t()).a.a;
                    ite.a(((pev) (obj)), iuj2.a);
                    try
                    {
                        iun.a(this, i, ((pev) (obj)), true);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.e("StoryEditService", "Failed to insertStory", ((Throwable) (obj)));
                    }
                }
                intent.putBoolean("edit_succeeded", true);
                imw1.send(0, intent);
            }
        }
_L4:
        (new oce(4)).b(getApplicationContext());
        return;
_L2:
        if (((String) (obj)).equals("edit_type_photo_caption"))
        {
            int j = intent.getIntExtra("account_id", -1);
            iuj iuj1 = (iuj)intent.getParcelableExtra("story_ref");
            Object obj4 = intent.getStringExtra("photo_caption");
            String s = intent.getStringExtra("media_key");
            Object obj2 = intent.getStringExtra("auth_key");
            boolean flag1 = intent.getBooleanExtra("includes_visible_moments", false);
            boolean flag3 = intent.getBooleanExtra("includes_hidden_moments", false);
            intent = intent.getParcelableArrayExtra("story_render_sizes_dp");
            android.graphics.Point apoint1[] = (android.graphics.Point[])Arrays.copyOf(intent, intent.length, [Landroid/graphics/Point;);
            obj4 = gad.b(getApplicationContext(), j, ((String) (obj4)), s);
            ((gad) (obj4)).d();
            intent = new Bundle();
            intent.putInt("task_result_error_code", ((nxx) (obj4)).l);
            intent.putSerializable("task_result_exception", ((nxx) (obj4)).n);
            if (((gad) (obj4)).l())
            {
                imw1.send(0, intent);
            } else
            {
                obj2 = new ing(getApplicationContext(), j, iuj1, ((String) (obj2)), null, flag1, flag3, apoint1, true, false);
                ((ing) (obj2)).d();
                if (!((ing) (obj2)).l())
                {
                    obj2 = ((pbm)((ing) (obj2)).t()).a.a;
                    ite.a(((pev) (obj2)), iuj1.a);
                    try
                    {
                        iun.a(this, j, ((pev) (obj2)), true);
                    }
                    catch (iuo iuo1)
                    {
                        Log.e("StoryEditService", "Failed to insertStory", iuo1);
                    }
                }
                intent.putBoolean("edit_succeeded", true);
                imw1.send(0, intent);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }
}
