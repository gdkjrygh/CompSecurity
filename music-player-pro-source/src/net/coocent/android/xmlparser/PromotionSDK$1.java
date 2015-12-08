// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.view.View;
import com.umeng.analytics.MobclickAgent;

// Referenced classes of package net.coocent.android.xmlparser:
//            PromotionSDK

class 
    implements android.view.tener
{

    public void onClick(View view)
    {
        MobclickAgent.onEvent(PromotionSDK.access$0(), "open");
        PromotionSDK.showPromoationApp();
    }

    ()
    {
    }
}
