// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.Intent;
import com.facebook.orca.compose.ai;

public class e
{

    public e()
    {
    }

    public static int a(Intent intent, String s, int i)
    {
        while (intent == null || !intent.hasExtra(s)) 
        {
            return i;
        }
        i = intent.getIntExtra(s, i);
        intent.removeExtra(s);
        return i;
    }

    public static ai a(Intent intent)
    {
        while (intent == null || !intent.getBooleanExtra("show_composer", false)) 
        {
            return null;
        }
        ai ai1 = new ai();
        ai1.a = intent.getStringExtra("composer_initial_text");
        ai1.b = intent.getParcelableArrayListExtra("composer_photo_uri_list");
        intent.removeExtra("show_composer");
        ai1.c = a(intent, "open_media_picker_source", -1);
        return ai1;
    }

    public static String a(Intent intent, String s)
    {
        while (intent == null || !intent.hasExtra(s)) 
        {
            return null;
        }
        String s1 = intent.getStringExtra(s);
        intent.removeExtra(s);
        return s1;
    }

    public static boolean a(Intent intent, String s, boolean flag)
    {
        while (intent == null || !intent.hasExtra(s)) 
        {
            return flag;
        }
        flag = intent.getBooleanExtra(s, flag);
        intent.removeExtra(s);
        return flag;
    }
}
