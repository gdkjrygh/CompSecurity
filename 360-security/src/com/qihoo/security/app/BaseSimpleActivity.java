// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.app.Activity;
import android.os.Bundle;
import com.qihoo.security.service.d;

public class BaseSimpleActivity extends Activity
{

    public BaseSimpleActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d.a(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d.b(getClass().getSimpleName(), Integer.valueOf(getClass().hashCode()));
    }
}
