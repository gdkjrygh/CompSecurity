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
//            bh, TagManager

public class PreviewActivity extends Activity
{

    public PreviewActivity()
    {
    }

    private void d(String s, String s1, String s2)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
        alertdialog.setTitle(s);
        alertdialog.setMessage(s1);
        alertdialog.setButton(-1, s2, new _cls1());
        alertdialog.show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bh.U("Preview activity");
        bundle = getIntent().getData();
        if (!TagManager.getInstance(this).i(bundle))
        {
            bundle = (new StringBuilder("Cannot preview the app with the uri: ")).append(bundle).append(". Launching current version instead.").toString();
            bh.W(bundle);
            d("Preview failure", bundle, "Continue");
        }
        bundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (bundle != null)
        {
            try
            {
                bh.U((new StringBuilder("Invoke the launch activity for package name: ")).append(getPackageName()).toString());
                startActivity(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bh.T((new StringBuilder("Calling preview threw an exception: ")).append(bundle.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_154;
        }
        bh.U((new StringBuilder("No launch activity found for package name: ")).append(getPackageName()).toString());
        return;
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final PreviewActivity asl;

        public void onClick(DialogInterface dialoginterface, int i)
        {
        }

        _cls1()
        {
            asl = PreviewActivity.this;
            super();
        }
    }

}
