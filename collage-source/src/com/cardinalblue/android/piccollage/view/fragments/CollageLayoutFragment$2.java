// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.IabBackgroundActivity;
import com.cardinalblue.android.piccollage.activities.WebSearchActivity;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.view.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            CollageLayoutFragment

class a
    implements com.cardinalblue.android.piccollage.view.a.gment._cls2
{

    final CollageLayoutFragment a;

    public void a()
    {
        Intent intent = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/WebSearchActivity);
        intent.putExtra("search_memo", CollageLayoutFragment.e(a));
        intent.putExtra("is_search_background", true);
        a.startActivityForResult(intent, 400);
    }

    public void a(PurchasableStickerBundle purchasablestickerbundle)
    {
        b.aK(purchasablestickerbundle.f());
        Intent intent = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/IabBackgroundActivity);
        intent.putExtra("extra_purchasable_bundle", purchasablestickerbundle);
        a.startActivityForResult(intent, 401);
    }

    public void a(IBackground ibackground)
    {
        b.T();
        CollageLayoutFragment.a(a, true);
        CollageLayoutFragment.f(a).a(ibackground);
        CollageLayoutFragment.f(a).notifyDataSetChanged();
        CollageLayoutFragment.a(a, ibackground.getPath());
        com.cardinalblue.android.piccollage.view.fragments.CollageLayoutFragment.b(a).a(ibackground);
    }

    (CollageLayoutFragment collagelayoutfragment)
    {
        a = collagelayoutfragment;
        super();
    }
}
