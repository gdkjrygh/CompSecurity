// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bqi;

public class PlayServicesAvailabilityActivity extends Activity
{

    public PlayServicesAvailabilityActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/connect/PlayServicesAvailabilityActivity);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bqi.a();
        int i = bqi.a(this);
        if (i != 0)
        {
            bqi.a(this, i, new android.content.DialogInterface.OnCancelListener() {

                private PlayServicesAvailabilityActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    a.finish();
                }

            
            {
                a = PlayServicesAvailabilityActivity.this;
                super();
            }
            }).show();
            return;
        } else
        {
            finish();
            return;
        }
    }
}
