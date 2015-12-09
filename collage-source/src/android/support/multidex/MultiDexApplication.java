// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.app.Application;
import android.content.Context;

// Referenced classes of package android.support.multidex:
//            a

public class MultiDexApplication extends Application
{

    public MultiDexApplication()
    {
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        a.a(this);
    }
}
