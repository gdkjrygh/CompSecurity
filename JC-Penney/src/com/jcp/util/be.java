// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

final class be extends DatePickerDialog
{

    be(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        super(context, ondatesetlistener, i, j, k);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int i = getContext().getResources().getIdentifier("android:id/year", null, null);
        if (i != 0)
        {
            bundle = findViewById(i);
            if (bundle != null)
            {
                bundle.setVisibility(8);
            }
        }
    }
}
