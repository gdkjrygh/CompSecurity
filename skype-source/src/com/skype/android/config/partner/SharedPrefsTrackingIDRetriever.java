// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.content.Context;
import android.content.SharedPreferences;
import com.skype.android.util.chained.AbstractChainedStringRetriever;

// Referenced classes of package com.skype.android.config.partner:
//            TrackingIdSource

public class SharedPrefsTrackingIDRetriever extends AbstractChainedStringRetriever
{

    private static final String PRELOAD_KEY_PARTNER_ID = "PartnerId";
    private static final String PRELOAD_SHARED_PREF_NAME = "preload_shared_pref";
    private final SharedPreferences sharedPreferences;

    public SharedPrefsTrackingIDRetriever(Context context)
    {
        sharedPreferences = context.getSharedPreferences("preload_shared_pref", 0);
    }

    protected volatile boolean needFurtherInquiry(Object obj)
    {
        return needFurtherInquiry((String)obj);
    }

    protected boolean needFurtherInquiry(String s)
    {
        return TrackingIdSource.isPlaceholder(s);
    }

    protected volatile void onInquiryResult(Object obj)
    {
        onInquiryResult((String)obj);
    }

    protected void onInquiryResult(String s)
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("PartnerId", s);
        editor.apply();
    }

    protected volatile Object tryGetValue()
    {
        return tryGetValue();
    }

    protected String tryGetValue()
    {
        return sharedPreferences.getString("PartnerId", null);
    }
}
