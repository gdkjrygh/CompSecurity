// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import N;
import android.app.Application;
import android.content.Context;

public class MultiDexApplication extends Application
{

    public MultiDexApplication()
    {
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        N.a(this);
    }
}
