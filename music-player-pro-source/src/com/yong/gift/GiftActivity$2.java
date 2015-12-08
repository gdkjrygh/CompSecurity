// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.yong.gift:
//            GiftActivity, GiftListViewAdapter, GiftEntity

class this._cls0
    implements android.widget.temClickListener
{

    final GiftActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Intent("android.intent.action.VIEW", Uri.parse(((GiftEntity)GiftActivity.access$1(GiftActivity.this).getItem(i)).getMarketUrl()));
        startActivity(adapterview);
    }

    pter()
    {
        this$0 = GiftActivity.this;
        super();
    }
}
