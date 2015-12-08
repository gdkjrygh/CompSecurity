// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.Strings;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

class this._cls0
    implements Func2
{

    final PromoBannerView this$0;

    public Boolean call(String s, String s1)
    {
        boolean flag;
        if (!Strings.isNullOrEmpty(s) || !Strings.isNullOrEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((String)obj, (String)obj1);
    }

    ()
    {
        this$0 = PromoBannerView.this;
        super();
    }
}
