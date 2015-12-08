// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.permissions.runtime;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b;
import omr;
import p;

public class RuntimePermissionsActivity extends omr
{

    private static final int f;

    public RuntimePermissionsActivity()
    {
    }

    public static Intent a(Context context, String as[])
    {
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        context = new Intent(context, com/google/android/apps/photos/permissions/runtime/RuntimePermissionsActivity);
        context.putExtra("intent_extra_permissions_required", as);
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            requestPermissions(getIntent().getStringArrayExtra("intent_extra_permissions_required"), f);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (i == f)
        {
            Intent intent = new Intent();
            intent.putExtra("intent_extra_permissions_required", as);
            intent.putExtra("intent_extra_permissions_grant_result", ai);
            setResult(-1, intent);
            finish();
        }
    }

    static 
    {
        f = b.tS;
    }
}
