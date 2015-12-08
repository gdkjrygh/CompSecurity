// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.widget.Toast;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

public class Toaster
{

    public Toaster()
    {
    }

    public static void longerToast(String s)
    {
        toast(s, 1);
    }

    public static void simpleToast(String s)
    {
        toast(s, 0);
    }

    public static void toast(String s, int i)
    {
        android.content.Context context = UAirship.shared().getApplicationContext();
        if (context == null)
        {
            Logger.info("Toaster - applicationContext is null, bailing out");
            return;
        } else
        {
            Toast.makeText(context, s, i).show();
            return;
        }
    }
}
