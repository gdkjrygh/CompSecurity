// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak, d

public class PreviewActivity extends Activity
{

    public PreviewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ak.c("Preview activity");
        bundle = getIntent().getData();
        if (!d.a(this).a(bundle))
        {
            bundle = (new StringBuilder("Cannot preview the app with the uri: ")).append(bundle).append(". Launching current version instead.").toString();
            ak.b(bundle);
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
            alertdialog.setTitle("Preview failure");
            alertdialog.setMessage(bundle);
            alertdialog.setButton(-1, "Continue", new android.content.DialogInterface.OnClickListener() {

                final PreviewActivity a;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                a = PreviewActivity.this;
                super();
            }
            });
            alertdialog.show();
        }
        bundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (bundle != null)
        {
            try
            {
                ak.c((new StringBuilder("Invoke the launch activity for package name: ")).append(getPackageName()).toString());
                startActivity(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                ak.a((new StringBuilder("Calling preview threw an exception: ")).append(bundle.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_187;
        }
        ak.c((new StringBuilder("No launch activity found for package name: ")).append(getPackageName()).toString());
        return;
    }
}
