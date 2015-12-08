// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            v

class a
    implements android.view.nClickListener
{

    final ctivity a;

    public void onClick(View view)
    {
        b.av(a.a.getPromotionId());
        if (!TextUtils.isEmpty(a.a.getClickEvent()))
        {
            f.a(a.a.getClickEvent());
        }
        try
        {
            view = PICAppRoutesService.d(a.a.getClickUrl());
            view.putExtra("extra_start_from", "banner");
            a.a.getActivity().startService(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            f.a(view);
        }
    }

    onData(onData ondata)
    {
        a = ondata;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/v$7

/* anonymous class */
    class v._cls7
        implements i
    {

        final WebPromotionData a;
        final v b;

        public Void a(j j1)
            throws Exception
        {
            k.a(v.a(b), (Bitmap)j1.e());
            v.a(b).setOnClickListener(new v._cls7._cls1(this));
            com.cardinalblue.android.piccollage.a.b.au(a.getPromotionId());
            if (!TextUtils.isEmpty(a.getShowEvent()))
            {
                f.a(a.getShowEvent());
            }
            return null;
        }

        public Object then(j j1)
            throws Exception
        {
            return a(j1);
        }

            
            {
                b = v1;
                a = webpromotiondata;
                super();
            }
    }

}
