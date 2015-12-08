// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Window;
import com.pandora.android.view.c;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

public class ErrorStateActivity extends BaseFragmentActivity
{

    public ErrorStateActivity()
    {
    }

    protected void a(Context context, Intent intent, String s)
    {
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected IntentFilter l()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040050);
        getWindow().setBackgroundDrawable(new c());
    }
}
