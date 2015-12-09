// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobCategory, WobDatastore

final class val.wobCategory
    implements Callable
{

    final WobsManager this$0;
    final WobCategory val$wobCategory;

    private Void call()
        throws Exception
    {
        WobsManager.access$200(WobsManager.this).removeAllWobsInCategories(new Integer[] {
            Integer.valueOf(val$wobCategory.getId())
        });
        WobsManager.access$200(WobsManager.this).removeCategories(new Integer[] {
            Integer.valueOf(val$wobCategory.getId())
        });
        WobsManager.access$400(WobsManager.this, val$wobCategory);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_wobsmanager;
        val$wobCategory = WobCategory.this;
        super();
    }
}
