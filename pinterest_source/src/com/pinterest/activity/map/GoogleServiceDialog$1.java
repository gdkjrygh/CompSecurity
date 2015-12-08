// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.pinterest.activity.map:
//            GoogleServiceDialog

class this._cls0
    implements android.view.rviceDialog._cls1
{

    final GoogleServiceDialog this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms"));
        try
        {
            getActivity().startActivity(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.gms")));
        }
        dismiss();
    }

    ()
    {
        this$0 = GoogleServiceDialog.this;
        super();
    }
}
