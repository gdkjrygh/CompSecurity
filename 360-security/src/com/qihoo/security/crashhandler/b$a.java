// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;

// Referenced classes of package com.qihoo.security.crashhandler:
//            b

static final class  extends Instrumentation
{

    public Activity newActivity(ClassLoader classloader, String s, Intent intent)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        try
        {
            classloader = super.newActivity(classloader, s, intent);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            String s1 = b.a("ActivityThread".getBytes());
            Parcel parcel = Parcel.obtain();
            intent.writeToParcel(parcel, 0);
            Log.e(s1, b.a(parcel.marshall()));
            parcel.recycle();
            Log.e(s1, b.a(s.getBytes()));
            throw classloader;
        }
        return classloader;
    }

    ()
    {
    }
}
