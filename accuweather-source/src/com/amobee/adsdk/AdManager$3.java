// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import java.util.ArrayList;

// Referenced classes of package com.amobee.adsdk:
//            AdManager, AmobeeAdPlaceholder, NetworkHelper

class val.index
    implements Runnable
{

    final AdManager this$0;
    private final int val$index;
    private final ArrayList val$placeholderList;

    public void run()
    {
        NetworkHelper.doRequest((AmobeeAdPlaceholder)val$placeholderList.get(val$index));
    }

    r()
    {
        this$0 = final_admanager;
        val$placeholderList = arraylist;
        val$index = I.this;
        super();
    }
}
