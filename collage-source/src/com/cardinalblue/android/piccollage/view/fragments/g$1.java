// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Checkable;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.n;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

class a
    implements com.cardinalblue.android.piccollage.view.a.nts.g._cls1
{

    final g a;

    public void a()
    {
        b.ac(a.a.f());
        Object obj = a.a.h().c();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = PICAppRoutesService.d(((String) (obj)));
            a.getActivity().startService(((android.content.Intent) (obj)));
        }
    }

    public void a(Sticker sticker, Checkable checkable)
    {
        a.a(sticker, checkable);
    }

    sService(g g1)
    {
        a = g1;
        super();
    }
}
