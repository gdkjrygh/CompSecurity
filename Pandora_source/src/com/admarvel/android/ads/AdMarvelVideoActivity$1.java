// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity, AdMarvelVideoView

class this._cls0
    implements Runnable
{

    final AdMarvelVideoActivity this$0;

    public void run()
    {
        if (AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this) == null || AdMarvelVideoActivity.access$1(AdMarvelVideoActivity.this))
        {
            return;
        } else
        {
            AdMarvelVideoActivity.access$4(AdMarvelVideoActivity.this, videoDuration - AdMarvelVideoActivity.access$2(AdMarvelVideoActivity.this, AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this).getCurrentPosition()), AdMarvelVideoActivity.access$3(AdMarvelVideoActivity.this));
            AdMarvelVideoActivity.access$5(AdMarvelVideoActivity.this, AdMarvelVideoActivity.access$2(AdMarvelVideoActivity.this, AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this).getCurrentPosition()));
            return;
        }
    }

    ()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
