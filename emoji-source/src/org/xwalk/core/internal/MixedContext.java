// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;

class MixedContext extends ContextWrapper
{

    private Context mActivityCtx;

    public MixedContext(Context context, Context context1)
    {
        super(context);
        mActivityCtx = context1;
    }

    public boolean bindService(Intent intent, ServiceConnection serviceconnection, int i)
    {
        return getApplicationContext().bindService(intent, serviceconnection, i);
    }

    public Context getApplicationContext()
    {
        return mActivityCtx.getApplicationContext();
    }

    public Object getSystemService(String s)
    {
        if (s.equals("layout_inflater"))
        {
            return super.getSystemService(s);
        } else
        {
            return mActivityCtx.getSystemService(s);
        }
    }

    public void unbindService(ServiceConnection serviceconnection)
    {
        getApplicationContext().unbindService(serviceconnection);
    }
}
