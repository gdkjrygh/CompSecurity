// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import android.app.Activity;

// Referenced classes of package com.supersonic.mediationsdk.sdk:
//            BaseApi, OfferwallListener

public interface OfferwallApi
    extends BaseApi
{

    public abstract void getOfferwallCredits();

    public abstract void initOfferwall(Activity activity, String s, String s1);

    public abstract boolean isOfferwallAvailable();

    public abstract void setOfferwallListener(OfferwallListener offerwalllistener);

    public abstract void showOfferwall();
}
