// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            t, j, i

public class PreviewActivity extends Activity
{

    public PreviewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t.c("Preview activity");
        bundle = getIntent().getData();
        if (!j.a(this).a(bundle))
        {
            bundle = (new StringBuilder("Cannot preview the app with the uri: ")).append(bundle).append(". Launching current version instead.").toString();
            t.b(bundle);
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
            alertdialog.setTitle("Preview failure");
            alertdialog.setMessage(bundle);
            alertdialog.setButton(-1, "Continue", new i(this));
            alertdialog.show();
        }
        bundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (bundle != null)
        {
            try
            {
                t.c((new StringBuilder("Invoke the launch activity for package name: ")).append(getPackageName()).toString());
                startActivity(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                t.a((new StringBuilder("Calling preview threw an exception: ")).append(bundle.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_187;
        }
        t.c((new StringBuilder("No launch activity found for package name: ")).append(getPackageName()).toString());
        return;
    }
}
