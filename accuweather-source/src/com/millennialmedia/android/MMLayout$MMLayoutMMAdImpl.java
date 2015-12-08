// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;

// Referenced classes of package com.millennialmedia.android:
//            MMAdImpl, MMLayout, MMLog, MMWebView, 
//            MMAd

class this._cls0 extends MMAdImpl
{

    final MMLayout this$0;

    public void addView(MMWebView mmwebview, android.widget.s s)
    {
        MMLog.w("MMLayout", (new StringBuilder()).append("MMLayout adding view (").append(mmwebview).append(") to ").append(this).toString());
        MMLayout.this.addView(mmwebview, s);
    }

    volatile MMAd getCallingAd()
    {
        return getCallingAd();
    }

    MMLayout getCallingAd()
    {
        return MMLayout.this;
    }

    int getId()
    {
        return MMLayout.this.getId();
    }

    public void removeView(MMWebView mmwebview)
    {
        MMLayout.this.removeView(mmwebview);
    }

    public void setClickable(boolean flag)
    {
        MMLayout.this.setClickable(flag);
    }

    public (Context context)
    {
        this$0 = MMLayout.this;
        super(context);
    }
}
