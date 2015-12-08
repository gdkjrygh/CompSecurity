// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.pref;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.util.AttributeSet;

public final class BSPlusPreference extends Preference
{

    private static final String MARKET_URL = "market://details?id=com.srowen.bs.android";

    public BSPlusPreference(Context context)
    {
        super(context);
        configureClickListener();
    }

    public BSPlusPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        configureClickListener();
    }

    public BSPlusPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        configureClickListener();
    }

    private void configureClickListener()
    {
        setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final BSPlusPreference this$0;

            public boolean onPreferenceClick(Preference preference)
            {
                preference = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.srowen.bs.android"));
                preference.addFlags(0x80000);
                getContext().startActivity(preference);
                return true;
            }

            
            {
                this$0 = BSPlusPreference.this;
                super();
            }
        });
    }
}
