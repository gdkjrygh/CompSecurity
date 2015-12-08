// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.IntentService;
import android.content.Intent;

public abstract class cwo extends IntentService
{

    private cwu a;

    public cwo(String s)
    {
        super(s);
    }

    protected abstract cwu a();

    public void onCreate()
    {
        a = a();
        super.onCreate();
    }

    public void onDestroy()
    {
        a.a();
        super.onDestroy();
    }

    protected final void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            a.a(intent);
        }
    }
}
