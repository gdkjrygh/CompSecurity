// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package com.google.android.libraries.velour:
//            DynamicActivityLoader

public interface c
{

    public abstract Activity a();

    public abstract SharedPreferences a(String s, int i);

    public abstract DynamicActivityLoader a(String s);

    public abstract void a(Intent intent);

    public abstract boolean a(Menu menu);

    public abstract boolean a(MenuItem menuitem);

    public abstract Intent b();

    public abstract void b(Intent intent);

    public abstract boolean b(Menu menu);

    public abstract android.content.res.Resources.Theme c();

    public abstract void startActivity(Intent intent);
}
