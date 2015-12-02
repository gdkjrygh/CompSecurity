// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.content.Context;
import android.content.Intent;
import com.facebook.orca.about.MessengerAboutActivity;
import com.facebook.orca.prefs.a;

public class l
    implements a
{

    private final Context a;

    public l(Context context)
    {
        a = context;
    }

    public void a()
    {
        Intent intent = new Intent(a, com/facebook/orca/about/MessengerAboutActivity);
        a.startActivity(intent);
    }
}
